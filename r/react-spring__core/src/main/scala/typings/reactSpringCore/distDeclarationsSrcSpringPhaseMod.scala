package typings.reactSpringCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcSpringPhaseMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/SpringPhase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasAnimated(target: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAnimated")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAnimating(target: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnimating")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPaused(target: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPaused")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def setActiveBit(target: Any, active: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setActiveBit")(target.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setPausedBit(target: Any, paused: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setPausedBit")(target.asInstanceOf[js.Any], paused.asInstanceOf[js.Any])).asInstanceOf[Double]
}
