package typings.reactHyperscript

import typings.react.mod.Attributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ClassType
import typings.react.mod.ClassicComponent
import typings.react.mod.ClassicComponentClass
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentElement
import typings.react.mod.ComponentState
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.FunctionComponent
import typings.react.mod.FunctionComponentElement
import typings.react.mod.HTMLAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactSVGElement
import typings.react.mod.SVGAttributes
import typings.reactHyperscript.reactHyperscriptStrings.input
import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ReactElement = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReactElement]
  inline def apply(children: Children): ReactElement = ^.asInstanceOf[js.Dynamic].apply(children.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  inline def apply(
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.reactHyperscript.reactHyperscriptStrings.animate, typings.reactHyperscript.reactHyperscriptStrings.circle, typings.reactHyperscript.reactHyperscriptStrings.clipPath */ Any,
    children: Children
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  // dom elements with attributes
  // dom elements without attributes
  inline def apply(tag: input): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = ^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any]).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def apply(tag: input, attributes: ClassAttributes[HTMLInputElement] & InputHTMLAttributes[HTMLInputElement]): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def apply(
    tag: input,
    attributes: ClassAttributes[HTMLInputElement] & InputHTMLAttributes[HTMLInputElement],
    children: Children
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def apply(tag: input, attributes: Unit, children: Children): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def apply(tag: input, children: Children): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def apply[P /* <: js.Object */](component: String, props: P & Attributes, children: Children): ReactElement = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def apply[P /* <: js.Object */](component: String, props: Unit, children: Children): ReactElement = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def apply[P /* <: js.Object */](component: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]]): ComponentElement[P, ClassicComponent[P, ComponentState]] = ^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any]).asInstanceOf[ComponentElement[P, ClassicComponent[P, ComponentState]]]
  inline def apply[P /* <: js.Object */](
    component: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: P & (ClassAttributes[ClassicComponent[P, ComponentState]]),
    children: Children
  ): ComponentElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ComponentElement[P, ClassicComponent[P, ComponentState]]]
  inline def apply[P /* <: js.Object */](
    component: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (P & (ClassAttributes[ClassicComponent[P, ComponentState]])) | Children
  ): ComponentElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ComponentElement[P, ClassicComponent[P, ComponentState]]]
  inline def apply[P /* <: js.Object */](
    component: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Unit,
    children: Children
  ): ComponentElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ComponentElement[P, ClassicComponent[P, ComponentState]]]
  inline def apply[P /* <: js.Object */](component: ComponentClass[P, ComponentState]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  inline def apply[P /* <: js.Object */](component: ComponentClass[P, ComponentState], props: P & Attributes, children: Children): ReactElement = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def apply[P /* <: js.Object */](component: ComponentClass[P, ComponentState], props: (P & Attributes) | Children): ReactElement = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def apply[P /* <: js.Object */](component: ComponentClass[P, ComponentState], props: Unit, children: Children): ReactElement = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  // react components with props
  // react components without props
  inline def apply[P /* <: js.Object */](component: FunctionComponent[P]): FunctionComponentElement[P] = ^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any]).asInstanceOf[FunctionComponentElement[P]]
  inline def apply[P /* <: js.Object */](component: FunctionComponent[P], props: P & Attributes, children: Children): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
  inline def apply[P /* <: js.Object */](component: FunctionComponent[P], props: (P & Attributes) | Children): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
  inline def apply[P /* <: js.Object */](component: FunctionComponent[P], props: Unit, children: Children): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
  inline def apply[T /* <: Element */](tag: String): DOMElement[DOMAttributes[T], T] = ^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any]).asInstanceOf[DOMElement[DOMAttributes[T], T]]
  inline def apply[T /* <: Element */](tag: String, children: Children): DOMElement[DOMAttributes[T], T] = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[DOMAttributes[T], T]]
  inline def apply[T /* <: SVGElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.reactHyperscript.reactHyperscriptStrings.animate, typings.reactHyperscript.reactHyperscriptStrings.circle, typings.reactHyperscript.reactHyperscriptStrings.clipPath */ Any,
    attributes: ClassAttributes[T] & SVGAttributes[T]
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  inline def apply[T /* <: SVGElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.reactHyperscript.reactHyperscriptStrings.animate, typings.reactHyperscript.reactHyperscriptStrings.circle, typings.reactHyperscript.reactHyperscriptStrings.clipPath */ Any,
    attributes: ClassAttributes[T] & SVGAttributes[T],
    children: Children
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  inline def apply[T /* <: SVGElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.reactHyperscript.reactHyperscriptStrings.animate, typings.reactHyperscript.reactHyperscriptStrings.circle, typings.reactHyperscript.reactHyperscriptStrings.clipPath */ Any,
    attributes: Unit,
    children: Children
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  inline def apply[T /* <: HTMLElement */, P /* <: HTMLAttributes[T] */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with typings.reactHyperscript.reactHyperscriptStrings.a, typings.reactHyperscript.reactHyperscriptStrings.abbr, typings.reactHyperscript.reactHyperscriptStrings.address */ Any,
    attributes: ClassAttributes[T] & P,
    children: Children
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
  
  @JSImport("react-hyperscript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Children = js.Array[ReactNode] | Double | String
}
