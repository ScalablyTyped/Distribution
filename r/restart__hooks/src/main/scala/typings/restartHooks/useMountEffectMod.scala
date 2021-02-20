package typings.restartHooks

import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMountEffectMod {
  
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
  @JSImport("@restart/hooks/cjs/useMountEffect", JSImport.Default)
  @js.native
  def default(effect: EffectCallback): Unit = js.native
}
