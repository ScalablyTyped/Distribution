package typings.rotJs

import org.scalablytyped.runtime.Instantiable0
import typings.rotJs.libSchedulerSpeedMod.SpeedActor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSchedulerMod {
  
  object default {
    
    @JSImport("rot-js/lib/scheduler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/scheduler", "default.Action")
    @js.native
    open class Action[T] ()
      extends typings.rotJs.libSchedulerActionMod.default[T]
    @JSImport("rot-js/lib/scheduler", "default.Action")
    @js.native
    def Action: Instantiable0[typings.rotJs.libSchedulerActionMod.default[js.Object]] = js.native
    inline def Action_=(x: Instantiable0[typings.rotJs.libSchedulerActionMod.default[js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Action")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/scheduler", "default.Simple")
    @js.native
    open class Simple[T] ()
      extends typings.rotJs.libSchedulerSimpleMod.default[T]
    @JSImport("rot-js/lib/scheduler", "default.Simple")
    @js.native
    def Simple: Instantiable0[typings.rotJs.libSchedulerSimpleMod.default[js.Object]] = js.native
    inline def Simple_=(x: Instantiable0[typings.rotJs.libSchedulerSimpleMod.default[js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Simple")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/scheduler", "default.Speed")
    @js.native
    open class Speed[T /* <: SpeedActor */] ()
      extends typings.rotJs.libSchedulerSpeedMod.default[T]
    @JSImport("rot-js/lib/scheduler", "default.Speed")
    @js.native
    def Speed: Instantiable0[typings.rotJs.libSchedulerSpeedMod.default[SpeedActor]] = js.native
    inline def Speed_=(x: Instantiable0[typings.rotJs.libSchedulerSpeedMod.default[SpeedActor]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Speed")(x.asInstanceOf[js.Any])
  }
}
