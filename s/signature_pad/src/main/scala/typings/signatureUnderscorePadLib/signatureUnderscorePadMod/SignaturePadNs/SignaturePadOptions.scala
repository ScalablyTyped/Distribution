package typings
package signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SignaturePadOptions extends js.Object {
  /*
       * (string) Color used to clear the background. Can be any color format accepted by context.fillStyle. Defaults to "rgba(0,0,0,0)" (transparent black). Use a non-transparent color e.g. "rgb(255,255,255)" (opaque white) if you'd like to save signatures as JPEG images.
       */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /*
       * (float or function) Radius of a single dot.
       */
  var dotSize: js.UndefOr[scala.Double | js.Function0[scala.Double]] = js.undefined
  /*
       * (float) Maximum width of a line. Defaults to 2.5.
       */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /*
       * (integer) Add the next point only if the previous one is farther than x pixels. Defaults to 5.
       */
  var minDistance: js.UndefOr[scala.Double] = js.undefined
  /*
       * (float) Minimum width of a line. Defaults to 0.5.
       */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /*
       * (function) Callback when stroke begin.
       */
  var onBegin: js.UndefOr[js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]] = js.undefined
  /*
       * (function) Callback when stroke end.
       */
  var onEnd: js.UndefOr[js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]] = js.undefined
  /*
       * (string) Color used to draw the lines. Can be any color format accepted by context.fillStyle. Defaults to "black".
       */
  var penColor: js.UndefOr[java.lang.String] = js.undefined
  /*
       * (integer) Draw the next point at most once per every x milliseconds. Set it to 0 to turn off throttling. Defaults to 16.
       */
  var throttle: js.UndefOr[scala.Double] = js.undefined
  /*
       * (float) Weight used to modify new velocity based on the previous velocity. Defaults to 0.7.
       */
  var velocityFilterWeight: js.UndefOr[scala.Double] = js.undefined
}

