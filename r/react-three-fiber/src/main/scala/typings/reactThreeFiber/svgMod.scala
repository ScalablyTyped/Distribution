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
import typings.reactThreeFiber.hooksMod.Extensions
import typings.reactThreeFiber.hooksMod.LoaderResult
import typings.reactThreeFiber.hooksMod.ObjectMap
import typings.reactThreeFiber.rendererMod.GlobalRenderCallback
import typings.reactThreeFiber.resizeContainerMod.ContainerProps
import typings.reactThreeFiber.resizeContainerMod.ResizeContainerProps
import typings.reactUseMeasure.mod.RectReadOnly
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.mod.Camera
import typings.three.mod.Object3D
import typings.three.mod.WebGLRenderer
import typings.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgMod {
  
  @JSImport("react-three-fiber/targets/svg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-three-fiber/targets/svg", "Canvas")
  @js.native
  val Canvas: MemoExoticComponent[js.Function1[/* hasChildrenProps */ ContainerProps, Element]] = js.native
  
  @JSImport("react-three-fiber/targets/svg", "Renderer")
  @js.native
  val Renderer: Reconciler[js.Any, js.Any, js.Any, js.Any] = js.native
  
  @JSImport("react-three-fiber/targets/svg", "ResizeContainer")
  @js.native
  val ResizeContainer: NamedExoticComponent[ResizeContainerProps] = js.native
  
  inline def addAfterEffect(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterEffect")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def addEffect(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addEffect")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def addTail(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addTail")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def applyProps(instance: js.Any, newProps: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyProps")(instance.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyProps(instance: js.Any, newProps: js.Any, oldProps: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyProps")(instance.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any], oldProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyProps(instance: js.Any, newProps: js.Any, oldProps: js.Any, accumulative: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyProps")(instance.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any], oldProps.asInstanceOf[js.Any], accumulative.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyProps(instance: js.Any, newProps: js.Any, oldProps: Unit, accumulative: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyProps")(instance.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any], oldProps.asInstanceOf[js.Any], accumulative.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createPortal(children: ReactNode, containerInfo: js.Any): Children = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], containerInfo.asInstanceOf[js.Any])).asInstanceOf[Children]
  inline def createPortal(children: ReactNode, containerInfo: js.Any, implementation: js.Any): Children = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], containerInfo.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Children]
  inline def createPortal(children: ReactNode, containerInfo: js.Any, implementation: js.Any, key: js.Any): Children = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], containerInfo.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Children]
  inline def createPortal(children: ReactNode, containerInfo: js.Any, implementation: Unit, key: js.Any): Children = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], containerInfo.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Children]
  
  inline def extend(objects: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(objects.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def forceResize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceResize")().asInstanceOf[Unit]
  
  inline def invalidate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")().asInstanceOf[Unit]
  inline def invalidate(state: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def invalidate(state: Boolean, frames: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(state.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def invalidate(state: Unit, frames: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(state.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def invalidate(state: MutableRefObject[typings.reactThreeFiber.canvasMod.CanvasContext]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def invalidate(state: MutableRefObject[typings.reactThreeFiber.canvasMod.CanvasContext], frames: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(state.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isOrthographicCamera(`def`: Camera): /* is three.three.OrthographicCamera */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrthographicCamera")(`def`.asInstanceOf[js.Any]).asInstanceOf[/* is three.three.OrthographicCamera */ Boolean]
  
  inline def render(element: ReactNode, container: Object3D): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def render(
    element: ReactNode,
    container: Object3D,
    state: MutableRefObject[typings.reactThreeFiber.canvasMod.CanvasContext]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def renderGl(state: MutableRefObject[typings.reactThreeFiber.canvasMod.CanvasContext], timestamp: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGl")(state.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def renderGl(
    state: MutableRefObject[typings.reactThreeFiber.canvasMod.CanvasContext],
    timestamp: Double,
    repeat: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGl")(state.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], repeat.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def renderGl(
    state: MutableRefObject[typings.reactThreeFiber.canvasMod.CanvasContext],
    timestamp: Double,
    repeat: Double,
    runGlobalEffects: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGl")(state.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], repeat.asInstanceOf[js.Any], runGlobalEffects.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def renderGl(
    state: MutableRefObject[typings.reactThreeFiber.canvasMod.CanvasContext],
    timestamp: Double,
    repeat: Unit,
    runGlobalEffects: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGl")(state.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], repeat.asInstanceOf[js.Any], runGlobalEffects.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("react-three-fiber/targets/svg", "stateContext")
  @js.native
  val stateContext: Context[typings.reactThreeFiber.canvasMod.SharedCanvasContext] = js.native
  
  inline def unmountComponentAtNode(container: Object3D): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unmountComponentAtNode(container: Object3D, callback: js.Function1[/* c */ Object3D, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useCanvas(props: typings.reactThreeFiber.canvasMod.UseCanvasProps): typings.reactThreeFiber.canvasMod.DomEventHandlers = ^.asInstanceOf[js.Dynamic].applyDynamic("useCanvas")(props.asInstanceOf[js.Any]).asInstanceOf[typings.reactThreeFiber.canvasMod.DomEventHandlers]
  
  inline def useFrame(callback: typings.reactThreeFiber.canvasMod.RenderCallback): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Null]
  inline def useFrame(callback: typings.reactThreeFiber.canvasMod.RenderCallback, renderPriority: Double): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useFrame")(callback.asInstanceOf[js.Any], renderPriority.asInstanceOf[js.Any])).asInstanceOf[Null]
  
  inline def useGraph(`object`: Object3D): ObjectMap = ^.asInstanceOf[js.Dynamic].applyDynamic("useGraph")(`object`.asInstanceOf[js.Any]).asInstanceOf[ObjectMap]
  
  object useLoader {
    
    inline def apply[T](Proto: Instantiable0[LoaderResult[T]], input: String | js.Array[String]): T = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def apply[T](
      Proto: Instantiable0[LoaderResult[T]],
      input: String | js.Array[String],
      extensions: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): T = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def apply[T](Proto: Instantiable0[LoaderResult[T]], input: String | js.Array[String], extensions: Extensions): T = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def apply[T](
      Proto: Instantiable0[LoaderResult[T]],
      input: String | js.Array[String],
      extensions: Extensions,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): T = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @JSImport("react-three-fiber/targets/svg", "useLoader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-three-fiber/targets/svg", "useLoader.preload")
    @js.native
    def preload: js.Function3[
        /* Proto */ Instantiable0[LoaderResult[js.Any]], 
        /* url */ String | js.Array[String], 
        /* extensions */ js.UndefOr[Extensions], 
        Unit
      ] = js.native
    inline def preload_=(
      x: js.Function3[
          /* Proto */ Instantiable0[LoaderResult[js.Any]], 
          /* url */ String | js.Array[String], 
          /* extensions */ js.UndefOr[Extensions], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preload")(x.asInstanceOf[js.Any])
  }
  
  inline def useResource[T](): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResource")().asInstanceOf[MutableRefObject[T]]
  inline def useResource[T](optionalRef: MutableRefObject[T]): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResource")(optionalRef.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]
  
  inline def useThree(): typings.reactThreeFiber.canvasMod.SharedCanvasContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useThree")().asInstanceOf[typings.reactThreeFiber.canvasMod.SharedCanvasContext]
  
  inline def useUpdate[T](callback: js.Function1[/* props */ T, Unit], dependents: js.Array[js.Any]): MutableRefObject[T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUpdate")(callback.asInstanceOf[js.Any], dependents.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[T | Unit]]
  inline def useUpdate[T](
    callback: js.Function1[/* props */ T, Unit],
    dependents: js.Array[js.Any],
    optionalRef: MutableRefObject[T]
  ): MutableRefObject[T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUpdate")(callback.asInstanceOf[js.Any], dependents.asInstanceOf[js.Any], optionalRef.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[T | Unit]]
  
  @js.native
  trait CanvasContext
    extends StObject
       with typings.reactThreeFiber.canvasMod.CanvasContext
  
  trait CanvasProps
    extends StObject
       with typings.reactThreeFiber.canvasMod.CanvasProps
  object CanvasProps {
    
    inline def apply(): CanvasProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasProps]
    }
  }
  
  @js.native
  trait ComputeOffsetsFunction
    extends typings.reactThreeFiber.canvasMod.ComputeOffsetsFunction
  
  trait DomEventHandlers
    extends StObject
       with typings.reactThreeFiber.canvasMod.DomEventHandlers
  object DomEventHandlers {
    
    inline def apply(
      onClick: js.Any => Unit,
      onContextMenu: js.Any => Unit,
      onDoubleClick: js.Any => Unit,
      onGotPointerCaptureLegacy: js.Any => Unit,
      onLostPointerCapture: js.Any => Unit,
      onPointerDown: js.Any => Unit,
      onPointerLeave: js.Any => Unit,
      onPointerMove: js.Any => Unit,
      onPointerUp: js.Any => Unit,
      onWheel: js.Any => Unit
    ): DomEventHandlers = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), onContextMenu = js.Any.fromFunction1(onContextMenu), onDoubleClick = js.Any.fromFunction1(onDoubleClick), onGotPointerCaptureLegacy = js.Any.fromFunction1(onGotPointerCaptureLegacy), onLostPointerCapture = js.Any.fromFunction1(onLostPointerCapture), onPointerDown = js.Any.fromFunction1(onPointerDown), onPointerLeave = js.Any.fromFunction1(onPointerLeave), onPointerMove = js.Any.fromFunction1(onPointerMove), onPointerUp = js.Any.fromFunction1(onPointerUp), onWheel = js.Any.fromFunction1(onWheel))
      __obj.asInstanceOf[DomEventHandlers]
    }
  }
  
  @js.native
  trait FilterFunction
    extends typings.reactThreeFiber.canvasMod.FilterFunction
  
  trait Intersection
    extends StObject
       with typings.reactThreeFiber.canvasMod.Intersection
  object Intersection {
    
    inline def apply(
      distance: Double,
      eventObject: Object3D,
      `object`: typings.three.object3DMod.Object3D,
      point: Vector3
    ): Intersection = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Intersection]
    }
  }
  
  @js.native
  trait RenderCallback
    extends typings.reactThreeFiber.canvasMod.RenderCallback
  
  trait ResizeOptions
    extends StObject
       with typings.reactThreeFiber.canvasMod.ResizeOptions
  object ResizeOptions {
    
    inline def apply(): ResizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeOptions]
    }
  }
  
  @js.native
  trait SharedCanvasContext
    extends StObject
       with typings.reactThreeFiber.canvasMod.SharedCanvasContext
  
  trait Subscription
    extends StObject
       with typings.reactThreeFiber.canvasMod.Subscription
  object Subscription {
    
    inline def apply(priority: Double, ref: MutableRefObject[typings.reactThreeFiber.canvasMod.RenderCallback]): Subscription = {
      val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscription]
    }
  }
  
  trait UseCanvasProps
    extends StObject
       with typings.reactThreeFiber.canvasMod.UseCanvasProps
  object UseCanvasProps {
    
    inline def apply(forceResize: () => Unit, gl: WebGLRenderer, size: RectReadOnly): UseCanvasProps = {
      val __obj = js.Dynamic.literal(forceResize = js.Any.fromFunction0(forceResize), gl = gl.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseCanvasProps]
    }
  }
  
  trait Viewport
    extends StObject
       with typings.reactThreeFiber.canvasMod.Viewport
  object Viewport {
    
    inline def apply(distance: Double, factor: Double, height: Double, width: Double): Viewport = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], factor = factor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Viewport]
    }
  }
}
