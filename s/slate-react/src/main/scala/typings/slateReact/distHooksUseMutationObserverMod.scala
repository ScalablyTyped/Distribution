package typings.slateReact

import typings.react.mod.RefObject
import typings.std.HTMLElement
import typings.std.MutationCallback
import typings.std.MutationObserverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseMutationObserverMod {
  
  @JSImport("slate-react/dist/hooks/use-mutation-observer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMutationObserver(node: RefObject[HTMLElement], callback: MutationCallback, options: MutationObserverInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutationObserver")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
