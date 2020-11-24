package typings.reactThreeFiber.anon

import typings.reactThreeFiber.threeTypesMod.Euler
import typings.reactThreeFiber.threeTypesMod.Layers
import typings.reactThreeFiber.threeTypesMod.Matrix4
import typings.reactThreeFiber.threeTypesMod.Quaternion
import typings.reactThreeFiber.threeTypesMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dispose extends js.Object {
  
  var dispose: js.UndefOr[js.Function0[Unit] | Null] = js.native
  
  var layers: js.UndefOr[Layers] = js.native
  
  var matrix: js.UndefOr[Matrix4] = js.native
  
  var position: js.UndefOr[Vector3] = js.native
  
  var quaternion: js.UndefOr[Quaternion] = js.native
  
  var rotation: js.UndefOr[Euler] = js.native
  
  var scale: js.UndefOr[Vector3] = js.native
  
  var up: js.UndefOr[Vector3] = js.native
}
object Dispose {
  
  @scala.inline
  def apply(): Dispose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dispose]
  }
  
  @scala.inline
  implicit class DisposeOps[Self <: Dispose] (val x: Self) extends AnyVal {
    
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDispose: Self = this.set("dispose", js.undefined)
    
    @scala.inline
    def setDisposeNull: Self = this.set("dispose", null)
    
    @scala.inline
    def setLayers(value: Layers): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setMatrix(value: Matrix4): Self = this.set("matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatrix: Self = this.set("matrix", js.undefined)
    
    @scala.inline
    def setPosition(value: Vector3): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setQuaternion(value: Quaternion): Self = this.set("quaternion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuaternion: Self = this.set("quaternion", js.undefined)
    
    @scala.inline
    def setRotation(value: Euler): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setScale(value: Vector3): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setUp(value: Vector3): Self = this.set("up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
  }
}
