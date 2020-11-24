package typings.senchaTouch.Ext.fx.layout.card

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStyle extends IAbstract {
  
  /** [Method] Returns the value of inAnimation
    * @returns Object
    */
  var getInAnimation: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of outAnimation
    * @returns Object
    */
  var getOutAnimation: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Sets the value of inAnimation
    * @param inAnimation Object The new value.
    */
  var setInAnimation: js.UndefOr[js.Function1[/* inAnimation */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of outAnimation
    * @param outAnimation Object The new value.
    */
  var setOutAnimation: js.UndefOr[js.Function1[/* outAnimation */ js.UndefOr[js.Any], Unit]] = js.native
}
object IStyle {
  
  @scala.inline
  def apply(): IStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStyle]
  }
  
  @scala.inline
  implicit class IStyleOps[Self <: IStyle] (val x: Self) extends AnyVal {
    
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
    def setGetInAnimation(value: () => _): Self = this.set("getInAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInAnimation: Self = this.set("getInAnimation", js.undefined)
    
    @scala.inline
    def setGetOutAnimation(value: () => _): Self = this.set("getOutAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOutAnimation: Self = this.set("getOutAnimation", js.undefined)
    
    @scala.inline
    def setSetInAnimation(value: /* inAnimation */ js.UndefOr[js.Any] => Unit): Self = this.set("setInAnimation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetInAnimation: Self = this.set("setInAnimation", js.undefined)
    
    @scala.inline
    def setSetOutAnimation(value: /* outAnimation */ js.UndefOr[js.Any] => Unit): Self = this.set("setOutAnimation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetOutAnimation: Self = this.set("setOutAnimation", js.undefined)
  }
}
