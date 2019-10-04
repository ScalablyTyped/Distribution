package typings.atPulumiAws.typesOutputMod.cloudfrontNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionOriginGroupFailoverCriteria extends js.Object {
  /**
    * A list of HTTP status codes for the origin group
    */
  var statusCodes: js.Array[Double]
}

object DistributionOriginGroupFailoverCriteria {
  @scala.inline
  def apply(statusCodes: js.Array[Double]): DistributionOriginGroupFailoverCriteria = {
    val __obj = js.Dynamic.literal(statusCodes = statusCodes)
  
    __obj.asInstanceOf[DistributionOriginGroupFailoverCriteria]
  }
}

