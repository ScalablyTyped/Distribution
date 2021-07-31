package typings.restartHooks

import typings.std.Element
import typings.std.IntersectionObserverEntry
import typings.std.IntersectionObserverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useIntersectionObserverMod {
  
  @JSImport("@restart/hooks/cjs/useIntersectionObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[TElement /* <: Element */](): js.Array[IntersectionObserverEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[IntersectionObserverEntry]]
  @scala.inline
  def default[TElement /* <: Element */](element: TElement): js.Array[IntersectionObserverEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[js.Array[IntersectionObserverEntry]]
  @scala.inline
  def default[TElement /* <: Element */](element: TElement, hasThresholdRootRootMargin: IntersectionObserverInit): js.Array[IntersectionObserverEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], hasThresholdRootRootMargin.asInstanceOf[js.Any])).asInstanceOf[js.Array[IntersectionObserverEntry]]
  @scala.inline
  def default[TElement /* <: Element */](element: Null, hasThresholdRootRootMargin: IntersectionObserverInit): js.Array[IntersectionObserverEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], hasThresholdRootRootMargin.asInstanceOf[js.Any])).asInstanceOf[js.Array[IntersectionObserverEntry]]
  @scala.inline
  def default[TElement /* <: Element */](element: Unit, hasThresholdRootRootMargin: IntersectionObserverInit): js.Array[IntersectionObserverEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], hasThresholdRootRootMargin.asInstanceOf[js.Any])).asInstanceOf[js.Array[IntersectionObserverEntry]]
}
