package typings.qlik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomPropertyOptions = js.Array[typings.qlik.mod.CustomPropertyOption] | js.Function0[js.Array[typings.qlik.mod.CustomPropertyOption]]
  type Global = js.Any
  type NxCellRows = js.Array[typings.qlik.mod.NxCell]
  type NxMeasureInfo = typings.qlik.mod.ColumnInfo
  type Paint = js.ThisFunction10[
    /* this */ typings.qlik.mod.ExtensionContext, 
    /* $element */ js.UndefOr[typings.jquery.JQuery[typings.std.HTMLElement]], 
    /* layout */ js.UndefOr[typings.qlik.mod.Layout], 
    /* qDimensionInfo */ js.UndefOr[typings.qlik.mod.NxDimensionInfo], 
    /* qMeasureInfo */ js.UndefOr[typings.qlik.mod.NxDimensionInfo], 
    /* qMatrix */ js.UndefOr[js.Array[typings.qlik.mod.NxCellRows]], 
    /* dimensions */ js.UndefOr[js.Array[typings.qlik.mod.NxCell]], 
    /* measures */ js.UndefOr[js.Array[typings.qlik.mod.NxCell]], 
    /* qSize */ js.UndefOr[typings.qlik.mod.Size], 
    /* qId */ js.UndefOr[java.lang.String], 
    /* qSelectionInfo */ js.UndefOr[typings.qlik.mod.Selectionobject], 
    scala.Unit
  ]
  type ShowFunction = js.Function3[
    /* layout */ typings.qlik.mod.Layout, 
    /* cls */ js.Any, 
    /* obj */ js.Any, 
    scala.Boolean | (js.Function1[/* measure */ typings.qlik.mod.NxMeasure, scala.Boolean])
  ]
  type SupportFunction = js.Function1[/* layout */ typings.qlik.mod.Layout, scala.Boolean]
  type SupportItem = scala.Boolean | typings.qlik.mod.SupportFunction
  type VisualizationOptions = typings.qlik.mod.VisualizationCommon
}
