package typings.reactMdTransition

import typings.reactMdTransition.constantsMod.TransitionStage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getNextStageMod {
  
  @JSImport("@react-md/transition/types/getNextStage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getNextStage(stage: TransitionStage): TransitionStage = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextStage")(stage.asInstanceOf[js.Any]).asInstanceOf[TransitionStage]
}
