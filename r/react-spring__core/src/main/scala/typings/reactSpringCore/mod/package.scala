package typings.reactSpringCore.mod

import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactSpringCore.anon.CallId
import typings.reactSpringCore.anon.Children
import typings.reactSpringCore.anon.From
import typings.reactSpringCore.anon.Height
import typings.reactSpringCore.anon.Items
import typings.reactSpringCore.anon.Keys
import typings.reactSpringCore.anon.Ref
import typings.reactSpringCore.anon.ScrollX
import typings.reactSpringCore.anon.To
import typings.reactSpringCore.anon.ToState
import typings.reactSpringCore.anon.ToUndefined
import typings.reactSpringCore.anon.`0`
import typings.reactSpringCore.anon.`4`
import typings.reactSpringCore.mod.^
import typings.reactSpringCore.reactSpringCoreBooleans.`true`
import typings.reactSpringCore.reactSpringCoreStrings.callId
import typings.reactSpringCore.reactSpringCoreStrings.cancel
import typings.reactSpringCore.reactSpringCoreStrings.children
import typings.reactSpringCore.reactSpringCoreStrings.default
import typings.reactSpringCore.reactSpringCoreStrings.delay
import typings.reactSpringCore.reactSpringCoreStrings.enter
import typings.reactSpringCore.reactSpringCoreStrings.expires
import typings.reactSpringCore.reactSpringCoreStrings.from
import typings.reactSpringCore.reactSpringCoreStrings.immediate
import typings.reactSpringCore.reactSpringCoreStrings.initial
import typings.reactSpringCore.reactSpringCoreStrings.items
import typings.reactSpringCore.reactSpringCoreStrings.keys
import typings.reactSpringCore.reactSpringCoreStrings.leave
import typings.reactSpringCore.reactSpringCoreStrings.loop
import typings.reactSpringCore.reactSpringCoreStrings.parentId
import typings.reactSpringCore.reactSpringCoreStrings.pause
import typings.reactSpringCore.reactSpringCoreStrings.ref
import typings.reactSpringCore.reactSpringCoreStrings.reset
import typings.reactSpringCore.reactSpringCoreStrings.reverse
import typings.reactSpringCore.reactSpringCoreStrings.sort
import typings.reactSpringCore.reactSpringCoreStrings.trail
import typings.reactSpringShared.mod.EasingDictionary
import typings.reactSpringShared.mod.FluidValue
import typings.reactSpringTypes.mod.Constrain
import typings.reactSpringTypes.mod.Falsy
import typings.reactSpringTypes.mod.InterpolatorFactory
import typings.reactSpringTypes.mod.Lookup
import typings.reactSpringTypes.mod.Merge
import typings.reactSpringTypes.mod.NoInfer
import typings.reactSpringTypes.mod.ObjectFromUnion
import typings.reactSpringTypes.mod.ObjectType
import typings.reactSpringTypes.mod.Omit
import typings.reactSpringTypes.mod.OneOrMore
import typings.reactSpringTypes.mod.Pick
import typings.reactSpringTypes.mod.Remap
import typings.reactSpringTypes.mod.UnknownProps
import typings.std.Exclude
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Spring[State /* <: js.Object */](
  props: From[State] & (Omit[
  SpringComponentProps[NoInfer[State]], 
  from | typings.reactSpringCore.reactSpringCoreStrings.to
])
): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Spring")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]

inline def Spring_to[State /* <: js.Object */](
  props: ToState[State] & (Omit[
  SpringComponentProps[NoInfer[State]], 
  typings.reactSpringCore.reactSpringCoreStrings.to
])
): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Spring")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]

