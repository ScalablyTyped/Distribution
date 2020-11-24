package typings.restartHooks

import typings.react.mod.EffectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@restart/hooks/cjs/useMountEffect", JSImport.Namespace)
@js.native
object useMountEffectMod extends js.Object {
  
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
  def default(effect: EffectCallback): Unit = js.native
}
