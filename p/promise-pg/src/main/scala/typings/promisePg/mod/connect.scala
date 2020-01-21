package typings.promisePg.mod

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-pg", "connect")
@js.native
object connect extends js.Object {
  def apply(connection: String): Promise[Client] = js.native
  def apply(connection: typings.pg.mod.ClientConfig): Promise[Client] = js.native
}

