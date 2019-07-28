package typings.rethinkdb.rethinkdbMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteResult extends js.Object {
  var deleted: Double
  var errors: Double
  var first_error: Error
  var generated_keys: js.Array[String]
  var inserted: Double
  var replaced: Double
  var skipped: Double
  var unchanged: Double
}

object WriteResult {
  @scala.inline
  def apply(
    deleted: Double,
    errors: Double,
    first_error: Error,
    generated_keys: js.Array[String],
    inserted: Double,
    replaced: Double,
    skipped: Double,
    unchanged: Double
  ): WriteResult = {
    val __obj = js.Dynamic.literal(deleted = deleted, errors = errors, first_error = first_error, generated_keys = generated_keys, inserted = inserted, replaced = replaced, skipped = skipped, unchanged = unchanged)
  
    __obj.asInstanceOf[WriteResult]
  }
}

