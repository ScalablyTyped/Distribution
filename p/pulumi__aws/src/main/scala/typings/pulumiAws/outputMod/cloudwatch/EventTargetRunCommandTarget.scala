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
  @scala.inline
  implicit class EventTargetRunCommandTargetOps[Self <: EventTargetRunCommandTarget] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

