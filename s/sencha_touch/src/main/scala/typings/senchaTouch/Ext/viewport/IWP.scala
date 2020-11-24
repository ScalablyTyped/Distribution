package typings.senchaTouch.Ext.viewport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWP extends IDefault {
  
  /** [Method] Returns the value of translatable
    * @returns Object
    */
  var getTranslatable: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Sets the value of translatable
    * @param translatable Object The new value.
    */
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[js.Any], Unit]] = js.native
}
object IWP {
  
  @scala.inline
  def apply(): IWP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWP]
  }
  
  @scala.inline
  implicit class IWPOps[Self <: IWP] (val x: Self) extends AnyVal {
    
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
    def setGetTranslatable(value: () => _): Self = this.set("getTranslatable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTranslatable: Self = this.set("getTranslatable", js.undefined)
    
    @scala.inline
    def setSetTranslatable(value: /* translatable */ js.UndefOr[js.Any] => Unit): Self = this.set("setTranslatable", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTranslatable: Self = this.set("setTranslatable", js.undefined)
  }
}
