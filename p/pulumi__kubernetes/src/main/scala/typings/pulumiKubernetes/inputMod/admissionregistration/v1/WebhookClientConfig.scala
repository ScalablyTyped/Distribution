package typings.pulumiKubernetes.inputMod.admissionregistration.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WebhookClientConfig contains the information to make a TLS connection with the webhook
  */
@js.native
trait WebhookClientConfig extends js.Object {
  /**
    * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.
    */
  var caBundle: js.UndefOr[Input[String]] = js.native
  /**
    * `service` is a reference to the service for this webhook. Either `service` or `url` must be specified.
    *
    * If the webhook is running within the cluster, then you should use `service`.
    */
  var service: js.UndefOr[Input[ServiceReference]] = js.native
  /**
    * `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or `service` must be specified.
    *
    * The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.
    *
    * Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.
    *
    * The scheme must be "https"; the URL must begin with "https://".
    *
    * A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.
    *
    * Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments ("#...") and query parameters ("?...") are not allowed, either.
    */
  var url: js.UndefOr[Input[String]] = js.native
}

object WebhookClientConfig {
  @scala.inline
  def apply(): WebhookClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookClientConfig]
  }
  @scala.inline
  implicit class WebhookClientConfigOps[Self <: WebhookClientConfig] (val x: Self) extends AnyVal {
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
    def setCaBundle(value: Input[String]): Self = this.set("caBundle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaBundle: Self = this.set("caBundle", js.undefined)
    @scala.inline
    def setService(value: Input[ServiceReference]): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    @scala.inline
    def setUrl(value: Input[String]): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

