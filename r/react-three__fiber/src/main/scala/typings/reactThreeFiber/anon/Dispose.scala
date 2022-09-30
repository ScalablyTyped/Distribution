package typings.reactThreeFiber.anon

import typings.reactThreeFiber.threeTypesMod.Euler
import typings.reactThreeFiber.threeTypesMod.Layers
import typings.reactThreeFiber.threeTypesMod.Matrix4
import typings.reactThreeFiber.threeTypesMod.Quaternion
import typings.reactThreeFiber.threeTypesMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dispose extends StObject {
  
  var dispose: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  
  var layers: js.UndefOr[Layers] = js.undefined
  
  var matrix: js.UndefOr[Matrix4] = js.undefined
  
  var position: js.UndefOr[Vector3] = js.undefined
  
  var quaternion: js.UndefOr[Quaternion] = js.undefined
  
  var rotation: js.UndefOr[Euler] = js.undefined
  
  var scale: js.UndefOr[Vector3] = js.undefined
  
  var up: js.UndefOr[Vector3] = js.undefined
}
object Dispose {
  
  inline def apply(): Dispose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dispose]
  }
  
  extension [Self <: Dispose](x: Self) {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setDisposeNull: Self = StObject.set(x, "dispose", null)
    
    inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    inline def setLayers(value: Layers): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setMatrix(value: Matrix4): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixFunction16(
      value: (/* n11 */ Double, /* n12 */ Double, /* n13 */ Double, /* n14 */ Double, /* n21 */ Double, /* n22 */ Double, /* n23 */ Double, /* n24 */ Double, /* n31 */ Double, /* n32 */ Double, /* n33 */ Double, /* n34 */ Double, /* n41 */ Double, /* n42 */ Double, /* n43 */ Double, /* n44 */ Double) => typings.three.matrix4Mod.Matrix4
    ): Self = StObject.set(x, "matrix", js.Any.fromFunction16(value))
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    inline def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setQuaternion(value: Quaternion): Self = StObject.set(x, "quaternion", value.asInstanceOf[js.Any])
    
    inline def setQuaternionUndefined: Self = StObject.set(x, "quaternion", js.undefined)
    
    inline def setRotation(value: Euler): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: Vector3): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setUp(value: Vector3): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
