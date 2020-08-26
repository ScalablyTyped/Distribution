package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceMetadataOptions extends js.Object {
  /**
    * Whether the metadata service is available. Can be `"enabled"` or `"disabled"`. (Default: `"enabled"`).
    */
  var httpEndpoint: String = js.native
  /**
    * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Can be an integer from `1` to `64`. (Default: `1`).
    */
  var httpPutResponseHopLimit: Double = js.native
  /**
    * Whether or not the metadata service requires session tokens, also referred to as _Instance Metadata Service Version 2_. Can be `"optional"` or `"required"`. (Default: `"optional"`).
    */
  var httpTokens: String = js.native
}

object InstanceMetadataOptions {
  @scala.inline
  def apply(httpEndpoint: String, httpPutResponseHopLimit: Double, httpTokens: String): InstanceMetadataOptions = {
    val __obj = js.Dynamic.literal(httpEndpoint = httpEndpoint.asInstanceOf[js.Any], httpPutResponseHopLimit = httpPutResponseHopLimit.asInstanceOf[js.Any], httpTokens = httpTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceMetadataOptions]
  }
  @scala.inline
  implicit class InstanceMetadataOptionsOps[Self <: InstanceMetadataOptions] (val x: Self) extends AnyVal {
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
    def setHttpEndpoint(value: String): Self = this.set("httpEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpPutResponseHopLimit(value: Double): Self = this.set("httpPutResponseHopLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpTokens(value: String): Self = this.set("httpTokens", value.asInstanceOf[js.Any])
  }
  
}

