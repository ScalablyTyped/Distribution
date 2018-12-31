package typings
package stompitLib.libConnectFailoverMod.ConnectFailoverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectFailoverOptions extends js.Object {
  // Override the connect function
  var connectFunction: js.UndefOr[
    js.Function2[
      /* options */ stompitLib.libConnectMod.connectNs.ConnectOptions, 
      /* connectionListener */ js.UndefOr[
        js.Function2[
          /* err */ nodeLib.Error | scala.Null, 
          /* client */ stompitLib.libClientMod.namespaced, 
          scala.Unit
        ]
      ], 
      stompitLib.libClientMod.namespaced
    ]
  ] = js.undefined
  // Milliseconds delay of the first reconnect
  var initialReconnectDelay: js.UndefOr[scala.Double] = js.undefined
  // Maximum milliseconds delay of any reconnect
  var maxReconnectDelay: js.UndefOr[scala.Double] = js.undefined
  // Maximum number of reconnects
  var maxReconnects: js.UndefOr[scala.Double] = js.undefined
  // Randomly choose a server to use for reconnect
  var randomize: js.UndefOr[scala.Boolean] = js.undefined
  // The exponent used in the exponential backoff attempts
  var reconnectDelayExponent: js.UndefOr[scala.Double] = js.undefined
  // Exponential increase of the reconnect delay
  var useExponentialBackOff: js.UndefOr[scala.Boolean] = js.undefined
}

