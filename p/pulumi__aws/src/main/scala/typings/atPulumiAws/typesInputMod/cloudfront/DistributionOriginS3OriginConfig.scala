package typings.atPulumiAws.typesInputMod.cloudfront

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionOriginS3OriginConfig extends js.Object {
  /**
    * The [CloudFront origin access
    * identity][5] to associate with the origin.
    */
  var originAccessIdentity: Input[String]
}

object DistributionOriginS3OriginConfig {
  @scala.inline
  def apply(originAccessIdentity: Input[String]): DistributionOriginS3OriginConfig = {
    val __obj = js.Dynamic.literal(originAccessIdentity = originAccessIdentity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DistributionOriginS3OriginConfig]
  }
}

