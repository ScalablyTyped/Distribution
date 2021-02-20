package typings.rnFetchBlob.mod

import typings.std.Event
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolyfillFileReader extends EventTarget {
  
  def abort(): Unit = js.native
  
  var isRNFBPolyFill: Boolean = js.native
  
  def onabort(e: Event): Unit = js.native
  
  def onerror(e: Event): Unit = js.native
  
  def onload(e: Event): Unit = js.native
  
  def onloadend(e: Event): Unit = js.native
  
  def onloadstart(e: Event): Unit = js.native
  
  def onprogress(e: Event): Unit = js.native
  
  def readAsArrayBuffer(b: PolyfillBlob): Unit = js.native
  
  def readAsBinaryString(b: PolyfillBlob): Unit = js.native
  
  def readAsDataURL(b: PolyfillBlob): Unit = js.native
  
  def readAsText(b: PolyfillBlob): Unit = js.native
  def readAsText(b: PolyfillBlob, label: String): Unit = js.native
  
  var readyState: Double = js.native
  
  var result: Double = js.native
}
object PolyfillFileReader {
  
  @JSImport("rn-fetch-blob", "PolyfillFileReader.DONE")
  @js.native
  val DONE: Double = js.native
  
  @JSImport("rn-fetch-blob", "PolyfillFileReader.EMPTY")
  @js.native
  val EMPTY: Double = js.native
  
  @JSImport("rn-fetch-blob", "PolyfillFileReader.LOADING")
  @js.native
  val LOADING: Double = js.native
}
