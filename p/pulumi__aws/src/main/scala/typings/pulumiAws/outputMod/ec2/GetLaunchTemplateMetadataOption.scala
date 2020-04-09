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
}

