package typings.reactMdUtils

import typings.react.mod.ReactElement
import typings.reactMdUtils.modeTypesMod.UserInteractionMode
import typings.reactMdUtils.userInteractionModeListenerMod.UserInteractionModeListenerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modeMod {
  
  @JSImport("@react-md/utils/types/mode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def UserInteractionModeListener(hasChildren: UserInteractionModeListenerProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("UserInteractionModeListener")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useIsUserInteractionMode(mode: UserInteractionMode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsUserInteractionMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useUserInteractionMode(): UserInteractionMode = ^.asInstanceOf[js.Dynamic].applyDynamic("useUserInteractionMode")().asInstanceOf[UserInteractionMode]
}
