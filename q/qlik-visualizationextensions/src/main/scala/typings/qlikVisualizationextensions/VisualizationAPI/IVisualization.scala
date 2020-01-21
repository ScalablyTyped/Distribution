package typings.qlikVisualizationextensions.VisualizationAPI

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

