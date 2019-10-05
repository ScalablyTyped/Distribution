package typings.randomDashUseragent.randomDashUseragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-useragent", "getAll")
@js.native
object getAll extends js.Object {
  def apply(): js.Array[String] = js.native
  def apply(
    filter: js.Function3[/* value */ UserAgent, /* index */ Double, /* array */ js.Array[UserAgent], Boolean]
  ): js.Array[String] = js.native
}

