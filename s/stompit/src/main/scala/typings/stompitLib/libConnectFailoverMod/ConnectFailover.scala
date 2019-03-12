package typings
package stompitLib.libConnectFailoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectFailover
  extends nodeLib.eventsMod.EventEmitter {
  def addServer(config: java.lang.String): scala.Unit = js.native
  def addServer(config: stompitLib.libConnectMod.connectNs.ConnectOptions): scala.Unit = js.native
  def connect(
    callback: js.Function4[
      /* error */ stdLib.Error | scala.Null, 
      /* client */ stompitLib.libClientMod.namespaced, 
      /* reconnect */ js.Function0[scala.Unit], 
      /* server */ stompitLib.libConnectFailoverMod.ConnectFailoverNs.Server, 
      scala.Unit
    ]
  ): stompitLib.Anon_Abort = js.native
  def getReconnectDelay(reconnects: scala.Double): scala.Double = js.native
  @JSName("on")
  def on_connect(
    event: stompitLib.stompitLibStrings.connect,
    listener: js.Function1[
      /* server */ stompitLib.libConnectFailoverMod.ConnectFailoverNs.ConnectState, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_connecting(
    event: stompitLib.stompitLibStrings.connecting,
    listener: js.Function1[
      /* server */ stompitLib.libConnectFailoverMod.ConnectFailoverNs.ConnectState, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: stompitLib.stompitLibStrings.error,
    listener: js.Function2[
      /* err */ stompitLib.libConnectFailoverMod.ConnectFailoverNs.ConnectError, 
      /* server */ stompitLib.libConnectFailoverMod.ConnectFailoverNs.ConnectState, 
      scala.Unit
    ]
  ): this.type = js.native
}

