package typings.reactFocusOn

import typings.react.mod.ComponentType
import typings.reactFocusOn.distEs5TypesMod.EffectProps
import typings.std.Record
import typings.useSidecar.distEs5TypesMod.MediumCallback
import typings.useSidecar.distEs5TypesMod.removeCb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5MediumMod {
  
  /* Inlined std.Readonly<use-sidecar.use-sidecar/dist/es5/types.SideCarMedium<react-focus-on.react-focus-on/dist/es5/types.EffectProps>> */
  object effectCar {
    
    @JSImport("react-focus-on/dist/es5/medium", "effectCar.assignMedium")
    @js.native
    val assignMedium: js.Function1[/* handler */ MediumCallback[ComponentType[EffectProps]], Unit] = js.native
    
    @JSImport("react-focus-on/dist/es5/medium", "effectCar.assignSyncMedium")
    @js.native
    val assignSyncMedium: js.Function1[/* handler */ MediumCallback[ComponentType[EffectProps]], Unit] = js.native
    
    @JSImport("react-focus-on/dist/es5/medium", "effectCar.options")
    @js.native
    val options: js.UndefOr[Record[String, Any]] = js.native
    
    @JSImport("react-focus-on/dist/es5/medium", "effectCar.read")
    @js.native
    val read: js.Function0[js.UndefOr[ComponentType[EffectProps]]] = js.native
    
    @JSImport("react-focus-on/dist/es5/medium", "effectCar.useMedium")
    @js.native
    val useMedium: js.Function1[/* effect */ ComponentType[EffectProps], removeCb] = js.native
  }
  
  @JSImport("react-focus-on/dist/es5/medium", "focusHiddenMarker")
  @js.native
  val focusHiddenMarker: /* "data-focus-on-hidden" */ String = js.native
}
