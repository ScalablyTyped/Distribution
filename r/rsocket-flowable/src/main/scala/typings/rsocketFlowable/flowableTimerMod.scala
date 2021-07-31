package typings.rsocketFlowable

import typings.rsocketFlowable.flowableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowableTimerMod {
  
  @JSImport("rsocket-flowable/FlowableTimer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def every(ms: Double): default[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(ms.asInstanceOf[js.Any]).asInstanceOf[default[Double]]
}
