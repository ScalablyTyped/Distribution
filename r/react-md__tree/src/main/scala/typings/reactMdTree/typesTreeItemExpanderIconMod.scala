package typings.reactMdTree

import typings.react.mod.ReactElement
import typings.reactMdIcon.typesIconRotatorMod.IconRotatorBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTreeItemExpanderIconMod {
  
  @JSImport("@react-md/tree/types/TreeItemExpanderIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TreeItemExpanderIcon(param0: TreeItemExpanderIconProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeItemExpanderIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait TreeItemExpanderIconProps
    extends StObject
       with IconRotatorBaseProps
  object TreeItemExpanderIconProps {
    
    inline def apply(rotated: Boolean): TreeItemExpanderIconProps = {
      val __obj = js.Dynamic.literal(rotated = rotated.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeItemExpanderIconProps]
    }
  }
}