inline def Trail[Item, Props /* <: TrailComponentProps[Item, scala.Any] */](param0: Props & (Valid[Props, TrailComponentProps[Item, Props]])): js.Array[js.UndefOr[String | Double | Boolean | ReactElement | ReactFragment | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Trail")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.UndefOr[String | Double | Boolean | ReactElement | ReactFragment | Null]]]

inline def Transition[Item, Props /* <: TransitionComponentProps[Item, scala.Any] */](
  props: (Props & (Valid[Props, TransitionComponentProps[Item, Props]])) | (TransitionComponentProps[Item, scala.Any])
): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Transition")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def createInterpolator: InterpolatorFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("createInterpolator").asInstanceOf[InterpolatorFactory]

inline def easings: EasingDictionary = ^.asInstanceOf[js.Dynamic].selectDynamic("easings").asInstanceOf[EasingDictionary]

/**
  * Clone the given `props` and move all non-reserved props
  * into the `to` prop.
  */
inline def inferTo[T /* <: js.Object */](props: T): InferTo_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("inferTo")(props.asInstanceOf[js.Any]).asInstanceOf[InferTo_[T]]

/** @deprecated Use the `to` export instead */
inline def interpolate: Interpolator = ^.asInstanceOf[js.Dynamic].selectDynamic("interpolate").asInstanceOf[Interpolator]

/** Map the value of one or more dependencies */
inline def to: Interpolator = ^.asInstanceOf[js.Dynamic].selectDynamic("to").asInstanceOf[Interpolator]

/** Advance all animations by the given time */
inline def update(dt: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(dt.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Used to orchestrate animation hooks in sequence with one another.
  * This is best used when you specifically want to orchestrate different
  * types of animation hook e.g. `useSpring` & `useTransition` in
  * sequence as opposed to multiple `useSpring` hooks.
  *
  *
  * ```jsx
  * export const MyComponent = () => {
  *  //...
  *  useChain([springRef, transitionRef])
  *  //...
  * }
  * ```
  *
  * @param refs – An array of `SpringRef`s.
  * @param timeSteps – Optional array of numbers that define the
  * delay between each animation from 0-1. The length should correlate
  * to the length of `refs`.
  * @param timeFrame – Optional number that defines the total duration
  *
  * @public
  */
inline def useChain(refs: js.Array[SpringRef[Lookup[scala.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useChain")(refs.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useChain(refs: js.Array[SpringRef[Lookup[scala.Any]]], timeSteps: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useChain")(refs.asInstanceOf[js.Any], timeSteps.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def useChain(refs: js.Array[SpringRef[Lookup[scala.Any]]], timeSteps: js.Array[Double], timeFrame: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useChain")(refs.asInstanceOf[js.Any], timeSteps.asInstanceOf[js.Any], timeFrame.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def useChain(refs: js.Array[SpringRef[Lookup[scala.Any]]], timeSteps: Unit, timeFrame: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useChain")(refs.asInstanceOf[js.Any], timeSteps.asInstanceOf[js.Any], timeFrame.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useInView(): js.Tuple2[RefObject[scala.Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInView")().asInstanceOf[js.Tuple2[RefObject[scala.Any], Boolean]]
inline def useInView(args: IntersectionArgs): js.Tuple2[RefObject[scala.Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInView")(args.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[RefObject[scala.Any], Boolean]]
inline def useInView[Props /* <: js.Object */](
  /**
  * TODO: make this narrower to only accept reserved props.
  */
props: js.Function0[Props & (Valid[Props, UseSpringProps[Props]])]
): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [react.react.RefObject<any>, @react-spring/core.@react-spring/core.SpringValues<State>] : never : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useInView")(props.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [react.react.RefObject<any>, @react-spring/core.@react-spring/core.SpringValues<State>] : never : never */ js.Any]
inline def useInView[Props /* <: js.Object */](
  /**
  * TODO: make this narrower to only accept reserved props.
  */
props: js.Function0[Props & (Valid[Props, UseSpringProps[Props]])],
  args: IntersectionArgs
): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [react.react.RefObject<any>, @react-spring/core.@react-spring/core.SpringValues<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useInView")(props.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [react.react.RefObject<any>, @react-spring/core.@react-spring/core.SpringValues<State>] : never : never */ js.Any]

/**
  * Accepts a function that contains imperative, possibly effectful code.
  *
  * @param effect Imperative function that can return a cleanup function
  * @param deps If present, effect will only activate if the values in the list change.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useEffect
  */
/* was `typeof useEffect` */
inline def useIsomorphicLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
/* was `typeof useEffect` */
inline def useIsomorphicLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Returns `boolean` or `null`, used to automatically
  * set skipAnimations to the value of the user's
  * `prefers-reduced-motion` query.
  *
  * The return value, post-effect, is the value of their prefered setting
  */
inline def useReducedMotion(): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useReducedMotion")().asInstanceOf[Boolean | Null]

/**
  * A small abstraction around the `useSpring` hook. It returns a `SpringValues`
  * object with the `width` and `height` of the element it's attached to & doesn't
  * necessarily have to be attached to the window, by passing a `container` you
  * can observe that element's size instead.
  *
  ```jsx
  import { useResize, animated } from '@react-spring/web'
  function MyComponent() {
  const { width } = useResize()
  return (
  <animated.div style={{ width }}>
  Hello World
  </animated.div>
  )
  }
  ```
  *
  * @param {UseResizeOptions} UseResizeOptions options for the useScroll hook.
  * @param {MutableRefObject<HTMLElement>} UseResizeOptions.container the container to listen to scroll events on, defaults to the window.
  *
  * @returns {SpringValues<{width: number; height: number;}>} SpringValues the collection of values returned from the inner hook
  */
inline def useResize(param0: UseResizeOptions): SpringValues[Height] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResize")(param0.asInstanceOf[js.Any]).asInstanceOf[SpringValues[Height]]

/**
  * A small utility abstraction around our signature useSpring hook. It's a great way to create
  * a scroll-linked animation. With either the raw value of distance or a 0-1 progress value.
  * You can either use the scroll values of the whole document, or just a specific element.
  *
  *
  ```jsx
  import { useScroll, animated } from '@react-spring/web'
  function MyComponent() {
  const { scrollYProgress } = useScroll()
  return (
  <animated.div style={{ opacity: scrollYProgress }}>
  Hello World
  </animated.div>
  )
  }
  ```
  *
  * @param {UseScrollOptions} useScrollOptions options for the useScroll hook.
  * @param {MutableRefObject<HTMLElement>} useScrollOptions.container the container to listen to scroll events on, defaults to the window.
  *
  * @returns {SpringValues<{scrollX: number; scrollY: number; scrollXProgress: number; scrollYProgress: number}>} SpringValues the collection of values returned from the inner hook
  */
inline def useScroll(): SpringValues[ScrollX] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScroll")().asInstanceOf[SpringValues[ScrollX]]
inline def useScroll(param0: UseScrollOptions): SpringValues[ScrollX] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScroll")(param0.asInstanceOf[js.Any]).asInstanceOf[SpringValues[ScrollX]]

/**
  * Updated on every render, with state inferred from forward props.
  */
inline def useSpring[Props /* <: js.Object */](props: Props & (Valid[Props, UseSpringProps[Props]])): SpringValues[PickAnimated[Props, `true`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any]).asInstanceOf[SpringValues[PickAnimated[Props, `true`]]]
inline def useSpring[Props /* <: js.Object */](props: Props & (Valid[Props, UseSpringProps[Props]]), deps: js.Array[scala.Any]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.SpringValues<State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.SpringValues<State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]
/**
  * The `props` function is only called on the first render, unless
  * `deps` change (when defined). State is inferred from forward props.
  */
inline def useSpring[Props /* <: js.Object */](props: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.SpringValues<State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.SpringValues<State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]
inline def useSpring[Props /* <: js.Object */](props: js.Function0[(Props & (Valid[Props, UseSpringProps[Props]])) | UseSpringProps[scala.Any]]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.SpringValues<State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.SpringValues<State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]
inline def useSpring[Props /* <: js.Object */](
  props: js.Function0[(Props & (Valid[Props, UseSpringProps[Props]])) | UseSpringProps[scala.Any]],
  deps: js.Array[scala.Any]
): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.SpringValues<State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.SpringValues<State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]
inline def useSpring[Props /* <: js.Object */](props: js.Function, deps: js.Array[scala.Any]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.SpringValues<State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.SpringValues<State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]
inline def useSpring[Props /* <: js.Object */](props: UseSpringProps[scala.Any]): SpringValues[PickAnimated[Props, `true`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any]).asInstanceOf[SpringValues[PickAnimated[Props, `true`]]]
inline def useSpring[Props /* <: js.Object */](props: UseSpringProps[scala.Any], deps: js.Array[scala.Any]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.SpringValues<State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.SpringValues<State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]

inline def useSpringRef[State /* <: Lookup[scala.Any] */](): SpringRef[State] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpringRef")().asInstanceOf[SpringRef[State]]

/**
  * Creates a constant single `SpringValue` that can be interacted
  * with imperatively. This is an advanced API and does not react
  * to updates from the parent component e.g. passing a new initial value
  *
  *
  * ```jsx
  * export const MyComponent = () => {
  *   const opacity = useSpringValue(1)
  *
  *   return <animated.div style={{ opacity }} />
  * }
  * ```
  *
  * @param initial – The initial value of the `SpringValue`.
  * @param props – Typically the same props as `useSpring` e.g. `config`, `loop` etc.
  *
  * @public
  */
inline def useSpringValue[T](initial: Exclude[T, js.Object]): SpringValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpringValue")(initial.asInstanceOf[js.Any]).asInstanceOf[SpringValue[T]]
inline def useSpringValue[T](initial: Exclude[T, js.Object], props: SpringUpdate[T]): SpringValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSpringValue")(initial.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[SpringValue[T]]

/**
  * Updated only when `deps` change, with state inferred from forward props.
  */
inline def useSpring_Props_Any[Props /* <: js.Object */](props: Props & (Valid[Props, UseSpringProps[Props]])): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.SpringValues<State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.SpringValues<State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]
inline def useSpring_Props_Any[Props /* <: js.Object */](props: UseSpringProps[scala.Any]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.SpringValues<State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.SpringValues<State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]

/**
  * When the `deps` argument exists, the `props` function is called whenever
  * the `deps` change on re-render.
  *
  * Without the `deps` argument, the `props` function is only called once.
  */
inline def useSprings[Props /* <: UseSpringProps[scala.Any] */](
  length: Double,
  props: js.Function2[/* i */ Double, /* ctrl */ Controller[Lookup[scala.Any]], Props]
): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useSprings")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]
inline def useSprings[Props /* <: UseSpringProps[scala.Any] */](
  length: Double,
  props: js.Function2[/* i */ Double, /* ctrl */ Controller[Lookup[scala.Any]], Props],
  deps: js.Array[scala.Any]
): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useSprings")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]

/**
  * Animations are updated on re-render.
  */
inline def useSprings_true[Props /* <: UseSpringsProps[Lookup[scala.Any]] */](length: Double, props: js.Array[Props] & (js.Array[UseSpringsProps[PickAnimated[Props, `true`]]])): js.Array[SpringValues[PickAnimated[Props, `true`]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSprings")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[SpringValues[PickAnimated[Props, `true`]]]]
inline def useSprings_true[Props /* <: UseSpringsProps[Lookup[scala.Any]] */](
  length: Double,
  props: js.Array[Props] & (js.Array[UseSpringsProps[PickAnimated[Props, `true`]]]),
  deps: js.Array[scala.Any]
): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useSprings")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]

/**
  * When the `deps` argument exists, you get the `update` and `stop` function.
  */
inline def useSprings_true_Props_Any[Props /* <: UseSpringsProps[Lookup[scala.Any]] */](length: Double, props: js.Array[Props] & (js.Array[UseSpringsProps[PickAnimated[Props, `true`]]])): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useSprings")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]

inline def useTrail[Props /* <: js.Object */](length: Double, props: Props & (Valid[Props, UseTrailProps[Props]])): js.Array[SpringValues[PickAnimated[Props, `true`]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTrail")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[SpringValues[PickAnimated[Props, `true`]]]]
inline def useTrail[Props /* <: js.Object */](length: Double, props: Props & (Valid[Props, UseTrailProps[Props]]), deps: js.Array[scala.Any]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTrail")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]
inline def useTrail[Props /* <: js.Object */](
  length: Double,
  props: js.Function2[
  /* i */ Double, 
  /* ctrl */ Controller[Lookup[scala.Any]], 
  UseTrailProps[scala.Any] | (Props & (Valid[Props, UseTrailProps[Props]]))
]
): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTrail")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]
inline def useTrail[Props /* <: js.Object */](
  length: Double,
  props: js.Function2[
  /* i */ Double, 
  /* ctrl */ Controller[Lookup[scala.Any]], 
  UseTrailProps[scala.Any] | (Props & (Valid[Props, UseTrailProps[Props]]))
],
  deps: js.Array[scala.Any]
): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTrail")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]
/**
  * This hook is an abstraction around `useSprings` and is designed to
  * automatically orchestrate the springs to stagger one after the other
  *
  * ```jsx
  * export const MyComponent = () => {
  *  const trails = useTrail(3, {opacity: 0})
  *
  *  return trails.map(styles => <animated.div style={styles} />)
  * }
  * ```
  *
  * @param length – The number of springs you want to create
  * @param propsArg – The props to pass to the internal `useSprings` hook,
  * therefore is the same as `useSprings`.
  *
  * @public
  */
inline def useTrail[Props /* <: js.Object */](length: Double, props: UseTrailProps[scala.Any]): js.Array[SpringValues[PickAnimated[Props, `true`]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTrail")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[SpringValues[PickAnimated[Props, `true`]]]]
/**
  * This hook is an abstraction around `useSprings` and is designed to
  * automatically orchestrate the springs to stagger one after the other
  *
  * ```jsx
  * export const MyComponent = () => {
  *  const trails = useTrail(3, {opacity: 0}, [])
  *
  *  return trails.map(styles => <animated.div style={styles} />)
  * }
  * ```
  *
  * @param length – The number of springs you want to create
  * @param propsArg – The props to pass to the internal `useSprings` hook,
  * therefore is the same as `useSprings`.
  * @param deps – The optional array of dependencies to pass to the internal
  * `useSprings` hook, therefore is the same as `useSprings`.
  *
  * @public
  */
inline def useTrail[Props /* <: js.Object */](length: Double, props: UseTrailProps[scala.Any], deps: js.Array[scala.Any]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTrail")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]

inline def useTransition[Item, Props /* <: js.Object */](data: OneOrMore[Item], props: Props & (Valid[Props, UseTransitionProps[Item]])): TransitionFn[Item, PickAnimated[Props, `true`]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[TransitionFn[Item, PickAnimated[Props, `true`]]]
inline def useTransition[Item, Props /* <: js.Object */](
  data: OneOrMore[Item],
  props: Props & (Valid[Props, UseTransitionProps[Item]]),
  deps: js.Array[scala.Any]
): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.TransitionFn<Item, State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.TransitionFn<Item, State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]
inline def useTransition[Item, Props /* <: js.Object */](
  data: OneOrMore[Item],
  props: js.Function0[UseTransitionProps[Item] | (Props & (Valid[Props, UseTransitionProps[Item]]))]
): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.TransitionFn<Item, @react-spring/core.@react-spring/core.PickAnimated<Props, true>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.TransitionFn<Item, @react-spring/core.@react-spring/core.PickAnimated<Props, true>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]
inline def useTransition[Item, Props /* <: js.Object */](
  data: OneOrMore[Item],
  props: js.Function0[UseTransitionProps[Item] | (Props & (Valid[Props, UseTransitionProps[Item]]))],
  deps: js.Array[scala.Any]
): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.TransitionFn<Item, @react-spring/core.@react-spring/core.PickAnimated<Props, true>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.TransitionFn<Item, @react-spring/core.@react-spring/core.PickAnimated<Props, true>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]
inline def useTransition[Item, Props /* <: js.Object */](data: OneOrMore[Item], props: UseTransitionProps[Item]): TransitionFn[Item, PickAnimated[Props, `true`]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[TransitionFn[Item, PickAnimated[Props, `true`]]]
inline def useTransition[Item, Props /* <: js.Object */](data: OneOrMore[Item], props: UseTransitionProps[Item], deps: js.Array[scala.Any]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.TransitionFn<Item, State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.TransitionFn<Item, State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]

inline def useTransition_ItemProps_Any[Item, Props /* <: js.Object */](data: OneOrMore[Item], props: Props & (Valid[Props, UseTransitionProps[Item]])): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.TransitionFn<Item, State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.TransitionFn<Item, State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]
inline def useTransition_ItemProps_Any[Item, Props /* <: js.Object */](data: OneOrMore[Item], props: UseTransitionProps[Item]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.TransitionFn<Item, State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [@react-spring/core.@react-spring/core.TransitionFn<Item, State>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]

/** @internal */
type AnimationResolver[T /* <: Readable[scala.Any] */] = js.Function1[/* result */ AnimationResult[T] | js.Promise[AnimationResult[T]], Unit]

/** The promised result of an animation. */
type AsyncResult[T /* <: Readable[scala.Any] */] = js.Promise[AnimationResult[T]]

type AsyncTo[T] = SpringChain[T] | SpringToFn[T]

/** The flush function that handles `start` calls */
type ControllerFlushFn[T /* <: Controller[scala.Any] */] = js.Function2[
/* ctrl */ T, 
/* queue */ ControllerQueue[InferState[T]], 
js.Promise[AnimationResult[T]]]

/** Queue of pending updates for a `Controller` instance. */
type ControllerQueue[State /* <: Lookup[scala.Any] */] = js.Array[(ControllerUpdate[State, scala.Any]) & `4`]

type ControllerUpdate[State /* <: Lookup[scala.Any] */, Item] = scala.Any & ToProps[State] & (ControllerProps[State, Item])

type ControllerUpdateFn[State /* <: Lookup[scala.Any] */] = js.Function2[
/* i */ Double, 
/* ctrl */ Controller[State], 
(ControllerUpdate[State, Unit]) | Falsy]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  Item extends undefined ? (result : @react-spring/core.@react-spring/core.AnimationResult<TResult>, ctrl : TSource, item : Item | undefined): void : (result : @react-spring/core.@react-spring/core.AnimationResult<TResult>, ctrl : TSource, item : Item): void
  }}}
  */
type EventHandler[TResult /* <: Readable[scala.Any] */, TSource, Item] = js.Function3[
/* result */ AnimationResult[TResult], 
/* ctrl */ TSource, 
/* item */ js.UndefOr[Item], 
Unit]

/** Event props can be customized per-key. */
type EventProp[T] = T | Lookup[js.UndefOr[T]]

/**
  * Extract the custom props that are treated like `to` values
  */
type ForwardProps[T /* <: js.Object */] = RawValues[
Omit[
  Constrain[T, js.Object], 
  typings.reactSpringCore.reactSpringCoreStrings.config | from | typings.reactSpringCore.reactSpringCoreStrings.to | ref | loop | pause | reset | cancel | reverse | immediate | default | delay | items | trail | sort | expires | initial | enter | typings.reactSpringCore.reactSpringCoreStrings.update | leave | children | keys | callId | parentId
]]

/**
  * A value or set of values that can be animated from/to.
  *
  * The `T` parameter can be a set of animated values (as an object type)
  * or a primitive type for a single animated value.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  [T] extends [@react-spring/core.@react-spring/core.IsPlainObject<T>] ? @react-spring/core.@react-spring/core.GoalValues<T> | @react-spring/types.@react-spring/types.Falsy : @react-spring/core.@react-spring/core.GoalValue<T>
  }}}
  */
type GoalProp[T] = GoalValues[T] | Falsy

/**
  * A value that `SpringValue` objects can animate from/to.
  *
  * The `UnknownProps` type lets you pass in { a: 1 } if the `key`
  * property of `SpringValue` equals "a".
  */
type GoalValue[T] = js.UndefOr[T | (FluidValue[T, scala.Any]) | UnknownProps | Null]

/** @internal */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @react-spring/core.@react-spring/core.Controller<infer State> ? @react-spring/core.@react-spring/core.ControllerUpdate<State, undefined> : T extends @react-spring/core.@react-spring/core.SpringValue<infer U> ? @react-spring/core.@react-spring/core.SpringUpdate<U> : @react-spring/types.@react-spring/types.Lookup<any>
  }}}
  */
type InferProps[T /* <: Readable[scala.Any] */] = Lookup[scala.Any]

/** @internal */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends object ? T extends std.ReadonlyArray<number | string> ? @react-spring/core.@react-spring/core.SpringValue<T> : @react-spring/core.@react-spring/core.Controller<T> : @react-spring/core.@react-spring/core.SpringValue<T>
  }}}
  */
type InferTarget[T] = SpringValue[T]

/**
  * Move all non-reserved props into the `to` prop.
  */
type InferTo_[T /* <: js.Object */] = Merge[
To[T], 
Pick[
  T, 
  (/* keyof T */ String) & (typings.reactSpringCore.reactSpringCoreStrings.config | from | typings.reactSpringCore.reactSpringCoreStrings.to | ref | loop | pause | reset | cancel | reverse | immediate | default | delay | items | trail | sort | expires | initial | enter | typings.reactSpringCore.reactSpringCoreStrings.update | leave | children | keys | callId | parentId)
]]

/**
  * Where `to` is inferred from non-reserved props
  *
  * The `T` parameter can be a set of animated values (as an object type)
  * or a primitive type for a single animated value.
  */
type InlineToProps[T] = Remap[GoalValues[T] & ToUndefined]

/** Return a union type of every key whose `T` value is incompatible with its `U` value */
type InvalidKeys[T, U] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T & keyof U ]: T[P] extends U[P]? never : P}[keyof T & keyof U] */ js.Any

/**
  * For testing whether a type is an object but not an array.
  *
  *     T extends IsPlainObject<T> ? true : false
  *
  * When `any` is passed, the resolved type is `true | false`.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends std.ReadonlyArray<any> ? @react-spring/types.@react-spring/types.Any : T extends object ? object : @react-spring/types.@react-spring/types.Any
  }}}
  */
type IsPlainObject[T] = typings.reactSpringTypes.mod.Any

type ItemKeys[T] = OneOrMore[Key] | (js.Function1[/* item */ T, Key]) | Null

type Key = String | Double

type LoopProp[T /* <: js.Object */] = Boolean | T | (js.Function0[Boolean | T])

/** For props that can be set on a per-key basis. */
type MatchProp[T] = Boolean | OneOrMore[StringKeys[T]] | (js.Function1[/* key */ StringKeys[T], Boolean])

/** Replace the type of each `P` property with `never` */
type NeverProps[T, P /* <: /* keyof T */ String */] = Remap[
(Pick[T, Exclude[/* keyof T */ String, P]]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in P ]: never} */ js.Any)]

/** Called when a `SpringValue` changes */
type OnChange[TResult /* <: Readable[scala.Any] */, TSource, Item] = EventHandler[TResult, TSource, Item]

type OnPause[TResult /* <: Readable[scala.Any] */, TSource, Item] = EventHandler[TResult, TSource, Item]

/**
  * Called after an animation is updated by new props,
  * even if the animation remains idle.
  */
type OnProps[T] = js.Function2[/* props */ SpringProps[T], /* spring */ SpringValue[T], Unit]

type OnResolve[TResult /* <: Readable[scala.Any] */, TSource, Item] = EventHandler[TResult, TSource, Item]

/** Called once the animation comes to a halt */
type OnRest[TResult /* <: Readable[scala.Any] */, TSource, Item] = EventHandler[TResult, TSource, Item]

type OnResume[TResult /* <: Readable[scala.Any] */, TSource, Item] = EventHandler[TResult, TSource, Item]

/**
  * Called before the first frame of every animation.
  * From inside the `requestAnimationFrame` callback.
  */
type OnStart[TResult /* <: Readable[scala.Any] */, TSource, Item] = EventHandler[TResult, TSource, Item]

/**
  * Pick the properties of these object props...
  *
  *     "to", "from", "initial", "enter", "update", "leave"
  *
  * ...as well as any forward props.
  */
type PickAnimated[Props /* <: js.Object */, Fwd] = scala.Any & (/* import warning: importer.ImportType#apply Failed type conversion: [Props] extends [@react-spring/types.@react-spring/types.Any] ? @react-spring/types.@react-spring/types.Lookup<any> : [object] extends [Props] ? @react-spring/types.@react-spring/types.Lookup<any> : @react-spring/types.@react-spring/types.ObjectFromUnion<Props extends {  from :infer From} ? From extends (): any ? std.ReturnType<From> : @react-spring/types.@react-spring/types.ObjectType<From> : @react-spring/core.@react-spring/core.TransitionKey & keyof Props extends never ? @react-spring/core.@react-spring/core.ToValues<Props, Fwd> : @react-spring/core.@react-spring/core.TransitionValues<Props>> */ js.Any)

/** @internal */
type RunAsyncProps[T /* <: AnimationTarget[scala.Any] */] = InferProps[T] & CallId

/** A serial queue of spring updates. */
type SpringChain[T] = js.Array[
/* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@react-spring/core.@react-spring/core.IsPlainObject<T>] ? @react-spring/core.@react-spring/core.ControllerUpdate<T, undefined> : @react-spring/core.@react-spring/core.SpringTo<T> | @react-spring/core.@react-spring/core.SpringUpdate<T> */ js.Any]

type SpringComponentProps[State /* <: js.Object */] = scala.Any & UseSpringProps[State] & Children[State]

/** A value that any `SpringValue` or `Controller` can animate to. */
type SpringTo[T] = (/* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@react-spring/core.@react-spring/core.IsPlainObject<T>] ? never : T | @react-spring/shared.@react-spring/shared.FluidValue<T, any> */ js.Any) | SpringChain[T] | SpringToFn[T] | Falsy

/**
  * An async function that can update or stop the animations of a spring.
  * Typically defined as the `to` prop.
  *
  * The `T` parameter can be a set of animated values (as an object type)
  * or a primitive type for a single animated value.
  */
type SpringToFn[T] = js.Function2[/* start */ StartFn[T], /* stop */ StopFn[T], js.Promise[scala.Any] | Unit]

/**
  * The props of a `useSpring` call or its async `update` function.
  *
  * The `T` parameter can be a set of animated values (as an object type)
  * or a primitive type for a single animated value.
  */
type SpringUpdate[T] = ToProps[T] & SpringProps[T]

/**
  * Update the props of an animation.
  *
  * The `T` parameter can be a set of animated values (as an object type)
  * or a primitive type for a single animated value.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @react-spring/core.@react-spring/core.IsPlainObject<T> ? @react-spring/core.@react-spring/core.UpdateValuesFn<T> : @react-spring/core.@react-spring/core.UpdateValueFn<T>
  }}}
  */
type SpringUpdateFn[T] = UpdateValuesFn[T]

/**
  * The set of `SpringValue` objects returned by a `useSpring` call (or similar).
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  [T] extends [@react-spring/types.@react-spring/types.Any] ? @react-spring/types.@react-spring/types.Lookup<@react-spring/core.@react-spring/core.SpringValue<unknown> | undefined> : {[ P in keyof T ]: @react-spring/core.@react-spring/core.SpringWrap<T[P]>}
  }}}
  */
type SpringValues[T /* <: Lookup[scala.Any] */] = Lookup[js.UndefOr[SpringValue[scala.Any]]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  [std.Exclude<T, @react-spring/shared.@react-spring/shared.FluidValue<any, any>>, std.Extract<T, std.Array<any>>] extends [object | void, never] ? never : @react-spring/core.@react-spring/core.SpringValue<std.Exclude<T, @react-spring/shared.@react-spring/shared.FluidValue<any, any> | void>> | std.Extract<T, void>
  }}}
  */
type SpringWrap[T] = (SpringValue[Exclude[T, (FluidValue[scala.Any, scala.Any]) | Unit]]) | (Extract[T, Unit])

/** Map an object type to allow `SpringValue` for any property */
type Springify[T] = Lookup[js.UndefOr[SpringValue[scala.Any]]] & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] | @react-spring/core.@react-spring/core.SpringValue<T[P]>} */ js.Any)

type SpringsUpdate[State /* <: Lookup[scala.Any] */] = (OneOrMore[ControllerUpdate[State, Unit]]) | (js.Function2[
/* index */ Double, 
/* ctrl */ Controller[State], 
(ControllerUpdate[State, Unit]) | Null])

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @react-spring/core.@react-spring/core.IsPlainObject<T> ? string & keyof T : string
  }}}
  */
