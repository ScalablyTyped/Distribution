package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def Children: typings.react.mod.ReactChildren = typings.react.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Children").asInstanceOf[typings.react.mod.ReactChildren]

@scala.inline
def Fragment: typings.react.mod.ExoticComponent[typings.react.anon.Children] = typings.react.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Fragment").asInstanceOf[typings.react.mod.ExoticComponent[typings.react.anon.Children]]

@scala.inline
def Profiler: typings.react.mod.ExoticComponent[typings.react.mod.ProfilerProps] = typings.react.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Profiler").asInstanceOf[typings.react.mod.ExoticComponent[typings.react.mod.ProfilerProps]]

@scala.inline
def StrictMode: typings.react.mod.ExoticComponent[typings.react.anon.Children] = typings.react.mod.^.asInstanceOf[js.Dynamic].selectDynamic("StrictMode").asInstanceOf[typings.react.mod.ExoticComponent[typings.react.anon.Children]]

/**
  * This feature is not yet available for server-side rendering.
  * Suspense support will be added in a later release.
  */
@scala.inline
def Suspense: typings.react.mod.ExoticComponent[typings.react.mod.SuspenseProps] = typings.react.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Suspense").asInstanceOf[typings.react.mod.ExoticComponent[typings.react.mod.SuspenseProps]]

// Custom components
@scala.inline
def cloneElement[P](
  element: typings.react.mod.FunctionComponentElement[P],
  props: typings.std.Partial[P] & typings.react.mod.Attributes,
  children: typings.react.mod.ReactNode*
): typings.react.mod.FunctionComponentElement[P] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.FunctionComponentElement[P]]
@scala.inline
def cloneElement[P](
  element: typings.react.mod.FunctionComponentElement[P],
  props: scala.Unit,
  children: typings.react.mod.ReactNode*
): typings.react.mod.FunctionComponentElement[P] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.FunctionComponentElement[P]]
@scala.inline
def cloneElement[P](
  element: typings.react.mod.ReactElement,
  props: typings.std.Partial[P] & typings.react.mod.Attributes,
  children: typings.react.mod.ReactNode*
): typings.react.mod.ReactElement = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactElement]
@scala.inline
def cloneElement[P](element: typings.react.mod.ReactElement, props: scala.Unit, children: typings.react.mod.ReactNode*): typings.react.mod.ReactElement = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactElement]
@scala.inline
def cloneElement[P, T /* <: typings.react.mod.Component[P, typings.react.mod.ComponentState, js.Any] */](
  element: typings.react.mod.CElement[P, T],
  props: typings.std.Partial[P] & typings.react.mod.ClassAttributes[T],
  children: typings.react.mod.ReactNode*
): typings.react.mod.CElement[P, T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.CElement[P, T]]
@scala.inline
def cloneElement[P, T /* <: typings.react.mod.Component[P, typings.react.mod.ComponentState, js.Any] */](
  element: typings.react.mod.CElement[P, T],
  props: scala.Unit,
  children: typings.react.mod.ReactNode*
): typings.react.mod.CElement[P, T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.CElement[P, T]]
// DOM Element (has to be the last, because type checking stops at first overload that fits)
@scala.inline
def cloneElement[P /* <: typings.react.mod.DOMAttributes[T] */, T /* <: typings.std.Element */](
  element: typings.react.mod.DOMElement[P, T],
  props: typings.react.mod.DOMAttributes[T] & P,
  children: typings.react.mod.ReactNode*
): typings.react.mod.DOMElement[P, T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.DOMElement[P, T]]
@scala.inline
def cloneElement[P /* <: typings.react.mod.DOMAttributes[T] */, T /* <: typings.std.Element */](
  element: typings.react.mod.DOMElement[P, T],
  props: scala.Unit,
  children: typings.react.mod.ReactNode*
): typings.react.mod.DOMElement[P, T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.DOMElement[P, T]]
// DOM Elements
// ReactHTMLElement
@scala.inline
def cloneElement[P /* <: typings.react.mod.HTMLAttributes[T] */, T /* <: typings.std.HTMLElement */](
  element: typings.react.mod.DetailedReactHTMLElement[P, T],
  props: P,
  children: typings.react.mod.ReactNode*
): typings.react.mod.DetailedReactHTMLElement[P, T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.DetailedReactHTMLElement[P, T]]
@scala.inline
def cloneElement[P /* <: typings.react.mod.HTMLAttributes[T] */, T /* <: typings.std.HTMLElement */](
  element: typings.react.mod.DetailedReactHTMLElement[P, T],
  props: scala.Unit,
  children: typings.react.mod.ReactNode*
): typings.react.mod.DetailedReactHTMLElement[P, T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.DetailedReactHTMLElement[P, T]]
// SVGElement
@scala.inline
def cloneElement[P /* <: typings.react.mod.SVGAttributes[T] */, T /* <: typings.std.SVGElement */](element: typings.react.mod.ReactSVGElement, props: P, children: typings.react.mod.ReactNode*): typings.react.mod.ReactSVGElement = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactSVGElement]
@scala.inline
def cloneElement[P /* <: typings.react.mod.SVGAttributes[T] */, T /* <: typings.std.SVGElement */](
  element: typings.react.mod.ReactSVGElement,
  props: scala.Unit,
  children: typings.react.mod.ReactNode*
): typings.react.mod.ReactSVGElement = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactSVGElement]

// ReactHTMLElement, less specific
@scala.inline
def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: typings.react.mod.HTMLAttributes[T] */, T /* <: typings.std.HTMLElement */](element: typings.react.mod.ReactHTMLElement[T], props: P, children: typings.react.mod.ReactNode*): typings.react.mod.ReactHTMLElement[T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactHTMLElement[T]]
@scala.inline
def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: typings.react.mod.HTMLAttributes[T] */, T /* <: typings.std.HTMLElement */](
  element: typings.react.mod.ReactHTMLElement[T],
  props: scala.Unit,
  children: typings.react.mod.ReactNode*
): typings.react.mod.ReactHTMLElement[T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactHTMLElement[T]]

