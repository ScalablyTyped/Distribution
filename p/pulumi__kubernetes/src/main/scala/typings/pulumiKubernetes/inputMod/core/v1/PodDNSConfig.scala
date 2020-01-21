package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from
  * DNSPolicy.
  */
trait PodDNSConfig extends js.Object {
  /**
    * A list of DNS name server IP addresses. This will be appended to the base nameservers
    * generated from DNSPolicy. Duplicated nameservers will be removed.
    */
  var nameservers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A list of DNS resolver options. This will be merged with the base options generated from
    * DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will
    * override those that appear in the base DNSPolicy.
    */
  var options: js.UndefOr[Input[js.Array[Input[PodDNSConfigOption]]]] = js.undefined
  /**
    * A list of DNS search domains for host-name lookup. This will be appended to the base search
    * paths generated from DNSPolicy. Duplicated search paths will be removed.
    */
  var searches: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object PodDNSConfig {
  @scala.inline
  def apply(
    nameservers: Input[js.Array[Input[String]]] = null,
    options: Input[js.Array[Input[PodDNSConfigOption]]] = null,
    searches: Input[js.Array[Input[String]]] = null
  ): PodDNSConfig = {
    val __obj = js.Dynamic.literal()
    if (nameservers != null) __obj.updateDynamic("nameservers")(nameservers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (searches != null) __obj.updateDynamic("searches")(searches.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodDNSConfig]
  }
}

