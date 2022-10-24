package typings.reactSpringCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Consumer
import typings.react.mod.PropsWithChildren
import typings.react.mod.Provider
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.global.JSX.Element
import typings.reactSpringCore.anon.Friction
import typings.reactSpringCore.anon.FrictionTension
import typings.reactSpringCore.anon.Tension
import typings.reactSpringCore.anon.To
import typings.reactSpringCore.anon.ToState
import typings.reactSpringCore.anon.`0`
import typings.reactSpringCore.anon.`1`
import typings.reactSpringCore.anon.`2`
import typings.reactSpringCore.distDeclarationsSrcComponentsSpringMod.SpringComponentProps
import typings.reactSpringCore.distDeclarationsSrcComponentsTrailMod.TrailComponentProps
import typings.reactSpringCore.distDeclarationsSrcConstantsMod.EasingDictionary
import typings.reactSpringCore.distDeclarationsSrcHooksUseSpringMod.UseSpringProps
import typings.reactSpringCore.distDeclarationsSrcHooksUseSpringsMod.UseSpringsProps
import typings.reactSpringCore.distDeclarationsSrcHooksUseTrailMod.UseTrailProps
import typings.reactSpringCore.distDeclarationsSrcInterpolateMod.Interpolator
import typings.reactSpringCore.distDeclarationsSrcSpringRefMod.SpringRef
import typings.reactSpringCore.distDeclarationsSrcTypesCommonMod.Valid
import typings.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.ControllerFlushFn
import typings.reactSpringCore.distDeclarationsSrcTypesObjectsMod.SpringValues
import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.ControllerUpdate
import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.InferTo
import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.PickAnimated
import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.SpringUpdate
import typings.reactSpringCore.distDeclarationsSrcTypesTransitionMod.TransitionComponentProps
import typings.reactSpringCore.distDeclarationsSrcTypesTransitionMod.TransitionFn
import typings.reactSpringCore.distDeclarationsSrcTypesTransitionMod.UseTransitionProps
import typings.reactSpringCore.reactSpringCoreBooleans.`true`
import typings.reactSpringCore.reactSpringCoreStrings.from
import typings.reactSpringTypes.interpolationMod.InterpolatorArgs
import typings.reactSpringTypes.utilMod.Lookup
import typings.reactSpringTypes.utilMod.NoInfer
import typings.reactSpringTypes.utilMod.OneOrMore
import typings.std.Exclude
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcMod {
  
  @JSImport("@react-spring/core/dist/declarations/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-spring/core/dist/declarations/src", "BailSignal")
  @js.native
  open class BailSignal ()
    extends typings.reactSpringCore.distDeclarationsSrcRunAsyncMod.BailSignal
  
  @JSImport("@react-spring/core/dist/declarations/src", "Controller")
  @js.native
  open class Controller[State /* <: Lookup[Any] */] ()
    extends typings.reactSpringCore.distDeclarationsSrcControllerMod.Controller[State] {
    def this(props: ControllerUpdate[State, Unit]) = this()
    def this(props: Null, flush: ControllerFlushFn[Any]) = this()
    def this(props: Unit, flush: ControllerFlushFn[Any]) = this()
    def this(props: ControllerUpdate[State, Unit], flush: ControllerFlushFn[Any]) = this()
  }
  
  /* note: abstract class */ @JSImport("@react-spring/core/dist/declarations/src", "FrameValue")
  @js.native
  open class FrameValue[T] ()
    extends typings.reactSpringCore.distDeclarationsSrcFrameValueMod.FrameValue[T]
  
  @JSImport("@react-spring/core/dist/declarations/src", "Interpolation")
  @js.native
  open class Interpolation[Input, Output] protected ()
    extends typings.reactSpringCore.distDeclarationsSrcInterpolationMod.Interpolation[Input, Output] {
    def this(/** The source of input values */
    source: Any, args: InterpolatorArgs[Input, Output]) = this()
  }
  
  inline def Spring[State /* <: js.Object */](
    props: To[State] & (Omit[
      SpringComponentProps[NoInfer[State]], 
      from | typings.reactSpringCore.reactSpringCoreStrings.to
    ])
  ): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Spring")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  object SpringContext {
    
    inline def apply(
      param0: PropsWithChildren[typings.reactSpringCore.distDeclarationsSrcSpringContextMod.SpringContext]
    ): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@react-spring/core/dist/declarations/src", "SpringContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-spring/core/dist/declarations/src", "SpringContext.Consumer")
    @js.native
    def Consumer: typings.react.mod.Consumer[typings.reactSpringCore.distDeclarationsSrcSpringContextMod.SpringContext] = js.native
    inline def Consumer_=(x: Consumer[typings.reactSpringCore.distDeclarationsSrcSpringContextMod.SpringContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Consumer")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/core/dist/declarations/src", "SpringContext.Provider")
    @js.native
    def Provider: typings.react.mod.Provider[typings.reactSpringCore.distDeclarationsSrcSpringContextMod.SpringContext] = js.native
    inline def Provider_=(x: Provider[typings.reactSpringCore.distDeclarationsSrcSpringContextMod.SpringContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Provider")(x.asInstanceOf[js.Any])
  }
  
  inline def SpringRef[State /* <: Lookup[Any] */](): typings.reactSpringCore.distDeclarationsSrcSpringRefMod.SpringRef[State] = ^.asInstanceOf[js.Dynamic].applyDynamic("SpringRef")().asInstanceOf[typings.reactSpringCore.distDeclarationsSrcSpringRefMod.SpringRef[State]]
  
  @JSImport("@react-spring/core/dist/declarations/src", "SpringValue")
  @js.native
  open class SpringValue[T] ()
    extends typings.reactSpringCore.distDeclarationsSrcSpringValueMod.SpringValue[T] {
    def this(from: Exclude[T, js.Object]) = this()
    def this(props: SpringUpdate[T]) = this()
    def this(from: Exclude[T, js.Object], props: SpringUpdate[T]) = this()
  }
  
  inline def Spring_to[State /* <: js.Object */](
    props: ToState[State] & (Omit[
      SpringComponentProps[NoInfer[State]], 
      typings.reactSpringCore.reactSpringCoreStrings.to
    ])
  ): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Spring")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def Trail[Item, Props /* <: TrailComponentProps[Item, Any] */](param0: Props & (Valid[Props, TrailComponentProps[Item, Props]])): js.Array[js.UndefOr[String | Double | Boolean | ReactElement | ReactFragment | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Trail")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.UndefOr[String | Double | Boolean | ReactElement | ReactFragment | Null]]]
  
  inline def Transition[Item /* <: Any */, Props /* <: TransitionComponentProps[Item, Any] */](
    props: (Props & (Valid[Props, TransitionComponentProps[Item, Props]])) | (TransitionComponentProps[Item, Any])
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Transition")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object config extends Shortcut {
    
    @JSImport("@react-spring/core/dist/declarations/src", "config.default")
    @js.native
    val default: Friction = js.native
    
    @JSImport("@react-spring/core/dist/declarations/src", "config.gentle")
    @js.native
    val gentle: Tension = js.native
    
    @JSImport("@react-spring/core/dist/declarations/src", "config.molasses")
    @js.native
    val molasses: `2` = js.native
    
    @JSImport("@react-spring/core/dist/declarations/src", "config.slow")
    @js.native
    val slow: `1` = js.native
    
    @JSImport("@react-spring/core/dist/declarations/src", "config.stiff")
    @js.native
    val stiff: `0` = js.native
    
    @JSImport("@react-spring/core/dist/declarations/src", "config.wobbly")
    @js.native
    val wobbly: FrictionTension = js.native
    
    type _To = Friction
    
    /* This means you don't have to write `default`, but can instead just say `config.foo` */
    override def _to: Friction = default
  }
  
  @JSImport("@react-spring/core/dist/declarations/src", "easings")
  @js.native
  val easings: EasingDictionary = js.native
  
  inline def inferTo[T /* <: js.Object */](props: T): InferTo[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("inferTo")(props.asInstanceOf[js.Any]).asInstanceOf[InferTo[T]]
  
  @JSImport("@react-spring/core/dist/declarations/src", "interpolate")
  @js.native
  val interpolate: Interpolator = js.native
  
  @JSImport("@react-spring/core/dist/declarations/src", "to")
  @js.native
  val to: Interpolator = js.native
  
  inline def update(dt: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(dt.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useChain(refs: js.Array[SpringRef[Lookup[Any]]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useChain")(refs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useChain(refs: js.Array[SpringRef[Lookup[Any]]], timeSteps: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useChain")(refs.asInstanceOf[js.Any], timeSteps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useChain(refs: js.Array[SpringRef[Lookup[Any]]], timeSteps: js.Array[Double], timeFrame: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useChain")(refs.asInstanceOf[js.Any], timeSteps.asInstanceOf[js.Any], timeFrame.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useChain(refs: js.Array[SpringRef[Lookup[Any]]], timeSteps: Unit, timeFrame: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useChain")(refs.asInstanceOf[js.Any], timeSteps.asInstanceOf[js.Any], timeFrame.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useSpring[Props /* <: js.Object */](props: Props & (Valid[Props, UseSpringProps[Props]])): SpringValues[PickAnimated[Props, `true`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any]).asInstanceOf[SpringValues[PickAnimated[Props, `true`]]]
  inline def useSpring[Props /* <: js.Object */](props: Props & (Valid[Props, UseSpringProps[Props]]), deps: js.Array[Any]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  inline def useSpring[Props /* <: js.Object */](props: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  inline def useSpring[Props /* <: js.Object */](props: js.Function0[(Props & (Valid[Props, UseSpringProps[Props]])) | UseSpringProps[Any]]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  inline def useSpring[Props /* <: js.Object */](
    props: js.Function0[(Props & (Valid[Props, UseSpringProps[Props]])) | UseSpringProps[Any]],
    deps: js.Array[Any]
  ): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  inline def useSpring[Props /* <: js.Object */](props: js.Function, deps: js.Array[Any]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  inline def useSpring[Props /* <: js.Object */](props: UseSpringProps[Any]): SpringValues[PickAnimated[Props, `true`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any]).asInstanceOf[SpringValues[PickAnimated[Props, `true`]]]
  inline def useSpring[Props /* <: js.Object */](props: UseSpringProps[Any], deps: js.Array[Any]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  
  inline def useSpringRef[State /* <: Lookup[Any] */](): SpringRef[State] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpringRef")().asInstanceOf[SpringRef[State]]
  
  inline def useSpring_Props_Any[Props /* <: js.Object */](props: Props & (Valid[Props, UseSpringProps[Props]])): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  inline def useSpring_Props_Any[Props /* <: js.Object */](props: UseSpringProps[Any]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(props.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  
  inline def useSprings[Props /* <: UseSpringProps[Any] */](
    length: Double,
    props: js.Function2[
      /* i */ Double, 
      /* ctrl */ typings.reactSpringCore.distDeclarationsSrcControllerMod.Controller[Lookup[Any]], 
      Props
    ]
  ): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useSprings")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  inline def useSprings[Props /* <: UseSpringProps[Any] */](
    length: Double,
    props: js.Function2[
      /* i */ Double, 
      /* ctrl */ typings.reactSpringCore.distDeclarationsSrcControllerMod.Controller[Lookup[Any]], 
      Props
    ],
    deps: js.Array[Any]
  ): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useSprings")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  
  inline def useSprings_true[Props /* <: UseSpringsProps[Lookup[Any]] */](length: Double, props: js.Array[Props] & (js.Array[UseSpringsProps[PickAnimated[Props, `true`]]])): js.Array[SpringValues[PickAnimated[Props, `true`]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSprings")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[SpringValues[PickAnimated[Props, `true`]]]]
  inline def useSprings_true[Props /* <: UseSpringsProps[Lookup[Any]] */](
    length: Double,
    props: js.Array[Props] & (js.Array[UseSpringsProps[PickAnimated[Props, `true`]]]),
    deps: js.Array[Any]
  ): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useSprings")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  
  inline def useSprings_true_Props_Any[Props /* <: UseSpringsProps[Lookup[Any]] */](length: Double, props: js.Array[Props] & (js.Array[UseSpringsProps[PickAnimated[Props, `true`]]])): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useSprings")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  
  inline def useTrail[Props /* <: js.Object */](length: Double, props: Props & (Valid[Props, UseTrailProps[Props]])): js.Array[SpringValues[PickAnimated[Props, `true`]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTrail")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[SpringValues[PickAnimated[Props, `true`]]]]
  inline def useTrail[Props /* <: js.Object */](length: Double, props: Props & (Valid[Props, UseTrailProps[Props]]), deps: js.Array[Any]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTrail")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  inline def useTrail[Props /* <: js.Object */](
    length: Double,
    props: js.Function2[
      /* i */ Double, 
      /* ctrl */ typings.reactSpringCore.distDeclarationsSrcControllerMod.Controller[Lookup[Any]], 
      UseTrailProps[Any] | (Props & (Valid[Props, UseTrailProps[Props]]))
    ]
  ): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTrail")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  inline def useTrail[Props /* <: js.Object */](
    length: Double,
    props: js.Function2[
      /* i */ Double, 
      /* ctrl */ typings.reactSpringCore.distDeclarationsSrcControllerMod.Controller[Lookup[Any]], 
      UseTrailProps[Any] | (Props & (Valid[Props, UseTrailProps[Props]]))
    ],
    deps: js.Array[Any]
  ): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTrail")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  inline def useTrail[Props /* <: js.Object */](length: Double, props: UseTrailProps[Any]): js.Array[SpringValues[PickAnimated[Props, `true`]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTrail")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[SpringValues[PickAnimated[Props, `true`]]]]
  inline def useTrail[Props /* <: js.Object */](length: Double, props: UseTrailProps[Any], deps: js.Array[Any]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTrail")(length.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [std.Array<@react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringValues<State>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  
  inline def useTransition[Item, Props /* <: js.Object */](data: OneOrMore[Item], props: Props & (Valid[Props, UseTransitionProps[Item]])): TransitionFn[Item, PickAnimated[Props, `true`]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[TransitionFn[Item, PickAnimated[Props, `true`]]]
  inline def useTransition[Item, Props /* <: js.Object */](
    data: OneOrMore[Item],
    props: Props & (Valid[Props, UseTransitionProps[Item]]),
    deps: js.Array[Any]
  ): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/transition.TransitionFn<Item, State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/transition.TransitionFn<Item, State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  inline def useTransition[Item, Props /* <: js.Object */](
    data: OneOrMore[Item],
    props: js.Function0[UseTransitionProps[Item] | (Props & (Valid[Props, UseTransitionProps[Item]]))]
  ): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/transition.TransitionFn<Item, @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/transition.TransitionFn<Item, @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  inline def useTransition[Item, Props /* <: js.Object */](
    data: OneOrMore[Item],
    props: js.Function0[UseTransitionProps[Item] | (Props & (Valid[Props, UseTransitionProps[Item]]))],
    deps: js.Array[Any]
  ): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/transition.TransitionFn<Item, @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/transition.TransitionFn<Item, @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true>>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  inline def useTransition[Item, Props /* <: js.Object */](data: OneOrMore[Item], props: UseTransitionProps[Item]): TransitionFn[Item, PickAnimated[Props, `true`]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[TransitionFn[Item, PickAnimated[Props, `true`]]]
  inline def useTransition[Item, Props /* <: js.Object */](data: OneOrMore[Item], props: UseTransitionProps[Item], deps: js.Array[Any]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/transition.TransitionFn<Item, State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/transition.TransitionFn<Item, State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  
  inline def useTransition_ItemProps_Any[Item, Props /* <: js.Object */](data: OneOrMore[Item], props: Props & (Valid[Props, UseTransitionProps[Item]])): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/transition.TransitionFn<Item, State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/transition.TransitionFn<Item, State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
  inline def useTransition_ItemProps_Any[Item, Props /* <: js.Object */](data: OneOrMore[Item], props: UseTransitionProps[Item]): /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/transition.TransitionFn<Item, State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/types/props.PickAnimated<Props, true> extends infer State ? State extends @react-spring/types.@react-spring/types/util.Lookup<any> ? [@react-spring/core.@react-spring/core/dist/declarations/src/types/transition.TransitionFn<Item, State>, @react-spring/core.@react-spring/core/dist/declarations/src/SpringRef.SpringRef<State>] : never : never */ js.Any]
}
