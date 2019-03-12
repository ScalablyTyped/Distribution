package typings
package singleDashSpaDashReactLib.singleDashSpaDashReactMod.SingleSpaReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lifecycles extends js.Object {
  def bootstrap(props: js.Any): js.Promise[scala.Unit]
  def mount(props: js.Any): js.Promise[scala.Unit]
  def unmount(props: js.Any): js.Promise[scala.Unit]
}

object Lifecycles {
  @scala.inline
  def apply(
    bootstrap: js.Any => js.Promise[scala.Unit],
    mount: js.Any => js.Promise[scala.Unit],
    unmount: js.Any => js.Promise[scala.Unit]
  ): Lifecycles = {
    val __obj = js.Dynamic.literal(bootstrap = js.Any.fromFunction1(bootstrap), mount = js.Any.fromFunction1(mount), unmount = js.Any.fromFunction1(unmount))
  
    __obj.asInstanceOf[Lifecycles]
  }
}

