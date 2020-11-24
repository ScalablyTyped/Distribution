package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDecorator extends IComponent {
  
  /** [Config Option] (Object) */
  var component: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the value of component
    * @returns Object
    */
  var getComponent: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Sets the value of component
    * @param component Object The new value.
    */
  var setComponent: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], Unit]] = js.native
}
object IDecorator {
  
  @scala.inline
  def apply(): IDecorator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDecorator]
  }
  
  @scala.inline
  implicit class IDecoratorOps[Self <: IDecorator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponent(value: js.Any): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setGetComponent(value: () => _): Self = this.set("getComponent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetComponent: Self = this.set("getComponent", js.undefined)
    
    @scala.inline
    def setSetComponent(value: /* component */ js.UndefOr[js.Any] => Unit): Self = this.set("setComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetComponent: Self = this.set("setComponent", js.undefined)
  }
}
