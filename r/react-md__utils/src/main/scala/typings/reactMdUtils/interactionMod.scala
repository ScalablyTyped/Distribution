package typings.reactMdUtils

import typings.react.mod.ReactElement
import typings.reactMdUtils.interactionModeMod.InteractionModeListenerProps
import typings.reactMdUtils.useModeDetectionMod.UserInteractionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionMod {
  
  object InteractionModeListener {
    
    @JSImport("@react-md/utils/types/interaction", "InteractionModeListener")
    @js.native
    def apply(hasChildren: InteractionModeListenerProps): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils/types/interaction", "InteractionModeListener.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils/types/interaction", "InteractionModeListener.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/utils/types/interaction", "useIsUserInteractionMode")
  @js.native
  def useIsUserInteractionMode(mode: UserInteractionMode): Boolean = js.native
  
  @JSImport("@react-md/utils/types/interaction", "useUserInteractionMode")
  @js.native
  def useUserInteractionMode(): UserInteractionMode = js.native
}
