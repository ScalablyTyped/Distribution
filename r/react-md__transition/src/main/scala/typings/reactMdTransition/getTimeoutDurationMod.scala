package typings.reactMdTransition

import typings.reactMdTransition.constantsMod.TransitionStage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTimeoutDurationMod {
  
  @JSImport("@react-md/transition/types/getTimeoutDuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getTimeoutDuration(stage: TransitionStage, appear: Double, enter: Double, exit: Double, appearing: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeoutDuration")(stage.asInstanceOf[js.Any], appear.asInstanceOf[js.Any], enter.asInstanceOf[js.Any], exit.asInstanceOf[js.Any], appearing.asInstanceOf[js.Any])).asInstanceOf[Double]
}
