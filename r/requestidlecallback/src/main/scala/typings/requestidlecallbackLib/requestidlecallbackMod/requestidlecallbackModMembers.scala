package typings
package requestidlecallbackLib.requestidlecallbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("requestidlecallback", JSImport.Namespace)
@js.native
object requestidlecallbackModMembers extends js.Object {
  def cancelIdleCallback(handle: IdleCallbackHandle): scala.Unit = js.native
  def requestIdleCallback(callback: IdleRequestCallback): IdleCallbackHandle = js.native
  def requestIdleCallback(callback: IdleRequestCallback, options: IdleRequestOptions): IdleCallbackHandle = js.native
}

