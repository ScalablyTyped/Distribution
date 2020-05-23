package typings.rcTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children[RecordType /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  children ? :std.Array<RecordType>} */ js.Any */] extends js.Object {
  var children: js.UndefOr[js.Array[RecordType]] = js.undefined
}

object Children {
  @scala.inline
  def apply[RecordType](children: js.Array[RecordType] = null): Children[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children[RecordType]]
  }
}

