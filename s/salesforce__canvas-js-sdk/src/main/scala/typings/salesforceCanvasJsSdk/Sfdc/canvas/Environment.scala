package typings.salesforceCanvasJsSdk.Sfdc.canvas

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see https://developer.salesforce.com/docs/atlas.en-us.platform_connect.meta/platform_connect/environment_object.htm
trait Environment extends StObject {
  
  val dimensions: EnvironmentDimensions
  
  val displayLocation: EnvironmentDisplayLocation
  
  val locationUrl: String
  
  val parameters: Record[String, Any]
  
  val record: js.UndefOr[EnvironmentRecord] = js.undefined
  
  val subLocation: EnvironmentDisplaySubLocation | Null
  
  val uiTheme: String
  
  val version: EnvironmentVersion
}
object Environment {
  
  inline def apply(
    dimensions: EnvironmentDimensions,
    displayLocation: EnvironmentDisplayLocation,
    locationUrl: String,
    parameters: Record[String, Any],
    uiTheme: String,
    version: EnvironmentVersion
  ): Environment = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], displayLocation = displayLocation.asInstanceOf[js.Any], locationUrl = locationUrl.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], uiTheme = uiTheme.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], subLocation = null)
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
    
    inline def setDimensions(value: EnvironmentDimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDisplayLocation(value: EnvironmentDisplayLocation): Self = StObject.set(x, "displayLocation", value.asInstanceOf[js.Any])
    
    inline def setLocationUrl(value: String): Self = StObject.set(x, "locationUrl", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: Record[String, Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRecord(value: EnvironmentRecord): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    inline def setSubLocation(value: EnvironmentDisplaySubLocation): Self = StObject.set(x, "subLocation", value.asInstanceOf[js.Any])
    
    inline def setSubLocationNull: Self = StObject.set(x, "subLocation", null)
    
    inline def setUiTheme(value: String): Self = StObject.set(x, "uiTheme", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: EnvironmentVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
