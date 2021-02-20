package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaxPortal
  extends RaxElement[js.Any, String | JSXElementConstructor[js.Any]] {
  
  var children: RaxNode = js.native
}
object RaxPortal {
  
  @scala.inline
  def apply(props: js.Any, `type`: String | JSXElementConstructor[js.Any]): RaxPortal = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaxPortal]
  }
  
  @scala.inline
  implicit class RaxPortalMutableBuilder[Self <: RaxPortal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: RaxNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
