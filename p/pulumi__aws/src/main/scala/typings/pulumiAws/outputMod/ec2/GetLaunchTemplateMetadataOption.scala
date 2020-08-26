package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateMetadataOption extends js.Object {
  /**
    * The state of the metadata service: `enabled`, `disabled`.
    */
  var httpEndpoint: String = js.native
  /**
    * The desired HTTP PUT response hop limit for instance metadata requests.
    */
  var httpPutResponseHopLimit: Double = js.native
  /**
    * If session tokens are required: `optional`, `required`.
    */
  var httpTokens: String = js.native
}

object GetLaunchTemplateMetadataOption {
  @scala.inline
  def apply(httpEndpoint: String, httpPutResponseHopLimit: Double, httpTokens: String): GetLaunchTemplateMetadataOption = {
    val __obj = js.Dynamic.literal(httpEndpoint = httpEndpoint.asInstanceOf[js.Any], httpPutResponseHopLimit = httpPutResponseHopLimit.asInstanceOf[js.Any], httpTokens = httpTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateMetadataOption]
  }
  @scala.inline
  implicit class GetLaunchTemplateMetadataOptionOps[Self <: GetLaunchTemplateMetadataOption] (val x: Self) extends AnyVal {
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

