package typings.rcTree

import typings.rcTree.anon.AutoExpandParent
import typings.rcTree.anon.PartialTreeState
import typings.rcTree.treeMod.TreeProps
import typings.rcTree.treeMod.TreeState
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default ()
    extends typings.rcTree.treeMod.default
  
  val TreeNode: FC[TreeNodeProps] = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    var TreeNode: FC[TreeNodeProps] = js.native
    var defaultProps: AutoExpandParent = js.native
    def getDerivedStateFromProps(props: TreeProps, prevState: TreeState): PartialTreeState = js.native
  }
  
}

