package typings
package reactDashSvgLib.reactDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Props extends js.Object {
  var evalScripts: js.UndefOr[
    reactDashSvgLib.reactDashSvgLibStrings.always | reactDashSvgLib.reactDashSvgLibStrings.once | reactDashSvgLib.reactDashSvgLibStrings.never
  ] = js.undefined
  var onInjected: js.UndefOr[js.Function1[/* svg */ reactLib.SVGSVGElement, scala.Unit]] = js.undefined
  var renumerateIRIElements: js.UndefOr[scala.Boolean] = js.undefined
  var src: java.lang.String
  var svgClassName: js.UndefOr[java.lang.String] = js.undefined
  var svgStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

