package typings.react.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.react.anon.Default
import typings.react.anon.UNDEFINEDVOIDONLY
import typings.react.mod.^
import typings.react.mod.global.JSX.ElementAttributesProperty
import typings.react.mod.global.JSX.ElementChildrenAttribute
import typings.react.mod.global.JSX.ElementClass
import typings.react.mod.global.JSX.IntrinsicAttributes
import typings.react.mod.global.JSX.IntrinsicClassAttributes
import typings.react.mod.global.JSX.IntrinsicElements
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.react.reactBooleans.`true`
import typings.react.reactStrings.input
import typings.react.reactStrings.mount
import typings.react.reactStrings.update
import typings.scheduler.tracingMod.Interaction
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.Partial
import typings.std.PromiseLike
import typings.std.SVGElement
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Fragment: ExoticComponent[typings.react.anon.Children] = ^.asInstanceOf[js.Dynamic].selectDynamic("Fragment").asInstanceOf[ExoticComponent[typings.react.anon.Children]]

inline def Profiler: ExoticComponent[ProfilerProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("Profiler").asInstanceOf[ExoticComponent[ProfilerProps]]

inline def StrictMode: ExoticComponent[typings.react.anon.Children] = ^.asInstanceOf[js.Dynamic].selectDynamic("StrictMode").asInstanceOf[ExoticComponent[typings.react.anon.Children]]

inline def Suspense: ExoticComponent[SuspenseProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("Suspense").asInstanceOf[ExoticComponent[SuspenseProps]]

inline def SuspenseList: ExoticComponent[typings.react.experimentalMod.reactAugmentingMod.SuspenseListProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("SuspenseList").asInstanceOf[ExoticComponent[typings.react.experimentalMod.reactAugmentingMod.SuspenseListProps]]

inline def cache[CachedFunction /* <: js.Function */](fn: CachedFunction): CachedFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("cache")(fn.asInstanceOf[js.Any]).asInstanceOf[CachedFunction]

// Custom components
inline def cloneElement[P](element: FunctionComponentElement[P], props: Partial[P] & Attributes, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def cloneElement[P](element: FunctionComponentElement[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def cloneElement[P](element: ReactElement, props: Partial[P] & Attributes, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
inline def cloneElement[P](element: ReactElement, props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
inline def cloneElement[P, T /* <: Component[P, ComponentState, Any] */](element: CElement[P, T], props: Partial[P] & ClassAttributes[T], children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
inline def cloneElement[P, T /* <: Component[P, ComponentState, Any] */](element: CElement[P, T], props: Unit, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
// DOM Element (has to be the last, because type checking stops at first overload that fits)
inline def cloneElement[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: DOMAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
inline def cloneElement[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: Unit, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
// ReactHTMLElement, less specific
inline def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: ReactNode*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactHTMLElement[T]]
inline def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: Unit, children: ReactNode*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactHTMLElement[T]]
// SVGElement
inline def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: ReactNode*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
inline def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: Unit, children: ReactNode*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]

// DOM Elements
// ReactHTMLElement
inline def cloneElement_PT_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: ReactNode*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
inline def cloneElement_PT_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: Unit, children: ReactNode*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]

inline def createContext[T](
  // If you thought this should be optional, see
// https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
defaultValue: T
): Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Context[T]]

inline def createElement[P /* <: js.Object */](`type`: String, props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
inline def createElement[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
inline def createElement[P /* <: js.Object */](`type`: String, props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
inline def createElement[P /* <: js.Object */](
  `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
  props: (ClassAttributes[ClassicComponent[P, ComponentState]]) & P,
  children: ReactNode*
): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
inline def createElement[P /* <: js.Object */](
  `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
  props: Null,
  children: ReactNode*
): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
inline def createElement[P /* <: js.Object */](
  `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
  props: Unit,
  children: ReactNode*
): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
// Custom components
inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with typings.react.reactStrings.a_, typings.react.reactStrings.abbr, typings.react.reactStrings.address */ Any,
  props: ClassAttributes[T] & P,
  children: ReactNode*
): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with typings.react.reactStrings.a_, typings.react.reactStrings.abbr, typings.react.reactStrings.address */ Any,
  props: Null,
  children: ReactNode*
): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with typings.react.reactStrings.a_, typings.react.reactStrings.abbr, typings.react.reactStrings.address */ Any,
  props: Unit,
  children: ReactNode*
): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]

inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Unit, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]

inline def createElement_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
inline def createElement_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
inline def createElement_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Unit, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]

inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.react.reactStrings.animate, typings.react.reactStrings.circle, typings.react.reactStrings.clipPath */ Any,
  props: ClassAttributes[T] & P,
  children: ReactNode*
): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.react.reactStrings.animate, typings.react.reactStrings.circle, typings.react.reactStrings.clipPath */ Any,
  props: Null,
  children: ReactNode*
): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.react.reactStrings.animate, typings.react.reactStrings.circle, typings.react.reactStrings.clipPath */ Any,
  props: Unit,
  children: ReactNode*
): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]

inline def createElement_P_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
inline def createElement_P_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
inline def createElement_P_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]

// DOM Elements
// TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
inline def createElement_input(
  `type`: input,
  props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
  children: ReactNode*
): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
inline def createElement_input(`type`: input, props: Null, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
inline def createElement_input(`type`: input, props: Unit, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]

inline def createFactory(
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.react.reactStrings.animate, typings.react.reactStrings.circle, typings.react.reactStrings.clipPath */ Any
): SVGFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[SVGFactory]
inline def createFactory[P](`type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]]): CFactory[P, ClassicComponent[P, ComponentState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CFactory[P, ClassicComponent[P, ComponentState]]]
inline def createFactory[P](`type`: ComponentClass[P, ComponentState]): Factory[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[Factory[P]]
// Custom components
inline def createFactory[P](`type`: FunctionComponent[P]): FunctionComponentFactory[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[FunctionComponentFactory[P]]
inline def createFactory[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String): DOMFactory[P, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[DOMFactory[P, T]]

inline def createFactory_PTC_CFactory[P, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C]): CFactory[P, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CFactory[P, T]]

//
// Top Level API
// ----------------------------------------------------------------------
// DOM Elements
inline def createFactory_T_HTMLFactory[T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with typings.react.reactStrings.a_, typings.react.reactStrings.abbr, typings.react.reactStrings.address */ Any
): HTMLFactory[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[HTMLFactory[T]]

inline def createRef[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[RefObject[T]]

inline def createServerContext(globalName: String, defaultValue: String): typings.react.canaryMod.reactAugmentingMod.ServerContext[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[typings.react.canaryMod.reactAugmentingMod.ServerContext[String]]
inline def createServerContext(
  globalName: String,
  defaultValue: js.Array[typings.react.canaryMod.reactAugmentingMod.ServerContextJSONValue]
): typings.react.canaryMod.reactAugmentingMod.ServerContext[js.Array[typings.react.canaryMod.reactAugmentingMod.ServerContextJSONValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[typings.react.canaryMod.reactAugmentingMod.ServerContext[js.Array[typings.react.canaryMod.reactAugmentingMod.ServerContextJSONValue]]]
inline def createServerContext(globalName: String, defaultValue: Boolean): typings.react.canaryMod.reactAugmentingMod.ServerContext[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[typings.react.canaryMod.reactAugmentingMod.ServerContext[Boolean]]
inline def createServerContext(globalName: String, defaultValue: Double): typings.react.canaryMod.reactAugmentingMod.ServerContext[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[typings.react.canaryMod.reactAugmentingMod.ServerContext[Double]]
inline def createServerContext(globalName: String, defaultValue: Null): typings.react.canaryMod.reactAugmentingMod.ServerContext[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[typings.react.canaryMod.reactAugmentingMod.ServerContext[Null]]
inline def createServerContext[T /* <: StringDictionary[typings.react.canaryMod.reactAugmentingMod.ServerContextJSONValue] */](globalName: String, defaultValue: T): typings.react.canaryMod.reactAugmentingMod.ServerContext[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[typings.react.canaryMod.reactAugmentingMod.ServerContext[T]]

inline def experimentalUseEffectEvent[T /* <: js.Function */](event: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_useEffectEvent")(event.asInstanceOf[js.Any]).asInstanceOf[T]

inline def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]]]

inline def isValidElement[P](): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")().asInstanceOf[/* is react.react.ReactElement */ Boolean]
inline def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.ReactElement */ Boolean]

inline def `lazy`[T /* <: ComponentType[Any] */](factory: js.Function0[js.Promise[Default[T]]]): LazyExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(factory.asInstanceOf[js.Any]).asInstanceOf[LazyExoticComponent[T]]

inline def memo[T /* <: ComponentType[Any] */](Component: T): MemoExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[MemoExoticComponent[T]]
inline def memo[T /* <: ComponentType[Any] */](
  Component: T,
  propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
): MemoExoticComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[MemoExoticComponent[T]]
inline def memo[P /* <: js.Object */](Component: FunctionComponent[P]): NamedExoticComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[NamedExoticComponent[P]]
inline def memo[P /* <: js.Object */](
  Component: FunctionComponent[P],
  propsAreEqual: js.Function2[/* prevProps */ P, /* nextProps */ P, Boolean]
): NamedExoticComponent[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[NamedExoticComponent[P]]

inline def startTransition(scope: TransitionFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startTransition")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def unstableUseCacheRefresh(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useCacheRefresh")().asInstanceOf[js.Function0[Unit]]

inline def use[T](usable: typings.react.canaryMod.reactAugmentingMod.Usable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(usable.asInstanceOf[js.Any]).asInstanceOf[T]

// I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
// useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
/**
  * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
  * has changed.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useCallback
  */
// A specific function type would not trigger implicit any.
// See https://github.com/DefinitelyTyped/DefinitelyTyped/issues/52873#issuecomment-845806435 for a comparison between `Function` and more specific types.
// tslint:disable-next-line ban-types
inline def useCallback[T /* <: js.Function */](callback: T, deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]

// This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
/**
  * Accepts a context object (the value returned from `React.createContext`) and returns the current
  * context value, as given by the nearest context provider for the given context.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useContext
  */
inline def useContext[T](context: Context[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[T]

/**
  * `useDebugValue` can be used to display a label for custom hooks in React DevTools.
  *
  * NOTE: We don’t recommend adding debug values to every custom hook.
  * It’s most valuable for custom hooks that are part of shared libraries.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useDebugValue
  */
// the name of the custom hook is itself derived from the function name at runtime:
// it's just the function name without the "use" prefix.
inline def useDebugValue[T](value: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useDebugValue[T](value: T, format: js.Function1[/* value */ T, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useDeferredValue[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]

/**
  * Accepts a function that contains imperative, possibly effectful code.
  *
  * @param effect Imperative function that can return a cleanup function
  * @param deps If present, effect will only activate if the values in the list change.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useEffect
  */
inline def useEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")().asInstanceOf[String]

inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
// NOTE: this does not accept strings, but this will have to be fixed by removing strings from type Ref<T>
/**
  * `useImperativeHandle` customizes the instance value that is exposed to parent components when using
  * `ref`. As always, imperative code using refs should be avoided in most cases.
  *
  * `useImperativeHandle` should be used with `React.forwardRef`.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useImperativeHandle
  */
inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useInsertionEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useInsertionEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useInsertionEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useInsertionEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

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
  * @see https://react.dev/reference/react/useLayoutEffect
  */
inline def useLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useMemo
  */
// allow undefined, but don't make it optional as that is very likely a mistake
inline def useMemo[T](factory: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any]).asInstanceOf[T]
inline def useMemo[T](factory: js.Function0[T], deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]

/**
  * An alternative to `useState`.
  *
  * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
  * multiple sub-values. It also lets you optimize performance for components that trigger deep
  * updates because you can pass `dispatch` down instead of callbacks.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useReducer
  */
// I'm not sure if I keep this 2-ary or if I make it (2,3)-ary; it's currently (2,3)-ary.
// The Flow types do have an overload for 3-ary invocation with undefined initializer.
// NOTE: without the ReducerState indirection, TypeScript would reduce S to be the most common
// supertype between the reducer's return type and the initialState (or the initializer's return type),
// which would prevent autocompletion from ever working.
// TODO: double-check if this weird overload logic is necessary. It is possible it's either a bug
// in older versions, or a regression in newer versions of the typescript completion service.
inline def useReducer[R /* <: Reducer[Any, Any] */](reducer: R, initialState: ReducerState[R], initializer: Unit): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]]]
/**
  * An alternative to `useState`.
  *
  * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
  * multiple sub-values. It also lets you optimize performance for components that trigger deep
  * updates because you can pass `dispatch` down instead of callbacks.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useReducer
  */
// overload where dispatch could accept 0 arguments.
inline def useReducer[R /* <: ReducerWithoutAction[Any] */](reducer: R, initializerArg: ReducerStateWithoutAction[R], initializer: Unit): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]
/**
  * An alternative to `useState`.
  *
  * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
  * multiple sub-values. It also lets you optimize performance for components that trigger deep
  * updates because you can pass `dispatch` down instead of callbacks.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useReducer
  */
// overload where dispatch could accept 0 arguments.
// overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
// If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be omitted.
// the last overload effectively behaves as if the identity function (x => x) is the initializer.
// overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
inline def useReducer[R /* <: ReducerWithoutAction[Any] */, I](
  reducer: R,
  initializerArg: (I & ReducerState[R]) | I,
  initializer: js.Function1[
  (/* arg */ I & ReducerState[R]) | (/* arg */ I), 
  ReducerState[R] | ReducerStateWithoutAction[R]
]
): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]

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
  * @see https://react.dev/reference/react/useRef
  */
inline def useRef[T](): MutableRefObject[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[MutableRefObject[js.UndefOr[T]]]
/**
  * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
  * (`initialValue`). The returned object will persist for the full lifetime of the component.
  *
  * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
  * value around similar to how you’d use instance fields in classes.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useRef
  */
inline def useRef[T](initialValue: T): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]

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
  * @see https://react.dev/reference/react/useRef
  */
inline def useRef_T_RefObject[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[RefObject[T]]
inline def useRef_T_RefObject[T](initialValue: T): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[RefObject[T]]

// convenience overload when first argument is omitted
/**
  * Returns a stateful value, and a function to update it.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useState
  */
inline def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")().asInstanceOf[js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]]]
/**
  * Returns a stateful value, and a function to update it.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useState
  */
inline def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
inline def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]

inline def useSyncExternalStore[Snapshot](
  subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
  getSnapshot: js.Function0[Snapshot]
): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
inline def useSyncExternalStore[Snapshot](
  subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
  getSnapshot: js.Function0[Snapshot],
  getServerSnapshot: js.Function0[Snapshot]
): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any], getServerSnapshot.asInstanceOf[js.Any])).asInstanceOf[Snapshot]

inline def useTransition(): js.Tuple2[Boolean, TransitionStartFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")().asInstanceOf[js.Tuple2[Boolean, TransitionStartFunction]]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type AnimationEventHandler[T] = EventHandler[AnimationEvent[T]]

// All the WAI-ARIA 1.1 role attribute values from https://www.w3.org/TR/wai-aria-1.1/#role_definitions
/* Rewritten from type alias, can be one of: 
  - typings.react.reactStrings.alert
  - typings.react.reactStrings.alertdialog
  - typings.react.reactStrings.application
  - typings.react.reactStrings.article
  - typings.react.reactStrings.banner
  - typings.react.reactStrings.button
  - typings.react.reactStrings.cell
  - typings.react.reactStrings.checkbox
  - typings.react.reactStrings.columnheader
  - typings.react.reactStrings.combobox
  - typings.react.reactStrings.complementary
  - typings.react.reactStrings.contentinfo
  - typings.react.reactStrings.definition
  - typings.react.reactStrings.dialog
  - typings.react.reactStrings.directory
  - typings.react.reactStrings.document
  - typings.react.reactStrings.feed
  - typings.react.reactStrings.figure
  - typings.react.reactStrings.form
  - typings.react.reactStrings.grid
  - typings.react.reactStrings.gridcell
  - typings.react.reactStrings.group
  - typings.react.reactStrings.heading
  - typings.react.reactStrings.img
  - typings.react.reactStrings.link
  - typings.react.reactStrings.list
  - typings.react.reactStrings.listbox
  - typings.react.reactStrings.listitem
  - typings.react.reactStrings.log
  - typings.react.reactStrings.main
  - typings.react.reactStrings.marquee
  - typings.react.reactStrings.math
  - typings.react.reactStrings.menu
  - typings.react.reactStrings.menubar
  - typings.react.reactStrings.menuitem
  - typings.react.reactStrings.menuitemcheckbox
  - typings.react.reactStrings.menuitemradio
  - typings.react.reactStrings.navigation
  - typings.react.reactStrings.none
  - typings.react.reactStrings.note
  - typings.react.reactStrings.option
  - typings.react.reactStrings.presentation
  - typings.react.reactStrings.progressbar
  - typings.react.reactStrings.radio
  - typings.react.reactStrings.radiogroup
  - typings.react.reactStrings.region
  - typings.react.reactStrings.row
  - typings.react.reactStrings.rowgroup
  - typings.react.reactStrings.rowheader
  - typings.react.reactStrings.scrollbar
  - typings.react.reactStrings.search
  - typings.react.reactStrings.searchbox
  - typings.react.reactStrings.separator
  - typings.react.reactStrings.slider
  - typings.react.reactStrings.spinbutton
  - typings.react.reactStrings.status
  - typings.react.reactStrings.switch
  - typings.react.reactStrings.tab
  - typings.react.reactStrings.table
  - typings.react.reactStrings.tablist
  - typings.react.reactStrings.tabpanel
  - typings.react.reactStrings.term
  - typings.react.reactStrings.textbox
  - typings.react.reactStrings.timer
  - typings.react.reactStrings.toolbar
  - typings.react.reactStrings.tooltip
  - typings.react.reactStrings.tree
  - typings.react.reactStrings.treegrid
  - typings.react.reactStrings.treeitem
  - java.lang.String
*/
type AriaRole = _AriaRole | String

type AudioHTMLAttributes[T] = MediaHTMLAttributes[T]

type Booleanish = Boolean

type CElement[P, T /* <: Component[P, ComponentState, Any] */] = ComponentElement[P, T]

type CFactory[P, T /* <: Component[P, ComponentState, Any] */] = ComponentFactory[P, T]

type ChangeEventHandler[T] = EventHandler[ChangeEvent[T]]

/**
  * We use an intersection type to infer multiple type parameters from
  * a single argument, which is useful for many top-level API defs.
  * See https://github.com/Microsoft/TypeScript/issues/7234 for more info.
  */
type ClassType[P, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */] = C & (Instantiable2[/* props */ P, /* context */ js.UndefOr[Any], T])

type ClassicElement[P] = CElement[P, ClassicComponent[P, ComponentState]]

type ClassicFactory[P] = CFactory[P, ClassicComponent[P, ComponentState]]

type ClipboardEventHandler[T] = EventHandler[ClipboardEvent[T]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends new (props : infer P): react.react.Component<any, any, any> ? react.react.PropsWithoutRef<P> & react.react.RefAttributes<std.InstanceType<T>> : react.react.PropsWithRef<react.react.ComponentProps<T>>
  }}}
  */
type ComponentPropsWithRef[T /* <: ElementType[Any] */] = ComponentProps[T]

type ComponentPropsWithoutRef[T /* <: ElementType[Any] */] = PropsWithoutRef[ComponentProps[T]]

type ComponentState = Any

type ComponentType[P] = (ComponentClass[P, ComponentState]) | FunctionComponent[P]

type CompositionEventHandler[T] = EventHandler[CompositionEvent[T]]

type Consumer[T] = ExoticComponent[ConsumerProps[T]]

// Any prop that has a default prop becomes optional, but its type is unchanged
// Undeclared default props are augmented into the resulting allowable attributes
// If declared props have indexed properties, ignore default props entirely as keyof gets widened
// Wrap in an outer-level conditional type to allow distribution over props that are unions
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  P extends any ? string extends keyof P ? P : std.Pick<P, std.Exclude<keyof P, keyof D>> & react.react.InexactPartial<std.Pick<P, std.Extract<keyof P, keyof D>>> & react.react.InexactPartial<std.Pick<D, std.Exclude<keyof D, keyof P>>> : never
  }}}
  */
type Defaultize[P, D] = P

type DependencyList = js.Array[Any]

// Destructors are only allowed to return void.
type Destructor = js.Function0[Unit | UNDEFINEDVOIDONLY]

type DetailedHTMLProps[E /* <: HTMLAttributes[T] */, T] = ClassAttributes[T] & E

// this technically does accept a second argument, but it's already under a deprecation warning
// and it's not even released so probably better to not define it.
type Dispatch[A] = js.Function1[/* value */ A, Unit]

// Since action _can_ be undefined, dispatch may be called without any parameters.
type DispatchWithoutAction = js.Function0[Unit]

type DragEventHandler[T] = EventHandler[DragEvent[T]]

// NOTE: callbacks are _only_ allowed to return either void, or a destructor.
type EffectCallback = js.Function0[Unit | Destructor]

//
// React Elements
// ----------------------------------------------------------------------
type ElementType[P] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof react.react.JSX.IntrinsicElements ]: P extends react.react.JSX.IntrinsicElements[K]? K : never}[keyof react.react.JSX.IntrinsicElements] */ js.Any) | ComponentType[P]

//
// Event Handler Types
// ----------------------------------------------------------------------
type EventHandler[E /* <: SyntheticEvent[Any, Event] */] = js.Function1[/* event */ E, Unit]

type ExactlyAnyPropertyKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: react.react.IsExactlyAny<T[K]> extends true? K : never}[keyof T] */ js.Any

//
// Class Interfaces
// ----------------------------------------------------------------------
type FC[P] = FunctionComponent[P]

type FocusEventHandler[T] = EventHandler[FocusEvent[T, Element]]

type FormEvent[T] = SyntheticEvent[T, Event]

type FormEventHandler[T] = EventHandler[FormEvent[T]]

type ForwardedRef[T] = (js.Function1[/* instance */ T | Null, Unit]) | (MutableRefObject[T | Null]) | Null

type GetDerivedStateFromError[P, S] = /**
  * This lifecycle is invoked after an error has been thrown by a descendant component.
  * It receives the error that was thrown as a parameter and should return a value to update state.
  *
  * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
  */
js.Function1[/* error */ Any, Partial[S] | Null]

type GetDerivedStateFromProps[P, S] = /**
  * Returns an update to a component's state based on its new props and old state.
  *
  * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
  */
js.Function2[/* nextProps */ P, /* prevState */ S, Partial[S] | Null]

type GlobalJSXElement = typings.react.mod.global.JSX.Element

type GlobalJSXElementAttributesProperty = ElementAttributesProperty

type GlobalJSXElementChildrenAttribute = ElementChildrenAttribute

type GlobalJSXElementClass = ElementClass

// React.JSX needs to point to global.JSX to keep global module augmentations intact.
// But we can't access global.JSX so we need to create these aliases instead.
// Once the global JSX namespace will be removed we replace React.JSX with the contents of global.JSX
type GlobalJSXElementType = typings.react.mod.global.JSX.ElementType

type GlobalJSXIntrinsicAttributes = IntrinsicAttributes

type GlobalJSXIntrinsicClassAttributes[T] = IntrinsicClassAttributes[T]

type GlobalJSXIntrinsicElements = IntrinsicElements

type GlobalJSXLibraryManagedAttributes[C, P] = LibraryManagedAttributes[C, P]

/* Rewritten from type alias, can be one of: 
  - typings.react.reactStrings._self
  - typings.react.reactStrings._blank
  - typings.react.reactStrings._parent
  - typings.react.reactStrings._top
  - java.lang.String
*/
type HTMLAttributeAnchorTarget = _HTMLAttributeAnchorTarget | String

type HTMLFactory[T /* <: HTMLElement */] = DetailedHTMLFactory[AllHTMLAttributes[T], T]

/* Rewritten from type alias, can be one of: 
  - typings.react.reactStrings.button
  - typings.react.reactStrings.checkbox
  - typings.react.reactStrings.color
  - typings.react.reactStrings.date
  - typings.react.reactStrings.`datetime-local`
  - typings.react.reactStrings.email
  - typings.react.reactStrings.file
  - typings.react.reactStrings.hidden
  - typings.react.reactStrings.image
  - typings.react.reactStrings.month
  - typings.react.reactStrings.number
  - typings.react.reactStrings.password
  - typings.react.reactStrings.radio
  - typings.react.reactStrings.range
  - typings.react.reactStrings.reset
  - typings.react.reactStrings.search
  - typings.react.reactStrings.submit
  - typings.react.reactStrings.tel
  - typings.react.reactStrings.text
  - typings.react.reactStrings.time
  - typings.react.reactStrings.url
  - typings.react.reactStrings.week
  - java.lang.String
*/
type HTMLInputTypeAttribute = _HTMLInputTypeAttribute | String

// naked 'any' type in a conditional type will short circuit and union both the then/else branches
// so boolean is only resolved for T = any
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  boolean extends T extends never ? true : false ? true : false
  }}}
  */
type IsExactlyAny[T] = `true`

type JSXElementConstructor[P] = (js.Function2[/* props */ P, /* deprecatedLegacyContext */ js.UndefOr[Any], ReactNode]) | (Instantiable1[/* props */ P, Component[Any, Any, Any]])

type Key = String | Double

type KeyboardEventHandler[T] = EventHandler[KeyboardEvent[T]]

type LegacyRef[T] = String | Ref[T]

// Try to resolve ill-defined props like for JS users: props can be any, or sometimes objects with properties of type any
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  // Distribute over P in case it is a union type
P extends any ? react.react.IsExactlyAny<P> extends true ? T : // If declared props have indexed properties, ignore inferred props entirely as keyof gets widened
string extends keyof P ? P : std.Pick<P, react.react.NotExactlyAnyPropertyKeys<P>> & std.Pick<T, std.Exclude<keyof T, react.react.NotExactlyAnyPropertyKeys<P>>> & std.Pick<P, std.Exclude<keyof P, keyof T>> : never
  }}}
  */
type MergePropTypes[P, T] = T

type MouseEventHandler[T] = EventHandler[MouseEvent[T, NativeMouseEvent]]

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

type NotExactlyAnyPropertyKeys[T] = Exclude[/* keyof T */ String, ExactlyAnyPropertyKeys[T]]

type PointerEventHandler[T] = EventHandler[PointerEvent[T]]

/**
  * {@link https://react.dev/reference/react/Profiler#onrender-callback Profiler API}
  */
type ProfilerOnRenderCallback = js.Function7[
/* id */ String, 
/* phase */ mount | update, 
/* actualDuration */ Double, 
/* baseDuration */ Double, 
/* startTime */ Double, 
/* commitTime */ Double, 
/* interactions */ Set[Interaction], 
Unit]

// Need an interface to not cause ReactNode to be a self-referential type.
type PromiseLikeOfReactNode = PromiseLike[ReactNode]

type PropsWithChildren[P] = P & typings.react.anon.Children

/** Ensures that the props do not include string ref, which cannot be forwarded */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  'ref' extends keyof P ? P extends {  ref :infer R | undefined} ? string extends R ? react.react.PropsWithoutRef<P> & {  ref :std.Exclude<R, string> | undefined} : P : P : P
  }}}
  */
