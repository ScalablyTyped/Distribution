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
  @scala.inline
  implicit class AssociationTargetOps[Self <: AssociationTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: Input[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: Input[String]*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: Input[js.Array[Input[String]]]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

