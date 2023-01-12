package typings.reachRouter.mod

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterProps extends StObject {
  
  var basepath: js.UndefOr[String] = js.undefined
  
  var component: js.UndefOr[ComponentType[js.Object] | String] = js.undefined
  
  var location: js.UndefOr[WindowLocation[Any]] = js.undefined
  
  var primary: js.UndefOr[Boolean] = js.undefined
}
object RouterProps {
  
  inline def apply(): RouterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouterProps] (val x: Self) extends AnyVal {
    
    inline def setBasepath(value: String): Self = StObject.set(x, "basepath", value.asInstanceOf[js.Any])
    
    inline def setBasepathUndefined: Self = StObject.set(x, "basepath", js.undefined)
    
    inline def setComponent(value: ComponentType[js.Object] | String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setLocation(value: WindowLocation[Any]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
  }
}
