package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTPGetAction describes an action based on HTTP Get requests.
  */
trait HTTPGetAction extends js.Object {
  /**
    * Host name to connect to, defaults to the pod IP. You probably want to set "Host" in
    * httpHeaders instead.
    */
  var host: js.UndefOr[Input[String]] = js.undefined
  /**
    * Custom headers to set in the request. HTTP allows repeated headers.
    */
  var httpHeaders: js.UndefOr[Input[js.Array[Input[HTTPHeader]]]] = js.undefined
  /**
    * Path to access on the HTTP server.
    */
  var path: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name or number of the port to access on the container. Number must be in the range 1 to
    * 65535. Name must be an IANA_SVC_NAME.
    */
  var port: Input[Double | String]
  /**
    * Scheme to use for connecting to the host. Defaults to HTTP.
    */
  var scheme: js.UndefOr[Input[String]] = js.undefined
}

object HTTPGetAction {
  @scala.inline
  def apply(
    port: Input[Double | String],
    host: Input[String] = null,
    httpHeaders: Input[js.Array[Input[HTTPHeader]]] = null,
    path: Input[String] = null,
    scheme: Input[String] = null
  ): HTTPGetAction = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (httpHeaders != null) __obj.updateDynamic("httpHeaders")(httpHeaders.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPGetAction]
  }
}

