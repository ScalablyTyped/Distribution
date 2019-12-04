package typings.reactDashDom.testDashUtilsMod

import typings.react.reactMod.Component
import typings.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "findAllInRenderedTree")
@js.native
object findAllInRenderedTree extends js.Object {
  def apply(root: Component[_, js.Object, _], fn: js.Function1[/* i */ ReactInstance, Boolean]): js.Array[ReactInstance] = js.native
}

