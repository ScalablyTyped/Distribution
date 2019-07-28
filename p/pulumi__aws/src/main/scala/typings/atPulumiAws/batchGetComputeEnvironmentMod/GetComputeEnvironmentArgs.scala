package typings.atPulumiAws.batchGetComputeEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetComputeEnvironmentArgs extends js.Object {
  /**
    * The name of the Batch Compute Environment
    */
  val computeEnvironmentName: String
}

object GetComputeEnvironmentArgs {
  @scala.inline
  def apply(computeEnvironmentName: String): GetComputeEnvironmentArgs = {
    val __obj = js.Dynamic.literal(computeEnvironmentName = computeEnvironmentName)
  
    __obj.asInstanceOf[GetComputeEnvironmentArgs]
  }
}

