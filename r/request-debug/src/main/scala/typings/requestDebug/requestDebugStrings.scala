package typings.requestDebug

import typings.requestDebug.mod.LogPhase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestDebugStrings {
  
  @js.native
  sealed trait auth extends LogPhase
  @scala.inline
  def auth: auth = "auth".asInstanceOf[auth]
  
  @js.native
  sealed trait redirect extends LogPhase
  @scala.inline
  def redirect: redirect = "redirect".asInstanceOf[redirect]
  
  @js.native
  sealed trait request extends LogPhase
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  
  @js.native
  sealed trait response extends LogPhase
  @scala.inline
  def response: response = "response".asInstanceOf[response]
}
