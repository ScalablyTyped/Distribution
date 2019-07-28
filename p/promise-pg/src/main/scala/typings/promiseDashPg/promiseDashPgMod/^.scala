package typings.promiseDashPg.promiseDashPgMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-pg", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(connection: String): Promise[Client] = js.native
  def connect(connection: typings.pg.pgMod.ClientConfig): Promise[Client] = js.native
  def end(): Promise[Unit] = js.native
}

