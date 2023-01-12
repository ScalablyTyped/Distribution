package typings.salesforceCanvasJsSdk.Sfdc.canvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see https://developer.salesforce.com/docs/atlas.en-us.platform_connect.meta/platform_connect/application_object.htm;
trait Application extends StObject {
  
  val applicationId: String
  
  val authType: ApplicationAuthType
  
  val canvasUrl: String
  
  val developerName: String
  
  val isInstalledPersonalApp: Boolean
  
  val name: String
  
  val namespace: String
  
  val options: js.Array[ApplicationOptions]
  
  val referenceId: String
  
  val samlInitiationMethod: String
  
  val version: String
}
object Application {
  
  inline def apply(
    applicationId: String,
    authType: ApplicationAuthType,
    canvasUrl: String,
    developerName: String,
    isInstalledPersonalApp: Boolean,
    name: String,
    namespace: String,
    options: js.Array[ApplicationOptions],
    referenceId: String,
    samlInitiationMethod: String,
    version: String
  ): Application = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], authType = authType.asInstanceOf[js.Any], canvasUrl = canvasUrl.asInstanceOf[js.Any], developerName = developerName.asInstanceOf[js.Any], isInstalledPersonalApp = isInstalledPersonalApp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], referenceId = referenceId.asInstanceOf[js.Any], samlInitiationMethod = samlInitiationMethod.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: String): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setAuthType(value: ApplicationAuthType): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setCanvasUrl(value: String): Self = StObject.set(x, "canvasUrl", value.asInstanceOf[js.Any])
    
    inline def setDeveloperName(value: String): Self = StObject.set(x, "developerName", value.asInstanceOf[js.Any])
    
    inline def setIsInstalledPersonalApp(value: Boolean): Self = StObject.set(x, "isInstalledPersonalApp", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[ApplicationOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: ApplicationOptions*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setReferenceId(value: String): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
    
    inline def setSamlInitiationMethod(value: String): Self = StObject.set(x, "samlInitiationMethod", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
