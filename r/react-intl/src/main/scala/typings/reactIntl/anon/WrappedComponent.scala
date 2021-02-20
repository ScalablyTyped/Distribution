package typings.reactIntl.anon

import typings.react.mod.ComponentType
import typings.reactIntl.componentsInjectIntlMod.WrappedComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrappedComponent[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */] extends StObject {
  
  var WrappedComponent: ComponentType[P] = js.native
}
object WrappedComponent {
  
  @scala.inline
  def apply[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */](WrappedComponent: ComponentType[P]): WrappedComponent[P, IntlPropName] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponent[P, IntlPropName]]
  }
  
  @scala.inline
  implicit class WrappedComponentMutableBuilder[Self <: WrappedComponent[_, _], P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */] (val x: Self with (WrappedComponent[P, IntlPropName])) extends AnyVal {
    
    @scala.inline
    def setWrappedComponent(value: ComponentType[P]): Self = StObject.set(x, "WrappedComponent", value.asInstanceOf[js.Any])
  }
}
