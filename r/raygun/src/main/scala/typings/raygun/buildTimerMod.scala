package typings.raygun

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTimerMod {
  
  @JSImport("raygun/build/timer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def startTimer(): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("startTimer")().asInstanceOf[js.Function0[Double]]
}
