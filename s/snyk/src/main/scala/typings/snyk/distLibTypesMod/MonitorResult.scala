package typings.snyk.distLibTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorResult extends StObject {
  
  var id: String
  
  var isMonitored: Boolean
  
  var licensesPolicy: Any
  
  @JSName("org")
  var org_ : js.UndefOr[String] = js.undefined
  
  var path: String
  
  var trialStarted: Boolean
  
  var uri: String
}
object MonitorResult {
  
  inline def apply(
    id: String,
    isMonitored: Boolean,
    licensesPolicy: Any,
    path: String,
    trialStarted: Boolean,
    uri: String
  ): MonitorResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isMonitored = isMonitored.asInstanceOf[js.Any], licensesPolicy = licensesPolicy.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], trialStarted = trialStarted.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitorResult] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsMonitored(value: Boolean): Self = StObject.set(x, "isMonitored", value.asInstanceOf[js.Any])
    
    inline def setLicensesPolicy(value: Any): Self = StObject.set(x, "licensesPolicy", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setTrialStarted(value: Boolean): Self = StObject.set(x, "trialStarted", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
