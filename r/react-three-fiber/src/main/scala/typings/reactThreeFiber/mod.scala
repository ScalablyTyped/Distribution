package typings.reactThreeFiber

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Context
import typings.react.mod.MutableRefObject
import typings.react.mod.NamedExoticComponent
import typings.react.mod.ReactNode
import typings.reactReconciler.mod.Reconciler
import typings.reactThreeFiber.anon.Children
import typings.reactThreeFiber.canvasMod.CanvasContext
import typings.reactThreeFiber.canvasMod.DomEventHandlers
import typings.reactThreeFiber.canvasMod.RenderCallback
import typings.reactThreeFiber.canvasMod.SharedCanvasContext
import typings.reactThreeFiber.canvasMod.UseCanvasProps
import typings.reactThreeFiber.hooksMod.Extensions
import typings.reactThreeFiber.hooksMod.LoaderResult
import typings.reactThreeFiber.hooksMod.ObjectMap
import typings.reactThreeFiber.rendererMod.GlobalRenderCallback
import typings.reactThreeFiber.resizeContainerMod.ContainerProps
import typings.reactThreeFiber.resizeContainerMod.ResizeContainerProps
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.mod.Camera
import typings.three.mod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-three-fiber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-three-fiber", "Canvas")
  @js.native
  val Canvas: NamedExoticComponent[ContainerProps] = js.native
  
  @JSImport("react-three-fiber", "Renderer")
  @js.native
  val Renderer: Reconciler[js.Any, js.Any, js.Any, js.Any] = js.native
  
  @JSImport("react-three-fiber", "ResizeContainer")
  @js.native
  val ResizeContainer: NamedExoticComponent[ResizeContainerProps] = js.native
  
  @scala.inline
  def addAfterEffect(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterEffect")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def addEffect(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addEffect")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def addTail(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addTail")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def applyProps(instance: js.Any, newProps: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyProps")(instance.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def applyProps(instance: js.Any, newProps: js.Any, oldProps: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyProps")(instance.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any], oldProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def applyProps(instance: js.Any, newProps: js.Any, oldProps: js.Any, accumulative: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyProps")(instance.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any], oldProps.asInstanceOf[js.Any], accumulative.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def applyProps(instance: js.Any, newProps: js.Any, oldProps: Unit, accumulative: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyProps")(instance.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any], oldProps.asInstanceOf[js.Any], accumulative.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def createPortal(children: ReactNode, containerInfo: js.Any): Children = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], containerInfo.asInstanceOf[js.Any])).asInstanceOf[Children]
  @scala.inline
  def createPortal(children: ReactNode, containerInfo: js.Any, implementation: js.Any): Children = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], containerInfo.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Children]
  @scala.inline
  def createPortal(children: ReactNode, containerInfo: js.Any, implementation: js.Any, key: js.Any): Children = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], containerInfo.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Children]
  @scala.inline
  def createPortal(children: ReactNode, containerInfo: js.Any, implementation: Unit, key: js.Any): Children = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], containerInfo.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Children]
  
  @scala.inline
  def extend(objects: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(objects.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def forceResize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceResize")().asInstanceOf[Unit]
  
  @scala.inline
  def invalidate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")().asInstanceOf[Unit]
  @scala.inline
  def invalidate(state: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def invalidate(state: Boolean, frames: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(state.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def invalidate(state: Unit, frames: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(state.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def invalidate(state: MutableRefObject[CanvasContext]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def invalidate(state: MutableRefObject[CanvasContext], frames: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(state.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def isOrthographicCamera(`def`: Camera): /* is three.three.OrthographicCamera */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrthographicCamera")(`def`.asInstanceOf[js.Any]).asInstanceOf[/* is three.three.OrthographicCamera */ Boolean]
  
  @scala.inline
  def render(element: ReactNode, container: Object3D): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def render(element: ReactNode, container: Object3D, state: MutableRefObject[CanvasContext]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def renderGl(state: MutableRefObject[CanvasContext], timestamp: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGl")(state.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def renderGl(state: MutableRefObject[CanvasContext], timestamp: Double, repeat: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGl")(state.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], repeat.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def renderGl(
    state: MutableRefObject[CanvasContext],
    timestamp: Double,
    repeat: Double,
    runGlobalEffects: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGl")(state.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], repeat.asInstanceOf[js.Any], runGlobalEffects.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def renderGl(state: MutableRefObject[CanvasContext], timestamp: Double, repeat: Unit, runGlobalEffects: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGl")(state.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], repeat.asInstanceOf[js.Any], runGlobalEffects.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("react-three-fiber", "stateContext")
  @js.native
  val stateContext: Context[SharedCanvasContext] = js.native
  
  @scala.inline
  def unmountComponentAtNode(container: Object3D): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def unmountComponentAtNode(container: Object3D, callback: js.Function1[/* c */ Object3D, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def useCanvas(props: UseCanvasProps): DomEventHandlers = ^.asInstanceOf[js.Dynamic].applyDynamic("useCanvas")(props.asInstanceOf[js.Any]).asInstanceOf[DomEventHandlers]
  
  @scala.inline
  def useFrame(callback: RenderCallback): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Null]
  @scala.inline
  def useFrame(callback: RenderCallback, renderPriority: Double): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useFrame")(callback.asInstanceOf[js.Any], renderPriority.asInstanceOf[js.Any])).asInstanceOf[Null]
  
  @scala.inline
  def useGraph(`object`: Object3D): ObjectMap = ^.asInstanceOf[js.Dynamic].applyDynamic("useGraph")(`object`.asInstanceOf[js.Any]).asInstanceOf[ObjectMap]
  
  object useLoader {
    
    @scala.inline
    def apply[T](Proto: Instantiable0[LoaderResult[T]], input: String | js.Array[String]): T = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def apply[T](
      Proto: Instantiable0[LoaderResult[T]],
      input: String | js.Array[String],
      extensions: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): T = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def apply[T](Proto: Instantiable0[LoaderResult[T]], input: String | js.Array[String], extensions: Extensions): T = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def apply[T](
      Proto: Instantiable0[LoaderResult[T]],
      input: String | js.Array[String],
      extensions: Extensions,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): T = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @JSImport("react-three-fiber", "useLoader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-three-fiber", "useLoader.preload")
    @js.native
    def preload: js.Function3[
        /* Proto */ Instantiable0[LoaderResult[js.Any]], 
        /* url */ String | js.Array[String], 
        /* extensions */ js.UndefOr[Extensions], 
        Unit
      ] = js.native
    @scala.inline
    def preload_=(
      x: js.Function3[
          /* Proto */ Instantiable0[LoaderResult[js.Any]], 
          /* url */ String | js.Array[String], 
          /* extensions */ js.UndefOr[Extensions], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preload")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def useResource[T](): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResource")().asInstanceOf[MutableRefObject[T]]
  @scala.inline
  def useResource[T](optionalRef: MutableRefObject[T]): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResource")(optionalRef.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]
  
  @scala.inline
  def useThree(): SharedCanvasContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useThree")().asInstanceOf[SharedCanvasContext]
  
  @scala.inline
  def useUpdate[T](callback: js.Function1[/* props */ T, Unit], dependents: js.Array[js.Any]): MutableRefObject[T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUpdate")(callback.asInstanceOf[js.Any], dependents.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[T | Unit]]
  @scala.inline
  def useUpdate[T](
    callback: js.Function1[/* props */ T, Unit],
    dependents: js.Array[js.Any],
    optionalRef: MutableRefObject[T]
  ): MutableRefObject[T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUpdate")(callback.asInstanceOf[js.Any], dependents.asInstanceOf[js.Any], optionalRef.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[T | Unit]]
}
