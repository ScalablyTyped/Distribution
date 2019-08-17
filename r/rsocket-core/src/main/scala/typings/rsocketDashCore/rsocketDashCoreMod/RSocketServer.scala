package typings.rsocketDashCore.rsocketDashCoreMod

import typings.rsocketDashCore.rSocketServerMod.ServerConfig
import typings.rsocketDashCore.rSocketServerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core", "RSocketServer")
@js.native
class RSocketServer[D, M] protected () extends default[D, M] {
  def this(config: ServerConfig[D, M]) = this()
}

