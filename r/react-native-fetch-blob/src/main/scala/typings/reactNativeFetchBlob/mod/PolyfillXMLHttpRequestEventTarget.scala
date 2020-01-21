package typings.reactNativeFetchBlob.mod

import typings.std.EventTarget
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolyfillXMLHttpRequestEventTarget extends EventTarget {
  def onabort(e: Event_): Unit = js.native
  def onerror(e: Event_): Unit = js.native
  def onload(e: Event_): Unit = js.native
  def onloadend(e: Event_): Unit = js.native
  def onloadstart(e: Event_): Unit = js.native
  def onprogress(e: Event_): Unit = js.native
  def ontimeout(e: Event_): Unit = js.native
}

