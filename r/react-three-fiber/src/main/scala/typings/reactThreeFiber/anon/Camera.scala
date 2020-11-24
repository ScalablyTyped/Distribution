package typings.reactThreeFiber.anon

import typings.reactThreeFiber.canvasMod.Intersection
import typings.three.mod.Ray
import typings.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Camera[T] extends js.Object {
  
  var camera: typings.reactThreeFiber.canvasMod.Camera = js.native
  
  var delta: Double = js.native
  
  var intersections: js.Array[Intersection] = js.native
  
  var ray: Ray = js.native
  
  var sourceEvent: T = js.native
  
  def stopPropagation(): Unit = js.native
  
  var stopped: Boolean = js.native
  
  var unprojectedPoint: Vector3 = js.native
}
object Camera {
  
  @scala.inline
  def apply[T](
    camera: typings.reactThreeFiber.canvasMod.Camera,
    delta: Double,
    intersections: js.Array[Intersection],
    ray: Ray,
    sourceEvent: T,
    stopPropagation: () => Unit,
    stopped: Boolean,
    unprojectedPoint: Vector3
  ): Camera[T] = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], intersections = intersections.asInstanceOf[js.Any], ray = ray.asInstanceOf[js.Any], sourceEvent = sourceEvent.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), stopped = stopped.asInstanceOf[js.Any], unprojectedPoint = unprojectedPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera[T]]
  }
  
  @scala.inline
  implicit class CameraOps[Self <: Camera[_], T] (val x: Self with Camera[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCamera(value: typings.reactThreeFiber.canvasMod.Camera): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionsVarargs(value: Intersection*): Self = this.set("intersections", js.Array(value :_*))
    
    @scala.inline
    def setIntersections(value: js.Array[Intersection]): Self = this.set("intersections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRay(value: Ray): Self = this.set("ray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceEvent(value: T): Self = this.set("sourceEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopped(value: Boolean): Self = this.set("stopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprojectedPoint(value: Vector3): Self = this.set("unprojectedPoint", value.asInstanceOf[js.Any])
  }
}
