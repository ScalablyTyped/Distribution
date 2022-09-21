package typings.rcResizeObserver

import typings.std.Element
import typings.std.Map
import typings.std.ResizeObserverEntry
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerUtilMod {
  
  @JSImport("rc-resize-observer/es/utils/observerUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-resize-observer/es/utils/observerUtil", "_el")
  @js.native
  val el: Map[Element, Set[ResizeListener]] = js.native
  
  inline def observe(element: Element, callback: ResizeListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("rc-resize-observer/es/utils/observerUtil", "_rs")
  @js.native
  val rs: js.Function1[/* entities */ js.Array[ResizeObserverEntry], Unit] = js.native
  
  inline def unobserve(element: Element, callback: ResizeListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unobserve")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ResizeListener = js.Function1[/* element */ Element, Unit]
}
