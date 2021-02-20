package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleErrorActionElasticsearch extends StObject {
  
  /**
    * The endpoint of your Elasticsearch domain.
    */
  var endpoint: Input[String] = js.native
  
  /**
    * The unique identifier for the document you are storing.
    */
  var id: Input[String] = js.native
  
  /**
    * The Elasticsearch index where you want to store your data.
    */
  var index: Input[String] = js.native
  
  /**
    * The IAM role ARN that has access to Elasticsearch.
    */
  var roleArn: Input[String] = js.native
  
  /**
    * The type of document you are storing.
    */
  var `type`: Input[String] = js.native
}
object TopicRuleErrorActionElasticsearch {
  
  @scala.inline
  def apply(
    endpoint: Input[String],
    id: Input[String],
    index: Input[String],
    roleArn: Input[String],
    `type`: Input[String]
  ): TopicRuleErrorActionElasticsearch = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionElasticsearch]
  }
  
  @scala.inline
  implicit class TopicRuleErrorActionElasticsearchMutableBuilder[Self <: TopicRuleErrorActionElasticsearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: Input[String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Input[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
