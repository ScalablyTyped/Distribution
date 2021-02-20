package typings.stompit

import typings.stompit.clientMod.Ack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stompitStrings {
  
  @js.native
  sealed trait auto extends Ack
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait client extends Ack
  @scala.inline
  def client: client = "client".asInstanceOf[client]
  
  @js.native
  sealed trait `client-individual` extends Ack
  @scala.inline
  def `client-individual`: `client-individual` = "client-individual".asInstanceOf[`client-individual`]
  
  @js.native
  sealed trait connect extends StObject
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait connecting extends StObject
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait error extends StObject
  @scala.inline
  def error: error = "error".asInstanceOf[error]
}
