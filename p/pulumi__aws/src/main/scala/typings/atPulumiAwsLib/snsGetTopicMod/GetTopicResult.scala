package typings
package atPulumiAwsLib.snsGetTopicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTopicResult extends js.Object {
  /**
    * Set to the ARN of the found topic, suitable for referencing in other resources that support SNS topics.
    */
  val arn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
}

object GetTopicResult {
  @scala.inline
  def apply(arn: java.lang.String, id: java.lang.String): GetTopicResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GetTopicResult]
  }
}

