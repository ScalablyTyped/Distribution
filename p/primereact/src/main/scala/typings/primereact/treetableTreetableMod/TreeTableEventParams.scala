package typings.primereact.treetableTreetableMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTableEventParams extends StObject {
  
  var node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
  
  var originalEvent: SyntheticEvent[Element, Event]
}
object TreeTableEventParams {
  
  inline def apply(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any,
    originalEvent: SyntheticEvent[Element, Event]
  ): TreeTableEventParams = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeTableEventParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeTableEventParams] (val x: Self) extends AnyVal {
    
    inline def setNode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
    ): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
