package typings.quill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  insert ? :any,   delete ? :number,   retain ? :number} & quill.quill.OptionalAttributes */
trait DeltaOperation extends js.Object {
  var attributes: js.UndefOr[StringMap] = js.undefined
  var delete: js.UndefOr[Double] = js.undefined
  var insert: js.UndefOr[js.Any] = js.undefined
  var retain: js.UndefOr[Double] = js.undefined
}

object DeltaOperation {
  @scala.inline
  def apply(
    attributes: StringMap = null,
    delete: Int | Double = null,
    insert: js.Any = null,
    retain: Int | Double = null
  ): DeltaOperation = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    if (retain != null) __obj.updateDynamic("retain")(retain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeltaOperation]
  }
}

