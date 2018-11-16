package typings
package stompitLib.libConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit/lib/connect", JSImport.Namespace)
@js.native
object libConnectModMembers extends js.Object {
  def apply(optionsOrPath: stompitLib.libConnectMod.connectNs.ConnectOptions | java.lang.String): stompitLib.libClientMod.namespaced = js.native
  def apply(
    optionsOrPath: stompitLib.libConnectMod.connectNs.ConnectOptions | java.lang.String,
    connectionListener: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* client */ stompitLib.libClientMod.namespaced, 
      scala.Unit
    ]
  ): stompitLib.libClientMod.namespaced = js.native
  def apply(port: scala.Double): stompitLib.libClientMod.namespaced = js.native
  def apply(port: scala.Double, host: java.lang.String): stompitLib.libClientMod.namespaced = js.native
  def apply(
    port: scala.Double,
    host: java.lang.String,
    connectionListener: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* client */ stompitLib.libClientMod.namespaced, 
      scala.Unit
    ]
  ): stompitLib.libClientMod.namespaced = js.native
}

