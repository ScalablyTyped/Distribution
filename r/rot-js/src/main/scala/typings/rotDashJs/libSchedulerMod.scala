package typings.rotDashJs

import org.scalablytyped.runtime.Instantiable0
import typings.rotDashJs.libSchedulerSpeedMod.SpeedActor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/scheduler", JSImport.Namespace)
@js.native
object libSchedulerMod extends js.Object {
  @js.native
  object default extends js.Object {
    @js.native
    class Action[T] ()
      extends typings.rotDashJs.libSchedulerActionMod.default[T]
    
    @js.native
    class Simple[T] ()
      extends typings.rotDashJs.libSchedulerSimpleMod.default[T]
    
    @js.native
    class Speed[T /* <: SpeedActor */] ()
      extends typings.rotDashJs.libSchedulerSpeedMod.default[T]
    
    var Action: Instantiable0[typings.rotDashJs.libSchedulerActionMod.default[js.Object]] = js.native
    var Simple: Instantiable0[typings.rotDashJs.libSchedulerSimpleMod.default[js.Object]] = js.native
    var Speed: Instantiable0[typings.rotDashJs.libSchedulerSpeedMod.default[SpeedActor]] = js.native
  }
  
}

