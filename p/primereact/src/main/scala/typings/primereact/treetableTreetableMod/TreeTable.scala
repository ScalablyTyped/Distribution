package typings.primereact.treetableTreetableMod

import typings.react.mod.Component
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("primereact/treetable/treetable", "TreeTable")
@js.native
open class TreeTable protected () extends Component[TreeTableProps, Any, Any] {
  def this(props: TreeTableProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TreeTableProps, context: Any) = this()
  
  def filter[T](value: T, field: String, mode: TreeTableFilterMatchModeType): Unit = js.native
  
  def getElement(): HTMLDivElement = js.native
}
