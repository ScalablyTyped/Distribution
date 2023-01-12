package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  // Animation settings
  var animationsTime: js.UndefOr[Double] = js.undefined
  
  var autoRescale: js.UndefOr[Any] = js.undefined
  
  // Global settings
  var autoResize: js.UndefOr[Boolean] = js.undefined
  
  // Batch edge drawing
  var batchEdgesDrawing: js.UndefOr[Boolean] = js.undefined
  
  // hovered node customizations
  var borderSize: js.UndefOr[Double] = js.undefined
  
  var canvasEdgesBatchSize: js.UndefOr[Double] = js.undefined
  
  // Graph settings
  @JSName("clone")
  var clone_FSettings: js.UndefOr[Boolean] = js.undefined
  
  var defaultEdgeColor: js.UndefOr[String] = js.undefined
  
  var defaultEdgeHoverColor: js.UndefOr[String] = js.undefined
  
  var defaultEdgeType: js.UndefOr[String] = js.undefined
  
  var defaultHoverLabelBGColor: js.UndefOr[String] = js.undefined
  
  var defaultLabelColor: js.UndefOr[String] = js.undefined
  
  var defaultLabelHoverColor: js.UndefOr[String] = js.undefined
  
  var defaultLabelSize: js.UndefOr[String] = js.undefined
  
  var defaultNodeBorderColor: js.UndefOr[String] = js.undefined
  
  var defaultNodeColor: js.UndefOr[String] = js.undefined
  
  var defaultNodeHoverColor: js.UndefOr[String] = js.undefined
  
  // Renderers settings
  var defaultNodeType: js.UndefOr[String] = js.undefined
  
  var doubleClickEnabled: js.UndefOr[Boolean] = js.undefined
  
  var doubleClickTimeout: js.UndefOr[Double] = js.undefined
  
  var doubleClickZoomDuration: js.UndefOr[Double] = js.undefined
  
  var doubleClickZoomingRatio: js.UndefOr[Double] = js.undefined
  
  var doubleTapTimeout: js.UndefOr[Double] = js.undefined
  
  var dragTimeout: js.UndefOr[Double] = js.undefined
  
  var drawEdges: js.UndefOr[Boolean] = js.undefined
  
  // Draw settings for labels, edges, and nodes
  var drawLabels: js.UndefOr[Boolean] = js.undefined
  
  var drawNodes: js.UndefOr[Boolean] = js.undefined
  
  var edgeColor: js.UndefOr[String] = js.undefined
  
  // hovered edge customizations
  var edgeHoverColor: js.UndefOr[String] = js.undefined
  
  var edgeHoverExtremities: js.UndefOr[Boolean] = js.undefined
  
  var edgeHoverPrecision: js.UndefOr[Double] = js.undefined
  
  var edgeHoverSizeRatio: js.UndefOr[Double] = js.undefined
  
  var edgesPowRatio: js.UndefOr[Double] = js.undefined
  
  var enableCamera: js.UndefOr[Boolean] = js.undefined
  
  var enableEdgeHovering: js.UndefOr[Boolean] = js.undefined
  
  var enableHovering: js.UndefOr[Boolean] = js.undefined
  
  var eventsEnabled: js.UndefOr[Boolean] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var fontStyle: js.UndefOr[String] = js.undefined
  
  var hideEdgesOnMove: js.UndefOr[Boolean] = js.undefined
  
  var hoverFont: js.UndefOr[Double] = js.undefined
  
  var hoverFontStyle: js.UndefOr[String] = js.undefined
  
  var immutable: js.UndefOr[Boolean] = js.undefined
  
  var labelAlignment: js.UndefOr[String] = js.undefined
  
  var labelColor: js.UndefOr[String] = js.undefined
  
  var labelHoverBGColor: js.UndefOr[String] = js.undefined
  
  var labelHoverColor: js.UndefOr[String] = js.undefined
  
  var labelHoverShadow: js.UndefOr[String] = js.undefined
  
  var labelHoverShadowColor: js.UndefOr[String] = js.undefined
  
  var labelSize: js.UndefOr[String] = js.undefined
  
  var labelSizeRatio: js.UndefOr[String] = js.undefined
  
  var labelThreshold: js.UndefOr[Double] = js.undefined
  
  var maxEdgeSize: js.UndefOr[Double] = js.undefined
  
  var maxNodeSize: js.UndefOr[Double] = js.undefined
  
  var minArrowSize: js.UndefOr[Double] = js.undefined
  
  // max/min node and edge size
  var minEdgeSize: js.UndefOr[Double] = js.undefined
  
  var minNodeSize: js.UndefOr[Double] = js.undefined
  
  var mouseEnabled: js.UndefOr[Boolean] = js.undefined
  
  var mouseInertiaDuration: js.UndefOr[Double] = js.undefined
  
  var mouseInertiaRatio: js.UndefOr[Double] = js.undefined
  
  var mouseWheelEnabled: js.UndefOr[Boolean] = js.undefined
  
  var mouseZoomDuration: js.UndefOr[Double] = js.undefined
  
  var nodeHoverColor: js.UndefOr[String] = js.undefined
  
  // Camera settings
  var nodesPowRatio: js.UndefOr[Double] = js.undefined
  
  var rescaleIgnoreSize: js.UndefOr[Boolean] = js.undefined
  
  // Rescale settings
  var scalingMode: js.UndefOr[String] = js.undefined
  
  var sideMargin: js.UndefOr[Double] = js.undefined
  
  var singleHover: js.UndefOr[Boolean] = js.undefined
  
  var skipErrors: js.UndefOr[Boolean] = js.undefined
  
  // Captor settings
  var touchEnabled: js.UndefOr[Boolean] = js.undefined
  
  var touchInertiaDuration: js.UndefOr[Double] = js.undefined
  
  var touchInertiaRatio: js.UndefOr[Double] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
  
  var webglEdgesBatchSize: js.UndefOr[Double] = js.undefined
  
  var webglOversamplingRatio: js.UndefOr[Double] = js.undefined
  
  var zoomMax: js.UndefOr[Double] = js.undefined
  
  var zoomMin: js.UndefOr[Double] = js.undefined
  
  var zoomingRatio: js.UndefOr[Double] = js.undefined
}
object Settings {
  