type PropsWithRef[P] = P

/** Ensures that the props do not include ref at all */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  // Omit would not be sufficient for this. We'd like to avoid unnecessary mapping and need a distributive conditional to support unions.
// see: https://www.typescriptlang.org/docs/handbook/2/conditional-types.html#distributive-conditional-types
// https://github.com/Microsoft/TypeScript/issues/28339
P extends any ? 'ref' extends keyof P ? std.Omit<P, 'ref'> : P : P
  }}}
  */
type PropsWithoutRef[P] = P

// NOTE: only the Context object itself can get a displayName
// https://github.com/facebook/react-devtools/blob/e0b854e4c/backend/attachRendererFiber.js#L310-L325
type Provider[T] = ProviderExoticComponent[ProviderProps[T]]

/**
  * @deprecated - This type is not relevant when using React. Inline the type instead to make the intent clear.
  */
type ReactChild = ReactElement | String | Double

type ReactComponentElement[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178, starting with typings.react.reactStrings.a_, typings.react.reactStrings.abbr, typings.react.reactStrings.address */ Any */, P] = ReactElement

type ReactEventHandler[T] = EventHandler[SyntheticEvent[T, Event]]

/**
  * @deprecated - This type is not relevant when using React. Inline the type instead to make the intent clear.
  */
