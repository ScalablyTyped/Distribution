package typings.reachRouter.mod

import typings.history.mod.LocationState
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterProps extends StObject {
  
  var basepath: js.UndefOr[String] = js.undefined
  
  var component: js.UndefOr[ComponentType[js.Object] | String] = js.undefined
  
  var location: js.UndefOr[WindowLocation[LocationState]] = js.undefined
  
  var primary: js.UndefOr[Boolean] = js.undefined
}
object RouterProps {
  
  @scala.inline
  def apply(): RouterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterProps]
  }
  
  @scala.inline
  implicit class RouterPropsMutableBuilder[Self <: RouterProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasepath(value: String): Self = StObject.set(x, "basepath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasepathUndefined: Self = StObject.set(x, "basepath", js.undefined)
    
    @scala.inline
    def setComponent(value: ComponentType[js.Object] | String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
  }
}
