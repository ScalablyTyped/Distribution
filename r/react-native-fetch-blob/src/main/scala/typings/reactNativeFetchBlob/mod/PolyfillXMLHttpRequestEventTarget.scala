package typings.reactNativeFetchBlob.mod

import typings.std.Event
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolyfillXMLHttpRequestEventTarget extends EventTarget {
  
  def onabort(e: Event): Unit = js.native
  
  def onerror(e: Event): Unit = js.native
  
  def onload(e: Event): Unit = js.native
  
  def onloadend(e: Event): Unit = js.native
  
  def onloadstart(e: Event): Unit = js.native
  
  def onprogress(e: Event): Unit = js.native
  
  def ontimeout(e: Event): Unit = js.native
}
