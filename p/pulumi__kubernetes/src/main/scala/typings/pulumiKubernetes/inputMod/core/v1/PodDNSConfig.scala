package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
  */
@js.native
trait PodDNSConfig extends js.Object {
  /**
    * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
    */
  var nameservers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
    */
  var options: js.UndefOr[Input[js.Array[Input[PodDNSConfigOption]]]] = js.native
  /**
    * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
    */
  var searches: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object PodDNSConfig {
  @scala.inline
  def apply(): PodDNSConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodDNSConfig]
  }
  @scala.inline
  implicit class PodDNSConfigOps[Self <: PodDNSConfig] (val x: Self) extends AnyVal {
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
    def setNameserversVarargs(value: Input[String]*): Self = this.set("nameservers", js.Array(value :_*))
    @scala.inline
    def setNameservers(value: Input[js.Array[Input[String]]]): Self = this.set("nameservers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameservers: Self = this.set("nameservers", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: Input[PodDNSConfigOption]*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: Input[js.Array[Input[PodDNSConfigOption]]]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setSearchesVarargs(value: Input[String]*): Self = this.set("searches", js.Array(value :_*))
    @scala.inline
    def setSearches(value: Input[js.Array[Input[String]]]): Self = this.set("searches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearches: Self = this.set("searches", js.undefined)
  }
  
}

