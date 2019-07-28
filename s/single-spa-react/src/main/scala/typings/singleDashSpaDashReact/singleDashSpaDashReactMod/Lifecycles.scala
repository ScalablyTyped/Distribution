package typings.singleDashSpaDashReact.singleDashSpaDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lifecycles extends js.Object {
  def bootstrap(props: js.Any): js.Promise[Unit]
  def mount(props: js.Any): js.Promise[Unit]
  def unmount(props: js.Any): js.Promise[Unit]
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
}

