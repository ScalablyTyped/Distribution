package typings.reactIntl.anon

import typings.react.mod.ComponentType
import typings.reactIntl.injectIntlMod.WrappedComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WrappedComponentComponentType[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */] extends StObject {
  
  var WrappedComponent: ComponentType[P]
}
object WrappedComponentComponentType {
  
  inline def apply[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */](WrappedComponent: ComponentType[P]): WrappedComponentComponentType[P, IntlPropName] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponentComponentType[P, IntlPropName]]
  }
  
  extension [Self <: WrappedComponentComponentType[?, ?], P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */](x: Self & (WrappedComponentComponentType[P, IntlPropName])) {
    
    inline def setWrappedComponent(value: ComponentType[P]): Self = StObject.set(x, "WrappedComponent", value.asInstanceOf[js.Any])
  }
}
