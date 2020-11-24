package typings.reactThreeFiber.anon

import typings.reactThreeFiber.canvasMod.ComputeOffsetsFunction
import typings.reactThreeFiber.canvasMod.DomEvent
import typings.reactThreeFiber.canvasMod.FilterFunction
import typings.reactThreeFiber.canvasMod.SharedCanvasContext
import typings.three.anon.X
import typings.three.layersMod.Layers
import typings.three.object3DMod.Object3D
import typings.three.rayMod.Ray
import typings.three.raycasterMod.Intersection
import typings.three.raycasterMod.RaycasterParameters
import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<three.three.Raycaster> & {  filter :react-three-fiber.react-three-fiber/canvas.FilterFunction | undefined,   computeOffsets :react-three-fiber.react-three-fiber/canvas.ComputeOffsetsFunction | undefined} */
@js.native
trait PartialRaycasterfilterFil extends js.Object {
  
  var camera: js.UndefOr[typings.three.cameraMod.Camera] = js.native
  
  var computeOffsets: js.UndefOr[ComputeOffsetsFunction] = js.native
  
  var constructor: js.UndefOr[js.Function0[js.Any]] = js.native
  
  var far: js.UndefOr[Double] = js.native
  
  var filter: js.UndefOr[FilterFunction] = js.native
  
  var intersectObject: js.UndefOr[js.Function1[/* object */ Object3D, js.Array[Intersection]]] = js.native
  
  var intersectObjects: js.UndefOr[js.Function1[/* objects */ js.Array[Object3D], js.Array[Intersection]]] = js.native
  
  var layers: js.UndefOr[Layers] = js.native
  
  var near: js.UndefOr[Double] = js.native
  
  var params: js.UndefOr[RaycasterParameters] = js.native
  
  var ray: js.UndefOr[Ray] = js.native
  
  var set: js.UndefOr[js.Function2[/* origin */ Vector3, /* direction */ Vector3, Unit]] = js.native
  
  var setFromCamera: js.UndefOr[js.Function2[/* coords */ X, /* camera */ typings.three.cameraMod.Camera, Unit]] = js.native
}
object PartialRaycasterfilterFil {
  
  @scala.inline
  def apply(): PartialRaycasterfilterFil = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRaycasterfilterFil]
  }
  
  @scala.inline
  implicit class PartialRaycasterfilterFilOps[Self <: PartialRaycasterfilterFil] (val x: Self) extends AnyVal {
    
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
    def setCamera(value: typings.three.cameraMod.Camera): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    
    @scala.inline
    def setComputeOffsets(value: /* event */ DomEvent => OffsetX): Self = this.set("computeOffsets", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComputeOffsets: Self = this.set("computeOffsets", js.undefined)
    
    @scala.inline
    def setConstructor(value: () => js.Any): Self = this.set("constructor", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteConstructor: Self = this.set("constructor", js.undefined)
    
    @scala.inline
    def setFar(value: Double): Self = this.set("far", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFar: Self = this.set("far", js.undefined)
    
    @scala.inline
    def setFilter(
      value: (/* items */ js.Array[Intersection], /* state */ SharedCanvasContext) => js.Array[Intersection]
    ): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setIntersectObject(value: /* object */ Object3D => js.Array[Intersection]): Self = this.set("intersectObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIntersectObject: Self = this.set("intersectObject", js.undefined)
    
    @scala.inline
    def setIntersectObjects(value: /* objects */ js.Array[Object3D] => js.Array[Intersection]): Self = this.set("intersectObjects", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIntersectObjects: Self = this.set("intersectObjects", js.undefined)
    
    @scala.inline
    def setLayers(value: Layers): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setNear(value: Double): Self = this.set("near", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNear: Self = this.set("near", js.undefined)
    
    @scala.inline
    def setParams(value: RaycasterParameters): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setRay(value: Ray): Self = this.set("ray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRay: Self = this.set("ray", js.undefined)
    
    @scala.inline
    def setSet(value: (/* origin */ Vector3, /* direction */ Vector3) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    
    @scala.inline
    def setSetFromCamera(value: (/* coords */ X, /* camera */ typings.three.cameraMod.Camera) => Unit): Self = this.set("setFromCamera", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetFromCamera: Self = this.set("setFromCamera", js.undefined)
  }
}
