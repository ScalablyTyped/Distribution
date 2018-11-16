package typings
package simpleDashWebsocketLib.simpleDashWebsocketMod.SocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options
  extends nodeLib.streamMod.internalNs.DuplexOptions {
  /** raw websocket instance to wrap */
  var socket: js.UndefOr[wsLib.wsMod.namespaced] = js.undefined
  /** websocket server url */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

