package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
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
  implicit class IDecoratorMutableBuilder[Self <: IDecorator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: js.Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setGetComponent(value: () => _): Self = StObject.set(x, "getComponent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetComponentUndefined: Self = StObject.set(x, "getComponent", js.undefined)
    
    @scala.inline
    def setSetComponent(value: /* component */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetComponentUndefined: Self = StObject.set(x, "setComponent", js.undefined)
  }
}
