package typings
package qlikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qlikMod {
  type CustomPropertyOptions = js.Array[CustomPropertyOption] | js.Function0[js.Array[CustomPropertyOption]]
  type Global = js.Any
  type NxCellRows = js.Array[NxCell]
  type NxMeasureInfo = ColumnInfo
  type Paint = js.ThisFunction10[
    /* this */ ExtensionContext, 
    /* $element */ js.UndefOr[jqueryLib.JQuery[stdLib.HTMLElement]], 
    /* layout */ js.UndefOr[Layout], 
    /* qDimensionInfo */ js.UndefOr[NxDimensionInfo], 
    /* qMeasureInfo */ js.UndefOr[NxDimensionInfo], 
    /* qMatrix */ js.UndefOr[js.Array[NxCellRows]], 
    /* dimensions */ js.UndefOr[js.Array[NxCell]], 
    /* measures */ js.UndefOr[js.Array[NxCell]], 
    /* qSize */ js.UndefOr[Size], 
    /* qId */ js.UndefOr[java.lang.String], 
    /* qSelectionInfo */ js.UndefOr[Selectionobject], 
    scala.Unit
  ]
  type ShowFunction = js.Function3[
    /* layout */ Layout, 
    /* cls */ js.Any, 
    /* obj */ js.Any, 
    scala.Boolean | (js.Function1[/* measure */ NxMeasure, scala.Boolean])
  ]
  type SupportFunction = js.Function1[/* layout */ Layout, scala.Boolean]
  type SupportItem = scala.Boolean | SupportFunction
  type VisualizationOptions = VisualizationCommon
}
