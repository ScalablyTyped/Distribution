package typings.senchaTouch.Ext.chart.label

import typings.senchaTouch.Ext.draw.sprite.IText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILabel extends IText {
  
  /** [Config Option] (Object) */
  var fx: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the value of field
    * @returns Object
    */
  var getField: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of fx
    * @returns Object
    */
  var getFx: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Render method
    * @param surface Object
    * @param ctx Object
    * @param clipRegion Object
    * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
    */
  @JSName("render")
  var render_ILabel: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  
  /** [Method] Sets the value of field
    * @param field Object The new value.
    */
  var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of fx
    * @param fx Object The new value.
    */
  var setFx: js.UndefOr[js.Function1[/* fx */ js.UndefOr[js.Any], Unit]] = js.native
}
object ILabel {
  
  @scala.inline
  def apply(): ILabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILabel]
  }
  
  @scala.inline
  implicit class ILabelOps[Self <: ILabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFx(value: js.Any): Self = this.set("fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFx: Self = this.set("fx", js.undefined)
    
    @scala.inline
    def setGetField(value: () => _): Self = this.set("getField", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetField: Self = this.set("getField", js.undefined)
    
    @scala.inline
    def setGetFx(value: () => _): Self = this.set("getFx", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFx: Self = this.set("getFx", js.undefined)
    
    @scala.inline
    def setRender(
      value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => _
    ): Self = this.set("render", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setSetField(value: /* field */ js.UndefOr[js.Any] => Unit): Self = this.set("setField", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetField: Self = this.set("setField", js.undefined)
    
    @scala.inline
    def setSetFx(value: /* fx */ js.UndefOr[js.Any] => Unit): Self = this.set("setFx", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFx: Self = this.set("setFx", js.undefined)
  }
}
