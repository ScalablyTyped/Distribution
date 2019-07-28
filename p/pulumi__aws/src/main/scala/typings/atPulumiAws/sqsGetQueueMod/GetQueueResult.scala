package typings.atPulumiAws.sqsGetQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueueResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the queue.
    */
  val arn: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
  /**
    * The URL of the queue.
    */
  val url: String
}

object GetQueueResult {
  @scala.inline
  def apply(arn: String, id: String, name: String, url: String): GetQueueResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id, name = name, url = url)
  
    __obj.asInstanceOf[GetQueueResult]
  }
}

