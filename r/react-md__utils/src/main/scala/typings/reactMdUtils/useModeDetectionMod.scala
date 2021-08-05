package typings.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useModeDetectionMod {
  
  @JSImport("@react-md/utils/types/interaction/useModeDetection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useModeDetection(): UserInteractionMode = ^.asInstanceOf[js.Dynamic].applyDynamic("useModeDetection")().asInstanceOf[UserInteractionMode]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdUtils.reactMdUtilsStrings.keyboard
    - typings.reactMdUtils.reactMdUtilsStrings.mouse
    - typings.reactMdUtils.reactMdUtilsStrings.touch
  */
  trait UserInteractionMode extends StObject
  object UserInteractionMode {
    
    inline def keyboard: typings.reactMdUtils.reactMdUtilsStrings.keyboard = "keyboard".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.keyboard]
    
    inline def mouse: typings.reactMdUtils.reactMdUtilsStrings.mouse = "mouse".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.mouse]
    
    inline def touch: typings.reactMdUtils.reactMdUtilsStrings.touch = "touch".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.touch]
  }
}
