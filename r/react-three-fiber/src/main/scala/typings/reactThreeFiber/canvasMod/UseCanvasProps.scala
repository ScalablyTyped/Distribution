package typings.reactThreeFiber.canvasMod

import typings.reactUseMeasure.mod.RectReadOnly
import typings.three.mod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseCanvasProps extends CanvasProps {
  
  def forceResize(): Unit = js.native
  
  @JSName("gl")
  var gl_UseCanvasProps: WebGLRenderer = js.native
  
  var size: RectReadOnly = js.native
}
object UseCanvasProps {
  
  @scala.inline
  def apply(forceResize: () => Unit, gl: WebGLRenderer, size: RectReadOnly): UseCanvasProps = {
    val __obj = js.Dynamic.literal(forceResize = js.Any.fromFunction0(forceResize), gl = gl.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseCanvasProps]
  }
  
  @scala.inline
  implicit class UseCanvasPropsOps[Self <: UseCanvasProps] (val x: Self) extends AnyVal {
    
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
    def setForceResize(value: () => Unit): Self = this.set("forceResize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGl(value: WebGLRenderer): Self = this.set("gl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: RectReadOnly): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