type StringKeys[T] = String

/**
  * A union type of all possible `to` prop values.
  *
  * This is not recommended for function types. Instead, you should declare
  * an overload for each `to` type. See `SpringUpdateFn` for an example.
  *
  * The `T` parameter can be a set of animated values (as an object type)
  * or a primitive type for a single animated value.
  */
type ToProps[T] = `0`[T] | (/* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@react-spring/core.@react-spring/core.IsPlainObject<T>] ? @react-spring/core.@react-spring/core.InlineToProps<T> : never */ js.Any)

/**
  * Pick the values of the `to` prop. Forward props are *not* included.
  */
type ToValues[Props /* <: js.Object */, AndForward] = scala.Any & (/* import warning: importer.ImportType#apply Failed type conversion: AndForward extends true ? @react-spring/core.@react-spring/core.ForwardProps<Props> : unknown */ js.Any)

type TrailComponentProps[Item, Props /* <: js.Object */] = scala.Any & UseSpringProps[Props] & (Items[Item, Props])

type TransitionComponentProps[Item, Props /* <: js.Object */] = scala.Any & UseTransitionProps[Item] & (Keys[Item, Props])

/** The function returned by `useTransition` */
type TransitionFn[Item, State /* <: Lookup[scala.Any] */] = js.Function1[/* render */ TransitionRenderFn[Item, State], Element]

