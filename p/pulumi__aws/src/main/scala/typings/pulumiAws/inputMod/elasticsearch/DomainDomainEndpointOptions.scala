package typings.pulumiAws.inputMod.elasticsearch

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDomainEndpointOptions extends js.Object {
  /**
    * Whether or not to require HTTPS
    */
  var enforceHttps: Input[Boolean] = js.native
  /**
    * <elided>
    */
  var tlsSecurityPolicy: js.UndefOr[Input[String]] = js.native
}

object DomainDomainEndpointOptions {
  @scala.inline
  def apply(enforceHttps: Input[Boolean], tlsSecurityPolicy: Input[String] = null): DomainDomainEndpointOptions = {
    val __obj = js.Dynamic.literal(enforceHttps = enforceHttps.asInstanceOf[js.Any])
    if (tlsSecurityPolicy != null) __obj.updateDynamic("tlsSecurityPolicy")(tlsSecurityPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDomainEndpointOptions]
  }
}

