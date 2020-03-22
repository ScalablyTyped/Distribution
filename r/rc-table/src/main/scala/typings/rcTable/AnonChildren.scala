package typings.rcTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren[RecordType /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  children ? :std.Array<RecordType>} */ js.Any */] extends js.Object {
  var children: js.UndefOr[js.Array[RecordType]] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply[RecordType /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  children ? :std.Array<RecordType>} */ js.Any */](children: js.Array[RecordType] = null): AnonChildren[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren[RecordType]]
  }
}

