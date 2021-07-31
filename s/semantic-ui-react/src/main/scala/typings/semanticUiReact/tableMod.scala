package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.semanticUiReact.tableTableMod.TableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table", JSImport.Default)
  @js.native
  val default: TableComponent = js.native
  
  type _To = TableComponent
  
  /* This means you don't have to write `default`, but can instead just say `tableMod.foo` */
  override def _to: TableComponent = default
}
