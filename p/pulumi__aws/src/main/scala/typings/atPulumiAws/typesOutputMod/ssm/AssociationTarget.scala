package typings.atPulumiAws.typesOutputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationTarget extends js.Object {
  /**
    * Either `InstanceIds` or `tag:Tag Name` to specify an EC2 tag.
    */
  var key: String
  /**
    * A list of instance IDs or tag values. AWS currently limits this list size to one value.
    */
  var values: js.Array[String]
}

object AssociationTarget {
  @scala.inline
  def apply(key: String, values: js.Array[String]): AssociationTarget = {
    val __obj = js.Dynamic.literal(key = key, values = values)
  
    __obj.asInstanceOf[AssociationTarget]
  }
}

