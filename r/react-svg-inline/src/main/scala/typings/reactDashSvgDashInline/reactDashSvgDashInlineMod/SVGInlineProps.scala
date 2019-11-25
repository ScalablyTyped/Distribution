package typings.reactDashSvgDashInline.reactDashSvgDashInlineMod

import typings.react.reactMod.ReactNode
import typings.reactDashSvgDashInline.reactDashSvgDashInlineStrings.comment
import typings.reactDashSvgDashInline.reactDashSvgDashInlineStrings.defs
import typings.reactDashSvgDashInline.reactDashSvgDashInlineStrings.desc
import typings.reactDashSvgDashInline.reactDashSvgDashInlineStrings.fill
import typings.reactDashSvgDashInline.reactDashSvgDashInlineStrings.height
import typings.reactDashSvgDashInline.reactDashSvgDashInlineStrings.sketchMSLayerGroup
import typings.reactDashSvgDashInline.reactDashSvgDashInlineStrings.sketchMSPage
import typings.reactDashSvgDashInline.reactDashSvgDashInlineStrings.sketchMSShapeGroup
import typings.reactDashSvgDashInline.reactDashSvgDashInlineStrings.title
import typings.reactDashSvgDashInline.reactDashSvgDashInlineStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGInlineProps extends js.Object {
  var accessibilityDesc: js.UndefOr[String] = js.undefined
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var classSuffix: js.UndefOr[String] = js.undefined
  var cleanup: js.UndefOr[
    Boolean | (js.Array[
      title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
    ])
  ] = js.undefined
  var cleanupExceptions: js.UndefOr[
    js.Array[
      title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
    ]
  ] = js.undefined
  var component: js.UndefOr[ReactNode] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var svg: String
  var width: js.UndefOr[String] = js.undefined
}

object SVGInlineProps {
  @scala.inline
  def apply(
    svg: String,
    accessibilityDesc: String = null,
    accessibilityLabel: String = null,
    className: String = null,
    classSuffix: String = null,
    cleanup: Boolean | (js.Array[
      title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
    ]) = null,
    cleanupExceptions: js.Array[
      title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
    ] = null,
    component: ReactNode = null,
    fill: String = null,
    height: String = null,
    width: String = null
  ): SVGInlineProps = {
    val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
    if (accessibilityDesc != null) __obj.updateDynamic("accessibilityDesc")(accessibilityDesc.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classSuffix != null) __obj.updateDynamic("classSuffix")(classSuffix.asInstanceOf[js.Any])
    if (cleanup != null) __obj.updateDynamic("cleanup")(cleanup.asInstanceOf[js.Any])
    if (cleanupExceptions != null) __obj.updateDynamic("cleanupExceptions")(cleanupExceptions.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGInlineProps]
  }
}

