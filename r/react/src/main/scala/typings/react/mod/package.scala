package typings.react

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnimationEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.AnimationEvent[T]]
  // tslint:disable-next-line:no-empty-interface
  type AudioHTMLAttributes[T] = typings.react.mod.MediaHTMLAttributes[T]
  type Booleanish = scala.Boolean
  type CElement[P, T /* <: typings.react.mod.Component[P, typings.react.mod.ComponentState, _] */] = typings.react.mod.ComponentElement[P, T]
  type CFactory[P, T /* <: typings.react.mod.Component[P, typings.react.mod.ComponentState, _] */] = typings.react.mod.ComponentFactory[P, T]
  type ChangeEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.ChangeEvent[T]]
  /**
    * We use an intersection type to infer multiple type parameters from
    * a single argument, which is useful for many top-level API defs.
    * See https://github.com/Microsoft/TypeScript/issues/7234 for more info.
    */
  type ClassType[P, T /* <: typings.react.mod.Component[P, typings.react.mod.ComponentState, _] */, C /* <: typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState] */] = C with (org.scalablytyped.runtime.Instantiable2[/* props */ P, js.UndefOr[/* context */ js.Any], T])
  type ClassicElement[P] = typings.react.mod.CElement[P, typings.react.mod.ClassicComponent[P, typings.react.mod.ComponentState]]
  type ClassicFactory[P] = typings.react.mod.CFactory[P, typings.react.mod.ClassicComponent[P, typings.react.mod.ComponentState]]
  type ClipboardEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.ClipboardEvent[T]]
  type ComponentFactory[P, T /* <: typings.react.mod.Component[P, typings.react.mod.ComponentState, _] */] = js.Function2[
    /* props */ js.UndefOr[typings.react.mod.ClassAttributes[T] with P], 
    /* repeated */ typings.react.mod.ReactNode, 
    typings.react.mod.CElement[P, T]
  ]
  /**
    * NOTE: prefer ComponentPropsWithRef, if the ref is forwarded,
    * or ComponentPropsWithoutRef when refs are not supported.
    */
  type ComponentProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] */ js.Any)
  type ComponentPropsWithRef[T /* <: typings.react.mod.ElementType[_] */] = typings.react.mod.PropsWithRef[typings.react.mod.ComponentProps[T]] | (typings.react.mod.PropsWithoutRef[_] with typings.react.mod.RefAttributes[typings.std.InstanceType[T]])
  type ComponentPropsWithoutRef[T /* <: typings.react.mod.ElementType[_] */] = typings.react.mod.PropsWithoutRef[typings.react.mod.ComponentProps[T]]
  type ComponentState = js.Any
  type ComponentType[P] = (typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState]) | typings.react.mod.FunctionComponent[P]
  type CompositionEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.CompositionEvent[T]]
  type Consumer[T] = typings.react.mod.ExoticComponent[typings.react.mod.ConsumerProps[T]]
  type ContextType[C /* <: typings.react.mod.Context[_] */] = js.Any
  type DOMFactory[P /* <: typings.react.mod.DOMAttributes[T] */, T /* <: typings.std.Element */] = js.Function2[
    /* props */ js.UndefOr[(typings.react.mod.ClassAttributes[T] with P) | scala.Null], 
    /* repeated */ typings.react.mod.ReactNode, 
    typings.react.mod.DOMElement[P, T]
  ]
  // Any prop that has a default prop becomes optional, but its type is unchanged
  // Undeclared default props are augmented into the resulting allowable attributes
  // If declared props have indexed properties, ignore default props entirely as keyof gets widened
  // Wrap in an outer-level conditional type to allow distribution over props that are unions
  type Defaultize[P, D] = ((typings.std.Pick[
    P, 
    typings.std.Exclude[/* keyof P */ java.lang.String, /* keyof D */ java.lang.String]
  ]) with (typings.std.Partial[
    typings.std.Pick[
      P, 
      typings.std.Extract[/* keyof P */ java.lang.String, /* keyof D */ java.lang.String]
    ]
  ]) with (typings.std.Partial[
    typings.std.Pick[
      D, 
      typings.std.Exclude[/* keyof D */ java.lang.String, /* keyof P */ java.lang.String]
    ]
  ])) | P
  // TODO (TypeScript 3.0): ReadonlyArray<unknown>
  type DependencyList = js.Array[js.Any]
  type DetailedHTMLProps[E /* <: typings.react.mod.HTMLAttributes[T] */, T] = typings.react.mod.ClassAttributes[T] with E
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
  type ElementRef[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any */] = js.UndefOr[js.Any | typings.std.InstanceType[C]]
  //
  // React Elements
  // ----------------------------------------------------------------------
  type ElementType[P] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' ]: P extends react.react.<global>.JSX.IntrinsicElements[K]? K : never}['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view'] */ js.Any) | typings.react.mod.ComponentType[P]
  //
  // Event Handler Types
  // ----------------------------------------------------------------------
  type EventHandler[E /* <: typings.react.mod.SyntheticEvent[_, typings.std.Event] */] = js.Function1[/* event */ E, scala.Unit]
  type ExactlyAnyPropertyKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: react.react.IsExactlyAny<T[K]> extends true? K : never}[keyof T] */ js.Any
  type FC[P] = typings.react.mod.FunctionComponent[P]
  //
  // Factories
  // ----------------------------------------------------------------------
  type Factory[P] = js.Function2[
    /* props */ js.UndefOr[typings.react.mod.Attributes with P], 
    /* repeated */ typings.react.mod.ReactNode, 
    typings.react.mod.ReactElement
  ]
  type FocusEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.FocusEvent[T]]
  // tslint:disable-next-line:no-empty-interface
  type FormEvent[T] = typings.react.mod.SyntheticEvent[T, typings.std.Event]
  type FormEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.FormEvent[T]]
  type FunctionComponentFactory[P] = js.Function2[
    /* props */ js.UndefOr[typings.react.mod.Attributes with P], 
    /* repeated */ typings.react.mod.ReactNode, 
    typings.react.mod.FunctionComponentElement[P]
  ]
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
  // tslint:disable-next-line:no-empty-interface
  type HTMLFactory[T /* <: typings.std.HTMLElement */] = typings.react.mod.DetailedHTMLFactory[typings.react.mod.AllHTMLAttributes[T], T]
  type JSXElementConstructor[P] = (js.Function1[/* props */ P, typings.react.mod.ReactElement | scala.Null]) | (org.scalablytyped.runtime.Instantiable1[/* props */ P, typings.react.mod.Component[P, js.Any, js.Any]])
  type Key = java.lang.String | scala.Double
  type KeyboardEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.KeyboardEvent[T]]
  type LazyExoticComponent[T /* <: typings.react.mod.ComponentType[_] */] = typings.react.mod.ExoticComponent[typings.react.mod.ComponentPropsWithRef[T]] with typings.react.anon.Result[T]
  type LegacyRef[T] = java.lang.String | typings.react.mod.Ref[T]
  // will show `Memo(${Component.displayName || Component.name})` in devtools by default,
  // but can be given its own specific name
  type MemoExoticComponent[T /* <: typings.react.mod.ComponentType[_] */] = typings.react.mod.NamedExoticComponent[typings.react.mod.ComponentPropsWithRef[T]] with typings.react.anon.Type[T]
  // Try to resolve ill-defined props like for JS users: props can be any, or sometimes objects with properties of type any
  type MergePropTypes[P, T] = ((typings.std.Pick[P, typings.react.mod.NotExactlyAnyPropertyKeys[P]]) with (typings.std.Pick[
    T, 
    typings.std.Exclude[/* keyof T */ java.lang.String, typings.react.mod.NotExactlyAnyPropertyKeys[P]]
  ]) with (typings.std.Pick[
    P, 
    typings.std.Exclude[/* keyof P */ java.lang.String, /* keyof T */ java.lang.String]
  ])) | P | T
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
    scala.Unit
  ]
  type PropsWithChildren[P] = P with typings.react.anon.Children
  /** Ensures that the props do not include string ref, which cannot be forwarded */
  type PropsWithRef[P] = P | (typings.react.mod.PropsWithoutRef[P] with typings.react.anon.RefExclude)
  /** Ensures that the props do not include ref at all */
  type PropsWithoutRef[P] = P | (typings.std.Pick[
    P, 
    typings.std.Exclude[/* keyof P */ java.lang.String, typings.react.reactStrings.ref]
  ])
  // NOTE: only the Context object itself can get a displayName
  // https://github.com/facebook/react-devtools/blob/e0b854e4c/backend/attachRendererFiber.js#L310-L325
  type Provider[T] = typings.react.mod.ProviderExoticComponent[typings.react.mod.ProviderProps[T]]
  type ReactChild = typings.react.mod.ReactElement | typings.react.mod.ReactText
  type ReactComponentElement[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */, P] = typings.react.mod.ReactElement
  type ReactEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.SyntheticEvent[T, typings.std.Event]]
  type ReactFragment = js.Object | typings.react.mod.ReactNodeArray
  // ReactHTML for ReactHTMLElement
  // tslint:disable-next-line:no-empty-interface
  type ReactHTMLElement[T /* <: typings.std.HTMLElement */] = typings.react.mod.DetailedReactHTMLElement[typings.react.mod.AllHTMLAttributes[T], T]
  //
  // Component API
  // ----------------------------------------------------------------------
  type ReactInstance = (typings.react.mod.Component[js.Any, js.Object, js.Any]) | typings.std.Element
  type ReactManagedAttributes[C, P] = P | (typings.react.mod.Defaultize[
    (typings.react.mod.MergePropTypes[P, typings.propTypes.mod.InferProps[js.Any]]) | P, 
    js.Any
  ]) | (typings.react.mod.MergePropTypes[P, typings.propTypes.mod.InferProps[js.Any]])
  type ReactNode = js.UndefOr[
    typings.react.mod.ReactChild | typings.react.mod.ReactFragment | typings.react.mod.ReactPortal | scala.Boolean
  ]
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
  type ReducerAction[R /* <: typings.react.mod.Reducer[_, _] */] = js.Any
  // types used to try and prevent the compiler from reducing S
  // to a supertype common with the second argument to useReducer()
  type ReducerState[R /* <: typings.react.mod.Reducer[_, _] */] = js.Any
  // The identity check is done with the SameValue algorithm (Object.is), which is stricter than ===
  type ReducerStateWithoutAction[R /* <: typings.react.mod.ReducerWithoutAction[_] */] = js.Any
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
    * If you thought this should be `EventTarget & T`, see https://github.com/DefinitelyTyped/DefinitelyTyped/pull/12239
    */
  type SyntheticEvent[T, E] = typings.react.mod.BaseSyntheticEvent[E, typings.std.EventTarget with T, typings.std.EventTarget]
  type TouchEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.TouchEvent[T]]
  type TransitionEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.TransitionEvent[T]]
  type TransitionFunction = js.Function0[js.UndefOr[scala.Unit]]
  type TransitionStartFunction = js.Function1[
    /* callback */ typings.react.experimentalMod.reactAugmentingMod.TransitionFunction, 
    scala.Unit
  ]
  type UIEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.UIEvent[T, typings.react.mod.NativeUIEvent]]
  type ValidationMap[T] = typings.propTypes.mod.ValidationMap[T]
  //
  // React.PropTypes
  // ----------------------------------------------------------------------
  type Validator[T] = typings.propTypes.mod.Validator[T]
  type WeakValidationMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? null extends T[K]? react.react.Validator<T[K] | null | undefined> : undefined extends T[K]? react.react.Validator<T[K] | null | undefined> : react.react.Validator<T[K]>}
    */ typings.react.reactStrings.WeakValidationMap with org.scalablytyped.runtime.TopLevel[js.Any]
  type WheelEventHandler[T] = typings.react.mod.EventHandler[typings.react.mod.WheelEvent[T]]
}
