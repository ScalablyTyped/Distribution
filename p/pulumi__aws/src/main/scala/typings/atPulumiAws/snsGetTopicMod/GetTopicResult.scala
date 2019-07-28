package typings.atPulumiAws.snsGetTopicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTopicResult extends js.Object {
  /**
    * Set to the ARN of the found topic, suitable for referencing in other resources that support SNS topics.
    */
  val arn: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
}

object GetTopicResult {
  @scala.inline
  def apply(arn: String, id: String, name: String): GetTopicResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id, name = name)
  
    __obj.asInstanceOf[GetTopicResult]
  }
}

