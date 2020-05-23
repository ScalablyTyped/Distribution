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
    delete: js.UndefOr[Double] = js.undefined,
    insert: js.Any = null,
    retain: js.UndefOr[Double] = js.undefined
  ): DeltaOperation = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(delete)) __obj.updateDynamic("delete")(delete.get.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    if (!js.isUndefined(retain)) __obj.updateDynamic("retain")(retain.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeltaOperation]
  }
}

