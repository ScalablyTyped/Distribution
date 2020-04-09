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
  def apply(
    httpEndpoint: Input[String] = null,
    httpPutResponseHopLimit: Input[Double] = null,
    httpTokens: Input[String] = null
  ): LaunchTemplateMetadataOptions = {
    val __obj = js.Dynamic.literal()
    if (httpEndpoint != null) __obj.updateDynamic("httpEndpoint")(httpEndpoint.asInstanceOf[js.Any])
    if (httpPutResponseHopLimit != null) __obj.updateDynamic("httpPutResponseHopLimit")(httpPutResponseHopLimit.asInstanceOf[js.Any])
    if (httpTokens != null) __obj.updateDynamic("httpTokens")(httpTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateMetadataOptions]
  }
}

