package typings.reactMdTree

import typings.react.mod.ReactElement
import typings.reactMdIcon.iconRotatorMod.IconRotatorBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeItemExpanderIconMod {
  
  @JSImport("@react-md/tree/types/TreeItemExpanderIcon", "TreeItemExpanderIcon")
  @js.native
  def TreeItemExpanderIcon(hasClassNameChildrenRotatedProps: TreeItemExpanderIconProps): ReactElement = js.native
  
  @js.native
  trait TreeItemExpanderIconProps extends IconRotatorBaseProps
  object TreeItemExpanderIconProps {
    
    @scala.inline
    def apply(rotated: Boolean): TreeItemExpanderIconProps = {
      val __obj = js.Dynamic.literal(rotated = rotated.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeItemExpanderIconProps]
    }
  }
}
