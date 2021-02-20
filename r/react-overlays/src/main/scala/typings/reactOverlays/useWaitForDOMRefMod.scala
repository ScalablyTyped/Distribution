package typings.reactOverlays

import typings.react.mod.RefObject
import typings.std.HTMLBodyElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useWaitForDOMRefMod {
  
  @JSImport("react-overlays/cjs/useWaitForDOMRef", JSImport.Default)
  @js.native
  def default[T /* <: HTMLElement */](): HTMLBodyElement | T | Null = js.native
  @JSImport("react-overlays/cjs/useWaitForDOMRef", JSImport.Default)
  @js.native
  def default[T /* <: HTMLElement */](ref: js.UndefOr[DOMContainer[T]], onResolved: js.Function1[HTMLBodyElement | T, Unit]): HTMLBodyElement | T | Null = js.native
  @JSImport("react-overlays/cjs/useWaitForDOMRef", JSImport.Default)
  @js.native
  def default[T /* <: HTMLElement */](ref: DOMContainer[T]): HTMLBodyElement | T | Null = js.native
  
  @JSImport("react-overlays/cjs/useWaitForDOMRef", "resolveContainerRef")
  @js.native
  def resolveContainerRef[T /* <: HTMLElement */](): HTMLBodyElement | T | Null = js.native
  @JSImport("react-overlays/cjs/useWaitForDOMRef", "resolveContainerRef")
  @js.native
  def resolveContainerRef[T /* <: HTMLElement */](ref: T): HTMLBodyElement | T | Null = js.native
  @JSImport("react-overlays/cjs/useWaitForDOMRef", "resolveContainerRef")
  @js.native
  def resolveContainerRef[T /* <: HTMLElement */](ref: js.Function0[T | RefObject[T] | Null]): HTMLBodyElement | T | Null = js.native
  @JSImport("react-overlays/cjs/useWaitForDOMRef", "resolveContainerRef")
  @js.native
  def resolveContainerRef[T /* <: HTMLElement */](ref: RefObject[T]): HTMLBodyElement | T | Null = js.native
  
  type DOMContainer[T /* <: HTMLElement */] = T | RefObject[T] | Null | (js.Function0[T | RefObject[T] | Null])
}
