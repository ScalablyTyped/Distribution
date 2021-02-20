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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMod {
  
  @JSImport("react-three-fiber/renderer", "Renderer")
  @js.native
  val Renderer: Reconciler[js.Any, js.Any, js.Any, js.Any] = js.native
  
  @JSImport("react-three-fiber/renderer", "addAfterEffect")
  @js.native
  def addAfterEffect(callback: GlobalRenderCallback): js.Function0[Unit] = js.native
  
  @JSImport("react-three-fiber/renderer", "addEffect")
  @js.native
  def addEffect(callback: GlobalRenderCallback): js.Function0[Unit] = js.native
  
  @JSImport("react-three-fiber/renderer", "addTail")
  @js.native
  def addTail(callback: GlobalRenderCallback): js.Function0[Unit] = js.native
  
  @JSImport("react-three-fiber/renderer", "applyProps")
  @js.native
  def applyProps(instance: js.Any, newProps: js.Any): Unit = js.native
  @JSImport("react-three-fiber/renderer", "applyProps")
  @js.native
  def applyProps(instance: js.Any, newProps: js.Any, oldProps: js.UndefOr[scala.Nothing], accumulative: Boolean): Unit = js.native
  @JSImport("react-three-fiber/renderer", "applyProps")
  @js.native
  def applyProps(instance: js.Any, newProps: js.Any, oldProps: js.Any): Unit = js.native
  @JSImport("react-three-fiber/renderer", "applyProps")
  @js.native
  def applyProps(instance: js.Any, newProps: js.Any, oldProps: js.Any, accumulative: Boolean): Unit = js.native
  
  @JSImport("react-three-fiber/renderer", "createPortal")
  @js.native
  def createPortal(children: ReactNode, containerInfo: js.Any): Children = js.native
  @JSImport("react-three-fiber/renderer", "createPortal")
  @js.native
  def createPortal(children: ReactNode, containerInfo: js.Any, implementation: js.UndefOr[scala.Nothing], key: js.Any): Children = js.native
  @JSImport("react-three-fiber/renderer", "createPortal")
  @js.native
  def createPortal(children: ReactNode, containerInfo: js.Any, implementation: js.Any): Children = js.native
  @JSImport("react-three-fiber/renderer", "createPortal")
  @js.native
  def createPortal(children: ReactNode, containerInfo: js.Any, implementation: js.Any, key: js.Any): Children = js.native
  
  @JSImport("react-three-fiber/renderer", "extend")
  @js.native
  def extend(objects: js.Object): Unit = js.native
  
  @JSImport("react-three-fiber/renderer", "forceResize")
  @js.native
  def forceResize(): Unit = js.native
  
  @JSImport("react-three-fiber/renderer", "invalidate")
  @js.native
  def invalidate(): Unit = js.native
  @JSImport("react-three-fiber/renderer", "invalidate")
  @js.native
  def invalidate(state: js.UndefOr[scala.Nothing], frames: Double): Unit = js.native
  @JSImport("react-three-fiber/renderer", "invalidate")
  @js.native
  def invalidate(state: Boolean): Unit = js.native
  @JSImport("react-three-fiber/renderer", "invalidate")
  @js.native
  def invalidate(state: Boolean, frames: Double): Unit = js.native
  @JSImport("react-three-fiber/renderer", "invalidate")
  @js.native
  def invalidate(state: MutableRefObject[CanvasContext]): Unit = js.native
  @JSImport("react-three-fiber/renderer", "invalidate")
  @js.native
  def invalidate(state: MutableRefObject[CanvasContext], frames: Double): Unit = js.native
  
  @JSImport("react-three-fiber/renderer", "render")
  @js.native
  def render(element: ReactNode, container: Object3D): js.Any = js.native
  @JSImport("react-three-fiber/renderer", "render")
  @js.native
  def render(element: ReactNode, container: Object3D, state: MutableRefObject[CanvasContext]): js.Any = js.native
  
  @JSImport("react-three-fiber/renderer", "renderGl")
  @js.native
  def renderGl(state: MutableRefObject[CanvasContext], timestamp: Double): Double = js.native
  @JSImport("react-three-fiber/renderer", "renderGl")
  @js.native
  def renderGl(
    state: MutableRefObject[CanvasContext],
    timestamp: Double,
    repeat: js.UndefOr[scala.Nothing],
    runGlobalEffects: Boolean
  ): Double = js.native
  @JSImport("react-three-fiber/renderer", "renderGl")
  @js.native
  def renderGl(state: MutableRefObject[CanvasContext], timestamp: Double, repeat: Double): Double = js.native
  @JSImport("react-three-fiber/renderer", "renderGl")
  @js.native
  def renderGl(
    state: MutableRefObject[CanvasContext],
    timestamp: Double,
    repeat: Double,
    runGlobalEffects: Boolean
  ): Double = js.native
  
  @JSImport("react-three-fiber/renderer", "unmountComponentAtNode")
  @js.native
  def unmountComponentAtNode(container: Object3D): Unit = js.native
  @JSImport("react-three-fiber/renderer", "unmountComponentAtNode")
  @js.native
  def unmountComponentAtNode(container: Object3D, callback: js.Function1[/* c */ Object3D, Unit]): Unit = js.native
  
  type GlobalRenderCallback = js.Function1[/* timeStamp */ Double, Boolean]
  
  type ObjectHash = StringDictionary[js.Object]
}
