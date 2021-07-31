package typings.reactThreeFiber

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactNode
import typings.reactReconciler.mod.Reconciler
import typings.reactThreeFiber.anon.Children
import typings.reactThreeFiber.canvasMod.CanvasContext
import typings.three.mod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMod {
  
  @JSImport("react-three-fiber/renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-three-fiber/renderer", "Renderer")
  @js.native
  val Renderer: Reconciler[js.Any, js.Any, js.Any, js.Any] = js.native
  
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
  
  @scala.inline
  def unmountComponentAtNode(container: Object3D): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def unmountComponentAtNode(container: Object3D, callback: js.Function1[/* c */ Object3D, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type GlobalRenderCallback = js.Function1[/* timeStamp */ Double, Boolean]
  
  type ObjectHash = StringDictionary[js.Object]
}
