package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandColumnComponentProps extends StObject {
  
  /**
    * True if the current row is able to be expanded.
    */
  var isExpandableRow: Boolean = js.native
  
  /**
    * True if the current row is currently expanded.
    */
  var isExpanded: Boolean = js.native
}
object ExpandColumnComponentProps {
  
  @scala.inline
  def apply(isExpandableRow: Boolean, isExpanded: Boolean): ExpandColumnComponentProps = {
    val __obj = js.Dynamic.literal(isExpandableRow = isExpandableRow.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandColumnComponentProps]
  }
  
  @scala.inline
  implicit class ExpandColumnComponentPropsMutableBuilder[Self <: ExpandColumnComponentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsExpandableRow(value: Boolean): Self = StObject.set(x, "isExpandableRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
  }
}
