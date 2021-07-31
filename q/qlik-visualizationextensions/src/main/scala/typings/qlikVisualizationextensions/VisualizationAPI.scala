package typings.qlikVisualizationextensions

import typings.angular.mod.IPromise
import typings.qlikVisualizationextensions.TableAPI.IQTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VisualizationAPI {
  
  @js.native
  trait IQVisualization extends StObject {
    
    /**
      * Closes a visualization and releases the session object.
      * @return - A promise.
      */
    def close(): IPromise[js.Any] = js.native
    
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
    def show(element: Unit, options: js.Any): Unit = js.native
    
    /**
      * Table object for this visualization.
      * Only for visualizations built on a hypercube.
      */
    var table: IQTable = js.native
  }
  
  @js.native
  trait IVisualization extends StObject {
    
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
    def create(`type`: VisualizationType): IPromise[js.Any] = js.native
    def create(`type`: VisualizationType, cols: js.Array[js.Any]): IPromise[js.Any] = js.native
    def create(`type`: VisualizationType, cols: js.Array[js.Any], options: js.Any): IPromise[js.Any] = js.native
    def create(`type`: VisualizationType, cols: Unit, options: js.Any): IPromise[js.Any] = js.native
    
    /**
      * Gets an existing visualization.
      * @param id - Id for an existing visualization.
      * @return - A promise of a QVisualization.
      */
    def get(id: String): IPromise[js.Any] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.barchart
    - typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.combochart
    - typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.gauge
    - typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.kpi
    - typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.linechart
    - typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.piechart
    - typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.`pivot-table`
    - typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.scatterplot
    - typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.table
    - typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.treemap
    - typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.`extension`
  */
  trait VisualizationType extends StObject
  object VisualizationType {
    
    @scala.inline
    def barchart: typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.barchart = "barchart".asInstanceOf[typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.barchart]
    
    @scala.inline
    def combochart: typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.combochart = "combochart".asInstanceOf[typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.combochart]
    
    @scala.inline
    def `extension`: typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.`extension` = "extension".asInstanceOf[typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.`extension`]
    
    @scala.inline
    def gauge: typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.gauge = "gauge".asInstanceOf[typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.gauge]
    
    @scala.inline
    def kpi: typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.kpi = "kpi".asInstanceOf[typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.kpi]
    
    @scala.inline
    def linechart: typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.linechart = "linechart".asInstanceOf[typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.linechart]
    
    @scala.inline
    def piechart: typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.piechart = "piechart".asInstanceOf[typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.piechart]
    
    @scala.inline
    def `pivot-table`: typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.`pivot-table` = "pivot-table".asInstanceOf[typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.`pivot-table`]
    
    @scala.inline
    def scatterplot: typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.scatterplot = "scatterplot".asInstanceOf[typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.scatterplot]
    
    @scala.inline
    def table: typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.table = "table".asInstanceOf[typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.table]
    
    @scala.inline
    def treemap: typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.treemap = "treemap".asInstanceOf[typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.treemap]
  }
}
