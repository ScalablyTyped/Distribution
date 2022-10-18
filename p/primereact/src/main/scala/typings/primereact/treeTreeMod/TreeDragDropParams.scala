package typings.primereact.treeTreeMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeDragDropParams extends StObject {
  
  var dragNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
  
  var dropIndex: Double
  
  var dropNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
  
  var originalEvent: SyntheticEvent[Element, Event]
  
  var value: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
  ]
}
object TreeDragDropParams {
  
  inline def apply(
    dragNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any,
    dropIndex: Double,
    dropNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any,
    originalEvent: SyntheticEvent[Element, Event],
    value: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
    ]
  ): TreeDragDropParams = {
    val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any], dropNode = dropNode.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeDragDropParams]
  }
  
  extension [Self <: TreeDragDropParams](x: Self) {
    
    inline def setDragNode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
    ): Self = StObject.set(x, "dragNode", value.asInstanceOf[js.Any])
    
    inline def setDropIndex(value: Double): Self = StObject.set(x, "dropIndex", value.asInstanceOf[js.Any])
    
    inline def setDropNode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
    ): Self = StObject.set(x, "dropNode", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setValue(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
        ]
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any)*
    ): Self = StObject.set(x, "value", js.Array(value*))
  }
}
