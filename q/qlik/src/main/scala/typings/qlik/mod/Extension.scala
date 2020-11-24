package typings.qlik.mod

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extension extends js.Object {
  
  var definition: Definition = js.native
  
  var initialProperties: InitialProperties = js.native
  
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
  @JSName("paint")
  var paint_Original: Paint = js.native
  
  var support: js.UndefOr[Support] = js.native
}
