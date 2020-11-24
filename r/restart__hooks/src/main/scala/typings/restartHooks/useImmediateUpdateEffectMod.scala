package typings.restartHooks

import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@restart/hooks/cjs/useImmediateUpdateEffect", JSImport.Namespace)
@js.native
object useImmediateUpdateEffectMod extends js.Object {
  
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
  def default(effect: EffectCallback, deps: DependencyList): Unit = js.native
}
