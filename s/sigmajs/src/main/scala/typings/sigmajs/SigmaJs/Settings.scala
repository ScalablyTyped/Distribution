package typings.sigmajs.SigmaJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  // Animation settings
  var animationsTime: js.UndefOr[Double] = js.native
  var autoRescale: js.UndefOr[js.Any] = js.native
  // Global settings
  var autoResize: js.UndefOr[Boolean] = js.native
  // Batch edge drawing
  var batchEdgesDrawing: js.UndefOr[Boolean] = js.native
  // hovered node customizations
  var borderSize: js.UndefOr[Double] = js.native
  var canvasEdgesBatchSize: js.UndefOr[Double] = js.native
  // Graph settings
  @JSName("clone")
  var clone_FSettings: js.UndefOr[Boolean] = js.native
  var defaultEdgeColor: js.UndefOr[String] = js.native
  var defaultEdgeHoverColor: js.UndefOr[String] = js.native
  var defaultEdgeType: js.UndefOr[String] = js.native
  var defaultHoverLabelBGColor: js.UndefOr[String] = js.native
  var defaultLabelColor: js.UndefOr[String] = js.native
  var defaultLabelHoverColor: js.UndefOr[String] = js.native
  var defaultLabelSize: js.UndefOr[String] = js.native
  var defaultNodeBorderColor: js.UndefOr[String] = js.native
  var defaultNodeColor: js.UndefOr[String] = js.native
  var defaultNodeHoverColor: js.UndefOr[String] = js.native
  // Renderers settings
  var defaultNodeType: js.UndefOr[String] = js.native
  var doubleClickEnabled: js.UndefOr[Boolean] = js.native
  var doubleClickTimeout: js.UndefOr[Double] = js.native
  var doubleClickZoomDuration: js.UndefOr[Double] = js.native
  var doubleClickZoomingRatio: js.UndefOr[Double] = js.native
  var doubleTapTimeout: js.UndefOr[Double] = js.native
  var dragTimeout: js.UndefOr[Double] = js.native
  var drawEdges: js.UndefOr[Boolean] = js.native
  // Draw settings for labels, edges, and nodes
  var drawLabels: js.UndefOr[Boolean] = js.native
  var drawNodes: js.UndefOr[Boolean] = js.native
  var edgeColor: js.UndefOr[String] = js.native
  // hovered edge customizations
  var edgeHoverColor: js.UndefOr[String] = js.native
  var edgeHoverExtremities: js.UndefOr[Boolean] = js.native
  var edgeHoverPrecision: js.UndefOr[Double] = js.native
  var edgeHoverSizeRatio: js.UndefOr[Double] = js.native
  var edgesPowRatio: js.UndefOr[Double] = js.native
  var enableCamera: js.UndefOr[Boolean] = js.native
  var enableEdgeHovering: js.UndefOr[Boolean] = js.native
  var enableHovering: js.UndefOr[Boolean] = js.native
  var eventsEnabled: js.UndefOr[Boolean] = js.native
  var font: js.UndefOr[String] = js.native
  var fontStyle: js.UndefOr[String] = js.native
  var hideEdgesOnMove: js.UndefOr[Boolean] = js.native
  var hoverFont: js.UndefOr[Double] = js.native
  var hoverFontStyle: js.UndefOr[String] = js.native
  var immutable: js.UndefOr[Boolean] = js.native
  var labelAlignment: js.UndefOr[String] = js.native
  var labelColor: js.UndefOr[String] = js.native
  var labelHoverBGColor: js.UndefOr[String] = js.native
  var labelHoverColor: js.UndefOr[String] = js.native
  var labelHoverShadow: js.UndefOr[String] = js.native
  var labelHoverShadowColor: js.UndefOr[String] = js.native
  var labelSize: js.UndefOr[String] = js.native
  var labelSizeRatio: js.UndefOr[String] = js.native
  var labelThreshold: js.UndefOr[Double] = js.native
  var maxEdgeSize: js.UndefOr[Double] = js.native
  var maxNodeSize: js.UndefOr[Double] = js.native
  var minArrowSize: js.UndefOr[Double] = js.native
  // max/min node and edge size
  var minEdgeSize: js.UndefOr[Double] = js.native
  var minNodeSize: js.UndefOr[Double] = js.native
  var mouseEnabled: js.UndefOr[Boolean] = js.native
  var mouseInertiaDuration: js.UndefOr[Double] = js.native
  var mouseInertiaRatio: js.UndefOr[Double] = js.native
  var mouseWheelEnabled: js.UndefOr[Boolean] = js.native
  var mouseZoomDuration: js.UndefOr[Double] = js.native
  var nodeHoverColor: js.UndefOr[String] = js.native
  // Camera settings
  var nodesPowRatio: js.UndefOr[Double] = js.native
  var rescaleIgnoreSize: js.UndefOr[Boolean] = js.native
  // Rescale settings
  var scalingMode: js.UndefOr[String] = js.native
  var sideMargin: js.UndefOr[Double] = js.native
  var singleHover: js.UndefOr[Boolean] = js.native
  var skipErrors: js.UndefOr[Boolean] = js.native
  // Captor settings
  var touchEnabled: js.UndefOr[Boolean] = js.native
  var touchInertiaDuration: js.UndefOr[Double] = js.native
  var touchInertiaRatio: js.UndefOr[Double] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
  var webglEdgesBatchSize: js.UndefOr[Double] = js.native
  var webglOversamplingRatio: js.UndefOr[Double] = js.native
  var zoomMax: js.UndefOr[Double] = js.native
  var zoomMin: js.UndefOr[Double] = js.native
  var zoomingRatio: js.UndefOr[Double] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
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
    def setAnimationsTime(value: Double): Self = this.set("animationsTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationsTime: Self = this.set("animationsTime", js.undefined)
    @scala.inline
    def setAutoRescale(value: js.Any): Self = this.set("autoRescale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRescale: Self = this.set("autoRescale", js.undefined)
    @scala.inline
    def setAutoResize(value: Boolean): Self = this.set("autoResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoResize: Self = this.set("autoResize", js.undefined)
    @scala.inline
    def setBatchEdgesDrawing(value: Boolean): Self = this.set("batchEdgesDrawing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchEdgesDrawing: Self = this.set("batchEdgesDrawing", js.undefined)
    @scala.inline
    def setBorderSize(value: Double): Self = this.set("borderSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderSize: Self = this.set("borderSize", js.undefined)
    @scala.inline
    def setCanvasEdgesBatchSize(value: Double): Self = this.set("canvasEdgesBatchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanvasEdgesBatchSize: Self = this.set("canvasEdgesBatchSize", js.undefined)
    @scala.inline
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setDefaultEdgeColor(value: String): Self = this.set("defaultEdgeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultEdgeColor: Self = this.set("defaultEdgeColor", js.undefined)
    @scala.inline
    def setDefaultEdgeHoverColor(value: String): Self = this.set("defaultEdgeHoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultEdgeHoverColor: Self = this.set("defaultEdgeHoverColor", js.undefined)
    @scala.inline
    def setDefaultEdgeType(value: String): Self = this.set("defaultEdgeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultEdgeType: Self = this.set("defaultEdgeType", js.undefined)
    @scala.inline
    def setDefaultHoverLabelBGColor(value: String): Self = this.set("defaultHoverLabelBGColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultHoverLabelBGColor: Self = this.set("defaultHoverLabelBGColor", js.undefined)
    @scala.inline
    def setDefaultLabelColor(value: String): Self = this.set("defaultLabelColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLabelColor: Self = this.set("defaultLabelColor", js.undefined)
    @scala.inline
    def setDefaultLabelHoverColor(value: String): Self = this.set("defaultLabelHoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLabelHoverColor: Self = this.set("defaultLabelHoverColor", js.undefined)
    @scala.inline
    def setDefaultLabelSize(value: String): Self = this.set("defaultLabelSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLabelSize: Self = this.set("defaultLabelSize", js.undefined)
    @scala.inline
    def setDefaultNodeBorderColor(value: String): Self = this.set("defaultNodeBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultNodeBorderColor: Self = this.set("defaultNodeBorderColor", js.undefined)
    @scala.inline
    def setDefaultNodeColor(value: String): Self = this.set("defaultNodeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultNodeColor: Self = this.set("defaultNodeColor", js.undefined)
    @scala.inline
    def setDefaultNodeHoverColor(value: String): Self = this.set("defaultNodeHoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultNodeHoverColor: Self = this.set("defaultNodeHoverColor", js.undefined)
    @scala.inline
    def setDefaultNodeType(value: String): Self = this.set("defaultNodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultNodeType: Self = this.set("defaultNodeType", js.undefined)
    @scala.inline
    def setDoubleClickEnabled(value: Boolean): Self = this.set("doubleClickEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleClickEnabled: Self = this.set("doubleClickEnabled", js.undefined)
    @scala.inline
    def setDoubleClickTimeout(value: Double): Self = this.set("doubleClickTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleClickTimeout: Self = this.set("doubleClickTimeout", js.undefined)
    @scala.inline
    def setDoubleClickZoomDuration(value: Double): Self = this.set("doubleClickZoomDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleClickZoomDuration: Self = this.set("doubleClickZoomDuration", js.undefined)
    @scala.inline
    def setDoubleClickZoomingRatio(value: Double): Self = this.set("doubleClickZoomingRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleClickZoomingRatio: Self = this.set("doubleClickZoomingRatio", js.undefined)
    @scala.inline
    def setDoubleTapTimeout(value: Double): Self = this.set("doubleTapTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleTapTimeout: Self = this.set("doubleTapTimeout", js.undefined)
    @scala.inline
    def setDragTimeout(value: Double): Self = this.set("dragTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragTimeout: Self = this.set("dragTimeout", js.undefined)
    @scala.inline
    def setDrawEdges(value: Boolean): Self = this.set("drawEdges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawEdges: Self = this.set("drawEdges", js.undefined)
    @scala.inline
    def setDrawLabels(value: Boolean): Self = this.set("drawLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawLabels: Self = this.set("drawLabels", js.undefined)
    @scala.inline
    def setDrawNodes(value: Boolean): Self = this.set("drawNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawNodes: Self = this.set("drawNodes", js.undefined)
    @scala.inline
    def setEdgeColor(value: String): Self = this.set("edgeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeColor: Self = this.set("edgeColor", js.undefined)
    @scala.inline
    def setEdgeHoverColor(value: String): Self = this.set("edgeHoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeHoverColor: Self = this.set("edgeHoverColor", js.undefined)
    @scala.inline
    def setEdgeHoverExtremities(value: Boolean): Self = this.set("edgeHoverExtremities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeHoverExtremities: Self = this.set("edgeHoverExtremities", js.undefined)
    @scala.inline
    def setEdgeHoverPrecision(value: Double): Self = this.set("edgeHoverPrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeHoverPrecision: Self = this.set("edgeHoverPrecision", js.undefined)
    @scala.inline
    def setEdgeHoverSizeRatio(value: Double): Self = this.set("edgeHoverSizeRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeHoverSizeRatio: Self = this.set("edgeHoverSizeRatio", js.undefined)
    @scala.inline
    def setEdgesPowRatio(value: Double): Self = this.set("edgesPowRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgesPowRatio: Self = this.set("edgesPowRatio", js.undefined)
    @scala.inline
    def setEnableCamera(value: Boolean): Self = this.set("enableCamera", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCamera: Self = this.set("enableCamera", js.undefined)
    @scala.inline
    def setEnableEdgeHovering(value: Boolean): Self = this.set("enableEdgeHovering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableEdgeHovering: Self = this.set("enableEdgeHovering", js.undefined)
    @scala.inline
    def setEnableHovering(value: Boolean): Self = this.set("enableHovering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHovering: Self = this.set("enableHovering", js.undefined)
    @scala.inline
    def setEventsEnabled(value: Boolean): Self = this.set("eventsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventsEnabled: Self = this.set("eventsEnabled", js.undefined)
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setHideEdgesOnMove(value: Boolean): Self = this.set("hideEdgesOnMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideEdgesOnMove: Self = this.set("hideEdgesOnMove", js.undefined)
    @scala.inline
    def setHoverFont(value: Double): Self = this.set("hoverFont", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverFont: Self = this.set("hoverFont", js.undefined)
    @scala.inline
    def setHoverFontStyle(value: String): Self = this.set("hoverFontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverFontStyle: Self = this.set("hoverFontStyle", js.undefined)
    @scala.inline
    def setImmutable(value: Boolean): Self = this.set("immutable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmutable: Self = this.set("immutable", js.undefined)
    @scala.inline
    def setLabelAlignment(value: String): Self = this.set("labelAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelAlignment: Self = this.set("labelAlignment", js.undefined)
    @scala.inline
    def setLabelColor(value: String): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    @scala.inline
    def setLabelHoverBGColor(value: String): Self = this.set("labelHoverBGColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelHoverBGColor: Self = this.set("labelHoverBGColor", js.undefined)
    @scala.inline
    def setLabelHoverColor(value: String): Self = this.set("labelHoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelHoverColor: Self = this.set("labelHoverColor", js.undefined)
    @scala.inline
    def setLabelHoverShadow(value: String): Self = this.set("labelHoverShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelHoverShadow: Self = this.set("labelHoverShadow", js.undefined)
    @scala.inline
    def setLabelHoverShadowColor(value: String): Self = this.set("labelHoverShadowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelHoverShadowColor: Self = this.set("labelHoverShadowColor", js.undefined)
    @scala.inline
    def setLabelSize(value: String): Self = this.set("labelSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelSize: Self = this.set("labelSize", js.undefined)
    @scala.inline
    def setLabelSizeRatio(value: String): Self = this.set("labelSizeRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelSizeRatio: Self = this.set("labelSizeRatio", js.undefined)
    @scala.inline
    def setLabelThreshold(value: Double): Self = this.set("labelThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelThreshold: Self = this.set("labelThreshold", js.undefined)
    @scala.inline
    def setMaxEdgeSize(value: Double): Self = this.set("maxEdgeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxEdgeSize: Self = this.set("maxEdgeSize", js.undefined)
    @scala.inline
    def setMaxNodeSize(value: Double): Self = this.set("maxNodeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxNodeSize: Self = this.set("maxNodeSize", js.undefined)
    @scala.inline
    def setMinArrowSize(value: Double): Self = this.set("minArrowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinArrowSize: Self = this.set("minArrowSize", js.undefined)
    @scala.inline
    def setMinEdgeSize(value: Double): Self = this.set("minEdgeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinEdgeSize: Self = this.set("minEdgeSize", js.undefined)
    @scala.inline
    def setMinNodeSize(value: Double): Self = this.set("minNodeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinNodeSize: Self = this.set("minNodeSize", js.undefined)
    @scala.inline
    def setMouseEnabled(value: Boolean): Self = this.set("mouseEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseEnabled: Self = this.set("mouseEnabled", js.undefined)
    @scala.inline
    def setMouseInertiaDuration(value: Double): Self = this.set("mouseInertiaDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseInertiaDuration: Self = this.set("mouseInertiaDuration", js.undefined)
    @scala.inline
    def setMouseInertiaRatio(value: Double): Self = this.set("mouseInertiaRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseInertiaRatio: Self = this.set("mouseInertiaRatio", js.undefined)
    @scala.inline
    def setMouseWheelEnabled(value: Boolean): Self = this.set("mouseWheelEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseWheelEnabled: Self = this.set("mouseWheelEnabled", js.undefined)
    @scala.inline
    def setMouseZoomDuration(value: Double): Self = this.set("mouseZoomDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseZoomDuration: Self = this.set("mouseZoomDuration", js.undefined)
    @scala.inline
    def setNodeHoverColor(value: String): Self = this.set("nodeHoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeHoverColor: Self = this.set("nodeHoverColor", js.undefined)
    @scala.inline
    def setNodesPowRatio(value: Double): Self = this.set("nodesPowRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodesPowRatio: Self = this.set("nodesPowRatio", js.undefined)
    @scala.inline
    def setRescaleIgnoreSize(value: Boolean): Self = this.set("rescaleIgnoreSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRescaleIgnoreSize: Self = this.set("rescaleIgnoreSize", js.undefined)
    @scala.inline
    def setScalingMode(value: String): Self = this.set("scalingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalingMode: Self = this.set("scalingMode", js.undefined)
    @scala.inline
    def setSideMargin(value: Double): Self = this.set("sideMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSideMargin: Self = this.set("sideMargin", js.undefined)
    @scala.inline
    def setSingleHover(value: Boolean): Self = this.set("singleHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleHover: Self = this.set("singleHover", js.undefined)
    @scala.inline
    def setSkipErrors(value: Boolean): Self = this.set("skipErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipErrors: Self = this.set("skipErrors", js.undefined)
    @scala.inline
    def setTouchEnabled(value: Boolean): Self = this.set("touchEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchEnabled: Self = this.set("touchEnabled", js.undefined)
    @scala.inline
    def setTouchInertiaDuration(value: Double): Self = this.set("touchInertiaDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchInertiaDuration: Self = this.set("touchInertiaDuration", js.undefined)
    @scala.inline
    def setTouchInertiaRatio(value: Double): Self = this.set("touchInertiaRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchInertiaRatio: Self = this.set("touchInertiaRatio", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    @scala.inline
    def setWebglEdgesBatchSize(value: Double): Self = this.set("webglEdgesBatchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebglEdgesBatchSize: Self = this.set("webglEdgesBatchSize", js.undefined)
    @scala.inline
    def setWebglOversamplingRatio(value: Double): Self = this.set("webglOversamplingRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebglOversamplingRatio: Self = this.set("webglOversamplingRatio", js.undefined)
    @scala.inline
    def setZoomMax(value: Double): Self = this.set("zoomMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomMax: Self = this.set("zoomMax", js.undefined)
    @scala.inline
    def setZoomMin(value: Double): Self = this.set("zoomMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomMin: Self = this.set("zoomMin", js.undefined)
    @scala.inline
    def setZoomingRatio(value: Double): Self = this.set("zoomingRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomingRatio: Self = this.set("zoomingRatio", js.undefined)
  }
  
}

