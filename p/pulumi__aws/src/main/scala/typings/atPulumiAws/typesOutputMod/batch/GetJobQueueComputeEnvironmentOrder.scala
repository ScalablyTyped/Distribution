package typings.atPulumiAws.typesOutputMod.batch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobQueueComputeEnvironmentOrder extends js.Object {
  var computeEnvironment: String = js.native
  var order: Double = js.native
}

object GetJobQueueComputeEnvironmentOrder {
  @scala.inline
  def apply(computeEnvironment: String, order: Double): GetJobQueueComputeEnvironmentOrder = {
    val __obj = js.Dynamic.literal(computeEnvironment = computeEnvironment.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetJobQueueComputeEnvironmentOrder]
  }
}

