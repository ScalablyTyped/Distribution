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
  @scala.inline
  implicit class DistributionOriginS3OriginConfigOps[Self <: DistributionOriginS3OriginConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOriginAccessIdentity(value: String): Self = this.set("originAccessIdentity", value.asInstanceOf[js.Any])
  }
  
}

