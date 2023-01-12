package typings.snyk.distLibSnykTestLegacyMod

import typings.snyk.distLibTypesMod.SupportedProjectTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicResultData extends StObject {
  
  var isPrivate: Boolean
  
  var ok: Boolean
  
  @JSName("org")
  var org_ : String
  
  var packageManager: js.UndefOr[SupportedProjectTypes] = js.undefined
  
  var payloadType: js.UndefOr[String] = js.undefined
  
  var platform: js.UndefOr[String] = js.undefined
  
  var severityThreshold: js.UndefOr[String] = js.undefined
  
  var summary: String
}
object BasicResultData {
  
  inline def apply(isPrivate: Boolean, ok: Boolean, org_ : String, summary: String): BasicResultData = {
    val __obj = js.Dynamic.literal(isPrivate = isPrivate.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicResultData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasicResultData] (val x: Self) extends AnyVal {
    
    inline def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
    
    inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setPackageManager(value: SupportedProjectTypes): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
    
    inline def setPackageManagerUndefined: Self = StObject.set(x, "packageManager", js.undefined)
    
    inline def setPayloadType(value: String): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
    
    inline def setPayloadTypeUndefined: Self = StObject.set(x, "payloadType", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setSeverityThreshold(value: String): Self = StObject.set(x, "severityThreshold", value.asInstanceOf[js.Any])
    
    inline def setSeverityThresholdUndefined: Self = StObject.set(x, "severityThreshold", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
