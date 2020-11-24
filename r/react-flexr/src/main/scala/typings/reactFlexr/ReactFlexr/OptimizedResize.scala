package typings.reactFlexr.ReactFlexr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple resize event throttler. Usefull for force updating when the
  * app have been resized. For best performance, use it in your main
  * app component in the componentDidMount life cycle.
  */
@js.native
trait OptimizedResize extends js.Object {
  
  def init(callback: js.Function0[Unit]): Unit = js.native
}
object OptimizedResize {
  
  @scala.inline
  def apply(init: js.Function0[Unit] => Unit): OptimizedResize = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[OptimizedResize]
  }
  
  @scala.inline
  implicit class OptimizedResizeOps[Self <: OptimizedResize] (val x: Self) extends AnyVal {
    
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
    def setInit(value: js.Function0[Unit] => Unit): Self = this.set("init", js.Any.fromFunction1(value))
  }
}
