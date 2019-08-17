package typings.rethinkdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rethinkdbMod {
  import typings.std.Error

  type ExpressionFunction[U] = js.Function1[/* doc */ Expression[js.Any], Expression[U]]
  type IndexFunction[U] = Expression[U] | js.Array[Expression[U]] | (js.Function1[/* doc */ Expression[js.Any], Expression[U] | js.Array[Expression[U]]])
  type JoinFunction[U] = js.Function2[/* left */ Expression[js.Any], /* right */ Expression[js.Any], Expression[U]]
  type Polygon = Geometry
  type ReduceFunction[U] = js.Function2[/* acc */ Expression[js.Any], /* val */ Expression[js.Any], Expression[U]]
  /**
    * An error has occurred within the driver. This may be a driver bug, or it may
    * be an unfulfillable command, such as an unserializable query.
    *
    * See https://www.rethinkdb.com/docs/error-types/
    */
  type ReqlDriverError = ReqlError
  type ReqlError = Error
}
