package typings.reactIntl.anon

import typings.react.mod.ComponentType
import typings.reactIntl.srcComponentsInjectIntlMod.WrappedComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WrappedComponent[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */] extends StObject {
  
  var WrappedComponent: ComponentType[P]
}
object WrappedComponent {
  
  inline def apply[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */](WrappedComponent: ComponentType[P]): WrappedComponent[P, IntlPropName] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponent[P, IntlPropName]]
  }
  
  extension [Self <: WrappedComponent[?, ?], P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */](x: Self & (WrappedComponent[P, IntlPropName])) {
    
    inline def setWrappedComponent(value: ComponentType[P]): Self = StObject.set(x, "WrappedComponent", value.asInstanceOf[js.Any])
  }
}
