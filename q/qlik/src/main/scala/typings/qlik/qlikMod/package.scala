package typings.qlik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qlikMod {
  import typings.jquery.JQuery
  import typings.std.HTMLElement

  type CustomPropertyOptions = js.Array[CustomPropertyOption] | js.Function0[js.Array[CustomPropertyOption]]
  type Global = js.Any
  type NxCellRows = js.Array[NxCell]
  type NxMeasureInfo = ColumnInfo
  type Paint = js.ThisFunction10[
    /* this */ ExtensionContext, 
    /* $element */ js.UndefOr[JQuery[HTMLElement]], 
    /* layout */ js.UndefOr[Layout], 
    /* qDimensionInfo */ js.UndefOr[NxDimensionInfo], 
    /* qMeasureInfo */ js.UndefOr[NxDimensionInfo], 
    /* qMatrix */ js.UndefOr[js.Array[NxCellRows]], 
    /* dimensions */ js.UndefOr[js.Array[NxCell]], 
    /* measures */ js.UndefOr[js.Array[NxCell]], 
    /* qSize */ js.UndefOr[Size], 
    /* qId */ js.UndefOr[String], 
    /* qSelectionInfo */ js.UndefOr[Selectionobject], 
    Unit
  ]
  type ShowFunction = js.Function3[
    /* layout */ Layout, 
    /* cls */ js.Any, 
    /* obj */ js.Any, 
    Boolean | (js.Function1[/* measure */ NxMeasure, Boolean])
  ]
  type SupportFunction = js.Function1[/* layout */ Layout, Boolean]
  type SupportItem = Boolean | SupportFunction
  type VisualizationOptions = VisualizationCommon
}
