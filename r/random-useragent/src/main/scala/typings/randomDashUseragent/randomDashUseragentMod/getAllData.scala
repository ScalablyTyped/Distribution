package typings.randomDashUseragent.randomDashUseragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-useragent", "getAllData")
@js.native
object getAllData extends js.Object {
  def apply(): js.Array[UserAgent] = js.native
  def apply(
    filter: js.Function3[/* value */ UserAgent, /* index */ Double, /* array */ js.Array[UserAgent], Boolean]
  ): js.Array[UserAgent] = js.native
}