@scala.inline
def createContext[T](
  // If you thought this should be optional, see
// https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
defaultValue: T
): typings.react.mod.Context[T] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.Context[T]]

@scala.inline
def createElement[P /* <: js.Object */](
  `type`: java.lang.String,
  props: typings.react.mod.Attributes & P,
  children: typings.react.mod.ReactNode*
): typings.react.mod.ReactElement = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactElement]
@scala.inline
def createElement[P /* <: js.Object */](`type`: java.lang.String, props: scala.Null, children: typings.react.mod.ReactNode*): typings.react.mod.ReactElement = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactElement]
@scala.inline
def createElement[P /* <: js.Object */](`type`: java.lang.String, props: scala.Unit, children: typings.react.mod.ReactNode*): typings.react.mod.ReactElement = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactElement]
@scala.inline
def createElement[P /* <: js.Object */](
  `type`: typings.react.mod.ClassType[
  P, 
  typings.react.mod.ClassicComponent[P, typings.react.mod.ComponentState], 
  typings.react.mod.ClassicComponentClass[P]
],
  props: (typings.react.mod.ClassAttributes[typings.react.mod.ClassicComponent[P, typings.react.mod.ComponentState]]) & P,
  children: typings.react.mod.ReactNode*
): typings.react.mod.CElement[P, typings.react.mod.ClassicComponent[P, typings.react.mod.ComponentState]] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.CElement[P, typings.react.mod.ClassicComponent[P, typings.react.mod.ComponentState]]]
@scala.inline
def createElement[P /* <: js.Object */](
  `type`: typings.react.mod.ClassType[
  P, 
  typings.react.mod.ClassicComponent[P, typings.react.mod.ComponentState], 
  typings.react.mod.ClassicComponentClass[P]
],
  props: scala.Null,
  children: typings.react.mod.ReactNode*
): typings.react.mod.CElement[P, typings.react.mod.ClassicComponent[P, typings.react.mod.ComponentState]] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.CElement[P, typings.react.mod.ClassicComponent[P, typings.react.mod.ComponentState]]]
@scala.inline
def createElement[P /* <: js.Object */](
  `type`: typings.react.mod.ClassType[
  P, 
  typings.react.mod.ClassicComponent[P, typings.react.mod.ComponentState], 
  typings.react.mod.ClassicComponentClass[P]
],
  props: scala.Unit,
  children: typings.react.mod.ReactNode*
): typings.react.mod.CElement[P, typings.react.mod.ClassicComponent[P, typings.react.mod.ComponentState]] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.CElement[P, typings.react.mod.ClassicComponent[P, typings.react.mod.ComponentState]]]
@scala.inline
def createElement[P /* <: js.Object */](
  `type`: typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState],
  props: typings.react.mod.Attributes & P,
  children: typings.react.mod.ReactNode*
): typings.react.mod.ReactElement = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactElement]
@scala.inline
def createElement[P /* <: js.Object */](
  `type`: typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState],
  props: scala.Null,
  children: typings.react.mod.ReactNode*
): typings.react.mod.ReactElement = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactElement]
@scala.inline
def createElement[P /* <: js.Object */](
  `type`: typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState],
  props: scala.Unit,
  children: typings.react.mod.ReactNode*
): typings.react.mod.ReactElement = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactElement]
// Custom components
@scala.inline
def createElement[P /* <: js.Object */](
  `type`: typings.react.mod.FunctionComponent[P],
  props: typings.react.mod.Attributes & P,
  children: typings.react.mod.ReactNode*
): typings.react.mod.FunctionComponentElement[P] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.FunctionComponentElement[P]]
@scala.inline
def createElement[P /* <: js.Object */](
  `type`: typings.react.mod.FunctionComponent[P],
  props: scala.Null,
  children: typings.react.mod.ReactNode*
): typings.react.mod.FunctionComponentElement[P] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.FunctionComponentElement[P]]
@scala.inline
def createElement[P /* <: js.Object */](
  `type`: typings.react.mod.FunctionComponent[P],
  props: scala.Unit,
  children: typings.react.mod.ReactNode*
): typings.react.mod.FunctionComponentElement[P] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.FunctionComponentElement[P]]
@scala.inline
def createElement[P /* <: typings.react.mod.SVGAttributes[T] */, T /* <: typings.std.SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
  props: typings.react.mod.ClassAttributes[T] & P,
  children: typings.react.mod.ReactNode*
): typings.react.mod.ReactSVGElement = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactSVGElement]
@scala.inline
def createElement[P /* <: typings.react.mod.SVGAttributes[T] */, T /* <: typings.std.SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
  props: scala.Null,
  children: typings.react.mod.ReactNode*
): typings.react.mod.ReactSVGElement = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactSVGElement]
@scala.inline
def createElement[P /* <: typings.react.mod.SVGAttributes[T] */, T /* <: typings.std.SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
  props: scala.Unit,
  children: typings.react.mod.ReactNode*
): typings.react.mod.ReactSVGElement = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactSVGElement]
@scala.inline
def createElement[P /* <: js.Object */, T /* <: typings.react.mod.Component[P, typings.react.mod.ComponentState, js.Any] */, C /* <: typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState] */](
  `type`: typings.react.mod.ClassType[P, T, C],
  props: typings.react.mod.ClassAttributes[T] & P,
  children: typings.react.mod.ReactNode*
): typings.react.mod.CElement[P, T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.CElement[P, T]]
@scala.inline
def createElement[P /* <: js.Object */, T /* <: typings.react.mod.Component[P, typings.react.mod.ComponentState, js.Any] */, C /* <: typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState] */](
  `type`: typings.react.mod.ClassType[P, T, C],
  props: scala.Null,
  children: typings.react.mod.ReactNode*
): typings.react.mod.CElement[P, T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.CElement[P, T]]
@scala.inline
def createElement[P /* <: js.Object */, T /* <: typings.react.mod.Component[P, typings.react.mod.ComponentState, js.Any] */, C /* <: typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState] */](
  `type`: typings.react.mod.ClassType[P, T, C],
  props: scala.Unit,
  children: typings.react.mod.ReactNode*
): typings.react.mod.CElement[P, T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.CElement[P, T]]

