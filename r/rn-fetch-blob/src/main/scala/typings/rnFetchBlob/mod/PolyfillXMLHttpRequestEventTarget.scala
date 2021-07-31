package typings.rnFetchBlob.mod

import typings.std.Event
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolyfillXMLHttpRequestEventTarget
  extends StObject
     with EventTarget {
  
  def onabort(e: Event): Unit = js.native
  
  def onerror(e: Event): Unit = js.native
  
  def onload(e: Event): Unit = js.native
  
  def onloadend(e: Event): Unit = js.native
  
  def onloadstart(e: Event): Unit = js.native
  
  def onprogress(e: Event): Unit = js.native
  
  def ontimeout(e: Event): Unit = js.native
}
