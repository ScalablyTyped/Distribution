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
}

