package typings.atPulumiAws.typesOutputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionOriginGroupMember extends js.Object {
  /**
    * The unique identifier of the member origin
    */
  var originId: String
}

object DistributionOriginGroupMember {
  @scala.inline
  def apply(originId: String): DistributionOriginGroupMember = {
    val __obj = js.Dynamic.literal(originId = originId)
  
    __obj.asInstanceOf[DistributionOriginGroupMember]
  }
}

