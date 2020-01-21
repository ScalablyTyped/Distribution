package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationTarget extends js.Object {
  /**
    * Either `InstanceIds` or `tag:Tag Name` to specify an EC2 tag.
    */
  var key: Input[String] = js.native
  /**
    * A list of instance IDs or tag values. AWS currently limits this list size to one value.
    */
  var values: Input[js.Array[Input[String]]] = js.native
}

object AssociationTarget {
  @scala.inline
  def apply(key: Input[String], values: Input[js.Array[Input[String]]]): AssociationTarget = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociationTarget]
  }
}

