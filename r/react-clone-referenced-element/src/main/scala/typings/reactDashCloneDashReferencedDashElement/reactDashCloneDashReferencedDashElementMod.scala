package typings.reactDashCloneDashReferencedDashElement

import typings.react.Element
import typings.react.HTMLElement
import typings.react.SVGElement
import typings.react.reactMod.Attributes
import typings.react.reactMod.CElement
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.DOMElement
import typings.react.reactMod.DetailedReactHTMLElement
import typings.react.reactMod.FunctionComponentElement
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactHTMLElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactSVGElement
import typings.react.reactMod.SVGAttributes
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-clone-referenced-element", JSImport.Namespace)
@js.native
object reactDashCloneDashReferencedDashElementMod extends js.Object {
  // Custom components
  def default[P](element: FunctionComponentElement[P]): FunctionComponentElement[P] = js.native
  def default[P](element: FunctionComponentElement[P], props: Partial[P] with Attributes, children: ReactNode*): FunctionComponentElement[P] = js.native
  def default[P](element: ReactElement): ReactElement = js.native
  def default[P](element: ReactElement, props: Partial[P] with Attributes, children: ReactNode*): ReactElement = js.native
  def default[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T]): CElement[P, T] = js.native
  def default[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], props: Partial[P] with ClassAttributes[T], children: ReactNode*): CElement[P, T] = js.native
  // DOM Element (has to be the last, because type checking stops at first overload that fits)
  def default[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T]): DOMElement[P, T] = js.native
  def default[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: DOMAttributes[T] with P, children: ReactNode*): DOMElement[P, T] = js.native
  // ReactHTMLElement, less specific
  def default[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T]): ReactHTMLElement[T] = js.native
  def default[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: ReactNode*): ReactHTMLElement[T] = js.native
  // SVGElement
  def default[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement): ReactSVGElement = js.native
  def default[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: ReactNode*): ReactSVGElement = js.native
  // DOM Elements
  // ReactHTMLElement
  @JSName("default")
  def default_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T]): DetailedReactHTMLElement[P, T] = js.native
  @JSName("default")
  def default_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: ReactNode*): DetailedReactHTMLElement[P, T] = js.native
}

