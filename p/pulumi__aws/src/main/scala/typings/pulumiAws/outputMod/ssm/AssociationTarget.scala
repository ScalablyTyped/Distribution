package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationTarget extends js.Object {
  /**
    * Either `InstanceIds` or `tag:Tag Name` to specify an EC2 tag.
    */
  var key: String = js.native
  /**
    * A list of instance IDs or tag values. AWS currently limits this list size to one value.
    */
  var values: js.Array[String] = js.native
}

object AssociationTarget {
  @scala.inline
  def apply(key: String, values: js.Array[String]): AssociationTarget = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociationTarget]
  }
}