@scala.inline
def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: typings.react.mod.DOMAttributes[T] */, T /* <: typings.std.Element */](
  `type`: java.lang.String,
  props: typings.react.mod.ClassAttributes[T] & P,
  children: typings.react.mod.ReactNode*
): typings.react.mod.DOMElement[P, T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.DOMElement[P, T]]
@scala.inline
def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: typings.react.mod.DOMAttributes[T] */, T /* <: typings.std.Element */](`type`: java.lang.String, props: scala.Null, children: typings.react.mod.ReactNode*): typings.react.mod.DOMElement[P, T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.DOMElement[P, T]]
@scala.inline
def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: typings.react.mod.DOMAttributes[T] */, T /* <: typings.std.Element */](`type`: java.lang.String, props: scala.Unit, children: typings.react.mod.ReactNode*): typings.react.mod.DOMElement[P, T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.DOMElement[P, T]]

@scala.inline
def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: typings.react.mod.HTMLAttributes[T] */, T /* <: typings.std.HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
  props: typings.react.mod.ClassAttributes[T] & P,
  children: typings.react.mod.ReactNode*
): typings.react.mod.DetailedReactHTMLElement[P, T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.DetailedReactHTMLElement[P, T]]
@scala.inline
def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: typings.react.mod.HTMLAttributes[T] */, T /* <: typings.std.HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
  props: scala.Null,
  children: typings.react.mod.ReactNode*
): typings.react.mod.DetailedReactHTMLElement[P, T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.DetailedReactHTMLElement[P, T]]
@scala.inline
def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: typings.react.mod.HTMLAttributes[T] */, T /* <: typings.std.HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
  props: scala.Unit,
  children: typings.react.mod.ReactNode*
): typings.react.mod.DetailedReactHTMLElement[P, T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.DetailedReactHTMLElement[P, T]]

@scala.inline
def createElement_P_Object_ReactElement[P /* <: js.Object */](
  `type`: typings.react.mod.FunctionComponent[P],
  props: typings.react.mod.Attributes & P,
  children: typings.react.mod.ReactNode*
): typings.react.mod.ReactElement = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactElement]
@scala.inline
def createElement_P_Object_ReactElement[P /* <: js.Object */](
  `type`: typings.react.mod.FunctionComponent[P],
  props: scala.Null,
  children: typings.react.mod.ReactNode*
): typings.react.mod.ReactElement = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactElement]
@scala.inline
def createElement_P_Object_ReactElement[P /* <: js.Object */](
  `type`: typings.react.mod.FunctionComponent[P],
  props: scala.Unit,
  children: typings.react.mod.ReactNode*
): typings.react.mod.ReactElement = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactElement]

// DOM Elements
// TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
@scala.inline
def createElement_input(
  `type`: typings.react.reactStrings.input,
  props: typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement] & typings.react.mod.ClassAttributes[typings.std.HTMLInputElement],
  children: typings.react.mod.ReactNode*
): typings.react.mod.DetailedReactHTMLElement[
typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
typings.std.HTMLInputElement] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.DetailedReactHTMLElement[
typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
typings.std.HTMLInputElement]]
@scala.inline
def createElement_input(
  `type`: typings.react.reactStrings.input,
  props: scala.Null,
  children: typings.react.mod.ReactNode*
): typings.react.mod.DetailedReactHTMLElement[
typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
typings.std.HTMLInputElement] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.DetailedReactHTMLElement[
typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
typings.std.HTMLInputElement]]
@scala.inline
def createElement_input(
  `type`: typings.react.reactStrings.input,
  props: scala.Unit,
  children: typings.react.mod.ReactNode*
): typings.react.mod.DetailedReactHTMLElement[
typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
typings.std.HTMLInputElement] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.DetailedReactHTMLElement[
typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
typings.std.HTMLInputElement]]

@scala.inline
def createFactory(`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any): typings.react.mod.SVGFactory = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.SVGFactory]
@scala.inline
def createFactory[P](
  `type`: typings.react.mod.ClassType[
  P, 
  typings.react.mod.ClassicComponent[P, typings.react.mod.ComponentState], 
  typings.react.mod.ClassicComponentClass[P]
]
): typings.react.mod.CFactory[P, typings.react.mod.ClassicComponent[P, typings.react.mod.ComponentState]] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.CFactory[P, typings.react.mod.ClassicComponent[P, typings.react.mod.ComponentState]]]
@scala.inline
def createFactory[P](`type`: typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState]): typings.react.mod.Factory[P] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.Factory[P]]
// Custom components
@scala.inline
def createFactory[P](`type`: typings.react.mod.FunctionComponent[P]): typings.react.mod.FunctionComponentFactory[P] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.FunctionComponentFactory[P]]
@scala.inline
def createFactory[P /* <: typings.react.mod.DOMAttributes[T] */, T /* <: typings.std.Element */](`type`: java.lang.String): typings.react.mod.DOMFactory[P, T] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.DOMFactory[P, T]]
@scala.inline
def createFactory[P, T /* <: typings.react.mod.Component[P, typings.react.mod.ComponentState, js.Any] */, C /* <: typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState] */](`type`: typings.react.mod.ClassType[P, T, C]): typings.react.mod.CFactory[P, T] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.CFactory[P, T]]

//
// Top Level API
// ----------------------------------------------------------------------
// DOM Elements
@scala.inline
def createFactory_T_HTMLElement_HTMLFactory[T /* <: typings.std.HTMLElement */](`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any): typings.react.mod.HTMLFactory[T] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.HTMLFactory[T]]

@scala.inline
def createRef[T](): typings.react.mod.RefObject[T] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[typings.react.mod.RefObject[T]]

@scala.inline
def forwardRef[T, P](render: typings.react.mod.ForwardRefRenderFunction[T, P]): typings.react.mod.ForwardRefExoticComponent[typings.react.mod.PropsWithoutRef[P] & typings.react.mod.RefAttributes[T]] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ForwardRefExoticComponent[typings.react.mod.PropsWithoutRef[P] & typings.react.mod.RefAttributes[T]]]

