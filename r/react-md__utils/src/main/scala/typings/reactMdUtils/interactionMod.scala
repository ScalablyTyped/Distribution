package typings.reactMdUtils

import typings.react.mod.ReactElement
import typings.reactMdUtils.interactionModeMod.InteractionModeListenerProps
import typings.reactMdUtils.useModeDetectionMod.UserInteractionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionMod {
  
  @JSImport("@react-md/utils/types/interaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object InteractionModeListener {
    
    @scala.inline
    def apply(hasChildren: InteractionModeListenerProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/utils/types/interaction", "InteractionModeListener")
    @js.native
    val ^ : js.Any = js.native
    
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
  
  @scala.inline
  def useIsUserInteractionMode(mode: UserInteractionMode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsUserInteractionMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def useUserInteractionMode(): UserInteractionMode = ^.asInstanceOf[js.Dynamic].applyDynamic("useUserInteractionMode")().asInstanceOf[UserInteractionMode]
}
