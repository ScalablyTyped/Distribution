package typings
package requestidlecallbackLib.requestidlecallbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("requestidlecallback", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cancelIdleCallback(handle: requestidlecallbackLib.requestidlecallbackMod.IdleCallbackHandle): scala.Unit = js.native
  def requestIdleCallback(callback: requestidlecallbackLib.requestidlecallbackMod.IdleRequestCallback): requestidlecallbackLib.requestidlecallbackMod.IdleCallbackHandle = js.native
  def requestIdleCallback(
    callback: requestidlecallbackLib.requestidlecallbackMod.IdleRequestCallback,
    options: requestidlecallbackLib.requestidlecallbackMod.IdleRequestOptions
  ): requestidlecallbackLib.requestidlecallbackMod.IdleCallbackHandle = js.native
}

