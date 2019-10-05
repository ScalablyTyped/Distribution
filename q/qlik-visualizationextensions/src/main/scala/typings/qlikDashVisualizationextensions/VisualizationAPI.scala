package typings.qlikDashVisualizationextensions

import typings.angular.angularMod.IPromise
import typings.qlikDashVisualizationextensions.TableAPI.IQTable
import typings.qlikDashVisualizationextensions.VisualizationAPI.VisualizationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VisualizationAPI")
@js.native
object VisualizationAPI extends js.Object {
  @js.native
  trait IQVisualization extends js.Object {
    /**
      * Table object for this visualization.
      * Only for visualizations built on a hypercube.
      */
    var table: IQTable = js.native
    /**
      * Closes a visualization and releases the session object.
      * @return - A promise.
      */
    def close(): IPromise[_] = js.native
    /**
      * Tells the visualization it has been resized and should re-paint.
      */
    def resize(): Unit = js.native
    /**
      * Sets options for a visualization.
      * @param options - Options to set (using applyPatches).
      */
    def setOptions(): Unit = js.native
    def setOptions(options: js.Any): Unit = js.native
    /**
      * Shows the visualization in an HTML element.
      * @param [element] - Optional. HTML element or HTML element ID.
      * @param [options] - Optional.
      * Name | Type | Description
      * noInteraction | Boolean | Set to true if you want to disable all interaction, including selections, in the visualization.
      * noSelections | Boolean | Set to true if you want to disable selections in the visualization.
      * | | Parameter introduced in version 3.0.
      */
    def show(): Unit = js.native
    def show(element: String): Unit = js.native
    def show(element: String, options: js.Any): Unit = js.native
    def show(element: js.Any): Unit = js.native
    def show(element: js.Any, options: js.Any): Unit = js.native
  }
  
  @js.native
  trait IVisualization extends js.Object {
    /**
      * Create a new visualization on the fly based on a session object
      * and will not be persisted in the app.
      * @param type - Visualization type. Can be:
      *       # barchart
      *       # combochart
      *       # gauge
      *       # kpi
      *       # linechart
      *       # piechart
      *       # pivot-table
      *       # scatterplot
      *       # table
      *       # treemap
      *       # extension
      * @param [cols] - Optional. Column definitions, dimensions and measures.
      *       Each entry can be of the following structures:
      *       # String
      *       # NxDimension
      *       # NxMeasure
      *       If the NxDimension or the NxMeasure refer to a library dimension
      *       or a library measure, you also need to add qType : "measure" or "dimension".
      * @param [options] - Optional. Options to set.
      * @return - A promise of a QVisualization.
      */
    def create(`type`: VisualizationType): IPromise[_] = js.native
    def create(`type`: VisualizationType, cols: js.Array[_]): IPromise[_] = js.native
    def create(`type`: VisualizationType, cols: js.Array[_], options: js.Any): IPromise[_] = js.native
    /**
      * Gets an existing visualization.
      * @param id - Id for an existing visualization.
      * @return - A promise of a QVisualization.
      */
    def get(id: String): IPromise[_] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.barchart
    - typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.combochart
    - typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.gauge
    - typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.kpi
    - typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.linechart
    - typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.piechart
    - typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.`pivot-table`
    - typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.scatterplot
    - typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.table
    - typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.treemap
    - typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.extension
  */
  trait VisualizationType extends js.Object
  
}

