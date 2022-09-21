package typings.rax.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.propTypes.mod.InferProps
import typings.rax.anon.`1`
import typings.rax.mod.^
import typings.rax.raxStrings.input
import typings.rax.raxStrings.ref
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.Exclude
import typings.std.Extract
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.InstanceType
import typings.std.Partial
import typings.std.Pick
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Children: RaxChildren = ^.asInstanceOf[js.Dynamic].selectDynamic("Children").asInstanceOf[RaxChildren]

inline def Fragment: ExoticComponent[typings.rax.anon.Children] = ^.asInstanceOf[js.Dynamic].selectDynamic("Fragment").asInstanceOf[ExoticComponent[typings.rax.anon.Children]]

inline def createContext[T](defaultValue: T): Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Context[T]]
inline def createContext[T](defaultValue: T, calculateChangedBits: js.Function2[/* prev */ T, /* next */ T, Double]): Context[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any], calculateChangedBits.asInstanceOf[js.Any])).asInstanceOf[Context[T]]

inline def createElement[P /* <: js.Object */](`type`: String, props: Attributes & P, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: js.Object */](`type`: String, props: Null, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: js.Object */](`type`: String, props: Unit, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: js.Object */](
  `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
  props: (ClassAttributes[ClassicComponent[P, ComponentState]]) & P,
  children: RaxNode*
): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
inline def createElement[P /* <: js.Object */](
  `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
  props: Null,
  children: RaxNode*
): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
inline def createElement[P /* <: js.Object */](
  `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
  props: Unit,
  children: RaxNode*
): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes & P, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Unit, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 114 */ Any,
  props: ClassAttributes[T] & P,
  children: RaxNode*
): DetailedRaxHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedRaxHTMLElement[P, T]]
inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 114 */ Any,
  props: Null,
  children: RaxNode*
): DetailedRaxHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedRaxHTMLElement[P, T]]
inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 114 */ Any,
  props: Unit,
  children: RaxNode*
): DetailedRaxHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedRaxHTMLElement[P, T]]

inline def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] & P, children: RaxNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
inline def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: RaxNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
inline def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Unit, children: RaxNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]

inline def createElement_P_ObjectT_ComponentPComponentStateAnyC_ComponentClassPComponentState_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: RaxNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
inline def createElement_P_ObjectT_ComponentPComponentStateAnyC_ComponentClassPComponentState_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: RaxNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
inline def createElement_P_ObjectT_ComponentPComponentStateAnyC_ComponentClassPComponentState_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Unit, children: RaxNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]

// Custom components
inline def createElement_P_Object_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: RaxNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def createElement_P_Object_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: RaxNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def createElement_P_Object_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: RaxNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]

inline def createElement_P_SVGAttributesTT_SVGElement_RaxSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ Any,
  props: ClassAttributes[T] & P,
  children: RaxNode*
): RaxSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxSVGElement]
inline def createElement_P_SVGAttributesTT_SVGElement_RaxSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ Any,
  props: Null,
  children: RaxNode*
): RaxSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxSVGElement]
inline def createElement_P_SVGAttributesTT_SVGElement_RaxSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ Any,
  props: Unit,
  children: RaxNode*
): RaxSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxSVGElement]

/**
  * ======================================================================
  * Rax Top Level API
  * ======================================================================
  */
// DOM Elements
// TODO: generalize this to everything in `keyof RaxHTML`, not just "input"
inline def createElement_input(
  `type`: input,
  props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
  children: RaxNode*
): DetailedRaxHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedRaxHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
inline def createElement_input(`type`: input, props: Null, children: RaxNode*): DetailedRaxHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedRaxHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
inline def createElement_input(`type`: input, props: Unit, children: RaxNode*): DetailedRaxHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedRaxHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]

inline def createRef[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[RefObject[T]]

inline def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]]]

inline def memo[T /* <: ComponentType[Any] */](Component: T): MemoExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[MemoExoticComponent[T]]
inline def memo[T /* <: ComponentType[Any] */](
  Component: T,
  propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
): MemoExoticComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[MemoExoticComponent[T]]
inline def memo[P /* <: js.Object */](Component: FC[P]): NamedExoticComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[NamedExoticComponent[P]]
inline def memo[P /* <: js.Object */](
  Component: FC[P],
  propsAreEqual: js.Function2[/* prevProps */ PropsWithChildren[P], /* nextProps */ PropsWithChildren[P], Boolean]
): NamedExoticComponent[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[NamedExoticComponent[P]]

inline def render: Renderer = ^.asInstanceOf[js.Dynamic].selectDynamic("render").asInstanceOf[Renderer]

// I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
// useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
/**
  * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
  * has changed.
  */
// TODO (TypeScript 3.0): <T extends (...args: never[]) => unknown>
inline def useCallback[T /* <: js.Function1[/* repeated */ Any, Any] */](callback: T, deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]

// This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
/**
  * Accepts a context object (the value returned from `Rax.createContext`) and returns the current
  * context value, as given by the nearest context provider for the given context.
  */
inline def useContext[T](context: Context[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[T]

/**
  * Accepts a function that contains imperative, possibly effectful code.
  *
  * @param effect Imperative function that can return a cleanup function
  * @param deps If present, effect will only activate if the values in the list change.
  */
inline def useEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
// NOTE: this does not accept strings, but this will have to be fixed by removing strings from type Ref<T>
/**
  * `useImperativeHandle` customizes the instance value that is exposed to parent components when using
  * `ref`. As always, imperative code using refs should be avoided in most cases.
  *
  * `useImperativeHandle` should be used with `Rax.forwardRef`.
  */
inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * The signature is identical to `useEffect`, but it fires synchronously after all DOM mutations.
  * Use this to read layout from the DOM and synchronously re-render. Updates scheduled inside
  * `useLayoutEffect` will be flushed synchronously, before the browser has a chance to paint.
  *
  * Prefer the standard `useEffect` when possible to avoid blocking visual updates.
  *
  * If you’re migrating code from a class component, `useLayoutEffect` fires in the same phase as
  * `componentDidMount` and `componentDidUpdate`.
  */
inline def useLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

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
  */
// overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
// If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be ommitted.
// the last overload effectively behaves as if the identity function (x => x) is the initializer.
// overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
inline def useReducer[R /* <: Reducer[Any, Any] */, I](
  reducer: R,
  initializerArg: (I & ReducerState[R]) | I,
  initializer: js.Function1[(/* arg */ I & ReducerState[R]) | (/* arg */ I), ReducerState[R]]
): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]]]

// convenience overload for potentially undefined initialValue / call with 0 arguments
// has a default to stop it from defaulting to {} instead
/**
  * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
  * (`initialValue`). The returned object will persist for the full lifetime of the component.
  *
  * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
  * value around similar to how you’d use instance fields in classes.
  */
// TODO (TypeScript 3.0): <T extends unknown>
inline def useRef[T](): MutableRefObject[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[MutableRefObject[js.UndefOr[T]]]
/**
  * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
  * (`initialValue`). The returned object will persist for the full lifetime of the component.
  *
  * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
  * value around similar to how you’d use instance fields in classes.
  */
// TODO (TypeScript 3.0): <T extends unknown>
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
  */
// TODO (TypeScript 3.0): <T extends unknown>
inline def useRef_T_RefObject[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[RefObject[T]]
inline def useRef_T_RefObject[T](initialValue: T): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[RefObject[T]]

// convenience overload when first argument is ommitted
/**
  * Returns a stateful value, and a function to update it.
  */
inline def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")().asInstanceOf[js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]]]
/**
  * Returns a stateful value, and a function to update it.
  */
inline def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
inline def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type AnimationEventHandler[T] = EventHandler[AnimationEvent[T]]

type AppearEventHandler[T] = EventHandler[AppearEvent[T]]

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

/**
  * NOTE: prefer ComponentPropsWithRef, if the ref is forwarded,
  * or ComponentPropsWithoutRef when refs are not supported.
  */
type ComponentProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 217 */ Any */] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: rax.rax.<global>.JSX.IntrinsicElements[T] */ js.Any)

type ComponentPropsWithRef[T /* <: ElementType[Any] */] = PropsWithRef[ComponentProps[T]] | (PropsWithoutRef[Any] & RefAttributes[InstanceType[T]])

type ComponentPropsWithoutRef[T /* <: ElementType[Any] */] = PropsWithoutRef[ComponentProps[T]]

type ComponentRef[T /* <: ElementType[Any] */] = Any

type ComponentState = Any

type ComponentType[P] = (ComponentClass[P, ComponentState]) | FunctionComponent[P]

type CompositionEventHandler[T] = EventHandler[CompositionEvent[T]]

type Consumer[T] = ExoticComponent[ConsumerProps[T]]

type ContextType[C /* <: Context[Any] */] = Any

// Any prop that has a default prop becomes optional, but its type is unchanged
// Undeclared default props are augmented into the resulting allowable attributes
// If declared props have indexed properties, ignore default props entirely as keyof gets widened
// Wrap in an outer-level conditional type to allow distribution over props that are unions
type Defaultize[P, D] = ((Pick[P, Exclude[/* keyof P */ String, /* keyof D */ String]]) & (Partial[Pick[P, Extract[/* keyof P */ String, /* keyof D */ String]]]) & (Partial[Pick[D, Exclude[/* keyof D */ String, /* keyof P */ String]]])) | P

// The identity check is done with the SameValue algorithm (Object.is), which is stricter than ===
// TODO (TypeScript 3.0): ReadonlyArray<unknown>
type DependencyList = js.Array[Any]

type DetailedHTMLProps[E /* <: HTMLAttributes[T] */, T] = ClassAttributes[T] & E

// this technically does accept a second argument, but it's already under a deprecation warning
// and it's not even released so probably better to not define it.
type Dispatch[A] = js.Function1[/* value */ A, Unit]

type DragEventHandler[T] = EventHandler[DragEvent[T]]

// NOTE: callbacks are _only_ allowed to return either void, or a destructor.
// The destructor is itself only allowed to return void.
type EffectCallback = js.Function0[Unit | js.Function0[js.UndefOr[Unit]]]

/**
  * Gets the instance type for a Rax element. The instance will be different for various component types:
  *
  * - Rax class components will be the class instance. So if you had `class Foo extends Component<{}> {}`
  *   and used `ElementRef<typeof Foo>` then the type would be the instance of `Foo`.
  * - Rax stateless functional components do not have a backing instance and so `ElementRef<typeof Bar>`
  *   (when `Bar` is `function Bar() {}`) will give you the `undefined` type.
  * - JSX intrinsics like `div` will give you their DOM instance. For `ElementRef<'div'>` that would be
  *   `HTMLDivElement`. For `ElementRef<'input'>` that would be `HTMLInputElement`.
  * - Rax stateless functional components that forward a `ref` will give you the `ElementRef` of the forwarded
  *   to component.
  *
  * `C` must be the type _of_ a Rax component so you need to use typeof as in `ElementRef<typeof MyComponent>`.
  */
type ElementRef[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 219 */ Any */] = Any

/**
  * ======================================================================
  * Rax Elements
  * ======================================================================
  */
type ElementType[P] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' | 'list' | 'cell' | 'loading' | 'refresh' | 'recycle-list' | 'scroller' | 'slider' | 'indicator' | 'waterfall' | 'web' | 'richtext' | 'slot' | 'swiper' | 'swiper-item' | 'scroll-view' | 'cover-view' | 'cover-image' | 'camera' | 'movable-view' | 'movable-area' | 'match-media' | 'icon' | 'rich-text' | 'radio' | 'radio-group' | 'picker-view' | 'picker' | 'navigator' | 'web-view' | 'lifestyle' | 'contact-button' | 'aria-component' | 'functional-page-navigator' | 'live-player' | 'live-pusher' | 'ad' | 'ad-custom' | 'open-data' | 'voip-room' | 'page-meta' | 'picker-view-column' | 'official-account' | 'navigation-bar' ]: P extends rax.rax.<global>.JSX.IntrinsicElements[K]? K : never}['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' | 'list' | 'cell' | 'loading' | 'refresh' | 'recycle-list' | 'scroller' | 'slider' | 'indicator' | 'waterfall' | 'web' | 'richtext' | 'slot' | 'swiper' | 'swiper-item' | 'scroll-view' | 'cover-view' | 'cover-image' | 'camera' | 'movable-view' | 'movable-area' | 'match-media' | 'icon' | 'rich-text' | 'radio' | 'radio-group' | 'picker-view' | 'picker' | 'navigator' | 'web-view' | 'lifestyle' | 'contact-button' | 'aria-component' | 'functional-page-navigator' | 'live-player' | 'live-pusher' | 'ad' | 'ad-custom' | 'open-data' | 'voip-room' | 'page-meta' | 'picker-view-column' | 'official-account' | 'navigation-bar'] */ js.Any) | ComponentType[P]

//
// Event Handler Types
// ----------------------------------------------------------------------
type EventHandler[E /* <: SyntheticEvent[Any, Event] */] = js.Function1[/* event */ E, Unit]

type ExactlyAnyPropertyKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: rax.rax.IsExactlyAny<T[K]> extends true? K : never}[keyof T] */ js.Any

type FC[P] = FunctionComponent[P]

type FocusEventHandler[T] = EventHandler[FocusEvent[T]]

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

type HTMLFactory[T /* <: HTMLElement */] = DetailedHTMLFactory[AllHTMLAttributes[T], T]

type JSXElementConstructor[P] = (js.Function1[/* props */ P, (RaxElement[Any, String | Any]) | Null]) | (Instantiable1[/* props */ P, Component[P, Any, Any]])

type Key = String | Double

type KeyboardEventHandler[T] = EventHandler[KeyboardEvent[T]]

type LegacyRef[T] = String | Ref[T]

// Try to resolve ill-defined props like for JS users: props can be any, or sometimes objects with properties of type any
type MergePropTypes[P, T] = ((Pick[P, NotExactlyAnyPropertyKeys[P]]) & (// For props which are exactly any, use the type inferred from propTypes if present
Pick[T, Exclude[/* keyof T */ String, NotExactlyAnyPropertyKeys[P]]]) & (// Keep leftover props not specified in propTypes
Pick[P, Exclude[/* keyof P */ String, /* keyof T */ String]])) | P | T

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

type PropsWithChildren[P] = P & typings.rax.anon.Children

/** Ensures that the props do not include string ref, which cannot be forwarded */
type PropsWithRef[P] = P | (PropsWithoutRef[P] & `1`)

/** Ensures that the props do not include ref at all */
type PropsWithoutRef[P] = P | (Pick[P, Exclude[/* keyof P */ String, ref]])

type Provider[T] = ProviderExoticComponent[ProviderProps[T]]

type RaxChild = (RaxElement[Any, String | Any]) | RaxText

type RaxComponentElement[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 217 */ Any */, P] = RaxElement[P, T]

type RaxEventHandler[T] = EventHandler[SyntheticEvent[T, Event]]

type RaxFragment = js.Object | RaxNodeArray

// RaxHTML for RaxHTMLElement
type RaxHTMLElement[T /* <: HTMLElement */] = DetailedRaxHTMLElement[AllHTMLAttributes[T], T]

/**
  * ======================================================================
  * Rax Component API
  * ======================================================================
  */
type RaxInstance = (Component[Any, js.Object, Any]) | Element

type RaxManagedAttributes[C, P] = P | (Defaultize[(MergePropTypes[P, InferProps[Any]]) | P, Any]) | (MergePropTypes[P, InferProps[Any]])

type RaxNode = js.UndefOr[Any | RaxFragment | RaxPortal | Boolean | Null]

/**
  * ======================================================================
  * Rax Nodes
  * ======================================================================
  */
type RaxText = String | Double

// Unlike redux, the actions _can_ be anything
type Reducer[S, A] = js.Function2[/* prevState */ S, /* action */ A, S]

type ReducerAction[R /* <: Reducer[Any, Any] */] = Any

// types used to try and prevent the compiler from reducing S
// to a supertype common with the second argument to useReducer()
type ReducerState[R /* <: Reducer[Any, Any] */] = Any

type Ref[T] = (js.Function1[/* instance */ T | Null, Unit]) | RefObject[T] | Null

/**
  * @deprecated Use ForwardRefRenderFunction. forwardRef doesn't accept a
  *             "real" component.
  */
type RefForwardingComponent[T, P] = ForwardRefRenderFunction[T, P]

type Requireable[T] = typings.propTypes.mod.Requireable[T]

/**
  * ======================================================================
  * Rax Hooks
  * ======================================================================
  */
// Unlike the class component setState, the updates are not allowed to be partial
type SetStateAction[S] = S | (js.Function1[/* prevState */ S, S])

/**
  * currentTarget - a reference to the element on which the event listener is registered.
  *
  * target - a reference to the element from which the event was originally dispatched.
  * This might be a child element to the element on which the event listener is registered.
  * If you thought this should be `EventTarget & T`, see https://github.com/DefinitelyTyped/DefinitelyTyped/pull/12239
  */
type SyntheticEvent[T, E] = BaseSyntheticEvent[E, EventTarget & T, EventTarget]

type TouchEventHandler[T] = EventHandler[TouchEvent[T]]

type TransitionEventHandler[T] = EventHandler[TransitionEvent[T]]

type UIEventHandler[T] = EventHandler[UIEvent[T]]

type ValidationMap[T] = typings.propTypes.mod.ValidationMap[T]

//
// Rax.PropTypes
// ----------------------------------------------------------------------
type Validator[T] = typings.propTypes.mod.Validator[T]

type WeakValidationMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? null extends T[K]? rax.rax.Validator<T[K] | null | undefined> : undefined extends T[K]? rax.rax.Validator<T[K] | null | undefined> : rax.rax.Validator<T[K]>}
  */ typings.rax.raxStrings.WeakValidationMap & TopLevel[Any]

type WheelEventHandler[T] = EventHandler[WheelEvent[T]]
