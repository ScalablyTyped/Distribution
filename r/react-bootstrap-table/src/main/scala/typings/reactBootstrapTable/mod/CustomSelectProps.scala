package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomSelectProps extends StObject {
  
  /**
    * True if the current row being drawn is selected.
    */
  var checked: Boolean = js.native
  
  /**
    * True if the current row being drawn is not permitted to be selected.
    */
  var disabled: Boolean = js.native
  
  /**
    * The indeterminate flag is used to indicate that there are some rows selected, but it is neither all rows nor
    * no rows. As far as the select all checkbox is concerned, it is neither true nor false.
    */
  var indeterminate: Boolean = js.native
  
  /**
    * Callback that should be used when someone selects the current row.
    *   `event`: the current event target
    *   `rowIndex`: the index of the current row being toggled.
    */
  def onChange(event: js.Any, rowIndex: String): Unit = js.native
  def onChange(event: js.Any, rowIndex: Double): Unit = js.native
  
  /**
    * Index for the row currently being rendered.
    * If the rowIndex is 'Header', it means this rendering is for header selection column.
    */
  var rowIndex: Double | String = js.native
  
  /**
    * What type of selection should be used? Values are 'radio' (single) or 'checkbox' (multiple).
    */
  var `type`: SelectRowMode = js.native
}
