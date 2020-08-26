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

@js.native
trait SVGInlineProps extends js.Object {
  var accessibilityDesc: js.UndefOr[String] = js.native
  var accessibilityLabel: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var classSuffix: js.UndefOr[String] = js.native
  var cleanup: js.UndefOr[
    Boolean | (js.Array[
      title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
    ])
  ] = js.native
  var cleanupExceptions: js.UndefOr[
    js.Array[
      title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
    ]
  ] = js.native
  var component: js.UndefOr[ReactNode] = js.native
  var fill: js.UndefOr[String] = js.native
  var height: js.UndefOr[String] = js.native
  var svg: String = js.native
  var width: js.UndefOr[String] = js.native
}

object SVGInlineProps {
  @scala.inline
  def apply(svg: String): SVGInlineProps = {
    val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGInlineProps]
  }
  @scala.inline
  implicit class SVGInlinePropsOps[Self <: SVGInlineProps] (val x: Self) extends AnyVal {
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
    def setSvg(value: String): Self = this.set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessibilityDesc(value: String): Self = this.set("accessibilityDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityDesc: Self = this.set("accessibilityDesc", js.undefined)
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClassSuffix(value: String): Self = this.set("classSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassSuffix: Self = this.set("classSuffix", js.undefined)
    @scala.inline
    def setCleanupVarargs(
      value: (title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup)*
    ): Self = this.set("cleanup", js.Array(value :_*))
    @scala.inline
    def setCleanup(
      value: Boolean | (js.Array[
          title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
        ])
    ): Self = this.set("cleanup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleanup: Self = this.set("cleanup", js.undefined)
    @scala.inline
    def setCleanupExceptionsVarargs(
      value: (title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup)*
    ): Self = this.set("cleanupExceptions", js.Array(value :_*))
    @scala.inline
    def setCleanupExceptions(
      value: js.Array[
          title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
        ]
    ): Self = this.set("cleanupExceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleanupExceptions: Self = this.set("cleanupExceptions", js.undefined)
    @scala.inline
    def setComponent(value: ReactNode): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

