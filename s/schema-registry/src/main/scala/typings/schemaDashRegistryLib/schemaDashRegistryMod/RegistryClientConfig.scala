package typings
package schemaDashRegistryLib.schemaDashRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistryClientConfig extends js.Object {
  var host: java.lang.String
  var logger: js.UndefOr[js.Object] = js.undefined
  var port: scala.Double
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object RegistryClientConfig {
  @scala.inline
  def apply(
    host: java.lang.String,
    port: scala.Double,
    logger: js.Object = null,
    protocol: java.lang.String = null,
    `type`: java.lang.String = null
  ): RegistryClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("port")(port)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RegistryClientConfig]
  }
}

