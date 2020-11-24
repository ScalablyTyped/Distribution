package typings.semanticUiReact.gridGridMod

import typings.react.mod.FunctionComponent
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.gridColumnMod.GridColumnProps
import typings.semanticUiReact.gridRowMod.GridRowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridComponent extends FunctionComponent[GridProps] {
  
  var Column: StatelessComponent[GridColumnProps] = js.native
  
  var Row: StatelessComponent[GridRowProps] = js.native
}
