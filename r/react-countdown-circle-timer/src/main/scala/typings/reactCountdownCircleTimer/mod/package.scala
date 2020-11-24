package typings.reactCountdownCircleTimer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ColorType = js.Array[js.Tuple2[java.lang.String, js.UndefOr[scala.Double]]]
  
  type OnCompleteFunctionType = js.Function0[js.UndefOr[(js.Tuple2[scala.Boolean, scala.Double]) | scala.Unit]]
  
  type RenderTimeFunctionType = js.Function3[
    /* remainingTime */ scala.Double, 
    /* elapsedTime */ scala.Double, 
    /* isPlaying */ scala.Boolean, 
    typings.react.mod.ReactNode
  ]
}
