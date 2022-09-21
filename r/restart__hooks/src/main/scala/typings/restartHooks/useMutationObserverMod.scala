package typings.restartHooks

import typings.std.Element
import typings.std.MutationCallback
import typings.std.MutationObserverInit
import typings.std.MutationRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMutationObserverMod {
  
  @JSImport("@restart/hooks/cjs/useMutationObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: Null, config: MutationObserverInit): js.Array[MutationRecord] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[MutationRecord]]
  inline def default(element: Null, config: MutationObserverInit, callback: MutationCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(element: Unit, config: MutationObserverInit): js.Array[MutationRecord] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[MutationRecord]]
  inline def default(element: Unit, config: MutationObserverInit, callback: MutationCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Observe mutations on a DOM node or tree of DOM nodes.
    * use a `MutationObserver` and return records as the are received.
    *
    * ```tsx
    * const [element, attachRef] = useCallbackRef(null);
    *
    * const records = useMutationObserver(element, { subtree: true });
    *
    * return (
    *   <div ref={attachRef} />
    * )
    * ```
    *
    * @param element The DOM element to observe
    * @param config The observer configuration
    */
  inline def default(element: Element, config: MutationObserverInit): js.Array[MutationRecord] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[MutationRecord]]
  inline def default(element: Element, config: MutationObserverInit, callback: MutationCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
