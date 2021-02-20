package typings.qlik.mod

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionContext extends StObject {
  
  @JSName("$element")
  var $element: JQuery[HTMLElement] = js.native
  
  @JSName("$scope")
  var $scope: js.Any = js.native
  
  var _inAnalysisState: Boolean = js.native
  
  var _inEditState: Boolean = js.native
  
  var _interactionState: Double = js.native
  
  var _on: Boolean = js.native
  
  var backendApi: BackendApi = js.native
  
  // TODO: options: ExtensionOptions;
  def paint(
    $element: js.UndefOr[JQuery[HTMLElement]],
    layout: js.UndefOr[Layout],
    qDimensionInfo: js.UndefOr[NxDimensionInfo],
    qMeasureInfo: js.UndefOr[NxDimensionInfo],
    qMatrix: js.UndefOr[js.Array[NxCellRows]],
    dimensions: js.UndefOr[js.Array[NxCell]],
    measures: js.UndefOr[js.Array[NxCell]],
    qSize: js.UndefOr[Size],
    qId: js.UndefOr[String],
    qSelectionInfo: js.UndefOr[Selectionobject]
  ): Unit = js.native
  // TODO: options: ExtensionOptions;
  @JSName("paint")
  var paint_Original: Paint = js.native
  
  def selectValues(dimNo: Double, values: js.Array[Double], toggleMode: Boolean): Unit = js.native
  
  var selectionsEnabled: Boolean = js.native
  
  def toggleLasso(): Unit = js.native
}
