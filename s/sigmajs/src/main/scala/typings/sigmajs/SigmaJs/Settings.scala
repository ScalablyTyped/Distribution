package typings.sigmajs.SigmaJs

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
    animationsTime: js.UndefOr[Double] = js.undefined,
    autoRescale: js.Any = null,
    autoResize: js.UndefOr[Boolean] = js.undefined,
    batchEdgesDrawing: js.UndefOr[Boolean] = js.undefined,
    borderSize: js.UndefOr[Double] = js.undefined,
    canvasEdgesBatchSize: js.UndefOr[Double] = js.undefined,
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
    doubleClickTimeout: js.UndefOr[Double] = js.undefined,
    doubleClickZoomDuration: js.UndefOr[Double] = js.undefined,
    doubleClickZoomingRatio: js.UndefOr[Double] = js.undefined,
    doubleTapTimeout: js.UndefOr[Double] = js.undefined,
    dragTimeout: js.UndefOr[Double] = js.undefined,
    drawEdges: js.UndefOr[Boolean] = js.undefined,
    drawLabels: js.UndefOr[Boolean] = js.undefined,
    drawNodes: js.UndefOr[Boolean] = js.undefined,
    edgeColor: String = null,
    edgeHoverColor: String = null,
    edgeHoverExtremities: js.UndefOr[Boolean] = js.undefined,
    edgeHoverPrecision: js.UndefOr[Double] = js.undefined,
    edgeHoverSizeRatio: js.UndefOr[Double] = js.undefined,
    edgesPowRatio: js.UndefOr[Double] = js.undefined,
    enableCamera: js.UndefOr[Boolean] = js.undefined,
    enableEdgeHovering: js.UndefOr[Boolean] = js.undefined,
    enableHovering: js.UndefOr[Boolean] = js.undefined,
    eventsEnabled: js.UndefOr[Boolean] = js.undefined,
    font: String = null,
    fontStyle: String = null,
    hideEdgesOnMove: js.UndefOr[Boolean] = js.undefined,
    hoverFont: js.UndefOr[Double] = js.undefined,
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
    labelThreshold: js.UndefOr[Double] = js.undefined,
    maxEdgeSize: js.UndefOr[Double] = js.undefined,
    maxNodeSize: js.UndefOr[Double] = js.undefined,
    minArrowSize: js.UndefOr[Double] = js.undefined,
    minEdgeSize: js.UndefOr[Double] = js.undefined,
    minNodeSize: js.UndefOr[Double] = js.undefined,
    mouseEnabled: js.UndefOr[Boolean] = js.undefined,
    mouseInertiaDuration: js.UndefOr[Double] = js.undefined,
    mouseInertiaRatio: js.UndefOr[Double] = js.undefined,
    mouseWheelEnabled: js.UndefOr[Boolean] = js.undefined,
    mouseZoomDuration: js.UndefOr[Double] = js.undefined,
    nodeHoverColor: String = null,
    nodesPowRatio: js.UndefOr[Double] = js.undefined,
    rescaleIgnoreSize: js.UndefOr[Boolean] = js.undefined,
    scalingMode: String = null,
    sideMargin: js.UndefOr[Double] = js.undefined,
    singleHover: js.UndefOr[Boolean] = js.undefined,
    skipErrors: js.UndefOr[Boolean] = js.undefined,
    touchEnabled: js.UndefOr[Boolean] = js.undefined,
    touchInertiaDuration: js.UndefOr[Double] = js.undefined,
    touchInertiaRatio: js.UndefOr[Double] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    webglEdgesBatchSize: js.UndefOr[Double] = js.undefined,
    webglOversamplingRatio: js.UndefOr[Double] = js.undefined,
    zoomMax: js.UndefOr[Double] = js.undefined,
    zoomMin: js.UndefOr[Double] = js.undefined,
    zoomingRatio: js.UndefOr[Double] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationsTime)) __obj.updateDynamic("animationsTime")(animationsTime.get.asInstanceOf[js.Any])
    if (autoRescale != null) __obj.updateDynamic("autoRescale")(autoRescale.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(batchEdgesDrawing)) __obj.updateDynamic("batchEdgesDrawing")(batchEdgesDrawing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderSize)) __obj.updateDynamic("borderSize")(borderSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canvasEdgesBatchSize)) __obj.updateDynamic("canvasEdgesBatchSize")(canvasEdgesBatchSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.get.asInstanceOf[js.Any])
    if (defaultEdgeColor != null) __obj.updateDynamic("defaultEdgeColor")(defaultEdgeColor.asInstanceOf[js.Any])
    if (defaultEdgeHoverColor != null) __obj.updateDynamic("defaultEdgeHoverColor")(defaultEdgeHoverColor.asInstanceOf[js.Any])
    if (defaultEdgeType != null) __obj.updateDynamic("defaultEdgeType")(defaultEdgeType.asInstanceOf[js.Any])
    if (defaultHoverLabelBGColor != null) __obj.updateDynamic("defaultHoverLabelBGColor")(defaultHoverLabelBGColor.asInstanceOf[js.Any])
    if (defaultLabelColor != null) __obj.updateDynamic("defaultLabelColor")(defaultLabelColor.asInstanceOf[js.Any])
    if (defaultLabelHoverColor != null) __obj.updateDynamic("defaultLabelHoverColor")(defaultLabelHoverColor.asInstanceOf[js.Any])
    if (defaultLabelSize != null) __obj.updateDynamic("defaultLabelSize")(defaultLabelSize.asInstanceOf[js.Any])
    if (defaultNodeBorderColor != null) __obj.updateDynamic("defaultNodeBorderColor")(defaultNodeBorderColor.asInstanceOf[js.Any])
    if (defaultNodeColor != null) __obj.updateDynamic("defaultNodeColor")(defaultNodeColor.asInstanceOf[js.Any])
    if (defaultNodeHoverColor != null) __obj.updateDynamic("defaultNodeHoverColor")(defaultNodeHoverColor.asInstanceOf[js.Any])
    if (defaultNodeType != null) __obj.updateDynamic("defaultNodeType")(defaultNodeType.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleClickEnabled)) __obj.updateDynamic("doubleClickEnabled")(doubleClickEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleClickTimeout)) __obj.updateDynamic("doubleClickTimeout")(doubleClickTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleClickZoomDuration)) __obj.updateDynamic("doubleClickZoomDuration")(doubleClickZoomDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleClickZoomingRatio)) __obj.updateDynamic("doubleClickZoomingRatio")(doubleClickZoomingRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleTapTimeout)) __obj.updateDynamic("doubleTapTimeout")(doubleTapTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dragTimeout)) __obj.updateDynamic("dragTimeout")(dragTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawEdges)) __obj.updateDynamic("drawEdges")(drawEdges.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawLabels)) __obj.updateDynamic("drawLabels")(drawLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawNodes)) __obj.updateDynamic("drawNodes")(drawNodes.get.asInstanceOf[js.Any])
    if (edgeColor != null) __obj.updateDynamic("edgeColor")(edgeColor.asInstanceOf[js.Any])
    if (edgeHoverColor != null) __obj.updateDynamic("edgeHoverColor")(edgeHoverColor.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeHoverExtremities)) __obj.updateDynamic("edgeHoverExtremities")(edgeHoverExtremities.get.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeHoverPrecision)) __obj.updateDynamic("edgeHoverPrecision")(edgeHoverPrecision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeHoverSizeRatio)) __obj.updateDynamic("edgeHoverSizeRatio")(edgeHoverSizeRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(edgesPowRatio)) __obj.updateDynamic("edgesPowRatio")(edgesPowRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCamera)) __obj.updateDynamic("enableCamera")(enableCamera.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableEdgeHovering)) __obj.updateDynamic("enableEdgeHovering")(enableEdgeHovering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHovering)) __obj.updateDynamic("enableHovering")(enableHovering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(eventsEnabled)) __obj.updateDynamic("eventsEnabled")(eventsEnabled.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hideEdgesOnMove)) __obj.updateDynamic("hideEdgesOnMove")(hideEdgesOnMove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverFont)) __obj.updateDynamic("hoverFont")(hoverFont.get.asInstanceOf[js.Any])
    if (hoverFontStyle != null) __obj.updateDynamic("hoverFontStyle")(hoverFontStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable.get.asInstanceOf[js.Any])
    if (labelAlignment != null) __obj.updateDynamic("labelAlignment")(labelAlignment.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor.asInstanceOf[js.Any])
    if (labelHoverBGColor != null) __obj.updateDynamic("labelHoverBGColor")(labelHoverBGColor.asInstanceOf[js.Any])
    if (labelHoverColor != null) __obj.updateDynamic("labelHoverColor")(labelHoverColor.asInstanceOf[js.Any])
    if (labelHoverShadow != null) __obj.updateDynamic("labelHoverShadow")(labelHoverShadow.asInstanceOf[js.Any])
    if (labelHoverShadowColor != null) __obj.updateDynamic("labelHoverShadowColor")(labelHoverShadowColor.asInstanceOf[js.Any])
    if (labelSize != null) __obj.updateDynamic("labelSize")(labelSize.asInstanceOf[js.Any])
    if (labelSizeRatio != null) __obj.updateDynamic("labelSizeRatio")(labelSizeRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(labelThreshold)) __obj.updateDynamic("labelThreshold")(labelThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxEdgeSize)) __obj.updateDynamic("maxEdgeSize")(maxEdgeSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNodeSize)) __obj.updateDynamic("maxNodeSize")(maxNodeSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minArrowSize)) __obj.updateDynamic("minArrowSize")(minArrowSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minEdgeSize)) __obj.updateDynamic("minEdgeSize")(minEdgeSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minNodeSize)) __obj.updateDynamic("minNodeSize")(minNodeSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseEnabled)) __obj.updateDynamic("mouseEnabled")(mouseEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseInertiaDuration)) __obj.updateDynamic("mouseInertiaDuration")(mouseInertiaDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseInertiaRatio)) __obj.updateDynamic("mouseInertiaRatio")(mouseInertiaRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseWheelEnabled)) __obj.updateDynamic("mouseWheelEnabled")(mouseWheelEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseZoomDuration)) __obj.updateDynamic("mouseZoomDuration")(mouseZoomDuration.get.asInstanceOf[js.Any])
    if (nodeHoverColor != null) __obj.updateDynamic("nodeHoverColor")(nodeHoverColor.asInstanceOf[js.Any])
    if (!js.isUndefined(nodesPowRatio)) __obj.updateDynamic("nodesPowRatio")(nodesPowRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rescaleIgnoreSize)) __obj.updateDynamic("rescaleIgnoreSize")(rescaleIgnoreSize.get.asInstanceOf[js.Any])
    if (scalingMode != null) __obj.updateDynamic("scalingMode")(scalingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(sideMargin)) __obj.updateDynamic("sideMargin")(sideMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(singleHover)) __obj.updateDynamic("singleHover")(singleHover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipErrors)) __obj.updateDynamic("skipErrors")(skipErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchEnabled)) __obj.updateDynamic("touchEnabled")(touchEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchInertiaDuration)) __obj.updateDynamic("touchInertiaDuration")(touchInertiaDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchInertiaRatio)) __obj.updateDynamic("touchInertiaRatio")(touchInertiaRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webglEdgesBatchSize)) __obj.updateDynamic("webglEdgesBatchSize")(webglEdgesBatchSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webglOversamplingRatio)) __obj.updateDynamic("webglOversamplingRatio")(webglOversamplingRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomMax)) __obj.updateDynamic("zoomMax")(zoomMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomMin)) __obj.updateDynamic("zoomMin")(zoomMin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomingRatio)) __obj.updateDynamic("zoomingRatio")(zoomingRatio.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

