package typings.pulumiAws.outputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOriginGroupFailoverCriteria extends js.Object {
  /**
    * A list of HTTP status codes for the origin group
    */
  var statusCodes: js.Array[Double] = js.native
}

object DistributionOriginGroupFailoverCriteria {
  @scala.inline
  def apply(statusCodes: js.Array[Double]): DistributionOriginGroupFailoverCriteria = {
    val __obj = js.Dynamic.literal(statusCodes = statusCodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DistributionOriginGroupFailoverCriteria]
  }
}

