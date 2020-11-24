package typings.reactThreeFiber.canvasMod

import typings.three.mod.Object3D
import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Intersection
  extends typings.three.raycasterMod.Intersection {
  
  var eventObject: Object3D = js.native
}
object Intersection {
  
  @scala.inline
  def apply(
    distance: Double,
    eventObject: Object3D,
    `object`: typings.three.object3DMod.Object3D,
    point: Vector3
  ): Intersection = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intersection]
  }
  
  @scala.inline
  implicit class IntersectionOps[Self <: Intersection] (val x: Self) extends AnyVal {
    
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
    def setEventObject(value: Object3D): Self = this.set("eventObject", value.asInstanceOf[js.Any])
  }
}
