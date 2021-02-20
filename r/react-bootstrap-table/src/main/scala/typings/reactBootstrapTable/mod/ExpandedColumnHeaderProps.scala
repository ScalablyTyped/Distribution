package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandedColumnHeaderProps extends StObject {
  
  var anyExpand: Boolean = js.native
}
object ExpandedColumnHeaderProps {
  
  @scala.inline
  def apply(anyExpand: Boolean): ExpandedColumnHeaderProps = {
    val __obj = js.Dynamic.literal(anyExpand = anyExpand.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandedColumnHeaderProps]
  }
  
  @scala.inline
  implicit class ExpandedColumnHeaderPropsMutableBuilder[Self <: ExpandedColumnHeaderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnyExpand(value: Boolean): Self = StObject.set(x, "anyExpand", value.asInstanceOf[js.Any])
  }
}
