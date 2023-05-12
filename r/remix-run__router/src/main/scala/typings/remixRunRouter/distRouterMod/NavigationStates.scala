package typings.remixRunRouter.distRouterMod

import typings.remixRunRouter.anon.FormEncType
import typings.remixRunRouter.anon.FormMethod
import typings.remixRunRouter.anon.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationStates extends StObject {
  
  var Idle: FormEncType
  
  var Loading: FormMethod
  
  var Submitting: Location
}
object NavigationStates {
  
  inline def apply(Idle: FormEncType, Loading: FormMethod, Submitting: Location): NavigationStates = {
    val __obj = js.Dynamic.literal(Idle = Idle.asInstanceOf[js.Any], Loading = Loading.asInstanceOf[js.Any], Submitting = Submitting.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationStates] (val x: Self) extends AnyVal {
    
    inline def setIdle(value: FormEncType): Self = StObject.set(x, "Idle", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: FormMethod): Self = StObject.set(x, "Loading", value.asInstanceOf[js.Any])
    
    inline def setSubmitting(value: Location): Self = StObject.set(x, "Submitting", value.asInstanceOf[js.Any])
  }
}
