package typings.rcTree.treeMod

import typings.rcTree.anon.AutoExpandParent
import typings.rcTree.anon.PartialTreeState
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-tree/es/Tree", JSImport.Default)
@js.native
class default () extends Tree
/* static members */
@JSImport("rc-tree/es/Tree", JSImport.Default)
@js.native
object default extends js.Object {
  
  var TreeNode: FC[TreeNodeProps] = js.native
  
  var defaultProps: AutoExpandParent = js.native
  
  def getDerivedStateFromProps(props: TreeProps, prevState: TreeState): PartialTreeState = js.native
}
