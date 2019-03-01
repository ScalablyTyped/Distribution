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
    bootstrap: js.Function1[js.Any, js.Promise[scala.Unit]],
    mount: js.Function1[js.Any, js.Promise[scala.Unit]],
    unmount: js.Function1[js.Any, js.Promise[scala.Unit]]
  ): Lifecycles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bootstrap")(bootstrap)
    __obj.updateDynamic("mount")(mount)
    __obj.updateDynamic("unmount")(unmount)
    __obj.asInstanceOf[Lifecycles]
  }
}

