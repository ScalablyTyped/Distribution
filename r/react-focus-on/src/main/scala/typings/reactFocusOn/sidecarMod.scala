package typings.reactFocusOn

import org.scalablytyped.runtime.Shortcut
import typings.reactFocusOn.typesMod.EffectProps
import typings.useSidecar.typesMod.SideCarComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidecarMod extends Shortcut {
  
  @JSImport("react-focus-on/dist/es5/sidecar", JSImport.Default)
  @js.native
  val default: SideCarComponent[EffectProps] = js.native
  
  type _To = SideCarComponent[EffectProps]
  
  /* This means you don't have to write `default`, but can instead just say `sidecarMod.foo` */
  override def _to: SideCarComponent[EffectProps] = default
}
