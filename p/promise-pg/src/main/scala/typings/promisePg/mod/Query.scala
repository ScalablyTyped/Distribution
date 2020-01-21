package typings.promisePg.mod

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-pg", "Query")
@js.native
class Query ()
  extends typings.pg.mod.Query[js.Any, js.Any] {
  var promise: Promise[QueryResult] = js.native
}

