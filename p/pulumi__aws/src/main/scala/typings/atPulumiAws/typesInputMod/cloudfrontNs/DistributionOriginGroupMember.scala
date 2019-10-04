package typings.atPulumiAws.typesInputMod.cloudfrontNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionOriginGroupMember extends js.Object {
  /**
    * The unique identifier of the member origin
    */
  var originId: Input[String]
}

object DistributionOriginGroupMember {
  @scala.inline
  def apply(originId: Input[String]): DistributionOriginGroupMember = {
    val __obj = js.Dynamic.literal(originId = originId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DistributionOriginGroupMember]
  }
}

