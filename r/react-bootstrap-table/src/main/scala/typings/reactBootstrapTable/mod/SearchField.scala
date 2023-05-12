package typings.reactBootstrapTable.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-bootstrap-table", "SearchField")
@js.native
open class SearchField protected ()
  extends Component[SearchFieldProps, js.Object, Any]
     with SearchFieldInterface {
  def this(props: SearchFieldProps) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: SearchFieldProps, context: Any) = this()
  
  /**
    * getValue should return the current search text.
    */
  /* CompleteClass */
  override def getValue(): String = js.native
  
  /**
    * setValue should update the current search text to the given value.
    */
  /* CompleteClass */
  override def setValue(search: String): Unit = js.native
}
