package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sns extends StObject {
  
  var arn: js.UndefOr[String] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var filterPolicy: js.UndefOr[js.Array[String] | StringDictionary[String]] = js.native
  
  var redrivePolicy: js.UndefOr[RedrivePolicy] = js.native
  
  var topicName: js.UndefOr[String] = js.native
}
object Sns {
  
  @scala.inline
  def apply(): Sns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sns]
  }
  
  @scala.inline
  implicit class SnsMutableBuilder[Self <: Sns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFilterPolicy(value: js.Array[String] | StringDictionary[String]): Self = StObject.set(x, "filterPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterPolicyUndefined: Self = StObject.set(x, "filterPolicy", js.undefined)
    
    @scala.inline
    def setFilterPolicyVarargs(value: String*): Self = StObject.set(x, "filterPolicy", js.Array(value :_*))
    
    @scala.inline
    def setRedrivePolicy(value: RedrivePolicy): Self = StObject.set(x, "redrivePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedrivePolicyUndefined: Self = StObject.set(x, "redrivePolicy", js.undefined)
    
    @scala.inline
    def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
  }
}
