package typings.rcTreeSelect

import typings.rcTreeSelect.treeNodeMod.TreeNodeProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-tree-select", JSImport.Default)
  @js.native
  class default[ValueType] ()
    extends typings.rcTreeSelect.treeSelectMod.default[ValueType]
  object default {
    
    @JSImport("rc-tree-select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    /* was `typeof SHOW_ALL` */
    @JSImport("rc-tree-select", "default.SHOW_ALL")
    @js.native
    def SHOW_ALL: /* "SHOW_ALL" */ String = js.native
    @scala.inline
    def SHOW_ALL_=(x: /* "SHOW_ALL" */ String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_ALL")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof SHOW_CHILD` */
    @JSImport("rc-tree-select", "default.SHOW_CHILD")
    @js.native
    def SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
    @scala.inline
    def SHOW_CHILD_=(x: /* "SHOW_CHILD" */ String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_CHILD")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof SHOW_PARENT` */
    @JSImport("rc-tree-select", "default.SHOW_PARENT")
    @js.native
    def SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
    @scala.inline
    def SHOW_PARENT_=(x: /* "SHOW_PARENT" */ String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_PARENT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("rc-tree-select", "default.TreeNode")
    @js.native
    def TreeNode: FC[TreeNodeProps] = js.native
    @scala.inline
    def TreeNode_=(x: FC[TreeNodeProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TreeNode")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rc-tree-select", "SHOW_ALL")
  @js.native
  val SHOW_ALL: /* "SHOW_ALL" */ String = js.native
  
  @JSImport("rc-tree-select", "SHOW_CHILD")
  @js.native
  val SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
  
  @JSImport("rc-tree-select", "SHOW_PARENT")
  @js.native
  val SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-tree-select", "TreeNode")
  @js.native
  val TreeNode: FC[TreeNodeProps] = js.native
}
