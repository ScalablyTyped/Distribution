package typings.reactThreeFiber

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactReconciler.mod.Reconciler
import typings.reactThreeFiber.anon.Dictkey
import typings.reactThreeFiber.anon.HandlePointer
import typings.reactThreeFiber.distDeclarationsSrcCoreEventsMod.EventManager
import typings.reactThreeFiber.distDeclarationsSrcCoreHooksMod.Extensions
import typings.reactThreeFiber.distDeclarationsSrcCoreHooksMod.LoaderResult
import typings.reactThreeFiber.distDeclarationsSrcCoreLoopMod.GlobalRenderCallback
import typings.reactThreeFiber.distDeclarationsSrcCoreMod.InjectState
import typings.reactThreeFiber.distDeclarationsSrcCoreMod.ReconcilerRoot
import typings.reactThreeFiber.distDeclarationsSrcCoreMod.RenderProps
import typings.reactThreeFiber.distDeclarationsSrcCoreRendererMod.Instance
import typings.reactThreeFiber.distDeclarationsSrcCoreRendererMod.LocalState
import typings.reactThreeFiber.distDeclarationsSrcCoreRendererMod.Root
import typings.reactThreeFiber.distDeclarationsSrcCoreStoreMod.RenderCallback
import typings.reactThreeFiber.distDeclarationsSrcCoreStoreMod.RootState
import typings.reactThreeFiber.distDeclarationsSrcCoreUtilsMod.ObjectMap
import typings.reactThreeFiber.distDeclarationsSrcWebCanvasMod.Props
import typings.std.Element
import typings.std.EventTarget
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.Map
import typings.std.ProgressEvent
import typings.three.mod.LoadingManager
import typings.three.mod.Object3D
import typings.three.srcCoreEventDispatcherMod.Event
import typings.zustand.reactMod.UseBoundStore
import typings.zustand.vanillaMod.EqualityChecker
import typings.zustand.vanillaMod.StateSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-three/fiber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-three/fiber", "Canvas")
  @js.native
  val Canvas: ForwardRefExoticComponent[Props & RefAttributes[HTMLCanvasElement]] = js.native
  
  @JSImport("@react-three/fiber", "act")
  @js.native
  val act: Any = js.native
  
  inline def addAfterEffect(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterEffect")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def addEffect(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addEffect")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def addTail(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addTail")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("@react-three/fiber", "context")
  @js.native
  val context: Context[UseBoundStore[RootState]] = js.native
  
  inline def createEvents(store: UseBoundStore[RootState]): HandlePointer = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvents")(store.asInstanceOf[js.Any]).asInstanceOf[HandlePointer]
  
  inline def createPortal(children: ReactNode, container: Object3D[Event]): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  inline def createPortal(children: ReactNode, container: Object3D[Event], state: InjectState): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def createRoot[TCanvas /* <: Element */](canvas: TCanvas): ReconcilerRoot[TCanvas] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(canvas.asInstanceOf[js.Any]).asInstanceOf[ReconcilerRoot[TCanvas]]
  
  inline def dispose[TObj /* <: Dictkey */](obj: TObj): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def events(store: UseBoundStore[RootState]): EventManager[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("events")(store.asInstanceOf[js.Any]).asInstanceOf[EventManager[HTMLElement]]
  
  @JSImport("@react-three/fiber", "extend")
  @js.native
  def extend: js.Function1[/* objects */ js.Object, Unit] = js.native
  inline def extend_=(x: js.Function1[/* objects */ js.Object, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extend")(x.asInstanceOf[js.Any])
  
  inline def getRootState(obj: Object3D[Event]): js.UndefOr[RootState] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootState")(obj.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[RootState]]
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(advance) */ inline def invalidate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")().asInstanceOf[Unit]
  inline def invalidate(state: Unit, frames: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(state.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def invalidate(state: RootState): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def invalidate(state: RootState, frames: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(state.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(applyProps) */ @JSImport("@react-three/fiber", "reconciler")
  @js.native
  val reconciler: Reconciler[UseBoundStore[RootState], Instance, Unit, Instance, Instance] = js.native
  
  inline def render[TCanvas /* <: Element */](children: ReactNode, canvas: TCanvas, config: RenderProps[TCanvas]): UseBoundStore[RootState] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(children.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[UseBoundStore[RootState]]
  
  @JSImport("@react-three/fiber", "_roots")
  @js.native
  val roots: Map[Element, Root] = js.native
  
  inline def unmountComponentAtNode[TElement /* <: Element */](canvas: TElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(canvas.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unmountComponentAtNode[TElement /* <: Element */](canvas: TElement, callback: js.Function1[/* canvas */ TElement, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(canvas.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useFrame(callback: RenderCallback): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Null]
  inline def useFrame(callback: RenderCallback, renderPriority: Double): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useFrame")(callback.asInstanceOf[js.Any], renderPriority.asInstanceOf[js.Any])).asInstanceOf[Null]
  
  inline def useGraph(`object`: Object3D[Event]): ObjectMap = ^.asInstanceOf[js.Dynamic].applyDynamic("useGraph")(`object`.asInstanceOf[js.Any]).asInstanceOf[ObjectMap]
  
  inline def useInstanceHandle[O](ref: MutableRefObject[O]): MutableRefObject[LocalState] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInstanceHandle")(ref.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[LocalState]]
  
  object useLoader {
    
    inline def apply[T](Proto: Instantiable1[/* manager */ js.UndefOr[LoadingManager], LoaderResult[T]], input: String): /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: string extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any]
    inline def apply[T](
      Proto: Instantiable1[/* manager */ js.UndefOr[LoadingManager], LoaderResult[T]],
      input: String,
      extensions: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: string extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any]
    inline def apply[T](
      Proto: Instantiable1[/* manager */ js.UndefOr[LoadingManager], LoaderResult[T]],
      input: String,
      extensions: Extensions
    ): /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: string extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any]
    inline def apply[T](
      Proto: Instantiable1[/* manager */ js.UndefOr[LoadingManager], LoaderResult[T]],
      input: String,
      extensions: Extensions,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: string extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any]
    inline def apply[T](
      Proto: Instantiable1[/* manager */ js.UndefOr[LoadingManager], LoaderResult[T]],
      input: js.Array[String]
    ): /* import warning: importer.ImportType#apply Failed type conversion: std.Array<string> extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string> extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any]
    inline def apply[T](
      Proto: Instantiable1[/* manager */ js.UndefOr[LoadingManager], LoaderResult[T]],
      input: js.Array[String],
      extensions: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): /* import warning: importer.ImportType#apply Failed type conversion: std.Array<string> extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string> extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any]
    inline def apply[T](
      Proto: Instantiable1[/* manager */ js.UndefOr[LoadingManager], LoaderResult[T]],
      input: js.Array[String],
      extensions: Extensions
    ): /* import warning: importer.ImportType#apply Failed type conversion: std.Array<string> extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string> extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any]
    inline def apply[T](
      Proto: Instantiable1[/* manager */ js.UndefOr[LoadingManager], LoaderResult[T]],
      input: js.Array[String],
      extensions: Extensions,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): /* import warning: importer.ImportType#apply Failed type conversion: std.Array<string> extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string> extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any]
    
    @JSImport("@react-three/fiber", "useLoader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-three/fiber", "useLoader.clear")
    @js.native
    def clear: js.Function2[
        /* Proto */ Instantiable0[LoaderResult[Any]], 
        /* input */ String | js.Array[String], 
        Unit
      ] = js.native
    inline def clear_=(
      x: js.Function2[
          /* Proto */ Instantiable0[LoaderResult[Any]], 
          /* input */ String | js.Array[String], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clear")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-three/fiber", "useLoader.preload")
    @js.native
    def preload: js.Function3[
        /* Proto */ Instantiable0[LoaderResult[Any]], 
        /* input */ String | js.Array[String], 
        /* extensions */ js.UndefOr[Extensions], 
        Unit
      ] = js.native
    inline def preload_=(
      x: js.Function3[
          /* Proto */ Instantiable0[LoaderResult[Any]], 
          /* input */ String | js.Array[String], 
          /* extensions */ js.UndefOr[Extensions], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preload")(x.asInstanceOf[js.Any])
  }
  
  inline def useStore(): UseBoundStore[RootState] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")().asInstanceOf[UseBoundStore[RootState]]
  
  inline def useThree[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useThree")().asInstanceOf[T]
  inline def useThree[T](selector: Unit, equalityFn: EqualityChecker[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useThree")(selector.asInstanceOf[js.Any], equalityFn.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def useThree[T](selector: StateSelector[RootState, T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useThree")(selector.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useThree[T](selector: StateSelector[RootState, T], equalityFn: EqualityChecker[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useThree")(selector.asInstanceOf[js.Any], equalityFn.asInstanceOf[js.Any])).asInstanceOf[T]
}
