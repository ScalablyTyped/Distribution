package typings.restartHooks

import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useImmediateUpdateEffectMod {
  
  /**
    * An _immediate_ effect that runs an effect callback when its dependency array
    * changes. This is helpful for updates should must run during render, most
    * commonly state derived from props; a more ergonomic version of https://reactjs.org/docs/hooks-faq.html#how-do-i-implement-getderivedstatefromprops
    *
    * ```ts
    * function Example({ value }) {
    *   const [intermediaryValue, setValue] = useState(value);
    *
    *   useImmediateUpdateEffect(() => {
    *     setValue(value)
    *   }, [value])
    * ```
    *
    * @category effects
    */
  @JSImport("@restart/hooks/cjs/useImmediateUpdateEffect", JSImport.Default)
  @js.native
  def default(effect: EffectCallback, deps: DependencyList): Unit = js.native
}