type TransitionFrom[Item] = Falsy | GoalProp[UnknownProps] | (js.Function2[/* item */ Item, /* index */ Double, GoalProp[UnknownProps] | Falsy])

type TransitionRenderFn[Item, State /* <: Lookup[scala.Any] */] = js.Function4[
/* values */ SpringValues[State], 
/* item */ Item, 
/* transition */ TransitionState[Item, State], 
/* index */ Double, 
ReactNode]

type TransitionTo[Item, State /* <: Lookup[scala.Any] */] = Falsy | (OneOrMore[ControllerUpdate[State, Item]]) | js.Function | (js.Function2[
/* item */ Item, 
/* index */ Double, 
(ControllerUpdate[State, Item]) | SpringChain[State] | SpringToFn[State] | Falsy])

/**
  * Extract a union of animated values from a set of `useTransition` props.
  */
type TransitionValues[Props /* <: js.Object */] = scala.Any & (ForwardProps[
ObjectFromUnion[
  Constrain[
    ObjectType[
      /* import warning: importer.ImportType#apply Failed type conversion: Props[@react-spring/core.@react-spring/core.TransitionKey & keyof Props] extends infer T ? T extends std.ReadonlyArray<infer Element> ? Element : T extends (args : ...any): infer Return ? Return extends std.ReadonlyArray<infer ReturnElement> ? ReturnElement : Return : T : never */ js.Any
    ], 
    js.Object
  ]
]])

type UseSpringsProps[State /* <: Lookup[scala.Any] */] = scala.Any & (ControllerUpdate[State, Unit]) & Ref[State]

type UseTrailProps[Props /* <: js.Object */] = UseSpringProps[Props]

/** Replace the type of each `T` property with `never` (unless compatible with `U`) */
type Valid[T, U] = NeverProps[T, InvalidKeys[T, U]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends std.ReadonlyArray<number | string> ? std.Array<number> : number
  }}}
  */
type VelocityProp[T] = js.Array[Double]
