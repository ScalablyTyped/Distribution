package typings.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleElasticsearch extends js.Object {
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

object TopicRuleElasticsearch {
  @scala.inline
  def apply(endpoint: String, id: String, index: String, roleArn: String, `type`: String): TopicRuleElasticsearch = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleElasticsearch]
  }
}

