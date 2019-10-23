package typings.requestidlecallback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("request")
@js.native
object request extends js.Object {
  def apply(callback: IdleRequestCallback): IdleCallbackHandle = js.native
  def apply(callback: IdleRequestCallback, options: IdleRequestOptions): IdleCallbackHandle = js.native
}

