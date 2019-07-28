package typings.sigmajs.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
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
  def apply(
    animationsTime: Int | Double = null,
    autoRescale: js.Any = null,
    autoResize: js.UndefOr[Boolean] = js.undefined,
    batchEdgesDrawing: js.UndefOr[Boolean] = js.undefined,
    borderSize: Int | Double = null,
    canvasEdgesBatchSize: Int | Double = null,
    clone: js.UndefOr[Boolean] = js.undefined,
    defaultEdgeColor: String = null,
    defaultEdgeHoverColor: String = null,
    defaultEdgeType: String = null,
    defaultHoverLabelBGColor: String = null,
    defaultLabelColor: String = null,
    defaultLabelHoverColor: String = null,
    defaultLabelSize: String = null,
    defaultNodeBorderColor: String = null,
    defaultNodeColor: String = null,
    defaultNodeHoverColor: String = null,
    defaultNodeType: String = null,
    doubleClickEnabled: js.UndefOr[Boolean] = js.undefined,
    doubleClickTimeout: Int | Double = null,
    doubleClickZoomDuration: Int | Double = null,
    doubleClickZoomingRatio: Int | Double = null,
    doubleTapTimeout: Int | Double = null,
    dragTimeout: Int | Double = null,
    drawEdges: js.UndefOr[Boolean] = js.undefined,
    drawLabels: js.UndefOr[Boolean] = js.undefined,
    drawNodes: js.UndefOr[Boolean] = js.undefined,
    edgeColor: String = null,
    edgeHoverColor: String = null,
    edgeHoverExtremities: js.UndefOr[Boolean] = js.undefined,
    edgeHoverPrecision: Int | Double = null,
    edgeHoverSizeRatio: Int | Double = null,
    edgesPowRatio: Int | Double = null,
    enableCamera: js.UndefOr[Boolean] = js.undefined,
    enableEdgeHovering: js.UndefOr[Boolean] = js.undefined,
    enableHovering: js.UndefOr[Boolean] = js.undefined,
    eventsEnabled: js.UndefOr[Boolean] = js.undefined,
    font: String = null,
    fontStyle: String = null,
    hideEdgesOnMove: js.UndefOr[Boolean] = js.undefined,
    hoverFont: Int | Double = null,
    hoverFontStyle: String = null,
    immutable: js.UndefOr[Boolean] = js.undefined,
    labelAlignment: String = null,
    labelColor: String = null,
    labelHoverBGColor: String = null,
    labelHoverColor: String = null,
    labelHoverShadow: String = null,
    labelHoverShadowColor: String = null,
    labelSize: String = null,
    labelSizeRatio: String = null,
    labelThreshold: Int | Double = null,
    maxEdgeSize: Int | Double = null,
    maxNodeSize: Int | Double = null,
    minArrowSize: Int | Double = null,
    minEdgeSize: Int | Double = null,
    minNodeSize: Int | Double = null,
    mouseEnabled: js.UndefOr[Boolean] = js.undefined,
    mouseInertiaDuration: Int | Double = null,
    mouseInertiaRatio: Int | Double = null,
    mouseWheelEnabled: js.UndefOr[Boolean] = js.undefined,
    mouseZoomDuration: Int | Double = null,
    nodeHoverColor: String = null,
    nodesPowRatio: Int | Double = null,
    rescaleIgnoreSize: js.UndefOr[Boolean] = js.undefined,
    scalingMode: String = null,
    sideMargin: Int | Double = null,
    singleHover: js.UndefOr[Boolean] = js.undefined,
    skipErrors: js.UndefOr[Boolean] = js.undefined,
    touchEnabled: js.UndefOr[Boolean] = js.undefined,
    touchInertiaDuration: Int | Double = null,
    touchInertiaRatio: Int | Double = null,
    verbose: js.UndefOr[Boolean] = js.undefined,
    webglEdgesBatchSize: Int | Double = null,
    webglOversamplingRatio: Int | Double = null,
    zoomMax: Int | Double = null,
    zoomMin: Int | Double = null,
    zoomingRatio: Int | Double = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (animationsTime != null) __obj.updateDynamic("animationsTime")(animationsTime.asInstanceOf[js.Any])
    if (autoRescale != null) __obj.updateDynamic("autoRescale")(autoRescale)
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize)
    if (!js.isUndefined(batchEdgesDrawing)) __obj.updateDynamic("batchEdgesDrawing")(batchEdgesDrawing)
    if (borderSize != null) __obj.updateDynamic("borderSize")(borderSize.asInstanceOf[js.Any])
    if (canvasEdgesBatchSize != null) __obj.updateDynamic("canvasEdgesBatchSize")(canvasEdgesBatchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone)
    if (defaultEdgeColor != null) __obj.updateDynamic("defaultEdgeColor")(defaultEdgeColor)
    if (defaultEdgeHoverColor != null) __obj.updateDynamic("defaultEdgeHoverColor")(defaultEdgeHoverColor)
    if (defaultEdgeType != null) __obj.updateDynamic("defaultEdgeType")(defaultEdgeType)
    if (defaultHoverLabelBGColor != null) __obj.updateDynamic("defaultHoverLabelBGColor")(defaultHoverLabelBGColor)
    if (defaultLabelColor != null) __obj.updateDynamic("defaultLabelColor")(defaultLabelColor)
    if (defaultLabelHoverColor != null) __obj.updateDynamic("defaultLabelHoverColor")(defaultLabelHoverColor)
    if (defaultLabelSize != null) __obj.updateDynamic("defaultLabelSize")(defaultLabelSize)
    if (defaultNodeBorderColor != null) __obj.updateDynamic("defaultNodeBorderColor")(defaultNodeBorderColor)
    if (defaultNodeColor != null) __obj.updateDynamic("defaultNodeColor")(defaultNodeColor)
    if (defaultNodeHoverColor != null) __obj.updateDynamic("defaultNodeHoverColor")(defaultNodeHoverColor)
    if (defaultNodeType != null) __obj.updateDynamic("defaultNodeType")(defaultNodeType)
    if (!js.isUndefined(doubleClickEnabled)) __obj.updateDynamic("doubleClickEnabled")(doubleClickEnabled)
    if (doubleClickTimeout != null) __obj.updateDynamic("doubleClickTimeout")(doubleClickTimeout.asInstanceOf[js.Any])
    if (doubleClickZoomDuration != null) __obj.updateDynamic("doubleClickZoomDuration")(doubleClickZoomDuration.asInstanceOf[js.Any])
    if (doubleClickZoomingRatio != null) __obj.updateDynamic("doubleClickZoomingRatio")(doubleClickZoomingRatio.asInstanceOf[js.Any])
    if (doubleTapTimeout != null) __obj.updateDynamic("doubleTapTimeout")(doubleTapTimeout.asInstanceOf[js.Any])
    if (dragTimeout != null) __obj.updateDynamic("dragTimeout")(dragTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(drawEdges)) __obj.updateDynamic("drawEdges")(drawEdges)
    if (!js.isUndefined(drawLabels)) __obj.updateDynamic("drawLabels")(drawLabels)
    if (!js.isUndefined(drawNodes)) __obj.updateDynamic("drawNodes")(drawNodes)
    if (edgeColor != null) __obj.updateDynamic("edgeColor")(edgeColor)
    if (edgeHoverColor != null) __obj.updateDynamic("edgeHoverColor")(edgeHoverColor)
    if (!js.isUndefined(edgeHoverExtremities)) __obj.updateDynamic("edgeHoverExtremities")(edgeHoverExtremities)
    if (edgeHoverPrecision != null) __obj.updateDynamic("edgeHoverPrecision")(edgeHoverPrecision.asInstanceOf[js.Any])
    if (edgeHoverSizeRatio != null) __obj.updateDynamic("edgeHoverSizeRatio")(edgeHoverSizeRatio.asInstanceOf[js.Any])
    if (edgesPowRatio != null) __obj.updateDynamic("edgesPowRatio")(edgesPowRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCamera)) __obj.updateDynamic("enableCamera")(enableCamera)
    if (!js.isUndefined(enableEdgeHovering)) __obj.updateDynamic("enableEdgeHovering")(enableEdgeHovering)
    if (!js.isUndefined(enableHovering)) __obj.updateDynamic("enableHovering")(enableHovering)
    if (!js.isUndefined(eventsEnabled)) __obj.updateDynamic("eventsEnabled")(eventsEnabled)
    if (font != null) __obj.updateDynamic("font")(font)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (!js.isUndefined(hideEdgesOnMove)) __obj.updateDynamic("hideEdgesOnMove")(hideEdgesOnMove)
    if (hoverFont != null) __obj.updateDynamic("hoverFont")(hoverFont.asInstanceOf[js.Any])
    if (hoverFontStyle != null) __obj.updateDynamic("hoverFontStyle")(hoverFontStyle)
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable)
    if (labelAlignment != null) __obj.updateDynamic("labelAlignment")(labelAlignment)
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (labelHoverBGColor != null) __obj.updateDynamic("labelHoverBGColor")(labelHoverBGColor)
    if (labelHoverColor != null) __obj.updateDynamic("labelHoverColor")(labelHoverColor)
    if (labelHoverShadow != null) __obj.updateDynamic("labelHoverShadow")(labelHoverShadow)
    if (labelHoverShadowColor != null) __obj.updateDynamic("labelHoverShadowColor")(labelHoverShadowColor)
    if (labelSize != null) __obj.updateDynamic("labelSize")(labelSize)
    if (labelSizeRatio != null) __obj.updateDynamic("labelSizeRatio")(labelSizeRatio)
    if (labelThreshold != null) __obj.updateDynamic("labelThreshold")(labelThreshold.asInstanceOf[js.Any])
    if (maxEdgeSize != null) __obj.updateDynamic("maxEdgeSize")(maxEdgeSize.asInstanceOf[js.Any])
    if (maxNodeSize != null) __obj.updateDynamic("maxNodeSize")(maxNodeSize.asInstanceOf[js.Any])
    if (minArrowSize != null) __obj.updateDynamic("minArrowSize")(minArrowSize.asInstanceOf[js.Any])
    if (minEdgeSize != null) __obj.updateDynamic("minEdgeSize")(minEdgeSize.asInstanceOf[js.Any])
    if (minNodeSize != null) __obj.updateDynamic("minNodeSize")(minNodeSize.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseEnabled)) __obj.updateDynamic("mouseEnabled")(mouseEnabled)
    if (mouseInertiaDuration != null) __obj.updateDynamic("mouseInertiaDuration")(mouseInertiaDuration.asInstanceOf[js.Any])
    if (mouseInertiaRatio != null) __obj.updateDynamic("mouseInertiaRatio")(mouseInertiaRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseWheelEnabled)) __obj.updateDynamic("mouseWheelEnabled")(mouseWheelEnabled)
    if (mouseZoomDuration != null) __obj.updateDynamic("mouseZoomDuration")(mouseZoomDuration.asInstanceOf[js.Any])
    if (nodeHoverColor != null) __obj.updateDynamic("nodeHoverColor")(nodeHoverColor)
    if (nodesPowRatio != null) __obj.updateDynamic("nodesPowRatio")(nodesPowRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(rescaleIgnoreSize)) __obj.updateDynamic("rescaleIgnoreSize")(rescaleIgnoreSize)
    if (scalingMode != null) __obj.updateDynamic("scalingMode")(scalingMode)
    if (sideMargin != null) __obj.updateDynamic("sideMargin")(sideMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(singleHover)) __obj.updateDynamic("singleHover")(singleHover)
    if (!js.isUndefined(skipErrors)) __obj.updateDynamic("skipErrors")(skipErrors)
    if (!js.isUndefined(touchEnabled)) __obj.updateDynamic("touchEnabled")(touchEnabled)
    if (touchInertiaDuration != null) __obj.updateDynamic("touchInertiaDuration")(touchInertiaDuration.asInstanceOf[js.Any])
    if (touchInertiaRatio != null) __obj.updateDynamic("touchInertiaRatio")(touchInertiaRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    if (webglEdgesBatchSize != null) __obj.updateDynamic("webglEdgesBatchSize")(webglEdgesBatchSize.asInstanceOf[js.Any])
    if (webglOversamplingRatio != null) __obj.updateDynamic("webglOversamplingRatio")(webglOversamplingRatio.asInstanceOf[js.Any])
    if (zoomMax != null) __obj.updateDynamic("zoomMax")(zoomMax.asInstanceOf[js.Any])
    if (zoomMin != null) __obj.updateDynamic("zoomMin")(zoomMin.asInstanceOf[js.Any])
    if (zoomingRatio != null) __obj.updateDynamic("zoomingRatio")(zoomingRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

