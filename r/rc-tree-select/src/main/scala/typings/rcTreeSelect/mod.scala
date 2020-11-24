package typings.rcTreeSelect

import typings.rcTreeSelect.treeNodeMod.TreeNodeProps
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-tree-select", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val SHOW_ALL: /* "SHOW_ALL" */ String = js.native
  
  val SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
  
  val SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
  
  /** This is a placeholder, not real render in dom */
  val TreeNode: FC[TreeNodeProps] = js.native
  
  @js.native
  class default[ValueType] ()
    extends typings.rcTreeSelect.treeSelectMod.default[ValueType]
  /* static members */
  @js.native
  object default extends js.Object {
    
    var SHOW_ALL: /* "SHOW_ALL" */ String = js.native
    
    var SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
    
    var SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
    
    var TreeNode: FC[TreeNodeProps] = js.native
  }
}
