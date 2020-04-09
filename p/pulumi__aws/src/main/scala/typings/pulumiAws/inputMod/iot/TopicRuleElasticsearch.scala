package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleElasticsearch extends js.Object {
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

object TopicRuleElasticsearch {
  @scala.inline
  def apply(
    endpoint: Input[String],
    id: Input[String],
    index: Input[String],
    roleArn: Input[String],
    `type`: Input[String]
  ): TopicRuleElasticsearch = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleElasticsearch]
  }
}

