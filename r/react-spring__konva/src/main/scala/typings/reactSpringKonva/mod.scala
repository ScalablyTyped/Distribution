package typings.reactSpringKonva

import org.scalablytyped.runtime.Shortcut
import typings.konva.mod.Konva.Arc
import typings.konva.mod.Konva.ArcConfig
import typings.konva.mod.Konva.Arrow
import typings.konva.mod.Konva.ArrowConfig
import typings.konva.mod.Konva.Circle
import typings.konva.mod.Konva.CircleConfig
import typings.konva.mod.Konva.Ellipse
import typings.konva.mod.Konva.EllipseConfig
import typings.konva.mod.Konva.FastLayer
import typings.konva.mod.Konva.Group
import typings.konva.mod.Konva.GroupConfig
import typings.konva.mod.Konva.Image
import typings.konva.mod.Konva.ImageConfig
import typings.konva.mod.Konva.Label
import typings.konva.mod.Konva.LabelConfig
import typings.konva.mod.Konva.Layer
import typings.konva.mod.Konva.LayerConfig
import typings.konva.mod.Konva.Line
import typings.konva.mod.Konva.LineConfig
import typings.konva.mod.Konva.Path
import typings.konva.mod.Konva.PathConfig
import typings.konva.mod.Konva.Rect
import typings.konva.mod.Konva.RectConfig
import typings.konva.mod.Konva.RegularPolygon
import typings.konva.mod.Konva.RegularPolygonConfig
import typings.konva.mod.Konva.Ring
import typings.konva.mod.Konva.RingConfig
import typings.konva.mod.Konva.Shape
import typings.konva.mod.Konva.ShapeConfig
import typings.konva.mod.Konva.Sprite
import typings.konva.mod.Konva.SpriteConfig
import typings.konva.mod.Konva.Stage
import typings.konva.mod.Konva.Star
import typings.konva.mod.Konva.StarConfig
import typings.konva.mod.Konva.Tag
import typings.konva.mod.Konva.TagConfig
import typings.konva.mod.Konva.Text
import typings.konva.mod.Konva.TextConfig
import typings.konva.mod.Konva.TextPath
import typings.konva.mod.Konva.TextPathConfig
import typings.konva.mod.Konva.Transformer
import typings.konva.mod.Konva.TransformerConfig
import typings.konva.mod.Konva.Wedge
import typings.konva.mod.Konva.WedgeConfig
import typings.react.mod.Consumer
import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.Provider
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactKonva.reactKonvaCoreMod.KonvaNodeComponent
import typings.reactKonva.reactKonvaCoreMod.StageProps
import typings.reactReconciler.mod.Reconciler
import typings.reactSpringCore.anon.Friction
import typings.reactSpringCore.anon.FrictionTension
import typings.reactSpringCore.anon.From
import typings.reactSpringCore.anon.Height
import typings.reactSpringCore.anon.ScrollX
import typings.reactSpringCore.anon.Tension
import typings.reactSpringCore.anon.ToState
import typings.reactSpringCore.anon.`1`
import typings.reactSpringCore.anon.`2`
import typings.reactSpringCore.anon.`3`
import typings.reactSpringCore.mod.ControllerFlushFn
import typings.reactSpringCore.mod.ControllerUpdate
import typings.reactSpringCore.mod.InferTo_
import typings.reactSpringCore.mod.Interpolator
import typings.reactSpringCore.mod.IntersectionArgs
import typings.reactSpringCore.mod.PickAnimated
import typings.reactSpringCore.mod.SpringComponentProps
import typings.reactSpringCore.mod.SpringRef
import typings.reactSpringCore.mod.SpringUpdate
import typings.reactSpringCore.mod.SpringValues
import typings.reactSpringCore.mod.TrailComponentProps
import typings.reactSpringCore.mod.TransitionComponentProps
import typings.reactSpringCore.mod.TransitionFn
import typings.reactSpringCore.mod.UseResizeOptions
import typings.reactSpringCore.mod.UseScrollOptions
import typings.reactSpringCore.mod.UseSpringProps
import typings.reactSpringCore.mod.UseSpringsProps
import typings.reactSpringCore.mod.UseTrailProps
import typings.reactSpringCore.mod.UseTransitionProps
import typings.reactSpringCore.mod.Valid
import typings.reactSpringKonva.reactSpringKonvaBooleans.`true`
import typings.reactSpringKonva.reactSpringKonvaStrings.from
import typings.reactSpringShared.mod.EasingDictionary
import typings.reactSpringTypes.mod.ComponentPropsWithRef
import typings.reactSpringTypes.mod.ElementType
import typings.reactSpringTypes.mod.InterpolatorArgs
import typings.reactSpringTypes.mod.InterpolatorFactory
import typings.reactSpringTypes.mod.Lookup
import typings.reactSpringTypes.mod.NoInfer
import typings.reactSpringTypes.mod.Omit
import typings.reactSpringTypes.mod.OneOrMore
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-spring/konva", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-spring/konva", "AnimationConfig")
  @js.native
  open class AnimationConfig ()
    extends typings.reactSpringCore.mod.AnimationConfig
  
  /** Use `[T] extends [Any]` to know if a type parameter is `any` */
  @JSImport("@react-spring/konva", "Any")
  @js.native
  open class Any ()
    extends typings.reactSpringCore.mod.Any
  
  /** This error is thrown to signal an interrupted async animation. */
  @JSImport("@react-spring/konva", "BailSignal")
  @js.native
  open class BailSignal ()
    extends typings.reactSpringCore.mod.BailSignal
  
  @JSImport("@react-spring/konva", "Controller")
  @js.native
  open class Controller[State /* <: Lookup[scala.Any] */] ()
    extends typings.reactSpringCore.mod.Controller[State] {
    def this(props: ControllerUpdate[State, Unit]) = this()
    def this(props: Null, flush: ControllerFlushFn[scala.Any]) = this()
    def this(props: Unit, flush: ControllerFlushFn[scala.Any]) = this()
    def this(props: ControllerUpdate[State, Unit], flush: ControllerFlushFn[scala.Any]) = this()
  }
  
  /**
    * A kind of `FluidValue` that manages an `AnimatedValue` node.
    *
    * Its underlying value can be accessed and even observed.
    */
  /* note: abstract class */ @JSImport("@react-spring/konva", "FrameValue")
  @js.native
  open class FrameValue[T] ()
    extends typings.reactSpringCore.mod.FrameValue[T] {
    def this(get: js.Function0[T]) = this()
  }
  
  /**
    * An `Interpolation` is a memoized value that's computed whenever one of its
    * `FluidValue` dependencies has its value changed.
    *
    * Other `FrameValue` objects can depend on this. For example, passing an
    * `Interpolation` as the `to` prop of a `useSpring` call will trigger an
    * animation toward the memoized value.
    */
  @JSImport("@react-spring/konva", "Interpolation")
  @js.native
  open class Interpolation[Input, Output] protected ()
    extends typings.reactSpringCore.mod.Interpolation[Input, Output] {
    def this(/** The source of input values */
    source: scala.Any, args: InterpolatorArgs[Input, Output]) = this()
  }
  
  inline def Spring[State /* <: js.Object */](
    props: From[State] & (Omit[
      SpringComponentProps[NoInfer[State]], 
      from | typings.reactSpringKonva.reactSpringKonvaStrings.to
    ])
  ): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Spring")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  object SpringContext {
    
    inline def apply(param0: PropsWithChildren[typings.reactSpringCore.mod.SpringContext]): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@react-spring/konva", "SpringContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-spring/konva", "SpringContext.Consumer")
    @js.native
    def Consumer: typings.react.mod.Consumer[typings.reactSpringCore.mod.SpringContext] = js.native
    inline def Consumer_=(x: Consumer[typings.reactSpringCore.mod.SpringContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Consumer")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/konva", "SpringContext.Provider")
    @js.native
    def Provider: typings.react.mod.Provider[typings.reactSpringCore.mod.SpringContext] = js.native
    inline def Provider_=(x: Provider[typings.reactSpringCore.mod.SpringContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Provider")(x.asInstanceOf[js.Any])
  }
  
  inline def SpringRef[State /* <: Lookup[scala.Any] */](): typings.reactSpringCore.mod.SpringRef[State] = ^.asInstanceOf[js.Dynamic].applyDynamic("SpringRef")().asInstanceOf[typings.reactSpringCore.mod.SpringRef[State]]
  
  /**
    * Only numbers, strings, and arrays of numbers/strings are supported.
    * Non-animatable strings are also supported.
    */
  @JSImport("@react-spring/konva", "SpringValue")
  @js.native
  open class SpringValue[T] ()
    extends typings.reactSpringCore.mod.SpringValue[T] {
    def this(from: Exclude[T, js.Object]) = this()
    def this(props: SpringUpdate[T]) = this()
    def this(from: Exclude[T, js.Object], props: SpringUpdate[T]) = this()
  }
  
  inline def Spring_to[State /* <: js.Object */](
    props: ToState[State] & (Omit[
      SpringComponentProps[NoInfer[State]], 
      typings.reactSpringKonva.reactSpringKonvaStrings.to
    ])
  ): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Spring")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def Trail[Item, Props /* <: TrailComponentProps[Item, scala.Any] */](param0: Props & (Valid[Props, TrailComponentProps[Item, Props]])): js.Array[js.UndefOr[String | Double | Boolean | ReactElement | ReactFragment | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Trail")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.UndefOr[String | Double | Boolean | ReactElement | ReactFragment | Null]]]
  
  inline def Transition[Item, Props /* <: TransitionComponentProps[Item, scala.Any] */](
    props: (Props & (Valid[Props, TransitionComponentProps[Item, Props]])) | (TransitionComponentProps[Item, scala.Any])
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Transition")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-spring/konva", "TransitionPhase")
  @js.native
  object TransitionPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactSpringCore.mod.TransitionPhase & String] = js.native
    
    /* "enter" */ val ENTER: typings.reactSpringCore.mod.TransitionPhase.ENTER & String = js.native
    
    /* "leave" */ val LEAVE: typings.reactSpringCore.mod.TransitionPhase.LEAVE & String = js.native
    
    /* "mount" */ val MOUNT: typings.reactSpringCore.mod.TransitionPhase.MOUNT & String = js.native
    
    /* "update" */ val UPDATE: typings.reactSpringCore.mod.TransitionPhase.UPDATE & String = js.native
  }
  
  @JSImport("@react-spring/konva", "a")
  @js.native
  val a: WithAnimated = js.native
  
  @JSImport("@react-spring/konva", "animated")
  @js.native
  val animated: WithAnimated = js.native
  
  object config extends Shortcut {
    
    @JSImport("@react-spring/konva", "config.default")
    @js.native
    val default: Friction = js.native
    
    @JSImport("@react-spring/konva", "config.gentle")
    @js.native
    val gentle: Tension = js.native
    
    @JSImport("@react-spring/konva", "config.molasses")
    @js.native
    val molasses: `3` = js.native
    
    @JSImport("@react-spring/konva", "config.slow")
    @js.native
    val slow: `2` = js.native
    
    @JSImport("@react-spring/konva", "config.stiff")
    @js.native
    val stiff: `1` = js.native
    
    @JSImport("@react-spring/konva", "config.wobbly")
    @js.native
    val wobbly: FrictionTension = js.native
    
    type _To = Friction
    
    /* This means you don't have to write `default`, but can instead just say `config.foo` */
    override def _to: Friction = default
  }
  
  @JSImport("@react-spring/konva", "createInterpolator")
  @js.native
  val createInterpolator: InterpolatorFactory = js.native
  
  @JSImport("@react-spring/konva", "easings")
  @js.native
  val easings: EasingDictionary = js.native
  
  /**
    * Clone the given `props` and move all non-reserved props
    * into the `to` prop.
    */
  inline def inferTo[T /* <: js.Object */](props: T): InferTo_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("inferTo")(props.asInstanceOf[js.Any]).asInstanceOf[InferTo_[T]]
  
  /** @deprecated Use the `to` export instead */
  @JSImport("@react-spring/konva", "interpolate")
  @js.native
  val interpolate: Interpolator = js.native
  
  /** Map the value of one or more dependencies */
  @JSImport("@react-spring/konva", "to")
  @js.native
  val to: Interpolator = js.native
  
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
  inline def useSpringValue[T](initial: Exclude[T, js.Object]): typings.reactSpringCore.mod.SpringValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpringValue")(initial.asInstanceOf[js.Any]).asInstanceOf[typings.reactSpringCore.mod.SpringValue[T]]
  inline def useSpringValue[T](initial: Exclude[T, js.Object], props: SpringUpdate[T]): typings.reactSpringCore.mod.SpringValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSpringValue")(initial.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typings.reactSpringCore.mod.SpringValue[T]]
  
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
    props: js.Function2[
      /* i */ Double, 
      /* ctrl */ typings.reactSpringCore.mod.Controller[Lookup[scala.Any]], 
      Props
    ]
  ): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useSprings")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]
  inline def useSprings[Props /* <: UseSpringProps[scala.Any] */](
    length: Double,
    props: js.Function2[
      /* i */ Double, 
      /* ctrl */ typings.reactSpringCore.mod.Controller[Lookup[scala.Any]], 
      Props
    ],
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
      /* ctrl */ typings.reactSpringCore.mod.Controller[Lookup[scala.Any]], 
      UseTrailProps[scala.Any] | (Props & (Valid[Props, UseTrailProps[Props]]))
    ]
  ): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTrail")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core.SpringValues<State>>, @react-spring/core.@react-spring/core.SpringRef<State>] : never : never */ js.Any]
  inline def useTrail[Props /* <: js.Object */](
    length: Double,
    props: js.Function2[
      /* i */ Double, 
      /* ctrl */ typings.reactSpringCore.mod.Controller[Lookup[scala.Any]], 
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
  
  /** The type of an `animated()` component */
  type AnimatedComponent[T /* <: ElementType[scala.Any] */] = ForwardRefExoticComponent[AnimatedProps[ComponentPropsWithRef[T]]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    std.Exclude<T, object | void> | std.Extract<T, std.ReadonlyArray<number | string>> extends infer U ? [U] extends [never] ? never : @react-spring/shared.@react-spring/shared.FluidValue<U | std.Exclude<T, object | void>, any> : never
    }}}
    */
  @js.native
  trait AnimatedLeaf[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in @react-spring/konva.@react-spring/konva.Primitives ]: @react-spring/konva.@react-spring/konva.AnimatedComponent<@react-spring/konva.@react-spring/konva.KonvaExports[P]>}
    }}}
    */
  @js.native
  trait AnimatedPrimitives extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T, T] extends [infer T, infer DT] ? [DT] extends [never] ? never : DT extends void ? undefined : DT extends object ? [@react-spring/types.@react-spring/types.AssignableKeys<DT, react.react.CSSProperties>] extends [never] ? DT extends std.ReadonlyArray<any> ? @react-spring/konva.@react-spring/konva.AnimatedStyles<DT> : DT : @react-spring/konva.@react-spring/konva.AnimatedStyle<T> : DT | @react-spring/konva.@react-spring/konva.AnimatedLeaf<T> : never
    }}}
    */
  type AnimatedProp[T] = Unit
  
  /** The props of an `animated()` component */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof Props ]: P extends 'ref' | 'key'? Props[P] : @react-spring/konva.@react-spring/konva.AnimatedProp<Props[P]>}
    }}}
    */
  @js.native
  trait AnimatedProps[Props /* <: js.Object */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T, T] extends [infer T, infer DT] ? DT extends void ? undefined : [DT] extends [never] ? never : DT extends object ? {[ P in keyof DT ]: @react-spring/konva.@react-spring/konva.AnimatedStyle<DT[P]>} : DT | @react-spring/konva.@react-spring/konva.AnimatedLeaf<T> : never
    }}}
    */
  type AnimatedStyle[T] = Unit
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: [T[P]] extends [infer DT]? DT extends object? [@react-spring/types.@react-spring/types.AssignableKeys<DT, react.react.CSSProperties>] extends [never]? DT extends std.ReadonlyArray<any>? @react-spring/konva.@react-spring/konva.AnimatedStyles<DT> : DT : {[ P in keyof DT ]: @react-spring/konva.@react-spring/konva.AnimatedProp<DT[P]>} : DT : never}
    }}}
    */
  @js.native
  trait AnimatedStyles[T /* <: js.Array[scala.Any] */] extends StObject
  
  trait KonvaExports extends StObject {
    
    var Arc: KonvaNodeComponent[typings.konva.mod.Konva.Arc, ArcConfig]
    
    var Arrow: KonvaNodeComponent[typings.konva.mod.Konva.Arrow, ArrowConfig]
    
    var Circle: KonvaNodeComponent[typings.konva.mod.Konva.Circle, CircleConfig]
    
    var Ellipse: KonvaNodeComponent[typings.konva.mod.Konva.Ellipse, EllipseConfig]
    
    var FastLayer: KonvaNodeComponent[typings.konva.mod.Konva.FastLayer, LayerConfig]
    
    var Group: KonvaNodeComponent[typings.konva.mod.Konva.Group, GroupConfig]
    
    var Image: KonvaNodeComponent[typings.konva.mod.Konva.Image, ImageConfig]
    
    var KonvaRenderer: Reconciler[scala.Any, scala.Any, scala.Any, scala.Any, scala.Any]
    
    var Label: KonvaNodeComponent[typings.konva.mod.Konva.Label, LabelConfig]
    
    var Layer: KonvaNodeComponent[typings.konva.mod.Konva.Layer, LayerConfig]
    
    var Line: KonvaNodeComponent[typings.konva.mod.Konva.Line, LineConfig]
    
    var Path: KonvaNodeComponent[typings.konva.mod.Konva.Path, PathConfig]
    
    var Rect: KonvaNodeComponent[typings.konva.mod.Konva.Rect, RectConfig]
    
    var RegularPolygon: KonvaNodeComponent[typings.konva.mod.Konva.RegularPolygon, RegularPolygonConfig]
    
    var Ring: KonvaNodeComponent[typings.konva.mod.Konva.Ring, RingConfig]
    
    var Shape: KonvaNodeComponent[typings.konva.mod.Konva.Shape, ShapeConfig]
    
    var Sprite: KonvaNodeComponent[typings.konva.mod.Konva.Sprite, SpriteConfig]
    
    var Stage: KonvaNodeComponent[typings.konva.mod.Konva.Stage, StageProps]
    
    var Star: KonvaNodeComponent[typings.konva.mod.Konva.Star, StarConfig]
    
    var Tag: KonvaNodeComponent[typings.konva.mod.Konva.Tag, TagConfig]
    
    var Text: KonvaNodeComponent[typings.konva.mod.Konva.Text, TextConfig]
    
    var TextPath: KonvaNodeComponent[typings.konva.mod.Konva.TextPath, TextPathConfig]
    
    var Transformer: KonvaNodeComponent[typings.konva.mod.Konva.Transformer, TransformerConfig]
    
    var Wedge: KonvaNodeComponent[typings.konva.mod.Konva.Wedge, WedgeConfig]
    
    var useStrictMode: js.Function1[/* useStrictMode */ Boolean, Unit]
  }
  object KonvaExports {
    
    inline def apply(
      Arc: KonvaNodeComponent[Arc, ArcConfig],
      Arrow: KonvaNodeComponent[Arrow, ArrowConfig],
      Circle: KonvaNodeComponent[Circle, CircleConfig],
      Ellipse: KonvaNodeComponent[Ellipse, EllipseConfig],
      FastLayer: KonvaNodeComponent[FastLayer, LayerConfig],
      Group: KonvaNodeComponent[Group, GroupConfig],
      Image: KonvaNodeComponent[Image, ImageConfig],
      KonvaRenderer: Reconciler[scala.Any, scala.Any, scala.Any, scala.Any, scala.Any],
      Label: KonvaNodeComponent[Label, LabelConfig],
      Layer: KonvaNodeComponent[Layer, LayerConfig],
      Line: KonvaNodeComponent[Line, LineConfig],
      Path: KonvaNodeComponent[Path, PathConfig],
      Rect: KonvaNodeComponent[Rect, RectConfig],
      RegularPolygon: KonvaNodeComponent[RegularPolygon, RegularPolygonConfig],
      Ring: KonvaNodeComponent[Ring, RingConfig],
      Shape: KonvaNodeComponent[Shape, ShapeConfig],
      Sprite: KonvaNodeComponent[Sprite, SpriteConfig],
      Stage: KonvaNodeComponent[Stage, StageProps],
      Star: KonvaNodeComponent[Star, StarConfig],
      Tag: KonvaNodeComponent[Tag, TagConfig],
      Text: KonvaNodeComponent[Text, TextConfig],
      TextPath: KonvaNodeComponent[TextPath, TextPathConfig],
      Transformer: KonvaNodeComponent[Transformer, TransformerConfig],
      Wedge: KonvaNodeComponent[Wedge, WedgeConfig],
      useStrictMode: /* useStrictMode */ Boolean => Unit
    ): KonvaExports = {
      val __obj = js.Dynamic.literal(Arc = Arc.asInstanceOf[js.Any], Arrow = Arrow.asInstanceOf[js.Any], Circle = Circle.asInstanceOf[js.Any], Ellipse = Ellipse.asInstanceOf[js.Any], FastLayer = FastLayer.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], KonvaRenderer = KonvaRenderer.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], Layer = Layer.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Rect = Rect.asInstanceOf[js.Any], RegularPolygon = RegularPolygon.asInstanceOf[js.Any], Ring = Ring.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], Sprite = Sprite.asInstanceOf[js.Any], Stage = Stage.asInstanceOf[js.Any], Star = Star.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextPath = TextPath.asInstanceOf[js.Any], Transformer = Transformer.asInstanceOf[js.Any], Wedge = Wedge.asInstanceOf[js.Any], useStrictMode = js.Any.fromFunction1(useStrictMode))
      __obj.asInstanceOf[KonvaExports]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KonvaExports] (val x: Self) extends AnyVal {
      
      inline def setArc(value: KonvaNodeComponent[Arc, ArcConfig]): Self = StObject.set(x, "Arc", value.asInstanceOf[js.Any])
      
      inline def setArrow(value: KonvaNodeComponent[Arrow, ArrowConfig]): Self = StObject.set(x, "Arrow", value.asInstanceOf[js.Any])
      
      inline def setCircle(value: KonvaNodeComponent[Circle, CircleConfig]): Self = StObject.set(x, "Circle", value.asInstanceOf[js.Any])
      
      inline def setEllipse(value: KonvaNodeComponent[Ellipse, EllipseConfig]): Self = StObject.set(x, "Ellipse", value.asInstanceOf[js.Any])
      
      inline def setFastLayer(value: KonvaNodeComponent[FastLayer, LayerConfig]): Self = StObject.set(x, "FastLayer", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: KonvaNodeComponent[Group, GroupConfig]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
      
      inline def setImage(value: KonvaNodeComponent[Image, ImageConfig]): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      inline def setKonvaRenderer(value: Reconciler[scala.Any, scala.Any, scala.Any, scala.Any, scala.Any]): Self = StObject.set(x, "KonvaRenderer", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: KonvaNodeComponent[Label, LabelConfig]): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
      
      inline def setLayer(value: KonvaNodeComponent[Layer, LayerConfig]): Self = StObject.set(x, "Layer", value.asInstanceOf[js.Any])
      
      inline def setLine(value: KonvaNodeComponent[Line, LineConfig]): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
      
      inline def setPath(value: KonvaNodeComponent[Path, PathConfig]): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
      
      inline def setRect(value: KonvaNodeComponent[Rect, RectConfig]): Self = StObject.set(x, "Rect", value.asInstanceOf[js.Any])
      
      inline def setRegularPolygon(value: KonvaNodeComponent[RegularPolygon, RegularPolygonConfig]): Self = StObject.set(x, "RegularPolygon", value.asInstanceOf[js.Any])
      
      inline def setRing(value: KonvaNodeComponent[Ring, RingConfig]): Self = StObject.set(x, "Ring", value.asInstanceOf[js.Any])
      
      inline def setShape(value: KonvaNodeComponent[Shape, ShapeConfig]): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
      
      inline def setSprite(value: KonvaNodeComponent[Sprite, SpriteConfig]): Self = StObject.set(x, "Sprite", value.asInstanceOf[js.Any])
      
      inline def setStage(value: KonvaNodeComponent[Stage, StageProps]): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
      
      inline def setStar(value: KonvaNodeComponent[Star, StarConfig]): Self = StObject.set(x, "Star", value.asInstanceOf[js.Any])
      
      inline def setTag(value: KonvaNodeComponent[Tag, TagConfig]): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      inline def setText(value: KonvaNodeComponent[Text, TextConfig]): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      inline def setTextPath(value: KonvaNodeComponent[TextPath, TextPathConfig]): Self = StObject.set(x, "TextPath", value.asInstanceOf[js.Any])
      
      inline def setTransformer(value: KonvaNodeComponent[Transformer, TransformerConfig]): Self = StObject.set(x, "Transformer", value.asInstanceOf[js.Any])
      
      inline def setUseStrictMode(value: /* useStrictMode */ Boolean => Unit): Self = StObject.set(x, "useStrictMode", js.Any.fromFunction1(value))
      
      inline def setWedge(value: KonvaNodeComponent[Wedge, WedgeConfig]): Self = StObject.set(x, "Wedge", value.asInstanceOf[js.Any])
    }
  }
  
  type Primitives = /* import warning: importer.ImportType#apply Failed type conversion: react-konva.react-konva/ReactKonvaCore.KonvaNodeComponent<konva.konva.Konva.Stage, react-konva.react-konva/ReactKonvaCore.StageProps> extends react.react.ElementType<any> ? 'Stage' : never */ js.Any
  
  /** The type of the `animated()` function */
  type WithAnimated = (js.Function1[
    /* wrappedComponent */ ElementType[scala.Any], 
    AnimatedComponent[ElementType[scala.Any]]
  ]) & AnimatedPrimitives
}
