package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  // Animation settings
  var animationsTime: js.UndefOr[scala.Double] = js.undefined
  var autoRescale: js.UndefOr[js.Any] = js.undefined
  // Global settings
  var autoResize: js.UndefOr[scala.Boolean] = js.undefined
  // Batch edge drawing
  var batchEdgesDrawing: js.UndefOr[scala.Boolean] = js.undefined
  // hovered node customizations
  var borderSize: js.UndefOr[scala.Double] = js.undefined
  var canvasEdgesBatchSize: js.UndefOr[scala.Double] = js.undefined
  // Graph settings
  @JSName("clone")
  var clone_FSettings: js.UndefOr[scala.Boolean] = js.undefined
  var defaultEdgeColor: js.UndefOr[java.lang.String] = js.undefined
  var defaultEdgeHoverColor: js.UndefOr[java.lang.String] = js.undefined
  var defaultEdgeType: js.UndefOr[java.lang.String] = js.undefined
  var defaultHoverLabelBGColor: js.UndefOr[java.lang.String] = js.undefined
  var defaultLabelColor: js.UndefOr[java.lang.String] = js.undefined
  var defaultLabelHoverColor: js.UndefOr[java.lang.String] = js.undefined
  var defaultLabelSize: js.UndefOr[java.lang.String] = js.undefined
  var defaultNodeBorderColor: js.UndefOr[java.lang.String] = js.undefined
  var defaultNodeColor: js.UndefOr[java.lang.String] = js.undefined
  var defaultNodeHoverColor: js.UndefOr[java.lang.String] = js.undefined
  // Renderers settings
  var defaultNodeType: js.UndefOr[java.lang.String] = js.undefined
  var doubleClickEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var doubleClickTimeout: js.UndefOr[scala.Double] = js.undefined
  var doubleClickZoomDuration: js.UndefOr[scala.Double] = js.undefined
  var doubleClickZoomingRatio: js.UndefOr[scala.Double] = js.undefined
  var doubleTapTimeout: js.UndefOr[scala.Double] = js.undefined
  var dragTimeout: js.UndefOr[scala.Double] = js.undefined
  var drawEdges: js.UndefOr[scala.Boolean] = js.undefined
  // Draw settings for labels, edges, and nodes
  var drawLabels: js.UndefOr[scala.Boolean] = js.undefined
  var drawNodes: js.UndefOr[scala.Boolean] = js.undefined
  var edgeColor: js.UndefOr[java.lang.String] = js.undefined
  // hovered edge customizations
  var edgeHoverColor: js.UndefOr[java.lang.String] = js.undefined
  var edgeHoverExtremities: js.UndefOr[scala.Boolean] = js.undefined
  var edgeHoverPrecision: js.UndefOr[scala.Double] = js.undefined
  var edgeHoverSizeRatio: js.UndefOr[scala.Double] = js.undefined
  var edgesPowRatio: js.UndefOr[scala.Double] = js.undefined
  var enableCamera: js.UndefOr[scala.Boolean] = js.undefined
  var enableEdgeHovering: js.UndefOr[scala.Boolean] = js.undefined
  var enableHovering: js.UndefOr[scala.Boolean] = js.undefined
  var eventsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  var hideEdgesOnMove: js.UndefOr[scala.Boolean] = js.undefined
  var hoverFont: js.UndefOr[scala.Double] = js.undefined
  var hoverFontStyle: js.UndefOr[java.lang.String] = js.undefined
  var immutable: js.UndefOr[scala.Boolean] = js.undefined
  var labelAlignment: js.UndefOr[java.lang.String] = js.undefined
  var labelColor: js.UndefOr[java.lang.String] = js.undefined
  var labelHoverBGColor: js.UndefOr[java.lang.String] = js.undefined
  var labelHoverColor: js.UndefOr[java.lang.String] = js.undefined
  var labelHoverShadow: js.UndefOr[java.lang.String] = js.undefined
  var labelHoverShadowColor: js.UndefOr[java.lang.String] = js.undefined
  var labelSize: js.UndefOr[java.lang.String] = js.undefined
  var labelSizeRatio: js.UndefOr[java.lang.String] = js.undefined
  var labelThreshold: js.UndefOr[scala.Double] = js.undefined
  var maxEdgeSize: js.UndefOr[scala.Double] = js.undefined
  var maxNodeSize: js.UndefOr[scala.Double] = js.undefined
  var minArrowSize: js.UndefOr[scala.Double] = js.undefined
  // max/min node and edge size
  var minEdgeSize: js.UndefOr[scala.Double] = js.undefined
  var minNodeSize: js.UndefOr[scala.Double] = js.undefined
  var mouseEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var mouseInertiaDuration: js.UndefOr[scala.Double] = js.undefined
  var mouseInertiaRatio: js.UndefOr[scala.Double] = js.undefined
  var mouseWheelEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var mouseZoomDuration: js.UndefOr[scala.Double] = js.undefined
  var nodeHoverColor: js.UndefOr[java.lang.String] = js.undefined
  // Camera settings
  var nodesPowRatio: js.UndefOr[scala.Double] = js.undefined
  var rescaleIgnoreSize: js.UndefOr[scala.Boolean] = js.undefined
  // Rescale settings
  var scalingMode: js.UndefOr[java.lang.String] = js.undefined
  var sideMargin: js.UndefOr[scala.Double] = js.undefined
  var singleHover: js.UndefOr[scala.Boolean] = js.undefined
  var skipErrors: js.UndefOr[scala.Boolean] = js.undefined
  // Captor settings
  var touchEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var touchInertiaDuration: js.UndefOr[scala.Double] = js.undefined
  var touchInertiaRatio: js.UndefOr[scala.Double] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
  var webglEdgesBatchSize: js.UndefOr[scala.Double] = js.undefined
  var webglOversamplingRatio: js.UndefOr[scala.Double] = js.undefined
  var zoomMax: js.UndefOr[scala.Double] = js.undefined
  var zoomMin: js.UndefOr[scala.Double] = js.undefined
  var zoomingRatio: js.UndefOr[scala.Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    animationsTime: scala.Int | scala.Double = null,
    autoRescale: js.Any = null,
    autoResize: js.UndefOr[scala.Boolean] = js.undefined,
    batchEdgesDrawing: js.UndefOr[scala.Boolean] = js.undefined,
    borderSize: scala.Int | scala.Double = null,
    canvasEdgesBatchSize: scala.Int | scala.Double = null,
    clone: js.UndefOr[scala.Boolean] = js.undefined,
    defaultEdgeColor: java.lang.String = null,
    defaultEdgeHoverColor: java.lang.String = null,
    defaultEdgeType: java.lang.String = null,
    defaultHoverLabelBGColor: java.lang.String = null,
    defaultLabelColor: java.lang.String = null,
    defaultLabelHoverColor: java.lang.String = null,
    defaultLabelSize: java.lang.String = null,
    defaultNodeBorderColor: java.lang.String = null,
    defaultNodeColor: java.lang.String = null,
    defaultNodeHoverColor: java.lang.String = null,
    defaultNodeType: java.lang.String = null,
    doubleClickEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    doubleClickTimeout: scala.Int | scala.Double = null,
    doubleClickZoomDuration: scala.Int | scala.Double = null,
    doubleClickZoomingRatio: scala.Int | scala.Double = null,
    doubleTapTimeout: scala.Int | scala.Double = null,
    dragTimeout: scala.Int | scala.Double = null,
    drawEdges: js.UndefOr[scala.Boolean] = js.undefined,
    drawLabels: js.UndefOr[scala.Boolean] = js.undefined,
    drawNodes: js.UndefOr[scala.Boolean] = js.undefined,
    edgeColor: java.lang.String = null,
    edgeHoverColor: java.lang.String = null,
    edgeHoverExtremities: js.UndefOr[scala.Boolean] = js.undefined,
    edgeHoverPrecision: scala.Int | scala.Double = null,
    edgeHoverSizeRatio: scala.Int | scala.Double = null,
    edgesPowRatio: scala.Int | scala.Double = null,
    enableCamera: js.UndefOr[scala.Boolean] = js.undefined,
    enableEdgeHovering: js.UndefOr[scala.Boolean] = js.undefined,
    enableHovering: js.UndefOr[scala.Boolean] = js.undefined,
    eventsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    font: java.lang.String = null,
    fontStyle: java.lang.String = null,
    hideEdgesOnMove: js.UndefOr[scala.Boolean] = js.undefined,
    hoverFont: scala.Int | scala.Double = null,
    hoverFontStyle: java.lang.String = null,
    immutable: js.UndefOr[scala.Boolean] = js.undefined,
    labelAlignment: java.lang.String = null,
    labelColor: java.lang.String = null,
    labelHoverBGColor: java.lang.String = null,
    labelHoverColor: java.lang.String = null,
    labelHoverShadow: java.lang.String = null,
    labelHoverShadowColor: java.lang.String = null,
    labelSize: java.lang.String = null,
    labelSizeRatio: java.lang.String = null,
    labelThreshold: scala.Int | scala.Double = null,
    maxEdgeSize: scala.Int | scala.Double = null,
    maxNodeSize: scala.Int | scala.Double = null,
    minArrowSize: scala.Int | scala.Double = null,
    minEdgeSize: scala.Int | scala.Double = null,
    minNodeSize: scala.Int | scala.Double = null,
    mouseEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    mouseInertiaDuration: scala.Int | scala.Double = null,
    mouseInertiaRatio: scala.Int | scala.Double = null,
    mouseWheelEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    mouseZoomDuration: scala.Int | scala.Double = null,
    nodeHoverColor: java.lang.String = null,
    nodesPowRatio: scala.Int | scala.Double = null,
    rescaleIgnoreSize: js.UndefOr[scala.Boolean] = js.undefined,
    scalingMode: java.lang.String = null,
    sideMargin: scala.Int | scala.Double = null,
    singleHover: js.UndefOr[scala.Boolean] = js.undefined,
    skipErrors: js.UndefOr[scala.Boolean] = js.undefined,
    touchEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    touchInertiaDuration: scala.Int | scala.Double = null,
    touchInertiaRatio: scala.Int | scala.Double = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined,
    webglEdgesBatchSize: scala.Int | scala.Double = null,
    webglOversamplingRatio: scala.Int | scala.Double = null,
    zoomMax: scala.Int | scala.Double = null,
    zoomMin: scala.Int | scala.Double = null,
    zoomingRatio: scala.Int | scala.Double = null
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

