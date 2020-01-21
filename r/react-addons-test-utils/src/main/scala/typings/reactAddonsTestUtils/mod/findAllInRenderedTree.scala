package typings.reactAddonsTestUtils.mod

import typings.react.mod.Component
import typings.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-addons-test-utils", "findAllInRenderedTree")
@js.native
object findAllInRenderedTree extends js.Object {
  def apply(root: Component[_, js.Object, _], fn: js.Function1[/* i */ ReactInstance, Boolean]): js.Array[ReactInstance] = js.native
}

