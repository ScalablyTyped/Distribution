package typings.reactThreeFiber

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable6
import typings.react.mod.Context
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactNode
import typings.reactReconciler.mod.Reconciler
import typings.reactThreeFiber.anon.Dictkey
import typings.reactThreeFiber.anon.Events
import typings.reactThreeFiber.anon.Manual
import typings.reactThreeFiber.anon.PartialOmitPerformancereg
import typings.reactThreeFiber.anon.PartialRaycaster
import typings.reactThreeFiber.anon.PartialWebGLShadowMap
import typings.reactThreeFiber.distDeclarationsSrcCoreEventsMod.EventManager
import typings.reactThreeFiber.distDeclarationsSrcCoreHooksMod.Extensions
import typings.reactThreeFiber.distDeclarationsSrcCoreHooksMod.LoaderResult
import typings.reactThreeFiber.distDeclarationsSrcCoreLoopMod.GlobalRenderCallback
import typings.reactThreeFiber.distDeclarationsSrcCoreRendererMod.Instance
import typings.reactThreeFiber.distDeclarationsSrcCoreRendererMod.LocalState
import typings.reactThreeFiber.distDeclarationsSrcCoreRendererMod.Root
import typings.reactThreeFiber.distDeclarationsSrcCoreStoreMod.Dpr
import typings.reactThreeFiber.distDeclarationsSrcCoreStoreMod.PrivateKeys_
import typings.reactThreeFiber.distDeclarationsSrcCoreStoreMod.RenderCallback
import typings.reactThreeFiber.distDeclarationsSrcCoreStoreMod.Renderer
import typings.reactThreeFiber.distDeclarationsSrcCoreStoreMod.RootState
import typings.reactThreeFiber.distDeclarationsSrcCoreStoreMod.Size
import typings.reactThreeFiber.distDeclarationsSrcCoreUtilsMod.Camera
import typings.reactThreeFiber.distDeclarationsSrcCoreUtilsMod.ObjectMap
import typings.reactThreeFiber.distDeclarationsSrcThreeTypesMod.Object3DNode
import typings.reactThreeFiber.reactThreeFiberStrings.always
import typings.reactThreeFiber.reactThreeFiberStrings.demand
import typings.reactThreeFiber.reactThreeFiberStrings.never
import typings.std.Element
import typings.std.EventTarget
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.Map
import typings.std.MouseEvent
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.ProgressEvent
import typings.three.mod.LoadingManager
import typings.three.mod.Object3D
import typings.three.mod.OrthographicCamera
import typings.three.mod.PerspectiveCamera
import typings.three.mod.WebGLRenderer
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcRenderersWebGLRendererMod.WebGLRendererParameters
import typings.zustand.reactMod.UseBoundStore
import typings.zustand.vanillaMod.EqualityChecker
import typings.zustand.vanillaMod.StateSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcCoreMod {
  
  @JSImport("@react-three/fiber/dist/declarations/src/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-three/fiber/dist/declarations/src/core", "act")
  @js.native
  val act: Any = js.native
  
  inline def addAfterEffect(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterEffect")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def addEffect(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addEffect")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def addTail(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addTail")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("@react-three/fiber/dist/declarations/src/core", "context")
  @js.native
  val context: Context[UseBoundStore[RootState]] = js.native
  
  inline def createPortal(children: ReactNode, container: Object3D[Event]): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  inline def createPortal(children: ReactNode, container: Object3D[Event], state: InjectState): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def createRoot[TCanvas /* <: Element */](canvas: TCanvas): ReconcilerRoot[TCanvas] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(canvas.asInstanceOf[js.Any]).asInstanceOf[ReconcilerRoot[TCanvas]]
  
  inline def dispose[TObj /* <: Dictkey */](obj: TObj): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@react-three/fiber/dist/declarations/src/core", "extend")
  @js.native
  def extend: js.Function1[/* objects */ js.Object, Unit] = js.native
  inline def extend_=(x: js.Function1[/* objects */ js.Object, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extend")(x.asInstanceOf[js.Any])
  
  inline def getRootState(obj: Object3D[Event]): js.UndefOr[RootState] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootState")(obj.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[RootState]]
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(advance) */ inline def invalidate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")().asInstanceOf[Unit]
  inline def invalidate(state: Unit, frames: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(state.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def invalidate(state: RootState): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def invalidate(state: RootState, frames: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(state.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(applyProps) */ @JSImport("@react-three/fiber/dist/declarations/src/core", "reconciler")
  @js.native
  val reconciler: Reconciler[UseBoundStore[RootState], Instance, Unit, Instance, Instance] = js.native
  
  inline def render[TCanvas /* <: Element */](children: ReactNode, canvas: TCanvas, config: RenderProps[TCanvas]): UseBoundStore[RootState] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(children.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[UseBoundStore[RootState]]
  
  @JSImport("@react-three/fiber/dist/declarations/src/core", "_roots")
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
    
    @JSImport("@react-three/fiber/dist/declarations/src/core", "useLoader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-three/fiber/dist/declarations/src/core", "useLoader.clear")
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
    
    @JSImport("@react-three/fiber/dist/declarations/src/core", "useLoader.preload")
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
  
  type GLProps = js.UndefOr[
    Renderer | (js.Function1[/* canvas */ HTMLCanvasElement, Renderer]) | (Partial[Properties[WebGLRenderer] | WebGLRendererParameters])
  ]
  
  type InjectState = Partial[(Omit[RootState, PrivateKeys_]) & Events]
  
  type Properties[T] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (_ : any): any? never : K}[keyof T] */ js.Any
  ]
  
  @js.native
  trait ReconcilerRoot[TCanvas /* <: Element */] extends StObject {
    
    def configure(): ReconcilerRoot[TCanvas] = js.native
    def configure(config: RenderProps[TCanvas]): ReconcilerRoot[TCanvas] = js.native
    
    def render(element: ReactNode): UseBoundStore[RootState] = js.native
    
    def unmount(): Unit = js.native
  }
  
  trait RenderProps[TCanvas /* <: Element */] extends StObject {
    
    var camera: js.UndefOr[
        (Camera & Manual) | ((Partial[
          (Object3DNode[typings.three.mod.Camera, Instantiable0[typings.three.mod.Camera]]) & (Object3DNode[PerspectiveCamera, Instantiable0[PerspectiveCamera]]) & (Object3DNode[
            OrthographicCamera, 
            Instantiable6[
              /* left */ js.UndefOr[Double], 
              /* right */ js.UndefOr[Double], 
              /* top */ js.UndefOr[Double], 
              /* bottom */ js.UndefOr[Double], 
              /* near */ js.UndefOr[Double], 
              /* far */ js.UndefOr[Double], 
              OrthographicCamera
            ]
          ])
        ]) & Manual)
      ] = js.undefined
    
    var dpr: js.UndefOr[Dpr] = js.undefined
    
    var events: js.UndefOr[js.Function1[/* store */ UseBoundStore[RootState], EventManager[HTMLElement]]] = js.undefined
    
    var flat: js.UndefOr[Boolean] = js.undefined
    
    var frameloop: js.UndefOr[always | demand | never] = js.undefined
    
    var gl: js.UndefOr[GLProps] = js.undefined
    
    var legacy: js.UndefOr[Boolean] = js.undefined
    
    var linear: js.UndefOr[Boolean] = js.undefined
    
    var onCreated: js.UndefOr[js.Function1[/* state */ RootState, Unit]] = js.undefined
    
    var onPointerMissed: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var orthographic: js.UndefOr[Boolean] = js.undefined
    
    var performance: js.UndefOr[PartialOmitPerformancereg] = js.undefined
    
    var raycaster: js.UndefOr[PartialRaycaster] = js.undefined
    
    var shadows: js.UndefOr[Boolean | PartialWebGLShadowMap] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
  }
  object RenderProps {
    
    inline def apply[TCanvas /* <: Element */](): RenderProps[TCanvas] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderProps[TCanvas]]
    }
    
    extension [Self <: RenderProps[?], TCanvas /* <: Element */](x: Self & RenderProps[TCanvas]) {
      
      inline def setCamera(
        value: (Camera & Manual) | ((Partial[
              (Object3DNode[typings.three.mod.Camera, Instantiable0[typings.three.mod.Camera]]) & (Object3DNode[PerspectiveCamera, Instantiable0[PerspectiveCamera]]) & (Object3DNode[
                OrthographicCamera, 
                Instantiable6[
                  /* left */ js.UndefOr[Double], 
                  /* right */ js.UndefOr[Double], 
                  /* top */ js.UndefOr[Double], 
                  /* bottom */ js.UndefOr[Double], 
                  /* near */ js.UndefOr[Double], 
                  /* far */ js.UndefOr[Double], 
                  OrthographicCamera
                ]
              ])
            ]) & Manual)
      ): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
      
      inline def setDpr(value: Dpr): Self = StObject.set(x, "dpr", value.asInstanceOf[js.Any])
      
      inline def setDprUndefined: Self = StObject.set(x, "dpr", js.undefined)
      
      inline def setEvents(value: /* store */ UseBoundStore[RootState] => EventManager[HTMLElement]): Self = StObject.set(x, "events", js.Any.fromFunction1(value))
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setFrameloop(value: always | demand | never): Self = StObject.set(x, "frameloop", value.asInstanceOf[js.Any])
      
      inline def setFrameloopUndefined: Self = StObject.set(x, "frameloop", js.undefined)
      
      inline def setGl(value: GLProps): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
      
      inline def setGlFunction1(value: /* canvas */ HTMLCanvasElement => Renderer): Self = StObject.set(x, "gl", js.Any.fromFunction1(value))
      
      inline def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
      
      inline def setLegacy(value: Boolean): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
      
      inline def setLegacyUndefined: Self = StObject.set(x, "legacy", js.undefined)
      
      inline def setLinear(value: Boolean): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
      
      inline def setLinearUndefined: Self = StObject.set(x, "linear", js.undefined)
      
      inline def setOnCreated(value: /* state */ RootState => Unit): Self = StObject.set(x, "onCreated", js.Any.fromFunction1(value))
      
      inline def setOnCreatedUndefined: Self = StObject.set(x, "onCreated", js.undefined)
      
      inline def setOnPointerMissed(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onPointerMissed", js.Any.fromFunction1(value))
      
      inline def setOnPointerMissedUndefined: Self = StObject.set(x, "onPointerMissed", js.undefined)
      
      inline def setOrthographic(value: Boolean): Self = StObject.set(x, "orthographic", value.asInstanceOf[js.Any])
      
      inline def setOrthographicUndefined: Self = StObject.set(x, "orthographic", js.undefined)
      
      inline def setPerformance(value: PartialOmitPerformancereg): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
      
      inline def setRaycaster(value: PartialRaycaster): Self = StObject.set(x, "raycaster", value.asInstanceOf[js.Any])
      
      inline def setRaycasterUndefined: Self = StObject.set(x, "raycaster", js.undefined)
      
      inline def setShadows(value: Boolean | PartialWebGLShadowMap): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
