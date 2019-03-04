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
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], attributedString = attributedString, constrainProportions = constrainProportions, exportOptions = exportOptions, fixedRadius = fixedRadius, frame = frame, hasClickThrough = hasClickThrough, horizontalRulerData = horizontalRulerData, id = id, includeInCloudUpload = includeInCloudUpload, isFlippedHorizontal = isFlippedHorizontal, isFlippedVertical = isFlippedVertical, isLocked = isLocked, isVisible = isVisible, layerListExpandedType = layerListExpandedType, layers = layers, name = name, nameIsFixed = nameIsFixed, objectID = objectID, resizingConstraint = resizingConstraint, resizingType = resizingType, rotation = rotation, shouldBreakMaskChain = shouldBreakMaskChain, style = style, verticalRulerData = verticalRulerData)
    if (css != null) __obj.updateDynamic("css")(css)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSPage]
  }
}

