package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandedColumnHeaderProps extends StObject {
  
  var anyExpand: Boolean
}
object ExpandedColumnHeaderProps {
  
  inline def apply(anyExpand: Boolean): ExpandedColumnHeaderProps = {
    val __obj = js.Dynamic.literal(anyExpand = anyExpand.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandedColumnHeaderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpandedColumnHeaderProps] (val x: Self) extends AnyVal {
    
    inline def setAnyExpand(value: Boolean): Self = StObject.set(x, "anyExpand", value.asInstanceOf[js.Any])
  }
}
