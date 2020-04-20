package typings.pulumiAws.outputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOriginS3OriginConfig extends js.Object {
  /**
    * The [CloudFront origin access
    * identity][5] to associate with the origin.
    */
  var originAccessIdentity: String = js.native
}

object DistributionOriginS3OriginConfig {
  @scala.inline
  def apply(originAccessIdentity: String): DistributionOriginS3OriginConfig = {
    val __obj = js.Dynamic.literal(originAccessIdentity = originAccessIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginS3OriginConfig]
  }
}

