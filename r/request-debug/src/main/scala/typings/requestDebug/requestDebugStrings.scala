package typings.requestDebug

import typings.requestDebug.mod.LogPhase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object requestDebugStrings {
  @js.native
  sealed trait auth extends LogPhase
  
  @js.native
  sealed trait redirect extends LogPhase
  
  @js.native
  sealed trait request extends LogPhase
  
  @js.native
  sealed trait response extends LogPhase
  
  @scala.inline
  def auth: auth = "auth".asInstanceOf[auth]
  @scala.inline
  def redirect: redirect = "redirect".asInstanceOf[redirect]
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  @scala.inline
  def response: response = "response".asInstanceOf[response]
}

