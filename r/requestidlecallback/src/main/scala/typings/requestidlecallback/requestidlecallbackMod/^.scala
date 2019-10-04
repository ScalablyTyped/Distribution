package typings.requestidlecallback.requestidlecallbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("requestidlecallback", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cancel(handle: IdleCallbackHandle): Unit = js.native
  def request(callback: IdleRequestCallback): IdleCallbackHandle = js.native
  def request(callback: IdleRequestCallback, options: IdleRequestOptions): IdleCallbackHandle = js.native
}

