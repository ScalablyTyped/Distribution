package typings
package qlikDashVisualizationextensionsLib.BackendAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackend extends js.Object {
  /**
           * Aborts the result of a search in a list object. Clears the existing search and returns the
           * object to the state it was in prior to the search started.
           */
  def abortSearch(): scala.Unit = js.native
  /**
           * Accepts the result of a search in a list object and the search result is selected in the field.
           * @param toggleMode - If true, toggle state for selected values
           */
  def acceptSearch(toggleMode: scala.Boolean): scala.Unit = js.native
  /**
           * Updates the properties for this object.
           * @param qPatches - Array of patches. Each path contains:
           *        #qOp: Add/Remove/Replace
           *        #qPath: Path to property
           *        #qValue: The new value in string format. Strings need to be surrounded by \".
           * @param qSoftPatch - Set to True if properties should be soft, that is not persisted.
           * @return - A promise of a Qlik engine reply.
           */
  def applyPatches(qPatches: js.Array[_], qSoftPatch: scala.Boolean): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Clears unconfirmed selections for this object.
           */
  def clearSelections(): scala.Unit = js.native
  /**
           * Clears all soft patches that has previously been applied for this object using the
           * applyPatches method.
           * @return - A promise of a Qlik engine reply.
           */
  def clearSoftPatches(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Collapse the left dimensions of a pivot table. Only works for hypercubes with
           * qMode = P which are not always fully expanded.
           * @param qRow - Row index.
           * @param qCol - Column index.
           * @param [qAll] - Optional. If set to true, qRow and qCol are ignored and all cells are collapsed.
           * @return - A promise of a Qlik engine reply.
           */
  def collapseLeft(qRow: scala.Double, qCol: scala.Double): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Collapse the left dimensions of a pivot table. Only works for hypercubes with
           * qMode = P which are not always fully expanded.
           * @param qRow - Row index.
           * @param qCol - Column index.
           * @param [qAll] - Optional. If set to true, qRow and qCol are ignored and all cells are collapsed.
           * @return - A promise of a Qlik engine reply.
           */
  def collapseLeft(qRow: scala.Double, qCol: scala.Double, qAll: scala.Boolean): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Collapse the top dimensions of a pivot table. Only works for hypercubes with
           * qMode = P which are not always fully expanded.
           * @param qRow - Row index.
           * @param qCol - Column index.
           * @param [qAll] - Optional. If set to true, qRow and qCol are ignored and all cells are collapsed.
           * @return - A promise of a Qlik engine reply.
           */
  def collapseTop(qRow: scala.Double, qCol: scala.Double): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Collapse the top dimensions of a pivot table. Only works for hypercubes with
           * qMode = P which are not always fully expanded.
           * @param qRow - Row index.
           * @param qCol - Column index.
           * @param [qAll] - Optional. If set to true, qRow and qCol are ignored and all cells are collapsed.
           * @return - A promise of a Qlik engine reply.
           */
  def collapseTop(qRow: scala.Double, qCol: scala.Double, qAll: scala.Boolean): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Loops through data rows for this object. Only rows that are available client side will be used.
           * @param callback - Function to call for each row.
           * Parameters are row number and row data as an array of NxCell objects.
           * The loop is terminated if the function returns false.
           * @return - An array of NxCell.
           */
  def eachDataRow(callback: js.Any): js.Array[INxCell] = js.native
  /**
           * Expands the left dimensions of a pivot table. Only works for hypercubes with
           * qMode = P which are not always fully expanded.
           * @param qRow - Row index.
           * @param qCol - Column index.
           * @param [qAll] - Optional. If set to true, qRow and qCol are ignored and all cells are collapsed.
           * @return - A promise of a Qlik engine reply.
           */
  def expandLeft(qRow: scala.Double, qCol: scala.Double): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Expands the left dimensions of a pivot table. Only works for hypercubes with
           * qMode = P which are not always fully expanded.
           * @param qRow - Row index.
           * @param qCol - Column index.
           * @param [qAll] - Optional. If set to true, qRow and qCol are ignored and all cells are collapsed.
           * @return - A promise of a Qlik engine reply.
           */
  def expandLeft(qRow: scala.Double, qCol: scala.Double, qAll: scala.Boolean): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Expands the top dimensions of a pivot table. Only works for hypercubes with
           * qMode = P which are not always fully expanded.
           * @param qRow - Row index.
           * @param qCol - Column index.
           * @param [qAll] - Optional. If set to true, qRow and qCol are ignored and all cells are collapsed.
           * @return - A promise of a Qlik engine reply.
           */
  def expandTop(qRow: scala.Double, qCol: scala.Double): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Expands the top dimensions of a pivot table. Only works for hypercubes with
           * qMode = P which are not always fully expanded.
           * @param qRow - Row index.
           * @param qCol - Column index.
           * @param [qAll] - Optional. If set to true, qRow and qCol are ignored and all cells are collapsed.
           * @return - A promise of a Qlik engine reply.
           */
  def expandTop(qRow: scala.Double, qCol: scala.Double, qAll: scala.Boolean): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Geta data from Qlik engine for this object.
           * @param qPages - An array of NxPage objects.
           * @return - A promise of qDataPages.
           */
  def getData(qPages: js.Array[INxPage]): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Gets a data row for this object.
           * @param rownum - The row number.
           * @return - A row of NxCell or null if the row is not available client side
           *                    and need to be fetched with getData method.
           */
  def getDataRow(rownum: scala.Double): INxCell = js.native
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
  def getPivotData(qPages: js.Array[INxPage]): angularLib.angularMod.angularNs.IPromise[js.Array[INxPage]] = js.native
  /**
           * Get properties for this object.
           * @return - A promise of object properties.
           */
  def getProperties(): angularLib.angularMod.angularNs.IPromise[_] = js.native
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
  def getReducedData(qPages: js.Array[INxPage], qZoomFactor: scala.Double, qReductionMode: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Get total number of data rows for this object.
           * @return - A number.
           */
  def getRowCount(): scala.Double = js.native
  /**
           * Get stacked data from the Qlik engine for this object. Only works for hypercubes with qMode = S.
           * @param qPages - An array of request page objects.
           * @param qMaxNbrCells - Maximum number of cells at outer level.
           * @return - A promise of stack data pages.
           */
  def getStackedData(qPages: js.Array[INxPage], qMaxNbrCells: scala.Double): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Find out if there are unconfirmed selections for this object.
           * @return - True if there are unconfirmed selections.
           */
  def hasSelections(): scala.Boolean = js.native
  /**
           * Save this object.
           * @return - A promise. In case of success, it returns "undefined". In case of failure it returns the error.
           */
  def save(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Search for a term in a list object. Results in an updated layout, containing only matching records.
           * @param term - Term to search for.
           */
  def search(term: java.lang.String): scala.Unit = js.native
  /**
           * Select values in this object using ranges.
           * @param qRanges - Array of ranges to select.
           * @param qOrMode - If true only one of the measures needs to be in range.
           */
  def selectRange(qRanges: js.Array[IRange], qOrMode: scala.Boolean): scala.Unit = js.native
  /**
           * Select values in this object with a Qlik engine call which triggers a repaint of the object.
           * @param qDimNo - Dimension number. 0 = first dimension.
           * @param qValues - Array of values (qElemNumber in the matrix from the Qlik engine) to select or deselect.
           * @param qToggleMode - If true, values in the field are selected in addition to any previously selected items.
           * If false, values in the field are selected while previously selected items are deselected.
           */
  def selectValues(qDimNo: scala.Double, qValues: js.Array[_], qToggleMode: scala.Boolean): scala.Unit = js.native
  /**
           * Set properties for this object.
           * @param props - The properties to set.
           * @return - A promise of a Qlik engine reply.
           */
  def setProperties(props: js.Any): angularLib.angularMod.angularNs.IPromise[_] = js.native
}

