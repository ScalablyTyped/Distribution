package typings.pulumiCloud.apiMod

import typings.pulumiPulumi.outputMod.Output_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpDeployment extends js.Object {
  /**
    * An optional list of custom domain names, each corresponding to a
    * previous call to attachCustomDomain on the API.  Each name
    * should be mapped using a DNS A record.
    */
  var customDomainNames: js.Array[Output_[String]]
  /**
    * The URL at which the HttpDeployment is available to the Internet.
    */
  var url: Output_[String]
}

object HttpDeployment {
  @scala.inline
  def apply(customDomainNames: js.Array[Output_[String]], url: Output_[String]): HttpDeployment = {
    val __obj = js.Dynamic.literal(customDomainNames = customDomainNames.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HttpDeployment]
  }
}

