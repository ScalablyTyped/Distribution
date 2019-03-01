package typings
package reactDashSvgDashInlineLib.reactDashSvgDashInlineMod.svgInlineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGInlineProps extends js.Object {
  var accessibilityDesc: js.UndefOr[java.lang.String] = js.undefined
  var accessibilityLabel: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var classSuffix: js.UndefOr[java.lang.String] = js.undefined
  var cleanup: js.UndefOr[
    scala.Boolean | (js.Array[
      reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.title | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.desc | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.comment | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.defs | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.width | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.height | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.fill | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.sketchMSShapeGroup | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.sketchMSPage | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.sketchMSLayerGroup
    ])
  ] = js.undefined
  var cleanupExceptions: js.UndefOr[
    js.Array[
      reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.title | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.desc | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.comment | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.defs | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.width | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.height | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.fill | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.sketchMSShapeGroup | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.sketchMSPage | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.sketchMSLayerGroup
    ]
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var svg: java.lang.String
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object SVGInlineProps {
  @scala.inline
  def apply(
    svg: java.lang.String,
    accessibilityDesc: java.lang.String = null,
    accessibilityLabel: java.lang.String = null,
    className: java.lang.String = null,
    classSuffix: java.lang.String = null,
    cleanup: scala.Boolean | (js.Array[
      reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.title | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.desc | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.comment | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.defs | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.width | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.height | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.fill | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.sketchMSShapeGroup | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.sketchMSPage | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.sketchMSLayerGroup
    ]) = null,
    cleanupExceptions: js.Array[
      reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.title | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.desc | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.comment | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.defs | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.width | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.height | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.fill | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.sketchMSShapeGroup | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.sketchMSPage | reactDashSvgDashInlineLib.reactDashSvgDashInlineLibStrings.sketchMSLayerGroup
    ] = null,
    component: reactLib.reactMod.ReactNs.ReactNode = null,
    fill: java.lang.String = null,
    height: java.lang.String = null,
    width: java.lang.String = null
  ): SVGInlineProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("svg")(svg)
    if (accessibilityDesc != null) __obj.updateDynamic("accessibilityDesc")(accessibilityDesc)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classSuffix != null) __obj.updateDynamic("classSuffix")(classSuffix)
    if (cleanup != null) __obj.updateDynamic("cleanup")(cleanup.asInstanceOf[js.Any])
    if (cleanupExceptions != null) __obj.updateDynamic("cleanupExceptions")(cleanupExceptions)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (height != null) __obj.updateDynamic("height")(height)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[SVGInlineProps]
  }
}

