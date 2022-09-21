package typings.qlikVisualizationextensions.BackendAPI

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBackend extends StObject {
  
  /**
    * Aborts the result of a search in a list object. Clears the existing search and returns the
    * object to the state it was in prior to the search started.
    */
  def abortSearch(): Unit = js.native
  
  /**
    * Accepts the result of a search in a list object and the search result is selected in the field.
    * @param toggleMode - If true, toggle state for selected values
    */
  def acceptSearch(toggleMode: Boolean): Unit = js.native
  
  /**
    * Updates the properties for this object.
    * @param qPatches - Array of patches. Each path contains:
    *        #qOp: Add/Remove/Replace
    *        #qPath: Path to property
    *        #qValue: The new value in string format. Strings need to be surrounded by \".
    * @param qSoftPatch - Set to True if properties should be soft, that is not persisted.
    * @return - A promise of a Qlik engine reply.
    */
  def applyPatches(qPatches: js.Array[Any], qSoftPatch: Boolean): IPromise[Any] = js.native
  
  /**
    * Clears unconfirmed selections for this object.
    */
  def clearSelections(): Unit = js.native
  
  /**
    * Clears all soft patches that has previously been applied for this object using the
    * applyPatches method.
    * @return - A promise of a Qlik engine reply.
    */
  def clearSoftPatches(): IPromise[Any] = js.native
  
  /**
    * Collapse the left dimensions of a pivot table. Only works for hypercubes with
    * qMode = P which are not always fully expanded.
    * @param qRow - Row index.
    * @param qCol - Column index.
    * @param [qAll] - Optional. If set to true, qRow and qCol are ignored and all cells are collapsed.
    * @return - A promise of a Qlik engine reply.
    */
  def collapseLeft(qRow: Double, qCol: Double): IPromise[Any] = js.native
  def collapseLeft(qRow: Double, qCol: Double, qAll: Boolean): IPromise[Any] = js.native
  
  /**
    * Collapse the top dimensions of a pivot table. Only works for hypercubes with
    * qMode = P which are not always fully expanded.
    * @param qRow - Row index.
    * @param qCol - Column index.
    * @param [qAll] - Optional. If set to true, qRow and qCol are ignored and all cells are collapsed.
    * @return - A promise of a Qlik engine reply.
    */
  def collapseTop(qRow: Double, qCol: Double): IPromise[Any] = js.native
  def collapseTop(qRow: Double, qCol: Double, qAll: Boolean): IPromise[Any] = js.native
  
  /**
    * Loops through data rows for this object. Only rows that are available client side will be used.
    * @param callback - Function to call for each row.
    * Parameters are row number and row data as an array of NxCell objects.
    * The loop is terminated if the function returns false.
    * @return - An array of NxCell.
    */
  def eachDataRow(callback: Any): js.Array[INxCell] = js.native
  
  /**
    * Expands the left dimensions of a pivot table. Only works for hypercubes with
    * qMode = P which are not always fully expanded.
    * @param qRow - Row index.
    * @param qCol - Column index.
    * @param [qAll] - Optional. If set to true, qRow and qCol are ignored and all cells are collapsed.
    * @return - A promise of a Qlik engine reply.
    */
  def expandLeft(qRow: Double, qCol: Double): IPromise[Any] = js.native
  def expandLeft(qRow: Double, qCol: Double, qAll: Boolean): IPromise[Any] = js.native
  
  /**
    * Expands the top dimensions of a pivot table. Only works for hypercubes with
    * qMode = P which are not always fully expanded.
    * @param qRow - Row index.
    * @param qCol - Column index.
    * @param [qAll] - Optional. If set to true, qRow and qCol are ignored and all cells are collapsed.
    * @return - A promise of a Qlik engine reply.
    */
  def expandTop(qRow: Double, qCol: Double): IPromise[Any] = js.native
  def expandTop(qRow: Double, qCol: Double, qAll: Boolean): IPromise[Any] = js.native
  
  /**
    * Geta data from Qlik engine for this object.
    * @param qPages - An array of NxPage objects.
    * @return - A promise of qDataPages.
    */
  def getData(qPages: js.Array[INxPage]): IPromise[Any] = js.native
  
  /**
    * Gets a data row for this object.
    * @param rownum - The row number.
    * @return - A row of NxCell or null if the row is not available client side
    *                    and need to be fetched with getData method.
    */
  def getDataRow(rownum: Double): INxCell = js.native
  
  /**
    * Gets qDimensionInfo for this object.
    * @return - An array of qDimensionInfo objects.
    */
  def getDimensionInfos(): js.Array[INxDimensionInfo] = js.native
  
  /**
    * Gets qMeasureInfo for this object.
    * @return - An array of qMeasureInfo objects.
    */
  def getMeasureInfos(): INxMeasureInfo = js.native
  
  /**
    * Gets pivot data from the Qlik engine for this object. Only works for hypercubes with qMode = P.
    * @param qPages - An array of request page objects.
    * @return - A promise of pivot data pages.
    */
  def getPivotData(qPages: js.Array[INxPage]): IPromise[js.Array[INxPage]] = js.native
  
  /**
    * Get properties for this object.
    * @return - A promise of object properties.
    */
  def getProperties(): IPromise[Any] = js.native
  
  /**
    * Get reduced data from the Qlik engine for this object. This method is intended for preserving the
    * shape of the data, not for viewing the actual data points.
    * @param qPages - An array of request page objects.
    * @param qZoomFactor - Zoom factor.
    * If set to -1, the Qlik engine decides of the zoom factor.
    * If qReductionMode is D1 or S, the zoom factor is 2n.
    * If the zoom factor is 5, the data are reduced by a factor 32.
    * If qReductionMode is C, the zoom factor defines the number of centroids.
    * @param qReductionMode - Reduction mode.Can be:
    *        # N for no data reduction.
    *        # D1 to reduce a bar chart or line chart.
    *          The profile of the chart is reduced whatever the number of dimensions in the chart.
    *        # S to reduce the resolution of a scatter plot.
    *        # C to reduce the data of a scatter plot chart.
    *        # ST to reduce the data of a stacked pivot table.
    * @return - A promise of reduced data pages.
    */
  def getReducedData(qPages: js.Array[INxPage], qZoomFactor: Double, qReductionMode: String): IPromise[Any] = js.native
  
  /**
    * Get total number of data rows for this object.
    * @return - A number.
    */
  def getRowCount(): Double = js.native
  
  /**
    * Get stacked data from the Qlik engine for this object. Only works for hypercubes with qMode = S.
    * @param qPages - An array of request page objects.
    * @param qMaxNbrCells - Maximum number of cells at outer level.
    * @return - A promise of stack data pages.
    */
  def getStackedData(qPages: js.Array[INxPage], qMaxNbrCells: Double): IPromise[Any] = js.native
  
  /**
    * Find out if there are unconfirmed selections for this object.
    * @return - True if there are unconfirmed selections.
    */
  def hasSelections(): Boolean = js.native
  
  /**
    * Save this object.
    * @return - A promise. In case of success, it returns "undefined". In case of failure it returns the error.
    */
  def save(): IPromise[Any] = js.native
  
  /**
    * Search for a term in a list object. Results in an updated layout, containing only matching records.
    * @param term - Term to search for.
    */
  def search(term: String): Unit = js.native
  
  /**
    * Select values in this object using ranges.
    * @param qRanges - Array of ranges to select.
    * @param qOrMode - If true only one of the measures needs to be in range.
    */
  def selectRange(qRanges: js.Array[IRange], qOrMode: Boolean): Unit = js.native
  
  /**
    * Select values in this object with a Qlik engine call which triggers a repaint of the object.
    * @param qDimNo - Dimension number. 0 = first dimension.
    * @param qValues - Array of values (qElemNumber in the matrix from the Qlik engine) to select or deselect.
    * @param qToggleMode - If true, values in the field are selected in addition to any previously selected items.
    * If false, values in the field are selected while previously selected items are deselected.
    */
  def selectValues(qDimNo: Double, qValues: js.Array[Any], qToggleMode: Boolean): Unit = js.native
  
  /**
    * Set properties for this object.
    * @param props - The properties to set.
    * @return - A promise of a Qlik engine reply.
    */
  def setProperties(props: Any): IPromise[Any] = js.native
}
