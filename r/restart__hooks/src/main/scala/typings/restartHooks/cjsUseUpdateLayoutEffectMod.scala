package typings.restartHooks

import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseUpdateLayoutEffectMod {
  
  @JSImport("@restart/hooks/cjs/useUpdateLayoutEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Runs a layout effect only when the dependencies have changed, skipping the
    * initial "on mount" run. Caution, if the dependency list never changes,
    * the effect is **never run**
    *
    * ```ts
    *  const ref = useRef<HTMLInput>(null);
    *
    *  // focuses an element only if the focus changes, and not on mount
    *  useUpdateLayoutEffect(() => {
    *    const element = ref.current?.children[focusedIdx] as HTMLElement
    *
    *    element?.focus()
    *
    *  }, [focusedIndex])
    * ```
    * @param effect An effect to run on mount
    *
    * @category effects
    */
  inline def default(fn: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
