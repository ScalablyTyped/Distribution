package typings
package reactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactMod {
  type AnimationEventHandler[T] = EventHandler[AnimationEvent[T]]
  // tslint:disable-next-line:no-empty-interface
  type AudioHTMLAttributes[T] = MediaHTMLAttributes[T]
  type CElement[P, T /* <: Component[P, ComponentState, _] */] = ComponentElement[P, T]
  type CFactory[P, T /* <: Component[P, ComponentState, _] */] = ComponentFactory[P, T]
  type CSSProperties = csstypeLib.csstypeMod.Properties[java.lang.String | scala.Double]
  type ChangeEventHandler[T] = EventHandler[ChangeEvent[T]]
  /**
    * We use an intersection type to infer multiple type parameters from
    * a single argument, which is useful for many top-level API defs.
    * See https://github.com/Microsoft/TypeScript/issues/7234 for more info.
    */
  type ClassType[P, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */] = C with (org.scalablytyped.runtime.Instantiable2[/* props */ P, /* context */ js.UndefOr[/* context */ js.Any], T])
  type ClassicElement[P] = CElement[P, ClassicComponent[P, ComponentState]]
  type ClassicFactory[P] = CFactory[P, ClassicComponent[P, ComponentState]]
  type ClipboardEventHandler[T] = EventHandler[ClipboardEvent[T]]
  type ComponentFactory[P, T /* <: Component[P, ComponentState, _] */] = js.Function2[
    /* props */ js.UndefOr[ClassAttributes[T] with P], 
    /* repeated */ ReactNode, 
    CElement[P, T]
  ]
  /**
    * NOTE: prefer ComponentPropsWithRef, if the ref is forwarded,
    * or ComponentPropsWithoutRef when refs are not supported.
    */
  type ComponentProps[T /* <: java.lang.String */] = js.Object | (/* import warning: ImportType.apply Failed type conversion: react.react.Global.JSX.IntrinsicElements[T] */ js.Any)
  type ComponentPropsWithRef[T /* <: ElementType[_] */] = PropsWithRef[ComponentProps[T]] | (PropsWithoutRef[_] with RefAttributes[stdLib.InstanceType[T]])
  type ComponentPropsWithoutRef[T /* <: ElementType[_] */] = PropsWithoutRef[ComponentProps[T]]
  type ComponentState = js.Any
  type ComponentType[P] = (ComponentClass[P, ComponentState]) | FunctionComponent[P]
  type CompositionEventHandler[T] = EventHandler[CompositionEvent[T]]
  type Consumer[T] = ExoticComponent[ConsumerProps[T]]
  type ContextType[C /* <: Context[_] */] = js.Any
  type DOMFactory[P /* <: DOMAttributes[T] */, T /* <: reactLib.Element */] = js.Function2[
    /* props */ js.UndefOr[ClassAttributes[T] with (P | scala.Null)], 
    /* repeated */ ReactNode, 
    DOMElement[P, T]
  ]
  // The identity check is done with the SameValue algorithm (Object.is), which is stricter than ===
  // TODO (TypeScript 3.0): ReadonlyArray<unknown>
  type DependencyList = js.Array[js.Any]
  type DetailedHTMLProps[E /* <: HTMLAttributes[T] */, T] = ClassAttributes[T] with E
  // this technically does accept a second argument, but it's already under a deprecation warning
  // and it's not even released so probably better to not define it.
  type Dispatch[A] = js.Function1[/* value */ A, scala.Unit]
  type DragEventHandler[T] = EventHandler[DragEvent[T]]
  // NOTE: callbacks are _only_ allowed to return either void, or a destructor.
  // The destructor is itself only allowed to return void.
  type EffectCallback = js.Function0[scala.Unit | js.Function0[js.UndefOr[scala.Unit]]]
  //
  // React Elements
  // ----------------------------------------------------------------------
  type ElementType[P] = scala.Nothing | ComponentType[P]
  //
  // Event Handler Types
  // ----------------------------------------------------------------------
  type EventHandler[E /* <: SyntheticEvent[_, reactLib.Event] */] = js.Function1[/* event */ E, scala.Unit]
  type FC[P] = FunctionComponent[P]
  //
  // Factories
  // ----------------------------------------------------------------------
  type Factory[P] = js.Function2[/* props */ js.UndefOr[Attributes with P], /* repeated */ ReactNode, ReactElement[P]]
  type FocusEventHandler[T] = EventHandler[FocusEvent[T]]
  // tslint:disable-next-line:no-empty-interface
  type FormEvent[T] = SyntheticEvent[T, reactLib.Event]
  type FormEventHandler[T] = EventHandler[FormEvent[T]]
  type FunctionComponentFactory[P] = js.Function2[
    /* props */ js.UndefOr[Attributes with P], 
    /* repeated */ ReactNode, 
    FunctionComponentElement[P]
  ]
  type GetDerivedStateFromError[P, S] = /**
    * This lifecycle is invoked after an error has been thrown by a descendant component.
    * It receives the error that was thrown as a parameter and should return a value to update state.
    *
    * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
    */
  js.Function1[/* error */ js.Any, stdLib.Partial[S] | scala.Null]
  type GetDerivedStateFromProps[P, S] = /**
    * Returns an update to a component's state based on its new props and old state.
    *
    * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
    */
  js.Function2[
    /* nextProps */ stdLib.Readonly[P], 
    /* prevState */ S, 
    stdLib.Partial[S] | scala.Null
  ]
  // tslint:disable-next-line:no-empty-interface
  type HTMLFactory[T /* <: reactLib.HTMLElement */] = DetailedHTMLFactory[AllHTMLAttributes[T], T]
  type JSXElementConstructor[P] = (js.Function1[/* props */ P, ReactElement[js.Any] | scala.Null]) | (org.scalablytyped.runtime.Instantiable1[/* props */ P, Component[P, js.Any, js.Any]])
  type Key = java.lang.String | scala.Double
  type KeyboardEventHandler[T] = EventHandler[KeyboardEvent[T]]
  type LegacyRef[T] = java.lang.String | Ref[T]
  type MouseEventHandler[T] = EventHandler[MouseEvent[T, reactLib.NativeMouseEvent]]
  type PointerEventHandler[T] = EventHandler[PointerEvent[T]]
  /**
    * {@link https://github.com/bvaughn/rfcs/blob/profiler/text/0000-profiler.md#detailed-design | API}
    */
  type ProfilerOnRenderCallback = js.Function7[
    /* id */ java.lang.String, 
    /* phase */ reactLib.reactLibStrings.mount | reactLib.reactLibStrings.update, 
    /* actualDuration */ scala.Double, 
    /* baseDuration */ scala.Double, 
    /* startTime */ scala.Double, 
    /* commitTime */ scala.Double, 
    /* interactions */ stdLib.Set[SchedulerInteraction], 
    scala.Unit
  ]
  type PropsWithChildren[P] = P with reactLib.Anon_Children
  /** Ensures that the props do not include string ref, which cannot be forwarded */
  type PropsWithRef[P] = P | (PropsWithoutRef[P] with reactLib.Anon_Ref)
  /** Ensures that the props do not include ref at all */
  type PropsWithoutRef[P] = P | (stdLib.Pick[P, stdLib.Exclude[java.lang.String, reactLib.reactLibStrings.ref]])
  // NOTE: only the Context object itself can get a displayName
  // https://github.com/facebook/react-devtools/blob/e0b854e4c/backend/attachRendererFiber.js#L310-L325
  type Provider[T] = ProviderExoticComponent[ProviderProps[T]]
  type ReactChild = ReactElement[js.Any] | ReactText
  type ReactComponentElement[T /* <: java.lang.String */, P] = ReactElement[P]
  type ReactEventHandler[T] = EventHandler[SyntheticEvent[T, reactLib.Event]]
  type ReactFragment = js.Object | ReactNodeArray
  // ReactHTML for ReactHTMLElement
  // tslint:disable-next-line:no-empty-interface
  type ReactHTMLElement[T /* <: reactLib.HTMLElement */] = DetailedReactHTMLElement[AllHTMLAttributes[T], T]
  //
  // Component API
  // ----------------------------------------------------------------------
  type ReactInstance = (Component[js.Any, js.Object, js.Any]) | reactLib.Element
  type ReactNode = js.UndefOr[ReactChild | ReactFragment | ReactPortal | scala.Boolean | scala.Null]
  //
  // React Nodes
  // http://facebook.github.io/react/docs/glossary.html
  // ----------------------------------------------------------------------
  type ReactText = java.lang.String | scala.Double
  /**
    * @deprecated Please use `ElementType`
    */
  type ReactType[P] = ElementType[P]
  // Unlike redux, the actions _can_ be anything
  type Reducer[S, A] = js.Function2[/* prevState */ S, /* action */ A, S]
  type ReducerAction[R /* <: Reducer[_, _] */] = js.Any
  // types used to try and prevent the compiler from reducing S
  // to a supertype common with the second argument to useReducer()
  type ReducerState[R /* <: Reducer[_, _] */] = js.Any
  type Ref[T] = (js.Function1[/* instance */ T | scala.Null, scala.Unit]) | RefObject[T] | scala.Null
  type Requireable[T] = propDashTypesLib.propDashTypesMod.Requireable[T]
  //
  // Class Interfaces
  // ----------------------------------------------------------------------
  /**
    * @deprecated as of recent React versions, function components can no
    * longer be considered 'stateless'. Please use `FunctionComponent` instead.
    *
    * @see [React Hooks](https://reactjs.org/docs/hooks-intro.html)
    */
  type SFC[P] = FunctionComponent[P]
  /**
    * @deprecated Please use `FunctionComponentElement`
    */
  type SFCElement[P] = FunctionComponentElement[P]
  /**
    * @deprecated Please use `FunctionComponentFactory`
    */
  type SFCFactory[P] = FunctionComponentFactory[P]
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
  type StatelessComponent[P] = FunctionComponent[P]
  /**
    * currentTarget - a reference to the element on which the event listener is registered.
    *
    * target - a reference to the element from which the event was originally dispatched.
    * This might be a child element to the element on which the event listener is registered.
    * If you thought this should be `EventTarget & T`, see https://github.com/DefinitelyTyped/DefinitelyTyped/pull/12239
    */
  type SyntheticEvent[T, E] = BaseSyntheticEvent[E, reactLib.EventTarget with T, reactLib.EventTarget]
  type TouchEventHandler[T] = EventHandler[TouchEvent[T]]
  type TransitionEventHandler[T] = EventHandler[TransitionEvent[T]]
  type UIEventHandler[T] = EventHandler[UIEvent[T]]
  type ValidationMap[T] = propDashTypesLib.propDashTypesMod.ValidationMap[T]
  //
  // React.PropTypes
  // ----------------------------------------------------------------------
  type Validator[T] = propDashTypesLib.propDashTypesMod.Validator[T]
  type WeakValidationMap[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? react.react.Validator<T[K]> | react.react.Validator<T[K] | null | undefined>}
    */ reactLib.reactLibStrings.WeakValidationMap with js.Any
  type WheelEventHandler[T] = EventHandler[WheelEvent[T]]
}
