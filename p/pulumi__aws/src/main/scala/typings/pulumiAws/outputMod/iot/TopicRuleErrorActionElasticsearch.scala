package typings.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleErrorActionElasticsearch extends js.Object {
  
  /**
    * The endpoint of your Elasticsearch domain.
    */
  var endpoint: String = js.native
  
  /**
    * The unique identifier for the document you are storing.
    */
  var id: String = js.native
  
  /**
    * The Elasticsearch index where you want to store your data.
    */
  var index: String = js.native
  
  /**
    * The IAM role ARN that has access to Elasticsearch.
    */
  var roleArn: String = js.native
  
  /**
    * The type of document you are storing.
    */
  var `type`: String = js.native
}
object TopicRuleErrorActionElasticsearch {
  
  @scala.inline
  def apply(endpoint: String, id: String, index: String, roleArn: String, `type`: String): TopicRuleErrorActionElasticsearch = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionElasticsearch]
  }
  
  @scala.inline
  implicit class TopicRuleErrorActionElasticsearchOps[Self <: TopicRuleErrorActionElasticsearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
