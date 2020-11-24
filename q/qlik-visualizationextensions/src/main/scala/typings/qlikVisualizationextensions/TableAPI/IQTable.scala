package typings.qlikVisualizationextensions.TableAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQTable extends js.Object {
  
  /**
    * Total number of columns for the qHyperCube.
    */
  var colCount: Double = js.native
  
  /**
    * Exports data of the underlying hypercube in OOXML or CSV format.
    * @param [options] - Optional. Properties:
    * Name | Type | Description
    * format | String | Data format. Can be one of:
    *       # OOXML: open XML, default
    *       # CSV_C: comma separated CSV
    *       # CSV_T: tab separated CSV
    * filename | String | Name of the exported file after download from browser.
    *                     This parameter is optional and only used in desktop.
    * state | String | Can be:
    *       # A: all values
    *       # P: possible values (default)
    * download | Boolean | Automatically start download of file (with window.open).
    * @param [callback] - Optional. Callback function returning the link to the exported file.
    */
  def exportData(): Unit = js.native
  def exportData(options: js.UndefOr[scala.Nothing], callback: js.Any): Unit = js.native
  def exportData(options: js.Any): Unit = js.native
  def exportData(options: js.Any, callback: js.Any): Unit = js.native
  
  /**
    * Gets the column number for a given field name.
    * @param fld - Field name.
    * @return - Column number, starting with zero. Undefined if no column with that name exists.
    */
  def getColByName(fld: String): Double = js.native
  
  /**
    * Gets more data for your qHyperCube.
    */
  def getMoreData(): js.Any = js.native
  
  /**
    * Header information.
    */
  var headers: js.Array[IQHeader] = js.native
  
  /**
    * Total number of rows for the qHyperCube, including rows not fetched from the server.
    */
  var rowCount: Double = js.native
  
  /**
    * Data rows.
    */
  var rows: js.Array[IQRow] = js.native
  
  /**
    * Total information for measures.
    */
  var totals: js.Array[IQMeasureCell] = js.native
}
