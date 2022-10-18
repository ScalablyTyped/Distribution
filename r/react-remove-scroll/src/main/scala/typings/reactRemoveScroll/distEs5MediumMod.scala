package typings.reactRemoveScroll

import typings.react.mod.ComponentType
import typings.reactRemoveScroll.distEs5TypesMod.IRemoveScrollEffectProps
import typings.std.Record
import typings.useSidecar.distEs5TypesMod.MediumCallback
import typings.useSidecar.distEs5TypesMod.removeCb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5MediumMod {
  
  /* Inlined std.Readonly<use-sidecar.use-sidecar/dist/es5/types.SideCarMedium<react-remove-scroll.react-remove-scroll/dist/es5/types.IRemoveScrollEffectProps>> */
  object effectCar {
    
    @JSImport("react-remove-scroll/dist/es5/medium", "effectCar.assignMedium")
    @js.native
    val assignMedium: js.Function1[/* handler */ MediumCallback[ComponentType[IRemoveScrollEffectProps]], Unit] = js.native
    
    @JSImport("react-remove-scroll/dist/es5/medium", "effectCar.assignSyncMedium")
    @js.native
    val assignSyncMedium: js.Function1[/* handler */ MediumCallback[ComponentType[IRemoveScrollEffectProps]], Unit] = js.native
    
    @JSImport("react-remove-scroll/dist/es5/medium", "effectCar.options")
    @js.native
    val options: js.UndefOr[Record[String, Any]] = js.native
    
    @JSImport("react-remove-scroll/dist/es5/medium", "effectCar.read")
    @js.native
    val read: js.Function0[js.UndefOr[ComponentType[IRemoveScrollEffectProps]]] = js.native
    
    @JSImport("react-remove-scroll/dist/es5/medium", "effectCar.useMedium")
    @js.native
    val useMedium: js.Function1[/* effect */ ComponentType[IRemoveScrollEffectProps], removeCb] = js.native
  }
}
