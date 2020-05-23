package typings.reactRouterRedux.mod

import typings.reactRouter.mod.`match`
import typings.reactRouterRedux.anon.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-redux", "createMatchSelector")
@js.native
object createMatchSelector extends js.Object {
  def apply(path: String): js.Function1[/* state */ Router, `match`[js.Object] | Null] = js.native
}

