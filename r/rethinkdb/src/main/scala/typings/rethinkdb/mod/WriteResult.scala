package typings.rethinkdb.mod

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
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], first_error = first_error.asInstanceOf[js.Any], generated_keys = generated_keys.asInstanceOf[js.Any], inserted = inserted.asInstanceOf[js.Any], replaced = replaced.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], unchanged = unchanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteResult]
  }
}

