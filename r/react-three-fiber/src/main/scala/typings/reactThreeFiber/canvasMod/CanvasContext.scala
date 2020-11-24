package typings.reactThreeFiber.canvasMod

import typings.react.mod.MutableRefObject
import typings.reactThreeFiber.threeTypesMod.NamedArrayTuple
import typings.reactUseMeasure.mod.RectReadOnly
import typings.three.mod.Clock
import typings.three.mod.Object3D
import typings.three.mod.Raycaster
import typings.three.mod.Scene
import typings.three.mod.Vector2
import typings.three.mod.WebGLRenderer
import typings.tinyEmitter.mod.TinyEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-three-fiber.react-three-fiber/canvas.SharedCanvasContext & {  captured :std.Array<react-three-fiber.react-three-fiber/canvas.Intersection> | undefined,   noEvents :boolean,   ready :boolean,   active :boolean,   manual :number,   colorManagement :boolean,   vr :boolean,   concurrent :boolean,   invalidateFrameloop :boolean,   frames :number,   subscribers :std.Array<react-three-fiber.react-three-fiber/canvas.Subscription>,   initialClick :react-three-fiber.react-three-fiber/three-types.NamedArrayTuple<(x : number, y : number): void>,   initialHits :std.Array<three.three.Object3D>,   pointer :tiny-emitter.tiny-emitter.TinyEmitter} */
@js.native
trait CanvasContext extends js.Object {
  
  var active: Boolean = js.native
  
  var aspect: Double = js.native
  
  var camera: Camera = js.native
  
  var captured: js.UndefOr[js.Array[Intersection]] = js.native
  
  var clock: Clock = js.native
  
  var colorManagement: Boolean = js.native
  
  var concurrent: Boolean = js.native
  
  var events: DomEventHandlers = js.native
  
  def forceResize(): Unit = js.native
  
  var frames: Double = js.native
  
  var gl: WebGLRenderer = js.native
  
  var initialClick: NamedArrayTuple[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.native
  
  var initialHits: js.Array[Object3D] = js.native
  
  def intersect(): Unit = js.native
  def intersect(event: DomEvent): Unit = js.native
  
  def invalidate(): Unit = js.native
  
  var invalidateFrameloop: Boolean = js.native
  
  var manual: Double = js.native
  
  var mouse: Vector2 = js.native
  
  var noEvents: Boolean = js.native
  
  var pointer: TinyEmitter = js.native
  
  var raycaster: Raycaster = js.native
  
  var ready: Boolean = js.native
  
  var scene: Scene = js.native
  
  def setDefaultCamera(camera: Camera): Unit = js.native
  
  var size: RectReadOnly = js.native
  
  def subscribe(callback: MutableRefObject[RenderCallback]): js.Function0[Unit] = js.native
  def subscribe(callback: MutableRefObject[RenderCallback], priority: Double): js.Function0[Unit] = js.native
  
  var subscribers: js.Array[Subscription] = js.native
  
  var viewport: ViewportData = js.native
  
  var vr: Boolean = js.native
}
