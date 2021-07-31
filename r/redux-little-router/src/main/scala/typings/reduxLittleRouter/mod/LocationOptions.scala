package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationOptions extends StObject {
  
  var persistQuery: js.UndefOr[Boolean] = js.undefined
  
  var updateRoutes: js.UndefOr[Boolean] = js.undefined
}
object LocationOptions {
  
  @scala.inline
  def apply(): LocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationOptions]
  }
  
  @scala.inline
  implicit class LocationOptionsMutableBuilder[Self <: LocationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPersistQuery(value: Boolean): Self = StObject.set(x, "persistQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistQueryUndefined: Self = StObject.set(x, "persistQuery", js.undefined)
    
    @scala.inline
    def setUpdateRoutes(value: Boolean): Self = StObject.set(x, "updateRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateRoutesUndefined: Self = StObject.set(x, "updateRoutes", js.undefined)
  }
}
