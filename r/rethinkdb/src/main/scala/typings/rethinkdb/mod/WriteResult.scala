package typings.rethinkdb.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteResult extends js.Object {
  var deleted: Double = js.native
  var errors: Double = js.native
  var first_error: Error = js.native
  var generated_keys: js.Array[String] = js.native
  var inserted: Double = js.native
  var replaced: Double = js.native
  var skipped: Double = js.native
  var unchanged: Double = js.native
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
  @scala.inline
  implicit class WriteResultOps[Self <: WriteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeleted(value: Double): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrors(value: Double): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirst_error(value: Error): Self = this.set("first_error", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerated_keysVarargs(value: String*): Self = this.set("generated_keys", js.Array(value :_*))
    @scala.inline
    def setGenerated_keys(value: js.Array[String]): Self = this.set("generated_keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setInserted(value: Double): Self = this.set("inserted", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplaced(value: Double): Self = this.set("replaced", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipped(value: Double): Self = this.set("skipped", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnchanged(value: Double): Self = this.set("unchanged", value.asInstanceOf[js.Any])
  }
  
}