type ReactFragment = js.Iterable[ReactNode]

// ReactHTML for ReactHTMLElement
type ReactHTMLElement[T /* <: HTMLElement */] = DetailedReactHTMLElement[AllHTMLAttributes[T], T]

//
// Component API
// ----------------------------------------------------------------------
type ReactInstance = (Component[Any, js.Object, Any]) | Element

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  C extends {  propTypes :infer T,   defaultProps :infer D} ? react.react.Defaultize<react.react.MergePropTypes<P, prop-types.prop-types.InferProps<T>>, D> : C extends {  propTypes :infer T} ? react.react.MergePropTypes<P, prop-types.prop-types.InferProps<T>> : C extends {  defaultProps :infer D} ? react.react.Defaultize<P, D> : P
  }}}
  */
type ReactManagedAttributes[C, P] = P

/** 
NOTE: Rewritten from type alias:
{{{
type ReactNode = react.react.ReactElement | string | number | std.Iterable<react.react.ReactNode> | react.react.ReactPortal | boolean | undefined | react.react/experimental.react.PromiseLikeOfReactNode
}}}
to avoid circular code involving: 
- react.react.<global>.JSX.ElementType
- react.react.GlobalJSXElementType
- react.react.JSX.ElementType
- react.react.JSXElementConstructor
- react.react.PromiseLikeOfReactNode
- react.react.ReactFragment
- react.react.ReactNode
*/
/* Rewritten from type alias, can be one of: 
  - typings.react.mod.ReactElement
  - java.lang.String
  - scala.Double
  - js.Iterable[scala.Any]
  - typings.react.mod.ReactPortal
  - scala.Boolean
  - scala.Unit
  - typings.react.experimentalMod.reactAugmentingMod.PromiseLikeOfReactNode
*/
type ReactNode = js.UndefOr[_ReactNode | js.Iterable[Any] | String | Double | Boolean]

