package typings.qrcodeDashSvg.qrcodeDashSvgMod

import typings.qrcodeDashSvg.qrcodeDashSvgStrings.H
import typings.qrcodeDashSvg.qrcodeDashSvgStrings.L
import typings.qrcodeDashSvg.qrcodeDashSvgStrings.M
import typings.qrcodeDashSvg.qrcodeDashSvgStrings.Q
import typings.qrcodeDashSvg.qrcodeDashSvgStrings.`svg-viewbox`
import typings.qrcodeDashSvg.qrcodeDashSvgStrings.g
import typings.qrcodeDashSvg.qrcodeDashSvgStrings.none
import typings.qrcodeDashSvg.qrcodeDashSvgStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Color of background, color name or hex string. Default is `#fffff`. */
  var background: js.UndefOr[String] = js.undefined
  /** Color of modules (squares), color name or hex string. Default is `#000000`. */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Wrapping element. Default is `svg`. \
    * `svg`: Populate squares in a SVG document with `width` and `height` attribute.
    * Recommended for converting to raster images or PDF where QR Code is being static (exact size). \
    * `svg-viewbox`: Populate squares in a SVG document with viewBox attriute.
    * **Recommended** for responsive web pages. \
    * `g`: Put squares in `g` element.
    * Useful when you need to put multiple QR Codes in a single SVG document \
    * `none`: No wrapper.
    */
  var container: js.UndefOr[svg | `svg-viewbox` | g | none] = js.undefined
  /** QR Code content, the only **required** parameter. */
  var content: String
  /** Error correction level. Default is `"M"`. */
  var ecl: js.UndefOr[L | M | H | Q] = js.undefined
  /** QR Code height in pixels. Default is `256`. */
  var height: js.UndefOr[Double] = js.undefined
  /** Join modules (squares) into one shape, into the SVG path element, **recommended** for web and responsive use. Default is `false`. */
  var join: js.UndefOr[Boolean] = js.undefined
  /** White space padding. `0` for no border. Default is `4`. */
  var padding: js.UndefOr[Double] = js.undefined
  /** To create a squares as pattern, then populate the canvas. Default is `false`. */
  var predefined: js.UndefOr[Boolean] = js.undefined
  /** Apply indents and new lines. Default is `true`. */
  var pretty: js.UndefOr[Boolean] = js.undefined
  /** Swap X and Y modules, only if you have issues with some QR readers. Default is `false`. */
  var swap: js.UndefOr[Boolean] = js.undefined
  /** QR Code width in pixels. Default is `256`. */
  var width: js.UndefOr[Double] = js.undefined
  /** Prepend XML declaration to the SVG document, i.e. ```<?xml version="1.0" standalone="yes"?>```. Default is `true`. */
  var xmlDeclaration: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    content: String,
    background: String = null,
    color: String = null,
    container: svg | `svg-viewbox` | g | none = null,
    ecl: L | M | H | Q = null,
    height: Int | Double = null,
    join: js.UndefOr[Boolean] = js.undefined,
    padding: Int | Double = null,
    predefined: js.UndefOr[Boolean] = js.undefined,
    pretty: js.UndefOr[Boolean] = js.undefined,
    swap: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    xmlDeclaration: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (ecl != null) __obj.updateDynamic("ecl")(ecl.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(join)) __obj.updateDynamic("join")(join.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(predefined)) __obj.updateDynamic("predefined")(predefined.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (!js.isUndefined(swap)) __obj.updateDynamic("swap")(swap.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(xmlDeclaration)) __obj.updateDynamic("xmlDeclaration")(xmlDeclaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

