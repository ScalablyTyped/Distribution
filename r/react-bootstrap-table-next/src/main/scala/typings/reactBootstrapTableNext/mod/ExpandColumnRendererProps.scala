package typings.reactBootstrapTableNext.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandColumnRendererProps extends StObject {
  
  var expandable: Boolean = js.native
  
  var expanded: Boolean = js.native
  
  var rowKey: String = js.native
}
object ExpandColumnRendererProps {
  
  @scala.inline
  def apply(expandable: Boolean, expanded: Boolean, rowKey: String): ExpandColumnRendererProps = {
    val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandColumnRendererProps]
  }
  
  @scala.inline
  implicit class ExpandColumnRendererPropsMutableBuilder[Self <: ExpandColumnRendererProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowKey(value: String): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
  }
}
