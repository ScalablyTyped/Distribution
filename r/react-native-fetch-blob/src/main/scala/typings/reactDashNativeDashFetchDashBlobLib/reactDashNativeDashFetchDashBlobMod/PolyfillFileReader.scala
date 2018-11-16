package typings
package reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolyfillFileReader
  extends stdLib.EventTarget {
  var isRNFBPolyFill: scala.Boolean = js.native
  var readyState: scala.Double = js.native
  var result: scala.Double = js.native
  def abort(): scala.Unit = js.native
  def onabort(e: stdLib.Event): scala.Unit = js.native
  def onerror(e: stdLib.Event): scala.Unit = js.native
  def onload(e: stdLib.Event): scala.Unit = js.native
  def onloadend(e: stdLib.Event): scala.Unit = js.native
  def onloadstart(e: stdLib.Event): scala.Unit = js.native
  def onprogress(e: stdLib.Event): scala.Unit = js.native
  def readAsArrayBuffer(b: PolyfillBlob): scala.Unit = js.native
  def readAsBinaryString(b: PolyfillBlob): scala.Unit = js.native
  def readAsDataURL(b: PolyfillBlob): scala.Unit = js.native
  def readAsText(b: PolyfillBlob): scala.Unit = js.native
  def readAsText(b: PolyfillBlob, label: java.lang.String): scala.Unit = js.native
}

