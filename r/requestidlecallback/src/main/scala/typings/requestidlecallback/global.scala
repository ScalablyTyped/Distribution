package typings.requestidlecallback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("cancel")
  @js.native
  def cancel(handle: IdleCallbackHandle): Unit = js.native
  
  @JSGlobal("cancelIdleCallback")
  @js.native
  def cancelIdleCallback(handle: Double): Unit = js.native
  
  @JSGlobal("request")
  @js.native
  def request(callback: IdleRequestCallback): IdleCallbackHandle = js.native
  @JSGlobal("request")
  @js.native
  def request(callback: IdleRequestCallback, options: IdleRequestOptions): IdleCallbackHandle = js.native
  
  @JSGlobal("requestIdleCallback")
  @js.native
  def requestIdleCallback(callback: IdleRequestCallback): Double = js.native
  @JSGlobal("requestIdleCallback")
  @js.native
  def requestIdleCallback(callback: IdleRequestCallback, options: IdleRequestOptions): Double = js.native
}
