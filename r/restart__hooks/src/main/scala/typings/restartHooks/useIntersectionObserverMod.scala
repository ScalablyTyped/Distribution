package typings.restartHooks

import typings.std.Element
import typings.std.IntersectionObserverCallback
import typings.std.IntersectionObserverEntry
import typings.std.IntersectionObserverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useIntersectionObserverMod {
  
  @JSImport("@restart/hooks/cjs/useIntersectionObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TElement /* <: Element */](): js.Array[IntersectionObserverEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[IntersectionObserverEntry]]
  inline def default[TElement /* <: Element */](element: TElement): js.Array[IntersectionObserverEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[js.Array[IntersectionObserverEntry]]
  /**
    * Setup an [`IntersectionObserver`](https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserver) on
    * a DOM Element. This overload does not trigger component updates when receiving new
    * entries. This allows for finer grained performance optimizations by the consumer.
    *
    * @param element The DOM element to observe
    * @param callback A listener for intersection updates.
    * @param init IntersectionObserver options with a notable change,
    * unlike a plain IntersectionObserver `root: null` means "not provided YET",
    * and the hook will wait until it receives a non-null value to set up the observer.
    * This change allows for easier syncing of element and root values in a React
    * context.
    *
    */
  inline def default[TElement /* <: Element */](element: TElement, callback: IntersectionObserverCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[TElement /* <: Element */](element: TElement, callback: IntersectionObserverCallback, options: IntersectionObserverInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[TElement /* <: Element */](element: TElement, options: IntersectionObserverInit): js.Array[IntersectionObserverEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[IntersectionObserverEntry]]
  inline def default[TElement /* <: Element */](element: Null, callback: IntersectionObserverCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[TElement /* <: Element */](element: Null, callback: IntersectionObserverCallback, options: IntersectionObserverInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[TElement /* <: Element */](element: Null, options: IntersectionObserverInit): js.Array[IntersectionObserverEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[IntersectionObserverEntry]]
  inline def default[TElement /* <: Element */](element: Unit, callback: IntersectionObserverCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[TElement /* <: Element */](element: Unit, callback: IntersectionObserverCallback, options: IntersectionObserverInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[TElement /* <: Element */](element: Unit, options: IntersectionObserverInit): js.Array[IntersectionObserverEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[IntersectionObserverEntry]]
}
