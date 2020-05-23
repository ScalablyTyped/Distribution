package typings.rethinkdb.mod

import typings.rethinkdb.anon.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rethinkdb", "js")
@js.native
object js_ extends js.Object {
  def apply(jsString: String): Operation[_] = js.native
  def apply(jsString: String, opts: Timeout): Operation[_] = js.native
}

