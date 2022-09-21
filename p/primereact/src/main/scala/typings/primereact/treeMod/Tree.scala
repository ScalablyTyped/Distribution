package typings.primereact.treeMod

import typings.react.mod.Component
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("primereact/tree/tree", "Tree")
@js.native
open class Tree protected () extends Component[TreeProps, Any, Any] {
  def this(props: TreeProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TreeProps, context: Any) = this()
  
  def filter[T](value: T): Unit = js.native
  
  def getElement(): HTMLDivElement = js.native
}
