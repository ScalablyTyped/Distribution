package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSPage extends js.Object {
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

