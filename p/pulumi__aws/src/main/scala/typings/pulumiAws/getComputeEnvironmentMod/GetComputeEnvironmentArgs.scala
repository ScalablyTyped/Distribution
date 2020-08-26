package typings.pulumiAws.getComputeEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComputeEnvironmentArgs extends js.Object {
  /**
    * The name of the Batch Compute Environment
    */
  val computeEnvironmentName: String = js.native
}

object GetComputeEnvironmentArgs {
  @scala.inline
  def apply(computeEnvironmentName: String): GetComputeEnvironmentArgs = {
    val __obj = js.Dynamic.literal(computeEnvironmentName = computeEnvironmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComputeEnvironmentArgs]
  }
  @scala.inline
  implicit class GetComputeEnvironmentArgsOps[Self <: GetComputeEnvironmentArgs] (val x: Self) extends AnyVal {
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
    def setComputeEnvironmentName(value: String): Self = this.set("computeEnvironmentName", value.asInstanceOf[js.Any])
  }
  
}

