package typings.reactThreeFiber.resizeContainerMod

import typings.three.cameraMod.Camera
import typings.three.object3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<three.three.Renderer, 'domElement'> */
@js.native
trait Renderer extends js.Object {
  
  var render: js.Function2[/* scene */ Object3D, /* camera */ Camera, Unit] = js.native
  
  var setSize: js.Function2[/* width */ Double, /* height */ Double, Unit] = js.native
}
object Renderer {
  
  @scala.inline
  def apply(
    render: (/* scene */ Object3D, /* camera */ Camera) => Unit,
    setSize: (/* width */ Double, /* height */ Double) => Unit
  ): Renderer = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction2(render), setSize = js.Any.fromFunction2(setSize))
    __obj.asInstanceOf[Renderer]
  }
  
  @scala.inline
  implicit class RendererOps[Self <: Renderer] (val x: Self) extends AnyVal {
    
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
    def setRender(value: (/* scene */ Object3D, /* camera */ Camera) => Unit): Self = this.set("render", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSize(value: (/* width */ Double, /* height */ Double) => Unit): Self = this.set("setSize", js.Any.fromFunction2(value))
  }
}
