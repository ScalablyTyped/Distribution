package typings.rotDashJs.rotDashJsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typings.rotDashJs.libSchedulerActionMod.default
import typings.rotDashJs.libSchedulerSpeedMod.SpeedActor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Scheduler")
@js.native
object Scheduler extends js.Object {
  @js.native
  class Action[T] () extends default[T]
  
  @js.native
  class Simple[T] ()
    extends typings.rotDashJs.libSchedulerSimpleMod.default[T]
  
  @js.native
  class Speed[T /* <: SpeedActor */] ()
    extends typings.rotDashJs.libSchedulerSpeedMod.default[T]
  
  @js.native
  object Action
    extends TopLevel[Instantiable0[default[js.Object]]]
  
  @js.native
  object Simple
    extends TopLevel[Instantiable0[typings.rotDashJs.libSchedulerSimpleMod.default[js.Object]]]
  
  @js.native
  object Speed
    extends TopLevel[Instantiable0[typings.rotDashJs.libSchedulerSpeedMod.default[SpeedActor]]]
  
}

