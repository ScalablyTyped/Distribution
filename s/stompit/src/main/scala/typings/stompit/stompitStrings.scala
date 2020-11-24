package typings.stompit

import typings.stompit.clientMod.Ack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stompitStrings {
  
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
  
  @js.native
  sealed trait auto extends Ack
  
  @js.native
  sealed trait client extends Ack
  
  @js.native
  sealed trait `client-individual` extends Ack
  
  @js.native
  sealed trait connect extends js.Object
  
  @js.native
  sealed trait connecting extends js.Object
  
  @js.native
  sealed trait error extends js.Object
}
