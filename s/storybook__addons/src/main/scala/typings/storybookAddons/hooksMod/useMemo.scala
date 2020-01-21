package typings.storybookAddons.hooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addons/dist/hooks", "useMemo")
@js.native
object useMemo extends js.Object {
  def apply[T](nextCreate: js.Function0[T]): T = js.native
  def apply[T](nextCreate: js.Function0[T], deps: js.Array[_]): T = js.native
}

