package typings.pulumiAws.outputMod.docdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterParameterGroupParameter extends js.Object {
  /**
    * Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
    */
  var applyMethod: js.UndefOr[String] = js.native
  /**
    * The name of the documentDB parameter.
    */
  var name: String = js.native
  /**
    * The value of the documentDB parameter.
    */
  var value: String = js.native
}

object ClusterParameterGroupParameter {
  @scala.inline
  def apply(name: String, value: String): ClusterParameterGroupParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterParameterGroupParameter]
  }
  @scala.inline
  implicit class ClusterParameterGroupParameterOps[Self <: ClusterParameterGroupParameter] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplyMethod(value: String): Self = this.set("applyMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyMethod: Self = this.set("applyMethod", js.undefined)
  }
  
}

