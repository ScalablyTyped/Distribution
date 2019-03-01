package typings
package stompitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object stompitLibStrings {
  @js.native
  sealed trait auto
    extends stompitLib.libClientMod.ClientNs.Ack
  
  @js.native
  sealed trait client
    extends stompitLib.libClientMod.ClientNs.Ack
  
  @js.native
  sealed trait `client-individual`
    extends stompitLib.libClientMod.ClientNs.Ack
  
  @js.native
  sealed trait connect extends js.Object
  
  @js.native
  sealed trait connecting extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def client: client = "client".asInstanceOf[client]
  @scala.inline
  def `client-individual`: `client-individual` = "client-individual".asInstanceOf[`client-individual`]
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
}