@scala.inline
def isValidElement[P](): /* is react.react.ReactElement */ scala.Boolean = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")().asInstanceOf[/* is react.react.ReactElement */ scala.Boolean]
@scala.inline
def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ scala.Boolean = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.ReactElement */ scala.Boolean]

@scala.inline
def `lazy`[T /* <: typings.react.mod.ComponentType[js.Any] */](factory: js.Function0[js.Promise[typings.react.anon.Default[T]]]): typings.react.mod.LazyExoticComponent[T] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(factory.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.LazyExoticComponent[T]]

@scala.inline
def memo[T /* <: typings.react.mod.ComponentType[js.Any] */](Component: T): typings.react.mod.MemoExoticComponent[T] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.MemoExoticComponent[T]]
@scala.inline
def memo[T /* <: typings.react.mod.ComponentType[js.Any] */](
  Component: T,
  propsAreEqual: js.Function2[
  /* prevProps */ typings.react.mod.ComponentProps[T], 
  /* nextProps */ typings.react.mod.ComponentProps[T], 
  scala.Boolean
]
): typings.react.mod.MemoExoticComponent[T] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.MemoExoticComponent[T]]
@scala.inline
def memo[P /* <: js.Object */](Component: typings.react.mod.SFC[P]): typings.react.mod.NamedExoticComponent[P] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.NamedExoticComponent[P]]
@scala.inline
def memo[P /* <: js.Object */](
  Component: typings.react.mod.SFC[P],
  propsAreEqual: js.Function2[
  /* prevProps */ typings.react.mod.PropsWithChildren[P], 
  /* nextProps */ typings.react.mod.PropsWithChildren[P], 
  scala.Boolean
]
): typings.react.mod.NamedExoticComponent[P] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.NamedExoticComponent[P]]

@scala.inline
def unstableStartTransition(scope: typings.react.experimentalMod.reactAugmentingMod.TransitionFunction): scala.Unit = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unstable_startTransition")(scope.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def unstableSuspenseList: typings.react.mod.ExoticComponent[typings.react.experimentalMod.reactAugmentingMod.SuspenseListProps] = typings.react.mod.^.asInstanceOf[js.Dynamic].selectDynamic("unstable_SuspenseList").asInstanceOf[typings.react.mod.ExoticComponent[typings.react.experimentalMod.reactAugmentingMod.SuspenseListProps]]

@scala.inline
def unstableUseDeferredValue[T](value: T): T = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useDeferredValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]

@scala.inline
def unstableUseOpaqueIdentifier(): typings.react.experimentalMod.reactAugmentingMod.OpaqueIdentifier = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useOpaqueIdentifier")().asInstanceOf[typings.react.experimentalMod.reactAugmentingMod.OpaqueIdentifier]

@scala.inline
def unstableUseTransition(): js.Tuple2[
typings.react.experimentalMod.reactAugmentingMod.TransitionStartFunction, 
scala.Boolean] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useTransition")().asInstanceOf[js.Tuple2[
typings.react.experimentalMod.reactAugmentingMod.TransitionStartFunction, 
scala.Boolean]]
@scala.inline
def unstableUseTransition(config: typings.react.experimentalMod.reactAugmentingMod.SuspenseConfig): js.Tuple2[
typings.react.experimentalMod.reactAugmentingMod.TransitionStartFunction, 
scala.Boolean] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useTransition")(config.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
typings.react.experimentalMod.reactAugmentingMod.TransitionStartFunction, 
scala.Boolean]]

@scala.inline
def unstableWithSuspenseConfig(scope: js.Function0[js.UndefOr[scala.Unit]]): scala.Unit = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unstable_withSuspenseConfig")(scope.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def unstableWithSuspenseConfig(
  scope: js.Function0[js.UndefOr[scala.Unit]],
  config: typings.react.experimentalMod.reactAugmentingMod.SuspenseConfig
): scala.Unit = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unstable_withSuspenseConfig")(scope.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

// I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
// useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
/**
  * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
  * has changed.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usecallback
  */
// TODO (TypeScript 3.0): <T extends (...args: never[]) => unknown>
@scala.inline
def useCallback[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](callback: T, deps: typings.react.mod.DependencyList): T = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]

// This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
/**
  * Accepts a context object (the value returned from `React.createContext`) and returns the current
  * context value, as given by the nearest context provider for the given context.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usecontext
  */
@scala.inline
def useContext[T](context: typings.react.mod.Context[T]): T = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[T]

/**
  * `useDebugValue` can be used to display a label for custom hooks in React DevTools.
  *
  * NOTE: We don’t recommend adding debug values to every custom hook.
  * It’s most valuable for custom hooks that are part of shared libraries.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usedebugvalue
  */
// the name of the custom hook is itself derived from the function name at runtime:
// it's just the function name without the "use" prefix.
@scala.inline
def useDebugValue[T](value: T): scala.Unit = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def useDebugValue[T](value: T, format: js.Function1[/* value */ T, js.Any]): scala.Unit = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/**
  * Accepts a function that contains imperative, possibly effectful code.
  *
  * @param effect Imperative function that can return a cleanup function
  * @param deps If present, effect will only activate if the values in the list change.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#useeffect
  */
@scala.inline
def useEffect(effect: typings.react.mod.EffectCallback): scala.Unit = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def useEffect(effect: typings.react.mod.EffectCallback, deps: typings.react.mod.DependencyList): scala.Unit = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def useImperativeHandle[T, R /* <: T */](ref: scala.Unit, init: js.Function0[R]): scala.Unit = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def useImperativeHandle[T, R /* <: T */](ref: scala.Unit, init: js.Function0[R], deps: typings.react.mod.DependencyList): scala.Unit = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: this does not accept strings, but this will have to be fixed by removing strings from type Ref<T>
/**
  * `useImperativeHandle` customizes the instance value that is exposed to parent components when using
  * `ref`. As always, imperative code using refs should be avoided in most cases.
  *
  * `useImperativeHandle` should be used with `React.forwardRef`.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#useimperativehandle
  */