/**
  * @deprecated - This type is not relevant when using React. Inline the type instead to make the intent clear.
  */
type ReactText = String | Double

// Unlike redux, the actions _can_ be anything
type Reducer[S, A] = js.Function2[/* prevState */ S, /* action */ A, S]

// If useReducer accepts a reducer without action, dispatch may be called without any parameters.
type ReducerWithoutAction[S] = js.Function1[/* prevState */ S, S]

type Ref[T] = RefCallback[T] | RefObject[T] | Null

// Bivariance hack for consistent unsoundness with RefObject
type RefCallback[T] = js.Function1[/* instance */ T | Null, Unit]

type Requireable[T] = typings.propTypes.mod.Requireable[T]

/**
  * @deprecated Please use `FunctionComponentFactory`
  */
type SFCFactory[P] = FunctionComponentFactory[P]

type SVGLineElementAttributes[T] = SVGProps[T]

type SVGTextElementAttributes[T] = SVGProps[T]

type ServerContextJSONArray = js.Array[typings.react.canaryMod.reactAugmentingMod.ServerContextJSONValue]

type ServerContextJSONValue = String | Boolean | Double | Null | typings.react.canaryMod.reactAugmentingMod.ServerContextJSONArray | StringDictionary[typings.react.canaryMod.reactAugmentingMod.ServerContextJSONValue]

