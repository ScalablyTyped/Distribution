package typings
package atPulumiAwsLib.sqsGetQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueueResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the queue.
    */
  val arn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val name: java.lang.String
  /**
    * The URL of the queue.
    */
  val url: java.lang.String
}

object GetQueueResult {
  @scala.inline
  def apply(arn: java.lang.String, id: java.lang.String, name: java.lang.String, url: java.lang.String): GetQueueResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id, name = name, url = url)
  
    __obj.asInstanceOf[GetQueueResult]
  }
}

