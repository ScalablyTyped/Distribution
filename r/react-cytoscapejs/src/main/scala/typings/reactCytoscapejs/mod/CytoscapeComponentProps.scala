package typings.reactCytoscapejs.mod

import typings.cytoscape.mod.Core
import typings.cytoscape.mod.ElementDefinition
import typings.cytoscape.mod.LayoutOptions
import typings.cytoscape.mod.Stylesheet
import typings.react.mod.CSSProperties
import typings.std.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CytoscapeComponentProps extends js.Object {
  var autoungrabify: js.UndefOr[Boolean] = js.undefined
  var autounselectify: js.UndefOr[Boolean] = js.undefined
  var boxSelectionEnabled: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var cy: js.UndefOr[js.Function1[/* cy */ Core, Unit]] = js.undefined
  var elements: js.Array[ElementDefinition]
  var id: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[LayoutOptions] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var pan: js.UndefOr[Position] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var stylesheet: js.UndefOr[Stylesheet | js.Array[Stylesheet] | String] = js.undefined
  var userZoomingEnabled: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
  var zoomingEnabled: js.UndefOr[Boolean] = js.undefined
}

object CytoscapeComponentProps {
  @scala.inline
  def apply(
    elements: js.Array[ElementDefinition],
    autoungrabify: js.UndefOr[Boolean] = js.undefined,
    autounselectify: js.UndefOr[Boolean] = js.undefined,
    boxSelectionEnabled: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    cy: /* cy */ Core => Unit = null,
    id: String = null,
    layout: LayoutOptions = null,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    pan: Position = null,
    style: CSSProperties = null,
    stylesheet: Stylesheet | js.Array[Stylesheet] | String = null,
    userZoomingEnabled: js.UndefOr[Boolean] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined,
    zoomingEnabled: js.UndefOr[Boolean] = js.undefined
  ): CytoscapeComponentProps = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    if (!js.isUndefined(autoungrabify)) __obj.updateDynamic("autoungrabify")(autoungrabify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autounselectify)) __obj.updateDynamic("autounselectify")(autounselectify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(boxSelectionEnabled)) __obj.updateDynamic("boxSelectionEnabled")(boxSelectionEnabled.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(js.Any.fromFunction1(cy))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet.asInstanceOf[js.Any])
    if (!js.isUndefined(userZoomingEnabled)) __obj.updateDynamic("userZoomingEnabled")(userZoomingEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomingEnabled)) __obj.updateDynamic("zoomingEnabled")(zoomingEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CytoscapeComponentProps]
  }
}

