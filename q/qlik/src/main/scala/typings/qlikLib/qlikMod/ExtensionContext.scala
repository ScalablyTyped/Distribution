package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionContext extends js.Object {
  @JSName("$element")
  var $element: jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  @JSName("$scope")
  var $scope: js.Any = js.native
  var _inAnalysisState: scala.Boolean = js.native
  var _inEditState: scala.Boolean = js.native
  var _interactionState: scala.Double = js.native
  var _on: scala.Boolean = js.native
  var backendApi: BackendApi = js.native
  // TODO: options: ExtensionOptions;
  @JSName("paint")
  var paint_Original: Paint = js.native
  var selectionsEnabled: scala.Boolean = js.native
  // TODO: options: ExtensionOptions;
  def paint(
    `this`: ExtensionContext,
    $element: js.UndefOr[jqueryLib.JQuery[stdLib.HTMLElement]],
    layout: js.UndefOr[Layout],
    qDimensionInfo: js.UndefOr[NxDimensionInfo],
    qMeasureInfo: js.UndefOr[NxDimensionInfo],
    qMatrix: js.UndefOr[js.Array[NxCellRows]],
    dimensions: js.UndefOr[js.Array[NxCell]],
    measures: js.UndefOr[js.Array[NxCell]],
    qSize: js.UndefOr[Size],
    qId: js.UndefOr[java.lang.String],
    qSelectionInfo: js.UndefOr[Selectionobject]
  ): scala.Unit = js.native
  def selectValues(dimNo: scala.Double, values: js.Array[scala.Double], toggleMode: scala.Boolean): scala.Unit = js.native
  def toggleLasso(): scala.Unit = js.native
}

