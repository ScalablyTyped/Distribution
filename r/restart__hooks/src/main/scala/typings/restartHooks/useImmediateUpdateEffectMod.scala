package typings.restartHooks

import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useImmediateUpdateEffectMod {
  
  @JSImport("@restart/hooks/cjs/useImmediateUpdateEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An _immediate_ effect that runs an effect callback when its dependency array
    * changes. This is helpful for updates should must run during render, most
    * commonly state derived from props; a more ergonomic version of https://reactjs.org/docs/hooks-faq.html#how-do-i-implement-getderivedstatefromprops
    *
    * ```ts
    * function Example({ value }) {
    *   const [intermediaryValue, setValue] = useState(value);
    *
    *   useUpdateImmediateEffect(() => {
    *     setValue(value)
    *   }, [value])
    * ```
    *
    * @category effects
    */
  inline def default(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
