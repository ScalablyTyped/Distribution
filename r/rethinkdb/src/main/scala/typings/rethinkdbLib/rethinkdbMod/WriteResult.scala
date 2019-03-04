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

object WriteResult {
  @scala.inline
  def apply(
    deleted: scala.Double,
    errors: scala.Double,
    first_error: nodeLib.Error,
    generated_keys: js.Array[java.lang.String],
    inserted: scala.Double,
    replaced: scala.Double,
    skipped: scala.Double,
    unchanged: scala.Double
  ): WriteResult = {
    val __obj = js.Dynamic.literal(deleted = deleted, errors = errors, first_error = first_error, generated_keys = generated_keys, inserted = inserted, replaced = replaced, skipped = skipped, unchanged = unchanged)
  
    __obj.asInstanceOf[WriteResult]
  }
}

