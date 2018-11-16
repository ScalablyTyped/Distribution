package typings
package reconnectingwebsocketLib.reconnectingwebsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var automaticOpen: js.UndefOr[scala.Boolean] = js.undefined
  var binaryType: js.UndefOr[
    reconnectingwebsocketLib.reconnectingwebsocketLibStrings.blob | reconnectingwebsocketLib.reconnectingwebsocketLibStrings.arraybuffer
  ] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var maxReconnectAttempts: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var maxReconnectInterval: js.UndefOr[scala.Double] = js.undefined
  var reconnectDecay: js.UndefOr[scala.Double] = js.undefined
  var reconnectInterval: js.UndefOr[scala.Double] = js.undefined
  var timeoutInterval: js.UndefOr[scala.Double] = js.undefined
}

