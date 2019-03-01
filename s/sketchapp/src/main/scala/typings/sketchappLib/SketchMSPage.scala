package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSPage extends SketchMSLayer {
  var _class: sketchappLib.sketchappLibStrings.page | sketchappLib.sketchappLibStrings.layer
  var attributedString: SketchMSAttributedString
  var constrainProportions: scala.Boolean
  // add this property to hold all CSS properties
  // of the current layer
  var css: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var exportOptions: SketchMSExportOptions
  var fixedRadius: scala.Double
  var frame: SketchMSRect
  var hasClickThrough: scala.Double
  var horizontalRulerData: SketchMSRulerData
  var id: java.lang.String
  var includeInCloudUpload: scala.Double
  var isFlippedHorizontal: scala.Double
  var isFlippedVertical: scala.Double
  var isLocked: scala.Boolean
  var isVisible: scala.Boolean
  var layerListExpandedType: scala.Double
  var layers: js.Array[SketchMSLayer]
  var name: java.lang.String
  var nameIsFixed: scala.Double
  var objectID: java.lang.String
  var resizingConstraint: scala.Double
  var resizingType: scala.Double
  var rotation: scala.Double
  var shouldBreakMaskChain: scala.Double
  var style: SketchMSStyle
  var verticalRulerData: SketchMSRulerData
}

object SketchMSPage {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.page | sketchappLib.sketchappLibStrings.layer,
    attributedString: SketchMSAttributedString,
    constrainProportions: scala.Boolean,
    exportOptions: SketchMSExportOptions,
    fixedRadius: scala.Double,
    frame: SketchMSRect,
    hasClickThrough: scala.Double,
    horizontalRulerData: SketchMSRulerData,
    id: java.lang.String,
    includeInCloudUpload: scala.Double,
    isFlippedHorizontal: scala.Double,
    isFlippedVertical: scala.Double,
    isLocked: scala.Boolean,
    isVisible: scala.Boolean,
    layerListExpandedType: scala.Double,
    layers: js.Array[SketchMSLayer],
    name: java.lang.String,
    nameIsFixed: scala.Double,
    objectID: java.lang.String,
    resizingConstraint: scala.Double,
    resizingType: scala.Double,
    rotation: scala.Double,
    shouldBreakMaskChain: scala.Double,
    style: SketchMSStyle,
    verticalRulerData: SketchMSRulerData,
    css: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    do_objectID: java.lang.String = null
  ): SketchMSPage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class.asInstanceOf[js.Any])
    __obj.updateDynamic("attributedString")(attributedString)
    __obj.updateDynamic("constrainProportions")(constrainProportions)
    __obj.updateDynamic("exportOptions")(exportOptions)
    __obj.updateDynamic("fixedRadius")(fixedRadius)
    __obj.updateDynamic("frame")(frame)
    __obj.updateDynamic("hasClickThrough")(hasClickThrough)
    __obj.updateDynamic("horizontalRulerData")(horizontalRulerData)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("includeInCloudUpload")(includeInCloudUpload)
    __obj.updateDynamic("isFlippedHorizontal")(isFlippedHorizontal)
    __obj.updateDynamic("isFlippedVertical")(isFlippedVertical)
    __obj.updateDynamic("isLocked")(isLocked)
    __obj.updateDynamic("isVisible")(isVisible)
    __obj.updateDynamic("layerListExpandedType")(layerListExpandedType)
    __obj.updateDynamic("layers")(layers)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nameIsFixed")(nameIsFixed)
    __obj.updateDynamic("objectID")(objectID)
    __obj.updateDynamic("resizingConstraint")(resizingConstraint)
    __obj.updateDynamic("resizingType")(resizingType)
    __obj.updateDynamic("rotation")(rotation)
    __obj.updateDynamic("shouldBreakMaskChain")(shouldBreakMaskChain)
    __obj.updateDynamic("style")(style)
    __obj.updateDynamic("verticalRulerData")(verticalRulerData)
    if (css != null) __obj.updateDynamic("css")(css)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSPage]
  }
}

