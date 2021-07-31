package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  // Animation settings
  var animationsTime: js.UndefOr[Double] = js.undefined
  
  var autoRescale: js.UndefOr[js.Any] = js.undefined
  
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
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationsTime(value: Double): Self = StObject.set(x, "animationsTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsTimeUndefined: Self = StObject.set(x, "animationsTime", js.undefined)
    
    @scala.inline
    def setAutoRescale(value: js.Any): Self = StObject.set(x, "autoRescale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRescaleUndefined: Self = StObject.set(x, "autoRescale", js.undefined)
    
    @scala.inline
    def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
    
    @scala.inline
    def setBatchEdgesDrawing(value: Boolean): Self = StObject.set(x, "batchEdgesDrawing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchEdgesDrawingUndefined: Self = StObject.set(x, "batchEdgesDrawing", js.undefined)
    
    @scala.inline
    def setBorderSize(value: Double): Self = StObject.set(x, "borderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderSizeUndefined: Self = StObject.set(x, "borderSize", js.undefined)
    
    @scala.inline
    def setCanvasEdgesBatchSize(value: Double): Self = StObject.set(x, "canvasEdgesBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasEdgesBatchSizeUndefined: Self = StObject.set(x, "canvasEdgesBatchSize", js.undefined)
    
    @scala.inline
    def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    @scala.inline
    def setDefaultEdgeColor(value: String): Self = StObject.set(x, "defaultEdgeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEdgeColorUndefined: Self = StObject.set(x, "defaultEdgeColor", js.undefined)
    
    @scala.inline
    def setDefaultEdgeHoverColor(value: String): Self = StObject.set(x, "defaultEdgeHoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEdgeHoverColorUndefined: Self = StObject.set(x, "defaultEdgeHoverColor", js.undefined)
    
    @scala.inline
    def setDefaultEdgeType(value: String): Self = StObject.set(x, "defaultEdgeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEdgeTypeUndefined: Self = StObject.set(x, "defaultEdgeType", js.undefined)
    
    @scala.inline
    def setDefaultHoverLabelBGColor(value: String): Self = StObject.set(x, "defaultHoverLabelBGColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHoverLabelBGColorUndefined: Self = StObject.set(x, "defaultHoverLabelBGColor", js.undefined)
    
    @scala.inline
    def setDefaultLabelColor(value: String): Self = StObject.set(x, "defaultLabelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLabelColorUndefined: Self = StObject.set(x, "defaultLabelColor", js.undefined)
    
    @scala.inline
    def setDefaultLabelHoverColor(value: String): Self = StObject.set(x, "defaultLabelHoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLabelHoverColorUndefined: Self = StObject.set(x, "defaultLabelHoverColor", js.undefined)
    
    @scala.inline
    def setDefaultLabelSize(value: String): Self = StObject.set(x, "defaultLabelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLabelSizeUndefined: Self = StObject.set(x, "defaultLabelSize", js.undefined)
    
    @scala.inline
    def setDefaultNodeBorderColor(value: String): Self = StObject.set(x, "defaultNodeBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNodeBorderColorUndefined: Self = StObject.set(x, "defaultNodeBorderColor", js.undefined)
    
    @scala.inline
    def setDefaultNodeColor(value: String): Self = StObject.set(x, "defaultNodeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNodeColorUndefined: Self = StObject.set(x, "defaultNodeColor", js.undefined)
    
    @scala.inline
    def setDefaultNodeHoverColor(value: String): Self = StObject.set(x, "defaultNodeHoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNodeHoverColorUndefined: Self = StObject.set(x, "defaultNodeHoverColor", js.undefined)
    
    @scala.inline
    def setDefaultNodeType(value: String): Self = StObject.set(x, "defaultNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNodeTypeUndefined: Self = StObject.set(x, "defaultNodeType", js.undefined)
    
    @scala.inline
    def setDoubleClickEnabled(value: Boolean): Self = StObject.set(x, "doubleClickEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleClickEnabledUndefined: Self = StObject.set(x, "doubleClickEnabled", js.undefined)
    
    @scala.inline
    def setDoubleClickTimeout(value: Double): Self = StObject.set(x, "doubleClickTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleClickTimeoutUndefined: Self = StObject.set(x, "doubleClickTimeout", js.undefined)
    
    @scala.inline
    def setDoubleClickZoomDuration(value: Double): Self = StObject.set(x, "doubleClickZoomDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleClickZoomDurationUndefined: Self = StObject.set(x, "doubleClickZoomDuration", js.undefined)
    
    @scala.inline
    def setDoubleClickZoomingRatio(value: Double): Self = StObject.set(x, "doubleClickZoomingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleClickZoomingRatioUndefined: Self = StObject.set(x, "doubleClickZoomingRatio", js.undefined)
    
    @scala.inline
    def setDoubleTapTimeout(value: Double): Self = StObject.set(x, "doubleTapTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleTapTimeoutUndefined: Self = StObject.set(x, "doubleTapTimeout", js.undefined)
    
    @scala.inline
    def setDragTimeout(value: Double): Self = StObject.set(x, "dragTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragTimeoutUndefined: Self = StObject.set(x, "dragTimeout", js.undefined)
    
    @scala.inline
    def setDrawEdges(value: Boolean): Self = StObject.set(x, "drawEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawEdgesUndefined: Self = StObject.set(x, "drawEdges", js.undefined)
    
    @scala.inline
    def setDrawLabels(value: Boolean): Self = StObject.set(x, "drawLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawLabelsUndefined: Self = StObject.set(x, "drawLabels", js.undefined)
    
    @scala.inline
    def setDrawNodes(value: Boolean): Self = StObject.set(x, "drawNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawNodesUndefined: Self = StObject.set(x, "drawNodes", js.undefined)
    
    @scala.inline
    def setEdgeColor(value: String): Self = StObject.set(x, "edgeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeColorUndefined: Self = StObject.set(x, "edgeColor", js.undefined)
    
    @scala.inline
    def setEdgeHoverColor(value: String): Self = StObject.set(x, "edgeHoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeHoverColorUndefined: Self = StObject.set(x, "edgeHoverColor", js.undefined)
    
    @scala.inline
    def setEdgeHoverExtremities(value: Boolean): Self = StObject.set(x, "edgeHoverExtremities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeHoverExtremitiesUndefined: Self = StObject.set(x, "edgeHoverExtremities", js.undefined)
    
    @scala.inline
    def setEdgeHoverPrecision(value: Double): Self = StObject.set(x, "edgeHoverPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeHoverPrecisionUndefined: Self = StObject.set(x, "edgeHoverPrecision", js.undefined)
    
    @scala.inline
    def setEdgeHoverSizeRatio(value: Double): Self = StObject.set(x, "edgeHoverSizeRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeHoverSizeRatioUndefined: Self = StObject.set(x, "edgeHoverSizeRatio", js.undefined)
    
    @scala.inline
    def setEdgesPowRatio(value: Double): Self = StObject.set(x, "edgesPowRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesPowRatioUndefined: Self = StObject.set(x, "edgesPowRatio", js.undefined)
    
    @scala.inline
    def setEnableCamera(value: Boolean): Self = StObject.set(x, "enableCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCameraUndefined: Self = StObject.set(x, "enableCamera", js.undefined)
    
    @scala.inline
    def setEnableEdgeHovering(value: Boolean): Self = StObject.set(x, "enableEdgeHovering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableEdgeHoveringUndefined: Self = StObject.set(x, "enableEdgeHovering", js.undefined)
    
    @scala.inline
    def setEnableHovering(value: Boolean): Self = StObject.set(x, "enableHovering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHoveringUndefined: Self = StObject.set(x, "enableHovering", js.undefined)
    
    @scala.inline
    def setEventsEnabled(value: Boolean): Self = StObject.set(x, "eventsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsEnabledUndefined: Self = StObject.set(x, "eventsEnabled", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setHideEdgesOnMove(value: Boolean): Self = StObject.set(x, "hideEdgesOnMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideEdgesOnMoveUndefined: Self = StObject.set(x, "hideEdgesOnMove", js.undefined)
    
    @scala.inline
    def setHoverFont(value: Double): Self = StObject.set(x, "hoverFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverFontStyle(value: String): Self = StObject.set(x, "hoverFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverFontStyleUndefined: Self = StObject.set(x, "hoverFontStyle", js.undefined)
    
    @scala.inline
    def setHoverFontUndefined: Self = StObject.set(x, "hoverFont", js.undefined)
    
    @scala.inline
    def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
    
    @scala.inline
    def setLabelAlignment(value: String): Self = StObject.set(x, "labelAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAlignmentUndefined: Self = StObject.set(x, "labelAlignment", js.undefined)
    
    @scala.inline
    def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    @scala.inline
    def setLabelHoverBGColor(value: String): Self = StObject.set(x, "labelHoverBGColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHoverBGColorUndefined: Self = StObject.set(x, "labelHoverBGColor", js.undefined)
    
    @scala.inline
    def setLabelHoverColor(value: String): Self = StObject.set(x, "labelHoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHoverColorUndefined: Self = StObject.set(x, "labelHoverColor", js.undefined)
    
    @scala.inline
    def setLabelHoverShadow(value: String): Self = StObject.set(x, "labelHoverShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHoverShadowColor(value: String): Self = StObject.set(x, "labelHoverShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHoverShadowColorUndefined: Self = StObject.set(x, "labelHoverShadowColor", js.undefined)
    
    @scala.inline
    def setLabelHoverShadowUndefined: Self = StObject.set(x, "labelHoverShadow", js.undefined)
    
    @scala.inline
    def setLabelSize(value: String): Self = StObject.set(x, "labelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelSizeRatio(value: String): Self = StObject.set(x, "labelSizeRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelSizeRatioUndefined: Self = StObject.set(x, "labelSizeRatio", js.undefined)
    
    @scala.inline
    def setLabelSizeUndefined: Self = StObject.set(x, "labelSize", js.undefined)
    
    @scala.inline
    def setLabelThreshold(value: Double): Self = StObject.set(x, "labelThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelThresholdUndefined: Self = StObject.set(x, "labelThreshold", js.undefined)
    
    @scala.inline
    def setMaxEdgeSize(value: Double): Self = StObject.set(x, "maxEdgeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxEdgeSizeUndefined: Self = StObject.set(x, "maxEdgeSize", js.undefined)
    
    @scala.inline
    def setMaxNodeSize(value: Double): Self = StObject.set(x, "maxNodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNodeSizeUndefined: Self = StObject.set(x, "maxNodeSize", js.undefined)
    
    @scala.inline
    def setMinArrowSize(value: Double): Self = StObject.set(x, "minArrowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinArrowSizeUndefined: Self = StObject.set(x, "minArrowSize", js.undefined)
    
    @scala.inline
    def setMinEdgeSize(value: Double): Self = StObject.set(x, "minEdgeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinEdgeSizeUndefined: Self = StObject.set(x, "minEdgeSize", js.undefined)
    
    @scala.inline
    def setMinNodeSize(value: Double): Self = StObject.set(x, "minNodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNodeSizeUndefined: Self = StObject.set(x, "minNodeSize", js.undefined)
    
    @scala.inline
    def setMouseEnabled(value: Boolean): Self = StObject.set(x, "mouseEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEnabledUndefined: Self = StObject.set(x, "mouseEnabled", js.undefined)
    
    @scala.inline
    def setMouseInertiaDuration(value: Double): Self = StObject.set(x, "mouseInertiaDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseInertiaDurationUndefined: Self = StObject.set(x, "mouseInertiaDuration", js.undefined)
    
    @scala.inline
    def setMouseInertiaRatio(value: Double): Self = StObject.set(x, "mouseInertiaRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseInertiaRatioUndefined: Self = StObject.set(x, "mouseInertiaRatio", js.undefined)
    
    @scala.inline
    def setMouseWheelEnabled(value: Boolean): Self = StObject.set(x, "mouseWheelEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseWheelEnabledUndefined: Self = StObject.set(x, "mouseWheelEnabled", js.undefined)
    
    @scala.inline
    def setMouseZoomDuration(value: Double): Self = StObject.set(x, "mouseZoomDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseZoomDurationUndefined: Self = StObject.set(x, "mouseZoomDuration", js.undefined)
    
    @scala.inline
    def setNodeHoverColor(value: String): Self = StObject.set(x, "nodeHoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeHoverColorUndefined: Self = StObject.set(x, "nodeHoverColor", js.undefined)
    
    @scala.inline
    def setNodesPowRatio(value: Double): Self = StObject.set(x, "nodesPowRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesPowRatioUndefined: Self = StObject.set(x, "nodesPowRatio", js.undefined)
    
    @scala.inline
    def setRescaleIgnoreSize(value: Boolean): Self = StObject.set(x, "rescaleIgnoreSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRescaleIgnoreSizeUndefined: Self = StObject.set(x, "rescaleIgnoreSize", js.undefined)
    
    @scala.inline
    def setScalingMode(value: String): Self = StObject.set(x, "scalingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingModeUndefined: Self = StObject.set(x, "scalingMode", js.undefined)
    
    @scala.inline
    def setSideMargin(value: Double): Self = StObject.set(x, "sideMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideMarginUndefined: Self = StObject.set(x, "sideMargin", js.undefined)
    
    @scala.inline
    def setSingleHover(value: Boolean): Self = StObject.set(x, "singleHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleHoverUndefined: Self = StObject.set(x, "singleHover", js.undefined)
    
    @scala.inline
    def setSkipErrors(value: Boolean): Self = StObject.set(x, "skipErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipErrorsUndefined: Self = StObject.set(x, "skipErrors", js.undefined)
    
    @scala.inline
    def setTouchEnabled(value: Boolean): Self = StObject.set(x, "touchEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchEnabledUndefined: Self = StObject.set(x, "touchEnabled", js.undefined)
    
    @scala.inline
    def setTouchInertiaDuration(value: Double): Self = StObject.set(x, "touchInertiaDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchInertiaDurationUndefined: Self = StObject.set(x, "touchInertiaDuration", js.undefined)
    
    @scala.inline
    def setTouchInertiaRatio(value: Double): Self = StObject.set(x, "touchInertiaRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchInertiaRatioUndefined: Self = StObject.set(x, "touchInertiaRatio", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    
    @scala.inline
    def setWebglEdgesBatchSize(value: Double): Self = StObject.set(x, "webglEdgesBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebglEdgesBatchSizeUndefined: Self = StObject.set(x, "webglEdgesBatchSize", js.undefined)
    
    @scala.inline
    def setWebglOversamplingRatio(value: Double): Self = StObject.set(x, "webglOversamplingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebglOversamplingRatioUndefined: Self = StObject.set(x, "webglOversamplingRatio", js.undefined)
    
    @scala.inline
    def setZoomMax(value: Double): Self = StObject.set(x, "zoomMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomMaxUndefined: Self = StObject.set(x, "zoomMax", js.undefined)
    
    @scala.inline
    def setZoomMin(value: Double): Self = StObject.set(x, "zoomMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomMinUndefined: Self = StObject.set(x, "zoomMin", js.undefined)
    
    @scala.inline
    def setZoomingRatio(value: Double): Self = StObject.set(x, "zoomingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomingRatioUndefined: Self = StObject.set(x, "zoomingRatio", js.undefined)
  }
}
