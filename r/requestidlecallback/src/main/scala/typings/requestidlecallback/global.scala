package typings.requestidlecallback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def cancel(handle: IdleCallbackHandle): Unit = js.native
  
  def cancelIdleCallback(handle: Double): Unit = js.native
  
  def request(callback: IdleRequestCallback): IdleCallbackHandle = js.native
  def request(callback: IdleRequestCallback, options: IdleRequestOptions): IdleCallbackHandle = js.native
  
  def requestIdleCallback(callback: IdleRequestCallback): Double = js.native
  def requestIdleCallback(callback: IdleRequestCallback, options: IdleRequestOptions): Double = js.native
}
