package typings.atPulumiAws.typesOutputMod.cloudwatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTargetRunCommandTarget extends js.Object {
  /**
    * Can be either `tag:tag-key` or `InstanceIds`.
    */
  var key: String
  /**
    * If Key is `tag:tag-key`, Values is a list of tag values. If Key is `InstanceIds`, Values is a list of Amazon EC2 instance IDs.
    */
  var values: js.Array[String]
}

object EventTargetRunCommandTarget {
  @scala.inline
  def apply(key: String, values: js.Array[String]): EventTargetRunCommandTarget = {
    val __obj = js.Dynamic.literal(key = key, values = values)
  
    __obj.asInstanceOf[EventTargetRunCommandTarget]
  }
}

