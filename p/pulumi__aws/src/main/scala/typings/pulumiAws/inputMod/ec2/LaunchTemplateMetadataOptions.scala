package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateMetadataOptions extends js.Object {
  /**
    * Whether the metadata service is available. Can be `"enabled"` or `"disabled"`. (Default: `"enabled"`).
    */
  var httpEndpoint: js.UndefOr[Input[String]] = js.native
  /**
    * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Can be an integer from `1` to `64`. (Default: `1`).
    */
  var httpPutResponseHopLimit: js.UndefOr[Input[Double]] = js.native
  /**
    * Whether or not the metadata service requires session tokens, also referred to as _Instance Metadata Service Version 2_. Can be `"optional"` or `"required"`. (Default: `"optional"`).
    */
  var httpTokens: js.UndefOr[Input[String]] = js.native
}

object LaunchTemplateMetadataOptions {
  @scala.inline
  def apply(): LaunchTemplateMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateMetadataOptions]
  }
  @scala.inline
  implicit class LaunchTemplateMetadataOptionsOps[Self <: LaunchTemplateMetadataOptions] (val x: Self) extends AnyVal {
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
    def setHttpEndpoint(value: Input[String]): Self = this.set("httpEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpEndpoint: Self = this.set("httpEndpoint", js.undefined)
    @scala.inline
    def setHttpPutResponseHopLimit(value: Input[Double]): Self = this.set("httpPutResponseHopLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpPutResponseHopLimit: Self = this.set("httpPutResponseHopLimit", js.undefined)
    @scala.inline
    def setHttpTokens(value: Input[String]): Self = this.set("httpTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpTokens: Self = this.set("httpTokens", js.undefined)
  }
  
}

