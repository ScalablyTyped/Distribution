package typings.singleSpaReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lifecycles extends js.Object {
  
  def bootstrap(props: js.Any): js.Promise[Unit] = js.native
  
  def mount(props: js.Any): js.Promise[Unit] = js.native
  
  def unmount(props: js.Any): js.Promise[Unit] = js.native
  
  var update: js.UndefOr[js.Function1[/* props */ js.Any, js.Promise[Unit]]] = js.native
}
object Lifecycles {
  
  @scala.inline
  def apply(
    bootstrap: js.Any => js.Promise[Unit],
    mount: js.Any => js.Promise[Unit],
    unmount: js.Any => js.Promise[Unit]
  ): Lifecycles = {
    val __obj = js.Dynamic.literal(bootstrap = js.Any.fromFunction1(bootstrap), mount = js.Any.fromFunction1(mount), unmount = js.Any.fromFunction1(unmount))
    __obj.asInstanceOf[Lifecycles]
  }
  
  @scala.inline
  implicit class LifecyclesOps[Self <: Lifecycles] (val x: Self) extends AnyVal {
    
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
    def setBootstrap(value: js.Any => js.Promise[Unit]): Self = this.set("bootstrap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMount(value: js.Any => js.Promise[Unit]): Self = this.set("mount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnmount(value: js.Any => js.Promise[Unit]): Self = this.set("unmount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: /* props */ js.Any => js.Promise[Unit]): Self = this.set("update", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
