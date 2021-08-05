package typings.restartHooks

import typings.std.Element
import typings.std.MutationCallback
import typings.std.MutationObserverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMutationObserverMod {
  
  @JSImport("@restart/hooks/cjs/useMutationObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: Null, config: MutationObserverInit, callback: MutationCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(element: Unit, config: MutationObserverInit, callback: MutationCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(element: Element, config: MutationObserverInit, callback: MutationCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
