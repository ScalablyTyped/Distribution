package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendApi extends StObject {
  
  def abortSearch(): Unit = js.native
  
  def acceptSearch(toggleMode: Boolean): Unit = js.native
  
  def applyPatches(qPatches: js.Array[Patch], qSoftPatch: Boolean): js.Promise[_] = js.native
  
  def clearSelections(): Unit = js.native
  
  def clearSoftPatches(): js.Promise[_] = js.native
  
  def collapseLeft(qRow: Double, qCol: Double): js.Promise[_] = js.native
  def collapseLeft(qRow: Double, qCol: Double, qAll: Boolean): js.Promise[_] = js.native
  
  def collapseTop(qRow: Double, qCol: Double): js.Promise[_] = js.native
  def collapseTop(qRow: Double, qCol: Double, qAll: Boolean): js.Promise[_] = js.native
  
  def eachDataRow(callback: js.Function2[/* i */ Double, /* d */ NxCellRows, Boolean | Unit]): NxCellRows = js.native
  
  def expandLeft(qRow: Double, qCol: Double): js.Promise[_] = js.native
  def expandLeft(qRow: Double, qCol: Double, qAll: Boolean): js.Promise[_] = js.native
  
  def expandTop(qRow: Double, qCol: Double): js.Promise[_] = js.native
  def expandTop(qRow: Double, qCol: Double, qAll: Boolean): js.Promise[_] = js.native
  
  def getData(qPages: js.Array[NxPage]): js.Promise[js.Array[NxDataPage]] = js.native
  
  def getDataRow(rownum: Double): NxCellRows | Null = js.native
  
  def getDimensionInfos(): js.Array[NxDimensionInfo] = js.native
  
  def getMeasureInfos(): js.Array[NxMeasureInfo] = js.native
  
  def getPivotData(qPages: js.Array[NxPage]): js.Promise[NxPivotPage] = js.native
  
  // TODO: getProperties(): Promise<Properties>;
  // TODO: getReducedData(qPages: NxPage[], qZoomFactor: number, qReductionMode: 'N' | 'D1' | 'S' | 'C' | 'ST'): Promise<ReducedDataPage>;
  def getRowCount(): Double = js.native
  
  def getStackeddata(qPages: js.Array[NxPage], qMaxNbrCells: Double): js.Promise[NxStackPage] = js.native
  
  def hasSelections(): Boolean = js.native
  
  def save(): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  
  def search(term: String): Unit = js.native
  
  def selectProperties(props: js.Object): js.Promise[_] = js.native
  
  // TODO: selectRange(qRanges: Ranges, qOrMode: boolean): void;
  def selectValues(qDimNo: Double, qValues: js.Array[Double], qToggleMode: Boolean): Unit = js.native
}
