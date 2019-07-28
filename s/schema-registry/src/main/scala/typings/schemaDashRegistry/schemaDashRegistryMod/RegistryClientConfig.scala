package typings.schemaDashRegistry.schemaDashRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistryClientConfig extends js.Object {
  var host: String
  var logger: js.UndefOr[js.Object] = js.undefined
  var port: Double
  var protocol: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object RegistryClientConfig {
  @scala.inline
  def apply(
    host: String,
    port: Double,
    logger: js.Object = null,
    protocol: String = null,
    `type`: String = null
  ): RegistryClientConfig = {
    val __obj = js.Dynamic.literal(host = host, port = port)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RegistryClientConfig]
  }
}

