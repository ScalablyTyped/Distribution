package typings.reactOverlays.anon

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends js.Object {
  
  /**
    * A DOM element, Ref to an element, or function that returns either. The `container` will have the Portal children
    * appended to it.
    */
  var container: Requireable[_] = js.native
  
  var onRendered: Requireable[js.Function1[/* repeated */ _, _]] = js.native
}
object Container {
  
  @scala.inline
  def apply(container: Requireable[_], onRendered: Requireable[js.Function1[/* repeated */ _, _]]): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], onRendered = onRendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: Requireable[_]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRendered(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onRendered", value.asInstanceOf[js.Any])
  }
}
