package typings.pulumiAws.getTopicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTopicResult extends js.Object {
  /**
    * Set to the ARN of the found topic, suitable for referencing in other resources that support SNS topics.
    */
  val arn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
}

object GetTopicResult {
  @scala.inline
  def apply(arn: String, id: String, name: String): GetTopicResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTopicResult]
  }
}

