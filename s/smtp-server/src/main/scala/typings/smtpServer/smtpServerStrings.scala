package typings.smtpServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smtpServerStrings {
  
  @scala.inline
  def LOGIN: LOGIN = "LOGIN".asInstanceOf[LOGIN]
  
  @scala.inline
  def PLAIN: PLAIN = "PLAIN".asInstanceOf[PLAIN]
  
  @scala.inline
  def XOAUTH2: XOAUTH2 = "XOAUTH2".asInstanceOf[XOAUTH2]
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait LOGIN extends js.Object
  
  @js.native
  sealed trait PLAIN extends js.Object
  
  @js.native
  sealed trait XOAUTH2 extends js.Object
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait error extends js.Object
}
