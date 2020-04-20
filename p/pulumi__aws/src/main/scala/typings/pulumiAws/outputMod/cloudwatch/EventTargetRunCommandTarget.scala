package typings.pulumiAws.outputMod.cloudwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTargetRunCommandTarget extends js.Object {
  /**
    * Can be either `tag:tag-key` or `InstanceIds`.
    */
  var key: String = js.native
  /**
    * If Key is `tag:tag-key`, Values is a list of tag values. If Key is `InstanceIds`, Values is a list of Amazon EC2 instance IDs.
    */
  var values: js.Array[String] = js.native
}

object EventTargetRunCommandTarget {
  @scala.inline
  def apply(key: String, values: js.Array[String]): EventTargetRunCommandTarget = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetRunCommandTarget]
  }
}

