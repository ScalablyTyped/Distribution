package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ImageBitmapOptions extends js.Object {
  var colorSpaceConversion: js.UndefOr[stdLib.stdLibStrings.none | stdLib.stdLibStrings.default] = js.undefined
  var imageOrientation: js.UndefOr[stdLib.stdLibStrings.none | stdLib.stdLibStrings.flipY] = js.undefined
  var premultiplyAlpha: js.UndefOr[
    stdLib.stdLibStrings.none | stdLib.stdLibStrings.premultiply | stdLib.stdLibStrings.default
  ] = js.undefined
  var resizeHeight: js.UndefOr[scala.Double] = js.undefined
  var resizeQuality: js.UndefOr[
    stdLib.stdLibStrings.pixelated | stdLib.stdLibStrings.low | stdLib.stdLibStrings.medium | stdLib.stdLibStrings.high
  ] = js.undefined
  var resizeWidth: js.UndefOr[scala.Double] = js.undefined
}