//
// React Hooks
// ----------------------------------------------------------------------
// based on the code in https://github.com/facebook/react/pull/13968
// Unlike the class component setState, the updates are not allowed to be partial
type SetStateAction[S] = S | (js.Function1[/* prevState */ S, S])

/**
  * currentTarget - a reference to the element on which the event listener is registered.
  *
  * target - a reference to the element from which the event was originally dispatched.
  * This might be a child element to the element on which the event listener is registered.
  * If you thought this should be `EventTarget & T`, see https://github.com/DefinitelyTyped/DefinitelyTyped/issues/11508#issuecomment-256045682
  */
type SyntheticEvent[T, E] = BaseSyntheticEvent[E, EventTarget & T, EventTarget]

type TouchEventHandler[T] = EventHandler[TouchEvent[T]]

type TransitionEventHandler[T] = EventHandler[TransitionEvent[T]]

type TransitionFunction = js.Function0[VoidOrUndefinedOnly]

type UIEventHandler[T] = EventHandler[UIEvent[T, NativeUIEvent]]

/**
  * @deprecated - Equivalent with `React.FC`.
  */
type VFC[P] = VoidFunctionComponent[P]

type ValidationMap[T] = typings.propTypes.mod.ValidationMap[T]

//
// React.PropTypes
// ----------------------------------------------------------------------
type Validator[T] = typings.propTypes.mod.Validator[T]

type VoidOrUndefinedOnly = Unit | UNDEFINEDVOIDONLY

type WheelEventHandler[T] = EventHandler[WheelEvent[T]]
