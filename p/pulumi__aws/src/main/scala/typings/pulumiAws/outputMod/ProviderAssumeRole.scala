package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderAssumeRole extends StObject {
  
  var durationSeconds: js.UndefOr[Double] = js.undefined
  
  var externalId: js.UndefOr[String] = js.undefined
  
  var policy: js.UndefOr[String] = js.undefined
  
  var policyArns: js.UndefOr[js.Array[String]] = js.undefined
  
  var roleArn: js.UndefOr[String] = js.undefined
  
  var sessionName: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var transitiveTagKeys: js.UndefOr[js.Array[String]] = js.undefined
}
object ProviderAssumeRole {
  
  inline def apply(): ProviderAssumeRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderAssumeRole]
  }
  
  extension [Self <: ProviderAssumeRole](x: Self) {
    
    inline def setDurationSeconds(value: Double): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyArns(value: js.Array[String]): Self = StObject.set(x, "policyArns", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnsUndefined: Self = StObject.set(x, "policyArns", js.undefined)
    
    inline def setPolicyArnsVarargs(value: String*): Self = StObject.set(x, "policyArns", js.Array(value :_*))
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setSessionName(value: String): Self = StObject.set(x, "sessionName", value.asInstanceOf[js.Any])
    
    inline def setSessionNameUndefined: Self = StObject.set(x, "sessionName", js.undefined)
    
    inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTransitiveTagKeys(value: js.Array[String]): Self = StObject.set(x, "transitiveTagKeys", value.asInstanceOf[js.Any])
    
    inline def setTransitiveTagKeysUndefined: Self = StObject.set(x, "transitiveTagKeys", js.undefined)
    
    inline def setTransitiveTagKeysVarargs(value: String*): Self = StObject.set(x, "transitiveTagKeys", js.Array(value :_*))
  }
}
