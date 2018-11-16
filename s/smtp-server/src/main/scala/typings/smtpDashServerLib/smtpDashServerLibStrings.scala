package typings
package smtpDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object smtpDashServerLibStrings {
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
  
  def LOGIN: LOGIN = "LOGIN".asInstanceOf[LOGIN]
  def PLAIN: PLAIN = "PLAIN".asInstanceOf[PLAIN]
  def XOAUTH2: XOAUTH2 = "XOAUTH2".asInstanceOf[XOAUTH2]
  def close: close = "close".asInstanceOf[close]
  def error: error = "error".asInstanceOf[error]
}

