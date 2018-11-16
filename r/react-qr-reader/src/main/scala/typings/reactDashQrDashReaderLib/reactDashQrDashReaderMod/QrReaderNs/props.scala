package typings
package reactDashQrDashReaderLib.reactDashQrDashReaderMod.QrReaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait props extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.native
  var delay: js.UndefOr[scala.Double | reactDashQrDashReaderLib.reactDashQrDashReaderLibNumbers.`false`] = js.native
  var facingMode: js.UndefOr[
    reactDashQrDashReaderLib.reactDashQrDashReaderLibStrings.user | reactDashQrDashReaderLib.reactDashQrDashReaderLibStrings.environment
  ] = js.native
  var legacyMode: js.UndefOr[scala.Boolean] = js.native
  var onImageLoad: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLImageElement], 
      scala.Unit
    ]
  ] = js.native
  var onLoad: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var resolution: js.UndefOr[scala.Double] = js.native
  var showViewFinder: js.UndefOr[scala.Boolean] = js.native
  var style: js.UndefOr[js.Any] = js.native
  def onError(err: js.Any): scala.Unit = js.native
  def onScan(): scala.Unit = js.native
  def onScan(data: java.lang.String): scala.Unit = js.native
}

