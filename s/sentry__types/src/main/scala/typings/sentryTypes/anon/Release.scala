package typings.sentryTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Release extends StObject {
  
  var environment: js.UndefOr[String] = js.undefined
  
  var release: js.UndefOr[String] = js.undefined
}
object Release {
  
  inline def apply(): Release = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Release]
  }
  
  extension [Self <: Release](x: Self) {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
  }
}
