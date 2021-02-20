package typings.reactThreeFiber

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Context
import typings.react.mod.MemoExoticComponent
import typings.react.mod.MutableRefObject
import typings.react.mod.NamedExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object css2dMod {
  
  @JSImport("react-three-fiber/targets/css2d", "Canvas")
  @js.native
  val Canvas: MemoExoticComponent[js.Function1[/* hasChildrenProps */ ContainerProps, Element]] = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "Renderer")
  @js.native
  val Renderer: Reconciler[js.Any, js.Any, js.Any, js.Any] = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "ResizeContainer")
  @js.native
  val ResizeContainer: NamedExoticComponent[ResizeContainerProps] = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "addAfterEffect")
  @js.native
  def addAfterEffect(callback: GlobalRenderCallback): js.Function0[Unit] = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "addEffect")
  @js.native
  def addEffect(callback: GlobalRenderCallback): js.Function0[Unit] = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "addTail")
  @js.native
  def addTail(callback: GlobalRenderCallback): js.Function0[Unit] = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "applyProps")
  @js.native
  def applyProps(instance: js.Any, newProps: js.Any): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "applyProps")
  @js.native
  def applyProps(instance: js.Any, newProps: js.Any, oldProps: js.UndefOr[scala.Nothing], accumulative: Boolean): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "applyProps")
  @js.native
  def applyProps(instance: js.Any, newProps: js.Any, oldProps: js.Any): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "applyProps")
  @js.native
  def applyProps(instance: js.Any, newProps: js.Any, oldProps: js.Any, accumulative: Boolean): Unit = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "createPortal")
  @js.native
  def createPortal(children: ReactNode, containerInfo: js.Any): Children = js.native
  @JSImport("react-three-fiber/targets/css2d", "createPortal")
  @js.native
  def createPortal(children: ReactNode, containerInfo: js.Any, implementation: js.UndefOr[scala.Nothing], key: js.Any): Children = js.native
  @JSImport("react-three-fiber/targets/css2d", "createPortal")
  @js.native
  def createPortal(children: ReactNode, containerInfo: js.Any, implementation: js.Any): Children = js.native
  @JSImport("react-three-fiber/targets/css2d", "createPortal")
  @js.native
  def createPortal(children: ReactNode, containerInfo: js.Any, implementation: js.Any, key: js.Any): Children = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "extend")
  @js.native
  def extend(objects: js.Object): Unit = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "forceResize")
  @js.native
  def forceResize(): Unit = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "invalidate")
  @js.native
  def invalidate(): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "invalidate")
  @js.native
  def invalidate(state: js.UndefOr[scala.Nothing], frames: Double): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "invalidate")
  @js.native
  def invalidate(state: Boolean): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "invalidate")
  @js.native
  def invalidate(state: Boolean, frames: Double): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "invalidate")
  @js.native
  def invalidate(state: MutableRefObject[CanvasContext]): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "invalidate")
  @js.native
  def invalidate(state: MutableRefObject[CanvasContext], frames: Double): Unit = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "isOrthographicCamera")
  @js.native
  def isOrthographicCamera(`def`: Camera): /* is three.three.OrthographicCamera */ Boolean = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "render")
  @js.native
  def render(element: ReactNode, container: Object3D): js.Any = js.native
  @JSImport("react-three-fiber/targets/css2d", "render")
  @js.native
  def render(element: ReactNode, container: Object3D, state: MutableRefObject[CanvasContext]): js.Any = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "renderGl")
  @js.native
  def renderGl(state: MutableRefObject[CanvasContext], timestamp: Double): Double = js.native
  @JSImport("react-three-fiber/targets/css2d", "renderGl")
  @js.native
  def renderGl(
    state: MutableRefObject[CanvasContext],
    timestamp: Double,
    repeat: js.UndefOr[scala.Nothing],
    runGlobalEffects: Boolean
  ): Double = js.native
  @JSImport("react-three-fiber/targets/css2d", "renderGl")
  @js.native
  def renderGl(state: MutableRefObject[CanvasContext], timestamp: Double, repeat: Double): Double = js.native
  @JSImport("react-three-fiber/targets/css2d", "renderGl")
  @js.native
  def renderGl(
    state: MutableRefObject[CanvasContext],
    timestamp: Double,
    repeat: Double,
    runGlobalEffects: Boolean
  ): Double = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "stateContext")
  @js.native
  val stateContext: Context[SharedCanvasContext] = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "unmountComponentAtNode")
  @js.native
  def unmountComponentAtNode(container: Object3D): Unit = js.native
  @JSImport("react-three-fiber/targets/css2d", "unmountComponentAtNode")
  @js.native
  def unmountComponentAtNode(container: Object3D, callback: js.Function1[/* c */ Object3D, Unit]): Unit = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "useCanvas")
  @js.native
  def useCanvas(props: UseCanvasProps): DomEventHandlers = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "useFrame")
  @js.native
  def useFrame(callback: RenderCallback): Null = js.native
  @JSImport("react-three-fiber/targets/css2d", "useFrame")
  @js.native
  def useFrame(callback: RenderCallback, renderPriority: Double): Null = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "useGraph")
  @js.native
  def useGraph(`object`: Object3D): ObjectMap = js.native
  
  object useLoader {
    
    @JSImport("react-three-fiber/targets/css2d", "useLoader")
    @js.native
    def apply[T](Proto: Instantiable0[LoaderResult[T]], input: String | js.Array[String]): T = js.native
    @JSImport("react-three-fiber/targets/css2d", "useLoader")
    @js.native
    def apply[T](
      Proto: Instantiable0[LoaderResult[T]],
      input: String | js.Array[String],
      extensions: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): T = js.native
    @JSImport("react-three-fiber/targets/css2d", "useLoader")
    @js.native
    def apply[T](Proto: Instantiable0[LoaderResult[T]], input: String | js.Array[String], extensions: Extensions): T = js.native
    @JSImport("react-three-fiber/targets/css2d", "useLoader")
    @js.native
    def apply[T](
      Proto: Instantiable0[LoaderResult[T]],
      input: String | js.Array[String],
      extensions: Extensions,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): T = js.native
    @JSImport("react-three-fiber/targets/css2d", "useLoader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-three-fiber/targets/css2d", "useLoader.preload")
    @js.native
    def preload: js.Function3[
        /* Proto */ Instantiable0[LoaderResult[js.Any]], 
        /* url */ String | js.Array[String], 
        /* extensions */ js.UndefOr[Extensions], 
        js.UndefOr[scala.Nothing]
      ] = js.native
    @scala.inline
    def preload_=(
      x: js.Function3[
          /* Proto */ Instantiable0[LoaderResult[js.Any]], 
          /* url */ String | js.Array[String], 
          /* extensions */ js.UndefOr[Extensions], 
          js.UndefOr[scala.Nothing]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preload")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-three-fiber/targets/css2d", "useResource")
  @js.native
  def useResource[T](): MutableRefObject[T] = js.native
  @JSImport("react-three-fiber/targets/css2d", "useResource")
  @js.native
  def useResource[T](optionalRef: MutableRefObject[T]): MutableRefObject[T] = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "useThree")
  @js.native
  def useThree(): SharedCanvasContext = js.native
  
  @JSImport("react-three-fiber/targets/css2d", "useUpdate")
  @js.native
  def useUpdate[T](callback: js.Function1[/* props */ T, Unit], dependents: js.Array[_]): MutableRefObject[js.UndefOr[T]] = js.native
  @JSImport("react-three-fiber/targets/css2d", "useUpdate")
  @js.native
  def useUpdate[T](
    callback: js.Function1[/* props */ T, Unit],
    dependents: js.Array[_],
    optionalRef: MutableRefObject[T]
  ): MutableRefObject[js.UndefOr[T]] = js.native
}
