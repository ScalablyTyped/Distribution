package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOriginGroupFailoverCriteria extends js.Object {
  /**
    * A list of HTTP status codes for the origin group
    */
  var statusCodes: Input[js.Array[Input[Double]]] = js.native
}

object DistributionOriginGroupFailoverCriteria {
  @scala.inline
  def apply(statusCodes: Input[js.Array[Input[Double]]]): DistributionOriginGroupFailoverCriteria = {
    val __obj = js.Dynamic.literal(statusCodes = statusCodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DistributionOriginGroupFailoverCriteria]
  }
}

