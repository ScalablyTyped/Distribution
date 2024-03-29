package typings.reactOverlays

import typings.react.mod.RefObject
import typings.std.HTMLBodyElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmUseWaitForDOMRefMod {
  
  @JSImport("react-overlays/esm/useWaitForDOMRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: HTMLElement */](): HTMLBodyElement | T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[HTMLBodyElement | T | Null]
  inline def default[T /* <: HTMLElement */](ref: Unit, onResolved: js.Function1[/* element */ T | HTMLBodyElement, Unit]): HTMLBodyElement | T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], onResolved.asInstanceOf[js.Any])).asInstanceOf[HTMLBodyElement | T | Null]
  inline def default[T /* <: HTMLElement */](ref: DOMContainer[T]): HTMLBodyElement | T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any]).asInstanceOf[HTMLBodyElement | T | Null]
  inline def default[T /* <: HTMLElement */](ref: DOMContainer[T], onResolved: js.Function1[/* element */ T | HTMLBodyElement, Unit]): HTMLBodyElement | T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], onResolved.asInstanceOf[js.Any])).asInstanceOf[HTMLBodyElement | T | Null]
  
  inline def resolveContainerRef[T /* <: HTMLElement */](): HTMLBodyElement | T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveContainerRef")().asInstanceOf[HTMLBodyElement | T | Null]
  inline def resolveContainerRef[T /* <: HTMLElement */](ref: DOMContainer[T]): HTMLBodyElement | T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveContainerRef")(ref.asInstanceOf[js.Any]).asInstanceOf[HTMLBodyElement | T | Null]
  
  type DOMContainer[T /* <: HTMLElement */] = T | RefObject[T] | Null | (js.Function0[T | RefObject[T] | Null])
}
