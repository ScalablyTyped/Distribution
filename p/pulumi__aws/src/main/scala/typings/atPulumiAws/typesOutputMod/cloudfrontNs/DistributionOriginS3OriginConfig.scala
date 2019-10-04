package typings.atPulumiAws.typesOutputMod.cloudfrontNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionOriginS3OriginConfig extends js.Object {
  /**
    * The [CloudFront origin access
    * identity][5] to associate with the origin.
    */
  var originAccessIdentity: String
}

object DistributionOriginS3OriginConfig {
  @scala.inline
  def apply(originAccessIdentity: String): DistributionOriginS3OriginConfig = {
    val __obj = js.Dynamic.literal(originAccessIdentity = originAccessIdentity)
  
    __obj.asInstanceOf[DistributionOriginS3OriginConfig]
  }
}

