package typings.sketchapp

import typings.sketchapp.sketchappStrings.oval
import typings.sketchapp.sketchappStrings.path
import typings.sketchapp.sketchappStrings.rectangle
import typings.sketchapp.sketchappStrings.shapePath
import typings.sketchapp.sketchappStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSPathLayer extends SketchMSLayer {
  @JSName("_class")
  var _class_SketchMSPathLayer: path | shapePath | rectangle | oval | triangle = js.native
  var edited: Boolean = js.native
  var isClosed: Boolean = js.native
  var pointRadiusBehaviour: Double = js.native
  var points: js.Array[SketchMSPoint] = js.native
}

object SketchMSPathLayer {
  @scala.inline
  def apply(
    _class: path | shapePath | rectangle | oval | triangle,
    booleanOperation: SketchMSLayerBooleanOperation,
    clippingMaskMode: SketchMSLayerClippingMaskMode,
    do_objectID: String,
    edited: Boolean,
    exportOptions: SketchMSLayerExportOptions,
    frame: SketchMSLayerFrame,
    hasClippingMask: Boolean,
    isClosed: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isVisible: Boolean,
    layerListExpandedType: Double,
    name: String,
    nameIsFixed: Boolean,
    pointRadiusBehaviour: Double,
    points: js.Array[SketchMSPoint],
    resizingConstraint: Double,
    resizingType: SketchMSLayerResizingType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    style: SketchMSStyle
  ): SketchMSPathLayer = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], clippingMaskMode = clippingMaskMode.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasClippingMask = hasClippingMask.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], pointRadiusBehaviour = pointRadiusBehaviour.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSPathLayer]
  }
  @scala.inline
  implicit class SketchMSPathLayerOps[Self <: SketchMSPathLayer] (val x: Self) extends AnyVal {
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
    def set_class(value: path | shapePath | rectangle | oval | triangle): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdited(value: Boolean): Self = this.set("edited", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsClosed(value: Boolean): Self = this.set("isClosed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointRadiusBehaviour(value: Double): Self = this.set("pointRadiusBehaviour", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointsVarargs(value: SketchMSPoint*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[SketchMSPoint]): Self = this.set("points", value.asInstanceOf[js.Any])
  }
  
}

