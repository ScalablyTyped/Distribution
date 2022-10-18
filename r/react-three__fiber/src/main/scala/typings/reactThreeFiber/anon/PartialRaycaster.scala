package typings.reactThreeFiber.anon

import typings.three.anon.Y
import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreLayersMod.Layers
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcCoreRaycasterMod.Intersection
import typings.three.srcCoreRaycasterMod.RaycasterParameters
import typings.three.srcMathRayMod.Ray
import typings.three.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<three.three.Raycaster> */
trait PartialRaycaster extends StObject {
  
  var camera: js.UndefOr[Camera] = js.undefined
  
  var constructor: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var far: js.UndefOr[Double] = js.undefined
  
  var intersectObject: js.UndefOr[
    js.Function1[/* object */ Object3D[Event], js.Array[Intersection[Object3D[Event]]]]
  ] = js.undefined
  
  var intersectObjects: js.UndefOr[
    js.Function1[/* objects */ js.Array[Object3D[Event]], js.Array[Intersection[Object3D[Event]]]]
  ] = js.undefined
  
  var layers: js.UndefOr[Layers] = js.undefined
  
  var near: js.UndefOr[Double] = js.undefined
  
  var params: js.UndefOr[RaycasterParameters] = js.undefined
  
  var ray: js.UndefOr[Ray] = js.undefined
  
  var set: js.UndefOr[js.Function2[/* origin */ Vector3, /* direction */ Vector3, Unit]] = js.undefined
  
  var setFromCamera: js.UndefOr[js.Function2[/* coords */ Y, /* camera */ Camera, Unit]] = js.undefined
}
object PartialRaycaster {
  
  inline def apply(): PartialRaycaster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRaycaster]
  }
  
  extension [Self <: PartialRaycaster](x: Self) {
    
    inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setConstructor(value: () => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction0(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
    
    inline def setFarUndefined: Self = StObject.set(x, "far", js.undefined)
    
    inline def setIntersectObject(value: /* object */ Object3D[Event] => js.Array[Intersection[Object3D[Event]]]): Self = StObject.set(x, "intersectObject", js.Any.fromFunction1(value))
    
    inline def setIntersectObjectUndefined: Self = StObject.set(x, "intersectObject", js.undefined)
    
    inline def setIntersectObjects(value: /* objects */ js.Array[Object3D[Event]] => js.Array[Intersection[Object3D[Event]]]): Self = StObject.set(x, "intersectObjects", js.Any.fromFunction1(value))
    
    inline def setIntersectObjectsUndefined: Self = StObject.set(x, "intersectObjects", js.undefined)
    
    inline def setLayers(value: Layers): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
    
    inline def setNearUndefined: Self = StObject.set(x, "near", js.undefined)
    
    inline def setParams(value: RaycasterParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRay(value: Ray): Self = StObject.set(x, "ray", value.asInstanceOf[js.Any])
    
    inline def setRayUndefined: Self = StObject.set(x, "ray", js.undefined)
    
    inline def setSet(value: (/* origin */ Vector3, /* direction */ Vector3) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetFromCamera(value: (/* coords */ Y, /* camera */ Camera) => Unit): Self = StObject.set(x, "setFromCamera", js.Any.fromFunction2(value))
    
    inline def setSetFromCameraUndefined: Self = StObject.set(x, "setFromCamera", js.undefined)
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
