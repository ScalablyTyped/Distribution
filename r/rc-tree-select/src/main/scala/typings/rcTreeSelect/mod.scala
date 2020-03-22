package typings.rcTreeSelect

import typings.rcTreeSelect.treeNodeMod.TreeNodeProps
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree-select/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default[ValueType] ()
    extends typings.rcTreeSelect.treeSelectMod.default[ValueType]
  
  val SHOW_ALL: typings.rcTreeSelect.rcTreeSelectStrings.SHOW_ALL = js.native
  val SHOW_CHILD: typings.rcTreeSelect.rcTreeSelectStrings.SHOW_CHILD = js.native
  val SHOW_PARENT: typings.rcTreeSelect.rcTreeSelectStrings.SHOW_PARENT = js.native
  /** This is a placeholder, not real render in dom */
  val TreeNode: FC[TreeNodeProps] = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    var SHOW_ALL: typings.rcTreeSelect.rcTreeSelectStrings.SHOW_ALL = js.native
    var SHOW_CHILD: typings.rcTreeSelect.rcTreeSelectStrings.SHOW_CHILD = js.native
    var SHOW_PARENT: typings.rcTreeSelect.rcTreeSelectStrings.SHOW_PARENT = js.native
    var TreeNode: FC[TreeNodeProps] = js.native
  }
  
}

