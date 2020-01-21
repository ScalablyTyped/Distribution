package typings.rsocketCore.rsocketserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketServer", JSImport.Default)
@js.native
class default[D, M] protected () extends RSocketServer[D, M] {
  def this(config: ServerConfig[D, M]) = this()
  /* CompleteClass */
  override def start(): Unit = js.native
  /* CompleteClass */
  override def stop(): Unit = js.native
}