@scala.inline
def useImperativeHandle[T, R /* <: T */](ref: typings.react.mod.Ref[T], init: js.Function0[R]): scala.Unit = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def useImperativeHandle[T, R /* <: T */](ref: typings.react.mod.Ref[T], init: js.Function0[R], deps: typings.react.mod.DependencyList): scala.Unit = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/**
  * The signature is identical to `useEffect`, but it fires synchronously after all DOM mutations.
  * Use this to read layout from the DOM and synchronously re-render. Updates scheduled inside
  * `useLayoutEffect` will be flushed synchronously, before the browser has a chance to paint.
  *
  * Prefer the standard `useEffect` when possible to avoid blocking visual updates.
  *
  * If you’re migrating code from a class component, `useLayoutEffect` fires in the same phase as
  * `componentDidMount` and `componentDidUpdate`.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#uselayouteffect
  */
@scala.inline
def useLayoutEffect(effect: typings.react.mod.EffectCallback): scala.Unit = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def useLayoutEffect(effect: typings.react.mod.EffectCallback, deps: typings.react.mod.DependencyList): scala.Unit = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/**
  * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
  *
  * Usage note: if calling `useMemo` with a referentially stable function, also give it as the input in
  * the second argument.
  *
  * ```ts
  * function expensive () { ... }
  *
  * function Component () {
  *   const expensiveResult = useMemo(expensive, [expensive])
  *   return ...
  * }
  * ```
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usememo
  */
// allow undefined, but don't make it optional as that is very likely a mistake
@scala.inline
def useMemo[T](factory: js.Function0[T]): T = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any]).asInstanceOf[T]
@scala.inline
def useMemo[T](factory: js.Function0[T], deps: typings.react.mod.DependencyList): T = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]

/**
  * An alternative to `useState`.
  *
  * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
  * multiple sub-values. It also lets you optimize performance for components that trigger deep
  * updates because you can pass `dispatch` down instead of callbacks.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usereducer
  */
// overload where dispatch could accept 0 arguments.
@scala.inline
def useReducer[R /* <: typings.react.mod.ReducerWithoutAction[js.Any] */](
  reducer: R,
  initializerArg: typings.react.mod.ReducerStateWithoutAction[R],
  initializer: scala.Unit
): js.Tuple2[
typings.react.mod.ReducerStateWithoutAction[R], 
typings.react.mod.DispatchWithoutAction] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
typings.react.mod.ReducerStateWithoutAction[R], 
typings.react.mod.DispatchWithoutAction]]
/**
  * An alternative to `useState`.
  *
  * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
  * multiple sub-values. It also lets you optimize performance for components that trigger deep
  * updates because you can pass `dispatch` down instead of callbacks.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usereducer
  */
// overload where dispatch could accept 0 arguments.
@scala.inline
def useReducer[R /* <: typings.react.mod.ReducerWithoutAction[js.Any] */, I](
  reducer: R,
  initializerArg: I,
  initializer: js.Function1[/* arg */ I, typings.react.mod.ReducerStateWithoutAction[R]]
): js.Tuple2[
typings.react.mod.ReducerStateWithoutAction[R], 
typings.react.mod.DispatchWithoutAction] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
typings.react.mod.ReducerStateWithoutAction[R], 
typings.react.mod.DispatchWithoutAction]]

/**
  * An alternative to `useState`.
  *
  * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
  * multiple sub-values. It also lets you optimize performance for components that trigger deep
  * updates because you can pass `dispatch` down instead of callbacks.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usereducer
  */
// I'm not sure if I keep this 2-ary or if I make it (2,3)-ary; it's currently (2,3)-ary.
// The Flow types do have an overload for 3-ary invocation with undefined initializer.
// NOTE: without the ReducerState indirection, TypeScript would reduce S to be the most common
// supertype between the reducer's return type and the initialState (or the initializer's return type),
// which would prevent autocompletion from ever working.
// TODO: double-check if this weird overload logic is necessary. It is possible it's either a bug
// in older versions, or a regression in newer versions of the typescript completion service.
@scala.inline
def useReducer_R_ReducerAnyAny[R /* <: typings.react.mod.Reducer[js.Any, js.Any] */](reducer: R, initialState: typings.react.mod.ReducerState[R], initializer: scala.Unit): js.Tuple2[
typings.react.mod.ReducerState[R], 
typings.react.mod.Dispatch[typings.react.mod.ReducerAction[R]]] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
typings.react.mod.ReducerState[R], 
typings.react.mod.Dispatch[typings.react.mod.ReducerAction[R]]]]

/**
  * An alternative to `useState`.
  *
  * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
  * multiple sub-values. It also lets you optimize performance for components that trigger deep
  * updates because you can pass `dispatch` down instead of callbacks.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usereducer
  */
// overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
// If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be omitted.
// the last overload effectively behaves as if the identity function (x => x) is the initializer.
// overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
@scala.inline
def useReducer_R_ReducerAnyAnyI[R /* <: typings.react.mod.Reducer[js.Any, js.Any] */, I](
  reducer: R,
  initializerArg: (I & typings.react.mod.ReducerState[R]) | I,
  initializer: js.Function1[
  (/* arg */ I & typings.react.mod.ReducerState[R]) | (/* arg */ I), 
  typings.react.mod.ReducerState[R]
]
): js.Tuple2[
typings.react.mod.ReducerState[R], 
typings.react.mod.Dispatch[typings.react.mod.ReducerAction[R]]] = (typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
typings.react.mod.ReducerState[R], 
typings.react.mod.Dispatch[typings.react.mod.ReducerAction[R]]]]

// convenience overload for refs given as a ref prop as they typically start with a null value
/**
  * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
  * (`initialValue`). The returned object will persist for the full lifetime of the component.
  *
  * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
  * value around similar to how you’d use instance fields in classes.
  *
  * Usage note: if you need the result of useRef to be directly mutable, include `| null` in the type
  * of the generic argument.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#useref
  */
// TODO (TypeScript 3.0): <T extends unknown>
@scala.inline
def useRef[T](): typings.react.mod.RefObject[T] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[typings.react.mod.RefObject[T]]
@scala.inline
def useRef[T](initialValue: T): typings.react.mod.RefObject[T] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.RefObject[T]]

