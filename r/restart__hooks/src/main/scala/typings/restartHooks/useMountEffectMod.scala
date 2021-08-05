package typings.restartHooks

import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMountEffectMod {
  
  @JSImport("@restart/hooks/cjs/useMountEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Run's an effect on mount, and is cleaned up on unmount. Generally
    * useful for interop with non-react plugins or components
    *
    * ```ts
    *  useMountEffect(() => {
    *    const plugin = $.myPlugin(ref.current)
    *
    *    return () => {
    *      plugin.destroy()
    *    }
    *  })
    * ```
    * @param effect An effect to run on mount
    *
    *  @category effects
    */
  inline def default(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
