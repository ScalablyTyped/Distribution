package typings.promiseDashPg.promiseDashPgMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-pg", "Query")
@js.native
class Query ()
  extends typings.pg.pgMod.Query {
  var promise: Promise[QueryResult] = js.native
}

