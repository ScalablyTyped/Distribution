package typings.atPulumiAws.typesOutputMod.iotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleElasticsearch extends js.Object {
  /**
    * The endpoint of your Elasticsearch domain.
    */
  var endpoint: String
  /**
    * The unique identifier for the document you are storing.
    */
  var id: String
  /**
    * The Elasticsearch index where you want to store your data.
    */
  var index: String
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String
  /**
    * The type of document you are storing.
    */
  var `type`: String
}

object TopicRuleElasticsearch {
  @scala.inline
  def apply(endpoint: String, id: String, index: String, roleArn: String, `type`: String): TopicRuleElasticsearch = {
    val __obj = js.Dynamic.literal(endpoint = endpoint, id = id, index = index, roleArn = roleArn)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TopicRuleElasticsearch]
  }
}

