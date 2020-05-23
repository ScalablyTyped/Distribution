package typings.snykDockerPlugin.distDockerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerOptions extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var tlsCaCert: js.UndefOr[String] = js.undefined
  var tlsCert: js.UndefOr[String] = js.undefined
  var tlsKey: js.UndefOr[String] = js.undefined
  var tlsVerify: js.UndefOr[String] = js.undefined
}

object DockerOptions {
  @scala.inline
  def apply(
    host: String = null,
    tlsCaCert: String = null,
    tlsCert: String = null,
    tlsKey: String = null,
    tlsVerify: String = null
  ): DockerOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (tlsCaCert != null) __obj.updateDynamic("tlsCaCert")(tlsCaCert.asInstanceOf[js.Any])
    if (tlsCert != null) __obj.updateDynamic("tlsCert")(tlsCert.asInstanceOf[js.Any])
    if (tlsKey != null) __obj.updateDynamic("tlsKey")(tlsKey.asInstanceOf[js.Any])
    if (tlsVerify != null) __obj.updateDynamic("tlsVerify")(tlsVerify.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerOptions]
  }
}

