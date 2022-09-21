package typings.qlik.mod

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionContext extends StObject {
  
  @JSName("$element")
  var $element: JQuery[HTMLElement]
  
  @JSName("$scope")
  var $scope: Any
  
  var _inAnalysisState: Boolean
  
  var _inEditState: Boolean
  
  var _interactionState: Double
  
  var _on: Boolean
  
  var backendApi: BackendApi
  
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
  ): Unit
  // TODO: options: ExtensionOptions;
  @JSName("paint")
  var paint_Original: Paint
  
  def selectValues(dimNo: Double, values: js.Array[Double], toggleMode: Boolean): Unit
  
  var selectionsEnabled: Boolean
  
  def toggleLasso(): Unit
}
object ExtensionContext {
  
  inline def apply(
    $element: JQuery[HTMLElement],
    $scope: Any,
    _inAnalysisState: Boolean,
    _inEditState: Boolean,
    _interactionState: Double,
    _on: Boolean,
    backendApi: BackendApi,
    paint: Paint,
    selectValues: (Double, js.Array[Double], Boolean) => Unit,
    selectionsEnabled: Boolean,
    toggleLasso: () => Unit
  ): ExtensionContext = {
    val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $scope = $scope.asInstanceOf[js.Any], _inAnalysisState = _inAnalysisState.asInstanceOf[js.Any], _inEditState = _inEditState.asInstanceOf[js.Any], _interactionState = _interactionState.asInstanceOf[js.Any], _on = _on.asInstanceOf[js.Any], backendApi = backendApi.asInstanceOf[js.Any], paint = paint.asInstanceOf[js.Any], selectValues = js.Any.fromFunction3(selectValues), selectionsEnabled = selectionsEnabled.asInstanceOf[js.Any], toggleLasso = js.Any.fromFunction0(toggleLasso))
    __obj.asInstanceOf[ExtensionContext]
  }
  
  extension [Self <: ExtensionContext](x: Self) {
    
    inline def set$element(value: JQuery[HTMLElement]): Self = StObject.set(x, "$element", value.asInstanceOf[js.Any])
    
    inline def set$scope(value: Any): Self = StObject.set(x, "$scope", value.asInstanceOf[js.Any])
    
    inline def setBackendApi(value: BackendApi): Self = StObject.set(x, "backendApi", value.asInstanceOf[js.Any])
    
    inline def setPaint(value: Paint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setSelectValues(value: (Double, js.Array[Double], Boolean) => Unit): Self = StObject.set(x, "selectValues", js.Any.fromFunction3(value))
    
    inline def setSelectionsEnabled(value: Boolean): Self = StObject.set(x, "selectionsEnabled", value.asInstanceOf[js.Any])
    
    inline def setToggleLasso(value: () => Unit): Self = StObject.set(x, "toggleLasso", js.Any.fromFunction0(value))
    
    inline def set_inAnalysisState(value: Boolean): Self = StObject.set(x, "_inAnalysisState", value.asInstanceOf[js.Any])
    
    inline def set_inEditState(value: Boolean): Self = StObject.set(x, "_inEditState", value.asInstanceOf[js.Any])
    
    inline def set_interactionState(value: Double): Self = StObject.set(x, "_interactionState", value.asInstanceOf[js.Any])
    
    inline def set_on(value: Boolean): Self = StObject.set(x, "_on", value.asInstanceOf[js.Any])
  }
}
