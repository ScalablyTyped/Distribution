package typings.randomDashUseragent.randomDashUseragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-useragent", "getRandomData")
@js.native
object getRandomData extends js.Object {
  def apply(): UserAgent | Null = js.native
  def apply(
    filter: js.Function3[/* value */ UserAgent, /* index */ Double, /* array */ js.Array[UserAgent], Boolean]
  ): UserAgent | Null = js.native
}

