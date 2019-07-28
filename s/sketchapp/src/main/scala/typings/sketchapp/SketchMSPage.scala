package typings.sketchapp

import org.scalablytyped.runtime.StringDictionary
import typings.sketchapp.sketchappStrings.layer
import typings.sketchapp.sketchappStrings.page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSPage extends SketchMSLayer {
  var _class: page | layer
  var attributedString: SketchMSAttributedString
  var constrainProportions: Boolean
  // add this property to hold all CSS properties
  // of the current layer
  var css: js.UndefOr[StringDictionary[String]] = js.undefined
  var do_objectID: js.UndefOr[String] = js.undefined
  var exportOptions: SketchMSExportOptions
  var fixedRadius: Double
  var frame: SketchMSRect
  var hasClickThrough: Double
  var horizontalRulerData: SketchMSRulerData
  var id: String
  var includeInCloudUpload: Double
  var isFlippedHorizontal: Double
  var isFlippedVertical: Double
  var isLocked: Boolean
  var isVisible: Boolean
  var layerListExpandedType: Double
  var layers: js.Array[SketchMSLayer]
  var name: String
  var nameIsFixed: Double
  var objectID: String
  var resizingConstraint: Double
  var resizingType: Double
  var rotation: Double
  var shouldBreakMaskChain: Double
  var style: SketchMSStyle
  var verticalRulerData: SketchMSRulerData
}

object SketchMSPage {
  @scala.inline
  def apply(
    _class: page | layer,
    attributedString: SketchMSAttributedString,
    constrainProportions: Boolean,
    exportOptions: SketchMSExportOptions,
    fixedRadius: Double,
    frame: SketchMSRect,
    hasClickThrough: Double,
    horizontalRulerData: SketchMSRulerData,
    id: String,
    includeInCloudUpload: Double,
    isFlippedHorizontal: Double,
    isFlippedVertical: Double,
    isLocked: Boolean,
    isVisible: Boolean,
    layerListExpandedType: Double,
    layers: js.Array[SketchMSLayer],
    name: String,
    nameIsFixed: Double,
    objectID: String,
    resizingConstraint: Double,
    resizingType: Double,
    rotation: Double,
    shouldBreakMaskChain: Double,
    style: SketchMSStyle,
    verticalRulerData: SketchMSRulerData,
    css: StringDictionary[String] = null,
    do_objectID: String = null
  ): SketchMSPage = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], attributedString = attributedString, constrainProportions = constrainProportions, exportOptions = exportOptions, fixedRadius = fixedRadius, frame = frame, hasClickThrough = hasClickThrough, horizontalRulerData = horizontalRulerData, id = id, includeInCloudUpload = includeInCloudUpload, isFlippedHorizontal = isFlippedHorizontal, isFlippedVertical = isFlippedVertical, isLocked = isLocked, isVisible = isVisible, layerListExpandedType = layerListExpandedType, layers = layers, name = name, nameIsFixed = nameIsFixed, objectID = objectID, resizingConstraint = resizingConstraint, resizingType = resizingType, rotation = rotation, shouldBreakMaskChain = shouldBreakMaskChain, style = style, verticalRulerData = verticalRulerData)
    if (css != null) __obj.updateDynamic("css")(css)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSPage]
  }
}

