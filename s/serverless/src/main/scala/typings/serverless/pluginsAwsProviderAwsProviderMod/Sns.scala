package typings.serverless.pluginsAwsProviderAwsProviderMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sns extends StObject {
  
  var arn: js.UndefOr[String] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var filterPolicy: js.UndefOr[Record[String, Any]] = js.undefined
  
  var redrivePolicy: js.UndefOr[RedrivePolicy] = js.undefined
  
  var topicName: js.UndefOr[String] = js.undefined
}
object Sns {
  
  inline def apply(): Sns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sns] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFilterPolicy(value: Record[String, Any]): Self = StObject.set(x, "filterPolicy", value.asInstanceOf[js.Any])
    
    inline def setFilterPolicyUndefined: Self = StObject.set(x, "filterPolicy", js.undefined)
    
    inline def setRedrivePolicy(value: RedrivePolicy): Self = StObject.set(x, "redrivePolicy", value.asInstanceOf[js.Any])
    
    inline def setRedrivePolicyUndefined: Self = StObject.set(x, "redrivePolicy", js.undefined)
    
    inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    inline def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
  }
}
