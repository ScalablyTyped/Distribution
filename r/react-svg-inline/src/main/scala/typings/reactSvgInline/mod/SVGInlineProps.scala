package typings.reactSvgInline.mod

import typings.react.mod.ReactNode
import typings.reactSvgInline.reactSvgInlineStrings.comment
import typings.reactSvgInline.reactSvgInlineStrings.defs
import typings.reactSvgInline.reactSvgInlineStrings.desc
import typings.reactSvgInline.reactSvgInlineStrings.fill
import typings.reactSvgInline.reactSvgInlineStrings.height
import typings.reactSvgInline.reactSvgInlineStrings.sketchMSLayerGroup
import typings.reactSvgInline.reactSvgInlineStrings.sketchMSPage
import typings.reactSvgInline.reactSvgInlineStrings.sketchMSShapeGroup
import typings.reactSvgInline.reactSvgInlineStrings.title
import typings.reactSvgInline.reactSvgInlineStrings.width
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

