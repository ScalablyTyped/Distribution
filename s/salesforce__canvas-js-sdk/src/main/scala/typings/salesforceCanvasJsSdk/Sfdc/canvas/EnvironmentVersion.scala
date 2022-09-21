package typings.salesforceCanvasJsSdk.Sfdc.canvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see https://developer.salesforce.com/docs/atlas.en-us.platform_connect.meta/platform_connect/version_object.htm
trait EnvironmentVersion extends StObject {
  
  val api: String
  
  val season: String
}
object EnvironmentVersion {
  
  inline def apply(api: String, season: String): EnvironmentVersion = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentVersion]
  }
  
  extension [Self <: EnvironmentVersion](x: Self) {
    
    inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setSeason(value: String): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
  }
}
