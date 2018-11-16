package typings
package qlikDashVisualizationextensionsLib.VisualizationAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQVisualization extends js.Object {
  /**
           * Table object for this visualization.
           * Only for visualizations built on a hypercube.
           */
  var table: qlikDashVisualizationextensionsLib.TableAPINs.IQTable = js.native
  /**
           * Closes a visualization and releases the session object.
           * @return - A promise.
           */
  def close(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Tells the visualization it has been resized and should re-paint.
           */
  def resize(): scala.Unit = js.native
  /**
           * Sets options for a visualization.
           * @param options - Options to set (using applyPatches).
           */
  def setOptions(): scala.Unit = js.native
  /**
           * Sets options for a visualization.
           * @param options - Options to set (using applyPatches).
           */
  def setOptions(options: js.Any): scala.Unit = js.native
  /**
           * Shows the visualization in an HTML element.
           * @param [element] - Optional. HTML element or HTML element ID.
           * @param [options] - Optional.
           * Name | Type | Description
           * noInteraction | Boolean | Set to true if you want to disable all interaction, including selections, in the visualization.
           * noSelections | Boolean | Set to true if you want to disable selections in the visualization.
           * | | Parameter introduced in version 3.0.
           */
  def show(): scala.Unit = js.native
  /**
           * Shows the visualization in an HTML element.
           * @param [element] - Optional. HTML element or HTML element ID.
           * @param [options] - Optional.
           * Name | Type | Description
           * noInteraction | Boolean | Set to true if you want to disable all interaction, including selections, in the visualization.
           * noSelections | Boolean | Set to true if you want to disable selections in the visualization.
           * | | Parameter introduced in version 3.0.
           */
  def show(element: java.lang.String): scala.Unit = js.native
  /**
           * Shows the visualization in an HTML element.
           * @param [element] - Optional. HTML element or HTML element ID.
           * @param [options] - Optional.
           * Name | Type | Description
           * noInteraction | Boolean | Set to true if you want to disable all interaction, including selections, in the visualization.
           * noSelections | Boolean | Set to true if you want to disable selections in the visualization.
           * | | Parameter introduced in version 3.0.
           */
  def show(element: java.lang.String, options: js.Any): scala.Unit = js.native
  /**
           * Shows the visualization in an HTML element.
           * @param [element] - Optional. HTML element or HTML element ID.
           * @param [options] - Optional.
           * Name | Type | Description
           * noInteraction | Boolean | Set to true if you want to disable all interaction, including selections, in the visualization.
           * noSelections | Boolean | Set to true if you want to disable selections in the visualization.
           * | | Parameter introduced in version 3.0.
           */
  def show(element: js.Any): scala.Unit = js.native
  /**
           * Shows the visualization in an HTML element.
           * @param [element] - Optional. HTML element or HTML element ID.
           * @param [options] - Optional.
           * Name | Type | Description
           * noInteraction | Boolean | Set to true if you want to disable all interaction, including selections, in the visualization.
           * noSelections | Boolean | Set to true if you want to disable selections in the visualization.
           * | | Parameter introduced in version 3.0.
           */
  def show(element: js.Any, options: js.Any): scala.Unit = js.native
}

