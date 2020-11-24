package typings.reactThreeFiber.anon

import typings.reactThreeFiber.threeTypesMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vertices extends js.Object {
  
  var vertices: js.UndefOr[js.Array[Vector3]] = js.native
}
object Vertices {
  
  @scala.inline
  def apply(): Vertices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vertices]
  }
  
  @scala.inline
  implicit class VerticesOps[Self <: Vertices] (val x: Self) extends AnyVal {
    
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
    def setVerticesVarargs(value: Vector3*): Self = this.set("vertices", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[Vector3]): Self = this.set("vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertices: Self = this.set("vertices", js.undefined)
  }
}
