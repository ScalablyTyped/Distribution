package typings
package stompitLib.libConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit/lib/connect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(optionsOrPath: ConnectOptions | java.lang.String): stompitLib.libClientMod.^ = js.native
  def apply(
    optionsOrPath: ConnectOptions | java.lang.String,
    connectionListener: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* client */ stompitLib.libClientMod.^, 
      scala.Unit
    ]
  ): stompitLib.libClientMod.^ = js.native
  def apply(port: scala.Double): stompitLib.libClientMod.^ = js.native
  def apply(port: scala.Double, host: java.lang.String): stompitLib.libClientMod.^ = js.native
  def apply(
    port: scala.Double,
    host: java.lang.String,
    connectionListener: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* client */ stompitLib.libClientMod.^, 
      scala.Unit
    ]
  ): stompitLib.libClientMod.^ = js.native
}

