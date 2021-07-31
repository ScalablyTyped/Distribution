package typings.rotJs

import org.scalablytyped.runtime.Instantiable0
import typings.rotJs.speedMod.SpeedActor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schedulerMod {
  
  object default {
    
    @JSImport("rot-js/lib/scheduler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/scheduler", "default.Action")
    @js.native
    class Action[T] ()
      extends typings.rotJs.actionMod.default[T]
    @JSImport("rot-js/lib/scheduler", "default.Action")
    @js.native
    def Action: Instantiable0[typings.rotJs.actionMod.default[js.Object]] = js.native
    @scala.inline
    def Action_=(x: Instantiable0[typings.rotJs.actionMod.default[js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Action")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/scheduler", "default.Simple")
    @js.native
    class Simple[T] ()
      extends typings.rotJs.simpleMod.default[T]
    @JSImport("rot-js/lib/scheduler", "default.Simple")
    @js.native
    def Simple: Instantiable0[typings.rotJs.simpleMod.default[js.Object]] = js.native
    @scala.inline
    def Simple_=(x: Instantiable0[typings.rotJs.simpleMod.default[js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Simple")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js/lib/scheduler", "default.Speed")
    @js.native
    class Speed[T /* <: SpeedActor */] ()
      extends typings.rotJs.speedMod.default[T]
    @JSImport("rot-js/lib/scheduler", "default.Speed")
    @js.native
    def Speed: Instantiable0[typings.rotJs.speedMod.default[SpeedActor]] = js.native
    @scala.inline
    def Speed_=(x: Instantiable0[typings.rotJs.speedMod.default[SpeedActor]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Speed")(x.asInstanceOf[js.Any])
  }
}