  inline def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    inline def setAnimationsTime(value: Double): Self = StObject.set(x, "animationsTime", value.asInstanceOf[js.Any])
    
    inline def setAnimationsTimeUndefined: Self = StObject.set(x, "animationsTime", js.undefined)
    
    inline def setAutoRescale(value: Any): Self = StObject.set(x, "autoRescale", value.asInstanceOf[js.Any])
    
    inline def setAutoRescaleUndefined: Self = StObject.set(x, "autoRescale", js.undefined)
    
    inline def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
    
    inline def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
    
    inline def setBatchEdgesDrawing(value: Boolean): Self = StObject.set(x, "batchEdgesDrawing", value.asInstanceOf[js.Any])
    
    inline def setBatchEdgesDrawingUndefined: Self = StObject.set(x, "batchEdgesDrawing", js.undefined)
    
    inline def setBorderSize(value: Double): Self = StObject.set(x, "borderSize", value.asInstanceOf[js.Any])
    
    inline def setBorderSizeUndefined: Self = StObject.set(x, "borderSize", js.undefined)
    
    inline def setCanvasEdgesBatchSize(value: Double): Self = StObject.set(x, "canvasEdgesBatchSize", value.asInstanceOf[js.Any])
    
    inline def setCanvasEdgesBatchSizeUndefined: Self = StObject.set(x, "canvasEdgesBatchSize", js.undefined)
    
    inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setDefaultEdgeColor(value: String): Self = StObject.set(x, "defaultEdgeColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultEdgeColorUndefined: Self = StObject.set(x, "defaultEdgeColor", js.undefined)
    
    inline def setDefaultEdgeHoverColor(value: String): Self = StObject.set(x, "defaultEdgeHoverColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultEdgeHoverColorUndefined: Self = StObject.set(x, "defaultEdgeHoverColor", js.undefined)
    
    inline def setDefaultEdgeType(value: String): Self = StObject.set(x, "defaultEdgeType", value.asInstanceOf[js.Any])
    
    inline def setDefaultEdgeTypeUndefined: Self = StObject.set(x, "defaultEdgeType", js.undefined)
    
    inline def setDefaultHoverLabelBGColor(value: String): Self = StObject.set(x, "defaultHoverLabelBGColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultHoverLabelBGColorUndefined: Self = StObject.set(x, "defaultHoverLabelBGColor", js.undefined)
    
    inline def setDefaultLabelColor(value: String): Self = StObject.set(x, "defaultLabelColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultLabelColorUndefined: Self = StObject.set(x, "defaultLabelColor", js.undefined)
    
    inline def setDefaultLabelHoverColor(value: String): Self = StObject.set(x, "defaultLabelHoverColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultLabelHoverColorUndefined: Self = StObject.set(x, "defaultLabelHoverColor", js.undefined)
    
    inline def setDefaultLabelSize(value: String): Self = StObject.set(x, "defaultLabelSize", value.asInstanceOf[js.Any])
    
    inline def setDefaultLabelSizeUndefined: Self = StObject.set(x, "defaultLabelSize", js.undefined)
    
    inline def setDefaultNodeBorderColor(value: String): Self = StObject.set(x, "defaultNodeBorderColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultNodeBorderColorUndefined: Self = StObject.set(x, "defaultNodeBorderColor", js.undefined)
    
    inline def setDefaultNodeColor(value: String): Self = StObject.set(x, "defaultNodeColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultNodeColorUndefined: Self = StObject.set(x, "defaultNodeColor", js.undefined)
    
    inline def setDefaultNodeHoverColor(value: String): Self = StObject.set(x, "defaultNodeHoverColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultNodeHoverColorUndefined: Self = StObject.set(x, "defaultNodeHoverColor", js.undefined)
    
    inline def setDefaultNodeType(value: String): Self = StObject.set(x, "defaultNodeType", value.asInstanceOf[js.Any])
    
    inline def setDefaultNodeTypeUndefined: Self = StObject.set(x, "defaultNodeType", js.undefined)
    
    inline def setDoubleClickEnabled(value: Boolean): Self = StObject.set(x, "doubleClickEnabled", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickEnabledUndefined: Self = StObject.set(x, "doubleClickEnabled", js.undefined)
    
    inline def setDoubleClickTimeout(value: Double): Self = StObject.set(x, "doubleClickTimeout", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickTimeoutUndefined: Self = StObject.set(x, "doubleClickTimeout", js.undefined)
    
    inline def setDoubleClickZoomDuration(value: Double): Self = StObject.set(x, "doubleClickZoomDuration", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickZoomDurationUndefined: Self = StObject.set(x, "doubleClickZoomDuration", js.undefined)
    
    inline def setDoubleClickZoomingRatio(value: Double): Self = StObject.set(x, "doubleClickZoomingRatio", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickZoomingRatioUndefined: Self = StObject.set(x, "doubleClickZoomingRatio", js.undefined)
    
    inline def setDoubleTapTimeout(value: Double): Self = StObject.set(x, "doubleTapTimeout", value.asInstanceOf[js.Any])
    
    inline def setDoubleTapTimeoutUndefined: Self = StObject.set(x, "doubleTapTimeout", js.undefined)
    
    inline def setDragTimeout(value: Double): Self = StObject.set(x, "dragTimeout", value.asInstanceOf[js.Any])
    
    inline def setDragTimeoutUndefined: Self = StObject.set(x, "dragTimeout", js.undefined)
    
    inline def setDrawEdges(value: Boolean): Self = StObject.set(x, "drawEdges", value.asInstanceOf[js.Any])
    
    inline def setDrawEdgesUndefined: Self = StObject.set(x, "drawEdges", js.undefined)
    
    inline def setDrawLabels(value: Boolean): Self = StObject.set(x, "drawLabels", value.asInstanceOf[js.Any])
    
    inline def setDrawLabelsUndefined: Self = StObject.set(x, "drawLabels", js.undefined)
    
    inline def setDrawNodes(value: Boolean): Self = StObject.set(x, "drawNodes", value.asInstanceOf[js.Any])
    
    inline def setDrawNodesUndefined: Self = StObject.set(x, "drawNodes", js.undefined)
    
    inline def setEdgeColor(value: String): Self = StObject.set(x, "edgeColor", value.asInstanceOf[js.Any])
    
    inline def setEdgeColorUndefined: Self = StObject.set(x, "edgeColor", js.undefined)
    
    inline def setEdgeHoverColor(value: String): Self = StObject.set(x, "edgeHoverColor", value.asInstanceOf[js.Any])
    
    inline def setEdgeHoverColorUndefined: Self = StObject.set(x, "edgeHoverColor", js.undefined)
    
    inline def setEdgeHoverExtremities(value: Boolean): Self = StObject.set(x, "edgeHoverExtremities", value.asInstanceOf[js.Any])
    
    inline def setEdgeHoverExtremitiesUndefined: Self = StObject.set(x, "edgeHoverExtremities", js.undefined)
    
    inline def setEdgeHoverPrecision(value: Double): Self = StObject.set(x, "edgeHoverPrecision", value.asInstanceOf[js.Any])
    
    inline def setEdgeHoverPrecisionUndefined: Self = StObject.set(x, "edgeHoverPrecision", js.undefined)
    
    inline def setEdgeHoverSizeRatio(value: Double): Self = StObject.set(x, "edgeHoverSizeRatio", value.asInstanceOf[js.Any])
    
    inline def setEdgeHoverSizeRatioUndefined: Self = StObject.set(x, "edgeHoverSizeRatio", js.undefined)
    
    inline def setEdgesPowRatio(value: Double): Self = StObject.set(x, "edgesPowRatio", value.asInstanceOf[js.Any])
    
    inline def setEdgesPowRatioUndefined: Self = StObject.set(x, "edgesPowRatio", js.undefined)
    
    inline def setEnableCamera(value: Boolean): Self = StObject.set(x, "enableCamera", value.asInstanceOf[js.Any])
    
    inline def setEnableCameraUndefined: Self = StObject.set(x, "enableCamera", js.undefined)
    
    inline def setEnableEdgeHovering(value: Boolean): Self = StObject.set(x, "enableEdgeHovering", value.asInstanceOf[js.Any])
    
    inline def setEnableEdgeHoveringUndefined: Self = StObject.set(x, "enableEdgeHovering", js.undefined)
    
    inline def setEnableHovering(value: Boolean): Self = StObject.set(x, "enableHovering", value.asInstanceOf[js.Any])
    
    inline def setEnableHoveringUndefined: Self = StObject.set(x, "enableHovering", js.undefined)
    
    inline def setEventsEnabled(value: Boolean): Self = StObject.set(x, "eventsEnabled", value.asInstanceOf[js.Any])
    
    inline def setEventsEnabledUndefined: Self = StObject.set(x, "eventsEnabled", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHideEdgesOnMove(value: Boolean): Self = StObject.set(x, "hideEdgesOnMove", value.asInstanceOf[js.Any])
    
    inline def setHideEdgesOnMoveUndefined: Self = StObject.set(x, "hideEdgesOnMove", js.undefined)
    
    inline def setHoverFont(value: Double): Self = StObject.set(x, "hoverFont", value.asInstanceOf[js.Any])
    
    inline def setHoverFontStyle(value: String): Self = StObject.set(x, "hoverFontStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverFontStyleUndefined: Self = StObject.set(x, "hoverFontStyle", js.undefined)
    
    inline def setHoverFontUndefined: Self = StObject.set(x, "hoverFont", js.undefined)
    
    inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
    
    inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
    
    inline def setLabelAlignment(value: String): Self = StObject.set(x, "labelAlignment", value.asInstanceOf[js.Any])
    
    inline def setLabelAlignmentUndefined: Self = StObject.set(x, "labelAlignment", js.undefined)
    
    inline def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    inline def setLabelHoverBGColor(value: String): Self = StObject.set(x, "labelHoverBGColor", value.asInstanceOf[js.Any])
    
    inline def setLabelHoverBGColorUndefined: Self = StObject.set(x, "labelHoverBGColor", js.undefined)
    
    inline def setLabelHoverColor(value: String): Self = StObject.set(x, "labelHoverColor", value.asInstanceOf[js.Any])
    
    inline def setLabelHoverColorUndefined: Self = StObject.set(x, "labelHoverColor", js.undefined)
    
    inline def setLabelHoverShadow(value: String): Self = StObject.set(x, "labelHoverShadow", value.asInstanceOf[js.Any])
    
    inline def setLabelHoverShadowColor(value: String): Self = StObject.set(x, "labelHoverShadowColor", value.asInstanceOf[js.Any])
    
    inline def setLabelHoverShadowColorUndefined: Self = StObject.set(x, "labelHoverShadowColor", js.undefined)
    
    inline def setLabelHoverShadowUndefined: Self = StObject.set(x, "labelHoverShadow", js.undefined)
    
    inline def setLabelSize(value: String): Self = StObject.set(x, "labelSize", value.asInstanceOf[js.Any])
    
    inline def setLabelSizeRatio(value: String): Self = StObject.set(x, "labelSizeRatio", value.asInstanceOf[js.Any])
    
    inline def setLabelSizeRatioUndefined: Self = StObject.set(x, "labelSizeRatio", js.undefined)
    
    inline def setLabelSizeUndefined: Self = StObject.set(x, "labelSize", js.undefined)
    
    inline def setLabelThreshold(value: Double): Self = StObject.set(x, "labelThreshold", value.asInstanceOf[js.Any])
    
    inline def setLabelThresholdUndefined: Self = StObject.set(x, "labelThreshold", js.undefined)
    
    inline def setMaxEdgeSize(value: Double): Self = StObject.set(x, "maxEdgeSize", value.asInstanceOf[js.Any])
    
    inline def setMaxEdgeSizeUndefined: Self = StObject.set(x, "maxEdgeSize", js.undefined)
    
    inline def setMaxNodeSize(value: Double): Self = StObject.set(x, "maxNodeSize", value.asInstanceOf[js.Any])
    
    inline def setMaxNodeSizeUndefined: Self = StObject.set(x, "maxNodeSize", js.undefined)
    
    inline def setMinArrowSize(value: Double): Self = StObject.set(x, "minArrowSize", value.asInstanceOf[js.Any])
    
    inline def setMinArrowSizeUndefined: Self = StObject.set(x, "minArrowSize", js.undefined)
    
    inline def setMinEdgeSize(value: Double): Self = StObject.set(x, "minEdgeSize", value.asInstanceOf[js.Any])
    
    inline def setMinEdgeSizeUndefined: Self = StObject.set(x, "minEdgeSize", js.undefined)
    
    inline def setMinNodeSize(value: Double): Self = StObject.set(x, "minNodeSize", value.asInstanceOf[js.Any])
    
    inline def setMinNodeSizeUndefined: Self = StObject.set(x, "minNodeSize", js.undefined)
    
    inline def setMouseEnabled(value: Boolean): Self = StObject.set(x, "mouseEnabled", value.asInstanceOf[js.Any])
    
    inline def setMouseEnabledUndefined: Self = StObject.set(x, "mouseEnabled", js.undefined)
    
    inline def setMouseInertiaDuration(value: Double): Self = StObject.set(x, "mouseInertiaDuration", value.asInstanceOf[js.Any])
    
    inline def setMouseInertiaDurationUndefined: Self = StObject.set(x, "mouseInertiaDuration", js.undefined)
    
    inline def setMouseInertiaRatio(value: Double): Self = StObject.set(x, "mouseInertiaRatio", value.asInstanceOf[js.Any])
    
    inline def setMouseInertiaRatioUndefined: Self = StObject.set(x, "mouseInertiaRatio", js.undefined)
    
    inline def setMouseWheelEnabled(value: Boolean): Self = StObject.set(x, "mouseWheelEnabled", value.asInstanceOf[js.Any])
    
    inline def setMouseWheelEnabledUndefined: Self = StObject.set(x, "mouseWheelEnabled", js.undefined)
    
    inline def setMouseZoomDuration(value: Double): Self = StObject.set(x, "mouseZoomDuration", value.asInstanceOf[js.Any])
    
    inline def setMouseZoomDurationUndefined: Self = StObject.set(x, "mouseZoomDuration", js.undefined)
    
    inline def setNodeHoverColor(value: String): Self = StObject.set(x, "nodeHoverColor", value.asInstanceOf[js.Any])
    
    inline def setNodeHoverColorUndefined: Self = StObject.set(x, "nodeHoverColor", js.undefined)
    
    inline def setNodesPowRatio(value: Double): Self = StObject.set(x, "nodesPowRatio", value.asInstanceOf[js.Any])
    
    inline def setNodesPowRatioUndefined: Self = StObject.set(x, "nodesPowRatio", js.undefined)
    
    inline def setRescaleIgnoreSize(value: Boolean): Self = StObject.set(x, "rescaleIgnoreSize", value.asInstanceOf[js.Any])
    
    inline def setRescaleIgnoreSizeUndefined: Self = StObject.set(x, "rescaleIgnoreSize", js.undefined)
    
    inline def setScalingMode(value: String): Self = StObject.set(x, "scalingMode", value.asInstanceOf[js.Any])
    
    inline def setScalingModeUndefined: Self = StObject.set(x, "scalingMode", js.undefined)
    
    inline def setSideMargin(value: Double): Self = StObject.set(x, "sideMargin", value.asInstanceOf[js.Any])
    
    inline def setSideMarginUndefined: Self = StObject.set(x, "sideMargin", js.undefined)
    
    inline def setSingleHover(value: Boolean): Self = StObject.set(x, "singleHover", value.asInstanceOf[js.Any])
    
    inline def setSingleHoverUndefined: Self = StObject.set(x, "singleHover", js.undefined)
    
    inline def setSkipErrors(value: Boolean): Self = StObject.set(x, "skipErrors", value.asInstanceOf[js.Any])
    
    inline def setSkipErrorsUndefined: Self = StObject.set(x, "skipErrors", js.undefined)
    
    inline def setTouchEnabled(value: Boolean): Self = StObject.set(x, "touchEnabled", value.asInstanceOf[js.Any])
    
    inline def setTouchEnabledUndefined: Self = StObject.set(x, "touchEnabled", js.undefined)
    
    inline def setTouchInertiaDuration(value: Double): Self = StObject.set(x, "touchInertiaDuration", value.asInstanceOf[js.Any])
    
    inline def setTouchInertiaDurationUndefined: Self = StObject.set(x, "touchInertiaDuration", js.undefined)
    
    inline def setTouchInertiaRatio(value: Double): Self = StObject.set(x, "touchInertiaRatio", value.asInstanceOf[js.Any])
    
    inline def setTouchInertiaRatioUndefined: Self = StObject.set(x, "touchInertiaRatio", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    
    inline def setWebglEdgesBatchSize(value: Double): Self = StObject.set(x, "webglEdgesBatchSize", value.asInstanceOf[js.Any])
    
    inline def setWebglEdgesBatchSizeUndefined: Self = StObject.set(x, "webglEdgesBatchSize", js.undefined)
    
    inline def setWebglOversamplingRatio(value: Double): Self = StObject.set(x, "webglOversamplingRatio", value.asInstanceOf[js.Any])
    
    inline def setWebglOversamplingRatioUndefined: Self = StObject.set(x, "webglOversamplingRatio", js.undefined)
    
    inline def setZoomMax(value: Double): Self = StObject.set(x, "zoomMax", value.asInstanceOf[js.Any])
    
    inline def setZoomMaxUndefined: Self = StObject.set(x, "zoomMax", js.undefined)
    
    inline def setZoomMin(value: Double): Self = StObject.set(x, "zoomMin", value.asInstanceOf[js.Any])
    
    inline def setZoomMinUndefined: Self = StObject.set(x, "zoomMin", js.undefined)
    
    inline def setZoomingRatio(value: Double): Self = StObject.set(x, "zoomingRatio", value.asInstanceOf[js.Any])
    
    inline def setZoomingRatioUndefined: Self = StObject.set(x, "zoomingRatio", js.undefined)
  }
}
