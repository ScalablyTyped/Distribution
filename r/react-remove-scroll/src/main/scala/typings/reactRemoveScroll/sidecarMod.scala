package typings.reactRemoveScroll

import org.scalablytyped.runtime.Shortcut
import typings.reactRemoveScroll.typesMod.IRemoveScrollEffectProps
import typings.useSidecar.typesMod.SideCarComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidecarMod extends Shortcut {
  
  @JSImport("react-remove-scroll/dist/es5/sidecar", JSImport.Default)
  @js.native
  val default: SideCarComponent[IRemoveScrollEffectProps] = js.native
  
  type _To = SideCarComponent[IRemoveScrollEffectProps]
  
  /* This means you don't have to write `default`, but can instead just say `sidecarMod.foo` */
  override def _to: SideCarComponent[IRemoveScrollEffectProps] = default
}
