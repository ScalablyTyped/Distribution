package typings.reactBootstrapTable.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-bootstrap-table", "SearchField")
@js.native
class SearchField ()
  extends Component[SearchFieldProps, js.Object, js.Any]
     with SearchFieldInterface {
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

