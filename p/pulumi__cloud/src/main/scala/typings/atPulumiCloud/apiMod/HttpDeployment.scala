package typings.atPulumiCloud.apiMod

import typings.atPulumiPulumi.outputMod.Output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpDeployment extends js.Object {
  /**
    * An optional list of custom domain names, each corresponding to a
    * previous call to attachCustomDomain on the API.  Each name
    * should be mapped using a DNS A record.
    */
  var customDomainNames: js.Array[Output[String]]
  /**
    * The URL at which the HttpDeployment is available to the Internet.
    */
  var url: Output[String]
}

object HttpDeployment {
  @scala.inline
  def apply(customDomainNames: js.Array[Output[String]], url: Output[String]): HttpDeployment = {
    val __obj = js.Dynamic.literal(customDomainNames = customDomainNames, url = url)
  
    __obj.asInstanceOf[HttpDeployment]
  }
}