// convenience overload for potentially undefined initialValue / call with 0 arguments
// has a default to stop it from defaulting to {} instead
/**
  * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
  * (`initialValue`). The returned object will persist for the full lifetime of the component.
  *
  * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
  * value around similar to how you’d use instance fields in classes.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#useref
  */
// TODO (TypeScript 3.0): <T extends unknown>
@scala.inline
def useRef_T_MutableRefObject[T](): typings.react.mod.MutableRefObject[js.UndefOr[T]] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[typings.react.mod.MutableRefObject[js.UndefOr[T]]]
/**
  * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
  * (`initialValue`). The returned object will persist for the full lifetime of the component.
  *
  * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
  * value around similar to how you’d use instance fields in classes.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#useref
  */
// TODO (TypeScript 3.0): <T extends unknown>
@scala.inline
def useRef_T_MutableRefObject[T](initialValue: T): typings.react.mod.MutableRefObject[T] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.MutableRefObject[T]]

// convenience overload when first argument is omitted
/**
  * Returns a stateful value, and a function to update it.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usestate
  */
@scala.inline
def useState[S](): js.Tuple2[
js.UndefOr[S], 
typings.react.mod.Dispatch[typings.react.mod.SetStateAction[js.UndefOr[S]]]] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useState")().asInstanceOf[js.Tuple2[
js.UndefOr[S], 
typings.react.mod.Dispatch[typings.react.mod.SetStateAction[js.UndefOr[S]]]]]
/**
  * Returns a stateful value, and a function to update it.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usestate
  */
@scala.inline
def useState[S](initialState: S): js.Tuple2[S, typings.react.mod.Dispatch[typings.react.mod.SetStateAction[S]]] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, typings.react.mod.Dispatch[typings.react.mod.SetStateAction[S]]]]
@scala.inline
def useState[S](initialState: js.Function0[S]): js.Tuple2[S, typings.react.mod.Dispatch[typings.react.mod.SetStateAction[S]]] = typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, typings.react.mod.Dispatch[typings.react.mod.SetStateAction[S]]]]

@scala.inline
def version: java.lang.String = typings.react.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]

type AnimationEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.AnimationEvent[T]]

type AudioHTMLAttributes[T] = typings.react.mod.MediaHTMLAttributes[T]

type Booleanish = scala.Boolean

type CElement[P, T /* <: typings.react.mod.Component[P, typings.react.mod.ComponentState, js.Any] */] = typings.react.mod.ComponentElement[P, T]

type CFactory[P, T /* <: typings.react.mod.Component[P, typings.react.mod.ComponentState, js.Any] */] = typings.react.mod.ComponentFactory[P, T]

type ChangeEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.ChangeEvent[T]]

/**
  * We use an intersection type to infer multiple type parameters from
  * a single argument, which is useful for many top-level API defs.
  * See https://github.com/Microsoft/TypeScript/issues/7234 for more info.
  */
type ClassType[P, T /* <: typings.react.mod.Component[P, typings.react.mod.ComponentState, js.Any] */, C /* <: typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState] */] = C & (org.scalablytyped.runtime.Instantiable2[/* props */ P, /* context */ js.UndefOr[js.Any], T])

type ClassicElement[P] = typings.react.mod.CElement[P, typings.react.mod.ClassicComponent[P, typings.react.mod.ComponentState]]

type ClassicFactory[P] = typings.react.mod.CFactory[P, typings.react.mod.ClassicComponent[P, typings.react.mod.ComponentState]]

type ClipboardEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.ClipboardEvent[T]]

/**
  * NOTE: prefer ComponentPropsWithRef, if the ref is forwarded,
  * or ComponentPropsWithoutRef when refs are not supported.
  */
type ComponentProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] */ js.Any)

type ComponentPropsWithRef[T /* <: typings.react.mod.ElementType[js.Any] */] = typings.react.mod.PropsWithRef[typings.react.mod.ComponentProps[T]] | (typings.react.mod.PropsWithoutRef[js.Any] & typings.react.mod.RefAttributes[typings.std.InstanceType[T]])

type ComponentPropsWithoutRef[T /* <: typings.react.mod.ElementType[js.Any] */] = typings.react.mod.PropsWithoutRef[typings.react.mod.ComponentProps[T]]

type ComponentState = js.Any

type ComponentType[P] = (typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState]) | typings.react.mod.FunctionComponent[P]

type CompositionEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.CompositionEvent[T]]

type Consumer[T] = typings.react.mod.ExoticComponent[typings.react.mod.ConsumerProps[T]]

type ContextType[C /* <: typings.react.mod.Context[js.Any] */] = js.Any

// Any prop that has a default prop becomes optional, but its type is unchanged
// Undeclared default props are augmented into the resulting allowable attributes
// If declared props have indexed properties, ignore default props entirely as keyof gets widened
// Wrap in an outer-level conditional type to allow distribution over props that are unions
type Defaultize[P, D] = ((typings.std.Pick[
P, 
typings.std.Exclude[/* keyof P */ java.lang.String, /* keyof D */ java.lang.String]]) & (typings.std.Partial[
typings.std.Pick[
  P, 
  typings.std.Extract[/* keyof P */ java.lang.String, /* keyof D */ java.lang.String]
]]) & (typings.std.Partial[
typings.std.Pick[
  D, 
  typings.std.Exclude[/* keyof D */ java.lang.String, /* keyof P */ java.lang.String]
]])) | P

// TODO (TypeScript 3.0): ReadonlyArray<unknown>
type DependencyList = js.Array[js.Any]

type DetailedHTMLProps[E /* <: typings.react.mod.HTMLAttributes[T] */, T] = typings.react.mod.ClassAttributes[T] & E

// this technically does accept a second argument, but it's already under a deprecation warning
// and it's not even released so probably better to not define it.
type Dispatch[A] = js.Function1[/* value */ A, scala.Unit]

// Since action _can_ be undefined, dispatch may be called without any parameters.
type DispatchWithoutAction = js.Function0[scala.Unit]

type DragEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.DragEvent[T]]

// NOTE: callbacks are _only_ allowed to return either void, or a destructor.
// The destructor is itself only allowed to return void.
type EffectCallback = js.Function0[scala.Unit | js.Function0[js.UndefOr[scala.Unit]]]

/**
  * Gets the instance type for a React element. The instance will be different for various component types:
  *
  * - React class components will be the class instance. So if you had `class Foo extends React.Component<{}> {}`
  *   and used `React.ElementRef<typeof Foo>` then the type would be the instance of `Foo`.
  * - React stateless functional components do not have a backing instance and so `React.ElementRef<typeof Bar>`
  *   (when `Bar` is `function Bar() {}`) will give you the `undefined` type.
  * - JSX intrinsics like `div` will give you their DOM instance. For `React.ElementRef<'div'>` that would be
  *   `HTMLDivElement`. For `React.ElementRef<'input'>` that would be `HTMLInputElement`.
  * - React stateless functional components that forward a `ref` will give you the `ElementRef` of the forwarded
  *   to component.
  *
  * `C` must be the type _of_ a React component so you need to use typeof as in React.ElementRef<typeof MyComponent>.
  *
  * @todo In Flow, this works a little different with forwarded refs and the `AbstractComponent` that
  *       `React.forwardRef()` returns.
  */
type ElementRef[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any */] = js.Any

//
// React Elements
// ----------------------------------------------------------------------
type ElementType[P] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' ]: P extends react.react.<global>.JSX.IntrinsicElements[K]? K : never}['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view'] */ js.Any) | typings.react.mod.ComponentType[P]

//
// Event Handler Types
// ----------------------------------------------------------------------
type EventHandler[E /* <: typings.react.mod.SyntheticEvent[js.Any, typings.std.Event] */] = js.Function1[/* event */ E, scala.Unit]

type ExactlyAnyPropertyKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: react.react.IsExactlyAny<T[K]> extends true? K : never}[keyof T] */ js.Any

type FC[P] = typings.react.mod.FunctionComponent[P]

type FocusEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.FocusEvent[T]]

type FormEvent[T] = typings.react.mod.SyntheticEvent[T, typings.std.Event]

type FormEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.FormEvent[T]]

type ForwardedRef[T] = (js.Function1[/* instance */ T | scala.Null, scala.Unit]) | (typings.react.mod.MutableRefObject[T | scala.Null]) | scala.Null

type GetDerivedStateFromError[P, S] = /**
  * This lifecycle is invoked after an error has been thrown by a descendant component.
  * It receives the error that was thrown as a parameter and should return a value to update state.
  *
  * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
  */
js.Function1[/* error */ js.Any, typings.std.Partial[S] | scala.Null]

type GetDerivedStateFromProps[P, S] = /**
  * Returns an update to a component's state based on its new props and old state.
  *
  * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
  */
js.Function2[/* nextProps */ P, /* prevState */ S, typings.std.Partial[S] | scala.Null]

type HTMLFactory[T /* <: typings.std.HTMLElement */] = typings.react.mod.DetailedHTMLFactory[typings.react.mod.AllHTMLAttributes[T], T]

type JSXElementConstructor[P] = (js.Function1[/* props */ P, typings.react.mod.ReactElement | scala.Null]) | (org.scalablytyped.runtime.Instantiable1[/* props */ P, typings.react.mod.Component[P, js.Any, js.Any]])

type Key = java.lang.String | scala.Double

type KeyboardEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.KeyboardEvent[T]]

type LegacyRef[T] = java.lang.String | typings.react.mod.Ref[T]

// Try to resolve ill-defined props like for JS users: props can be any, or sometimes objects with properties of type any
type MergePropTypes[P, T] = ((typings.std.Pick[P, typings.react.mod.NotExactlyAnyPropertyKeys[P]]) & (typings.std.Pick[
T, 
typings.std.Exclude[/* keyof T */ java.lang.String, typings.react.mod.NotExactlyAnyPropertyKeys[P]]]) & (typings.std.Pick[
P, 
typings.std.Exclude[/* keyof P */ java.lang.String, /* keyof T */ java.lang.String]])) | P | T

type MouseEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.MouseEvent[T, typings.react.mod.NativeMouseEvent]]

type NativeAnimationEvent = typings.std.AnimationEvent

type NativeClipboardEvent = typings.std.ClipboardEvent

type NativeCompositionEvent = typings.std.CompositionEvent

type NativeDragEvent = typings.std.DragEvent

type NativeFocusEvent = typings.std.FocusEvent

type NativeKeyboardEvent = typings.std.KeyboardEvent

type NativeMouseEvent = typings.std.MouseEvent

type NativePointerEvent = typings.std.PointerEvent

type NativeTouchEvent = typings.std.TouchEvent

type NativeTransitionEvent = typings.std.TransitionEvent

type NativeUIEvent = typings.std.UIEvent

type NativeWheelEvent = typings.std.WheelEvent

type NotExactlyAnyPropertyKeys[T] = typings.std.Exclude[/* keyof T */ java.lang.String, typings.react.mod.ExactlyAnyPropertyKeys[T]]

type PointerEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.PointerEvent[T]]

/**
  * {@link https://github.com/bvaughn/rfcs/blob/profiler/text/0000-profiler.md#detailed-design | API}
  */
type ProfilerOnRenderCallback = js.Function7[
/* id */ java.lang.String, 
/* phase */ typings.react.reactStrings.mount | typings.react.reactStrings.update, 
/* actualDuration */ scala.Double, 
/* baseDuration */ scala.Double, 
/* startTime */ scala.Double, 
/* commitTime */ scala.Double, 
/* interactions */ typings.std.Set[typings.react.mod.SchedulerInteraction], 
scala.Unit]

type PropsWithChildren[P] = P & typings.react.anon.Children

/** Ensures that the props do not include string ref, which cannot be forwarded */
type PropsWithRef[P] = P | (typings.react.mod.PropsWithoutRef[P] & typings.react.anon.`1`)

