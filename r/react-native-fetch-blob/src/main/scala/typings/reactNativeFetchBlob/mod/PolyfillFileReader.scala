package typings.reactNativeFetchBlob.mod

import typings.std.EventTarget
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolyfillFileReader extends EventTarget {
  var isRNFBPolyFill: Boolean = js.native
  var readyState: Double = js.native
  var result: Double = js.native
  def abort(): Unit = js.native
  def onabort(e: Event_): Unit = js.native
  def onerror(e: Event_): Unit = js.native
  def onload(e: Event_): Unit = js.native
  def onloadend(e: Event_): Unit = js.native
  def onloadstart(e: Event_): Unit = js.native
  def onprogress(e: Event_): Unit = js.native
  def readAsArrayBuffer(b: PolyfillBlob): Unit = js.native
  def readAsBinaryString(b: PolyfillBlob): Unit = js.native
  def readAsDataURL(b: PolyfillBlob): Unit = js.native
  def readAsText(b: PolyfillBlob): Unit = js.native
  def readAsText(b: PolyfillBlob, label: String): Unit = js.native
}

@JSImport("react-native-fetch-blob", "PolyfillFileReader")
@js.native
object PolyfillFileReader extends js.Object {
  val DONE: Double = js.native
  val EMPTY: Double = js.native
  val LOADING: Double = js.native
}

