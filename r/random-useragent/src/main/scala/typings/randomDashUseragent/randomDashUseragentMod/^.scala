package typings.randomDashUseragent.randomDashUseragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-useragent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getAll(): js.Array[String] = js.native
  def getAll(
    filter: js.Function3[/* value */ UserAgent, /* index */ Double, /* array */ js.Array[UserAgent], Boolean]
  ): js.Array[String] = js.native
  def getAllData(): js.Array[UserAgent] = js.native
  def getAllData(
    filter: js.Function3[/* value */ UserAgent, /* index */ Double, /* array */ js.Array[UserAgent], Boolean]
  ): js.Array[UserAgent] = js.native
  def getRandom(): String | Null = js.native
  def getRandom(
    filter: js.Function3[/* value */ UserAgent, /* index */ Double, /* array */ js.Array[UserAgent], Boolean]
  ): String | Null = js.native
  def getRandomData(): UserAgent | Null = js.native
  def getRandomData(
    filter: js.Function3[/* value */ UserAgent, /* index */ Double, /* array */ js.Array[UserAgent], Boolean]
  ): UserAgent | Null = js.native
}

