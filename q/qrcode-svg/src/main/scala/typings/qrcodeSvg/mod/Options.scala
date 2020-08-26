package typings.qrcodeSvg.mod

import typings.qrcodeSvg.qrcodeSvgStrings.H
import typings.qrcodeSvg.qrcodeSvgStrings.L
import typings.qrcodeSvg.qrcodeSvgStrings.M
import typings.qrcodeSvg.qrcodeSvgStrings.Q
import typings.qrcodeSvg.qrcodeSvgStrings.`svg-viewbox`
import typings.qrcodeSvg.qrcodeSvgStrings.g
import typings.qrcodeSvg.qrcodeSvgStrings.none
import typings.qrcodeSvg.qrcodeSvgStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Color of background, color name or hex string. Default is `#fffff`. */
  var background: js.UndefOr[String] = js.native
  /** Color of modules (squares), color name or hex string. Default is `#000000`. */
  var color: js.UndefOr[String] = js.native
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
  var container: js.UndefOr[svg | `svg-viewbox` | g | none] = js.native
  /** QR Code content, the only **required** parameter. */
  var content: String = js.native
  /** Error correction level. Default is `"M"`. */
  var ecl: js.UndefOr[L | M | H | Q] = js.native
  /** QR Code height in pixels. Default is `256`. */
  var height: js.UndefOr[Double] = js.native
  /** Join modules (squares) into one shape, into the SVG path element, **recommended** for web and responsive use. Default is `false`. */
  var join: js.UndefOr[Boolean] = js.native
  /** White space padding. `0` for no border. Default is `4`. */
  var padding: js.UndefOr[Double] = js.native
  /** To create a squares as pattern, then populate the canvas. Default is `false`. */
  var predefined: js.UndefOr[Boolean] = js.native
  /** Apply indents and new lines. Default is `true`. */
  var pretty: js.UndefOr[Boolean] = js.native
  /** Swap X and Y modules, only if you have issues with some QR readers. Default is `false`. */
  var swap: js.UndefOr[Boolean] = js.native
  /** QR Code width in pixels. Default is `256`. */
  var width: js.UndefOr[Double] = js.native
  /** Prepend XML declaration to the SVG document, i.e. ```<?xml version="1.0" standalone="yes"?>```. Default is `true`. */
  var xmlDeclaration: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(content: String): Options = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setContainer(value: svg | `svg-viewbox` | g | none): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setEcl(value: L | M | H | Q): Self = this.set("ecl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcl: Self = this.set("ecl", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setJoin(value: Boolean): Self = this.set("join", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoin: Self = this.set("join", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPredefined(value: Boolean): Self = this.set("predefined", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredefined: Self = this.set("predefined", js.undefined)
    @scala.inline
    def setPretty(value: Boolean): Self = this.set("pretty", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
    @scala.inline
    def setSwap(value: Boolean): Self = this.set("swap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwap: Self = this.set("swap", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setXmlDeclaration(value: Boolean): Self = this.set("xmlDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlDeclaration: Self = this.set("xmlDeclaration", js.undefined)
  }
  
}

