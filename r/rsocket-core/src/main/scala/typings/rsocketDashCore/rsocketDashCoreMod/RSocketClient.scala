package typings.rsocketDashCore.rsocketDashCoreMod

import typings.rsocketDashCore.rSocketClientMod.ClientConfig
import typings.rsocketDashCore.rSocketClientMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core", "RSocketClient")
@js.native
class RSocketClient[D, M] protected () extends default[D, M] {
  def this(config: ClientConfig[D, M]) = this()
}