/** Ensures that the props do not include ref at all */
type PropsWithoutRef[P] = P | (typings.std.Pick[
P, 
typings.std.Exclude[/* keyof P */ java.lang.String, typings.react.reactStrings.ref]])

// NOTE: only the Context object itself can get a displayName
// https://github.com/facebook/react-devtools/blob/e0b854e4c/backend/attachRendererFiber.js#L310-L325
type Provider[T] = typings.react.mod.ProviderExoticComponent[typings.react.mod.ProviderProps[T]]

type ReactChild = typings.react.mod.ReactElement | typings.react.mod.ReactText

type ReactComponentElement[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */, P] = typings.react.mod.ReactElement

type ReactEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.SyntheticEvent[T, typings.std.Event]]

type ReactFragment = js.Object | typings.react.mod.ReactNodeArray

// ReactHTML for ReactHTMLElement
type ReactHTMLElement[T /* <: typings.std.HTMLElement */] = typings.react.mod.DetailedReactHTMLElement[typings.react.mod.AllHTMLAttributes[T], T]

//
// Component API
// ----------------------------------------------------------------------
type ReactInstance = (typings.react.mod.Component[js.Any, js.Object, js.Any]) | typings.std.Element

type ReactManagedAttributes[C, P] = P | (typings.react.mod.Defaultize[
(typings.react.mod.MergePropTypes[P, typings.propTypes.mod.InferProps[js.Any]]) | P, 
js.Any]) | (typings.react.mod.MergePropTypes[P, typings.propTypes.mod.InferProps[js.Any]])

type ReactNode = js.UndefOr[
typings.react.mod.ReactChild | typings.react.mod.ReactFragment | typings.react.mod.ReactPortal | scala.Boolean]

//
// React Nodes
// http://facebook.github.io/react/docs/glossary.html
// ----------------------------------------------------------------------
type ReactText = java.lang.String | scala.Double

/**
  * @deprecated Please use `ElementType`
  */
type ReactType[P] = typings.react.mod.ElementType[P]

// Unlike redux, the actions _can_ be anything
type Reducer[S, A] = js.Function2[/* prevState */ S, /* action */ A, S]

type ReducerAction[R /* <: typings.react.mod.Reducer[js.Any, js.Any] */] = js.Any

// types used to try and prevent the compiler from reducing S
// to a supertype common with the second argument to useReducer()
type ReducerState[R /* <: typings.react.mod.Reducer[js.Any, js.Any] */] = js.Any

// The identity check is done with the SameValue algorithm (Object.is), which is stricter than ===
type ReducerStateWithoutAction[R /* <: typings.react.mod.ReducerWithoutAction[js.Any] */] = js.Any

// If useReducer accepts a reducer without action, dispatch may be called without any parameters.
type ReducerWithoutAction[S] = js.Function1[/* prevState */ S, S]

type Ref[T] = typings.react.mod.RefCallback[T] | typings.react.mod.RefObject[T] | scala.Null

type RefCallback[T] = js.Function1[/* instance */ T | scala.Null, scala.Unit]

/**
  * @deprecated Use ForwardRefRenderFunction. forwardRef doesn't accept a
  *             "real" component.
  */
type RefForwardingComponent[T, P] = typings.react.mod.ForwardRefRenderFunction[T, P]

type Requireable[T] = typings.propTypes.mod.Requireable[T]

//
// Class Interfaces
// ----------------------------------------------------------------------
/**
  * @deprecated as of recent React versions, function components can no
  * longer be considered 'stateless'. Please use `FunctionComponent` instead.
  *
  * @see [React Hooks](https://reactjs.org/docs/hooks-intro.html)
  */
type SFC[P] = typings.react.mod.FunctionComponent[P]

/**
  * @deprecated Please use `FunctionComponentElement`
  */
type SFCElement[P] = typings.react.mod.FunctionComponentElement[P]

/**
  * @deprecated Please use `FunctionComponentFactory`
  */
type SFCFactory[P] = typings.react.mod.FunctionComponentFactory[P]

//
// React Hooks
// ----------------------------------------------------------------------
// based on the code in https://github.com/facebook/react/pull/13968
// Unlike the class component setState, the updates are not allowed to be partial
type SetStateAction[S] = S | (js.Function1[/* prevState */ S, S])

/**
  * @deprecated as of recent React versions, function components can no
  * longer be considered 'stateless'. Please use `FunctionComponent` instead.
  *
  * @see [React Hooks](https://reactjs.org/docs/hooks-intro.html)
  */
type StatelessComponent[P] = typings.react.mod.FunctionComponent[P]

/**
  * currentTarget - a reference to the element on which the event listener is registered.
  *
  * target - a reference to the element from which the event was originally dispatched.
  * This might be a child element to the element on which the event listener is registered.
  * If you thought this should be `EventTarget & T`, see https://github.com/DefinitelyTyped/DefinitelyTyped/issues/11508#issuecomment-256045682
  */
type SyntheticEvent[T, E] = typings.react.mod.BaseSyntheticEvent[E, typings.std.EventTarget & T, typings.std.EventTarget]

type TouchEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.TouchEvent[T]]

type TransitionEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.TransitionEvent[T]]

type TransitionFunction = js.Function0[js.UndefOr[scala.Unit]]

type TransitionStartFunction = js.Function1[
/* callback */ typings.react.experimentalMod.reactAugmentingMod.TransitionFunction, 
scala.Unit]

type UIEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.UIEvent[T, typings.react.mod.NativeUIEvent]]

type VFC[P] = typings.react.mod.VoidFunctionComponent[P]

type ValidationMap[T] = typings.propTypes.mod.ValidationMap[T]

//
// React.PropTypes
// ----------------------------------------------------------------------
type Validator[T] = typings.propTypes.mod.Validator[T]

type WeakValidationMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? null extends T[K]? react.react.Validator<T[K] | null | undefined> : undefined extends T[K]? react.react.Validator<T[K] | null | undefined> : react.react.Validator<T[K]>}
  */ typings.react.reactStrings.WeakValidationMap & org.scalablytyped.runtime.TopLevel[js.Any]

type WheelEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.WheelEvent[T]]
