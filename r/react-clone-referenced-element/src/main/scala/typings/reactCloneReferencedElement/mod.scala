package typings.reactCloneReferencedElement

import typings.react.mod.Attributes
import typings.react.mod.CElement
import typings.react.mod.ClassAttributes
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.FunctionComponentElement
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactHTMLElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactSVGElement
import typings.react.mod.SVGAttributes
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Partial
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-clone-referenced-element", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // Custom components
  def default[P](element: FunctionComponentElement[P], props: Partial[P] with Attributes, children: ReactNode*): FunctionComponentElement[P] = js.native
  def default[P](element: FunctionComponentElement[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): FunctionComponentElement[P] = js.native
  def default[P](element: ReactElement, props: Partial[P] with Attributes, children: ReactNode*): ReactElement = js.native
  def default[P](element: ReactElement, props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
  def default[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], props: Partial[P] with ClassAttributes[T], children: ReactNode*): CElement[P, T] = js.native
  def default[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactNode*): CElement[P, T] = js.native
  // DOM Element (has to be the last, because type checking stops at first overload that fits)
  def default[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: DOMAttributes[T] with P, children: ReactNode*): DOMElement[P, T] = js.native
  def default[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactNode*): DOMElement[P, T] = js.native
  // DOM Elements
  // ReactHTMLElement
  def default[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: ReactNode*): DetailedReactHTMLElement[P, T] = js.native
  def default[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactNode*): DetailedReactHTMLElement[P, T] = js.native
  // SVGElement
  def default[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: ReactNode*): ReactSVGElement = js.native
  def default[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactSVGElement = js.native
  // ReactHTMLElement, less specific
  @JSName("default")
  def default_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: ReactNode*): ReactHTMLElement[T] = js.native
  @JSName("default")
  def default_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactHTMLElement[T] = js.native
}

