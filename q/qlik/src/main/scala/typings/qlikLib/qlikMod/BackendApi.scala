package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendApi extends js.Object {
  def abortSearch(): scala.Unit = js.native
  def acceptSearch(toggleMode: scala.Boolean): scala.Unit = js.native
  def applyPatches(qPatches: js.Array[Patch], qSoftPatch: scala.Boolean): stdLib.Promise[_] = js.native
  def clearSelections(): scala.Unit = js.native
  def clearSoftPatches(): stdLib.Promise[_] = js.native
  def collapseLeft(qRow: scala.Double, qCol: scala.Double): stdLib.Promise[_] = js.native
  def collapseLeft(qRow: scala.Double, qCol: scala.Double, qAll: scala.Boolean): stdLib.Promise[_] = js.native
  def collapseTop(qRow: scala.Double, qCol: scala.Double): stdLib.Promise[_] = js.native
  def collapseTop(qRow: scala.Double, qCol: scala.Double, qAll: scala.Boolean): stdLib.Promise[_] = js.native
  def eachDataRow(callback: js.Function2[/* i */ scala.Double, /* d */ NxCellRows, scala.Boolean | scala.Unit]): NxCellRows = js.native
  def expandLeft(qRow: scala.Double, qCol: scala.Double): stdLib.Promise[_] = js.native
  def expandLeft(qRow: scala.Double, qCol: scala.Double, qAll: scala.Boolean): stdLib.Promise[_] = js.native
  def expandTop(qRow: scala.Double, qCol: scala.Double): stdLib.Promise[_] = js.native
  def expandTop(qRow: scala.Double, qCol: scala.Double, qAll: scala.Boolean): stdLib.Promise[_] = js.native
  def getData(qPages: js.Array[NxPage]): stdLib.Promise[js.Array[NxDataPage]] = js.native
  def getDataRow(rownum: scala.Double): NxCellRows | scala.Null = js.native
  def getDimensionInfos(): js.Array[NxDimensionInfo] = js.native
  def getMeasureInfos(): js.Array[NxMeasureInfo] = js.native
  def getPivotData(qPages: js.Array[NxPage]): stdLib.Promise[NxPivotPage] = js.native
  // TODO: getProperties(): Promise<Properties>;
  // TODO: getReducedData(qPages: NxPage[], qZoomFactor: number, qReductionMode: 'N' | 'D1' | 'S' | 'C' | 'ST'): Promise<ReducedDataPage>;
  def getRowCount(): scala.Double = js.native
  def getStackeddata(qPages: js.Array[NxPage], qMaxNbrCells: scala.Double): stdLib.Promise[NxStackPage] = js.native
  def hasSelections(): scala.Boolean = js.native
  def save(): stdLib.Promise[js.UndefOr[scala.Nothing]] = js.native
  def search(term: java.lang.String): scala.Unit = js.native
  def selectProperties(props: js.Object): stdLib.Promise[_] = js.native
  // TODO: selectRange(qRanges: Ranges, qOrMode: boolean): void;
  def selectValues(qDimNo: scala.Double, qValues: js.Array[scala.Double], qToggleMode: scala.Boolean): scala.Unit = js.native
}

