package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteResult extends js.Object {
  var deleted: scala.Double
  var errors: scala.Double
  var first_error: nodeLib.Error
  var generated_keys: js.Array[java.lang.String]
  var inserted: scala.Double
  var replaced: scala.Double
  var skipped: scala.Double
  var unchanged: scala.Double
}

