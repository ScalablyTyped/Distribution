package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOriginS3OriginConfig extends js.Object {
  /**
    * The [CloudFront origin access
    * identity][5] to associate with the origin.
    */
  var originAccessIdentity: Input[String] = js.native
}

object DistributionOriginS3OriginConfig {
  @scala.inline
  def apply(originAccessIdentity: Input[String]): DistributionOriginS3OriginConfig = {
    val __obj = js.Dynamic.literal(originAccessIdentity = originAccessIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginS3OriginConfig]
  }
}

