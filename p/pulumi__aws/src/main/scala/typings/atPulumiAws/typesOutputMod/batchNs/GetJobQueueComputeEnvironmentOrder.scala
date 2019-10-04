package typings.atPulumiAws.typesOutputMod.batchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobQueueComputeEnvironmentOrder extends js.Object {
  var computeEnvironment: String
  var order: Double
}

object GetJobQueueComputeEnvironmentOrder {
  @scala.inline
  def apply(computeEnvironment: String, order: Double): GetJobQueueComputeEnvironmentOrder = {
    val __obj = js.Dynamic.literal(computeEnvironment = computeEnvironment, order = order)
  
    __obj.asInstanceOf[GetJobQueueComputeEnvironmentOrder]
  }
}

