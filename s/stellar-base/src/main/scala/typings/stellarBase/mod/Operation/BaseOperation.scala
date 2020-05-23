package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOperation[T /* <: OperationType */] extends js.Object {
  var source: js.UndefOr[String] = js.undefined
  var `type`: T
}

object BaseOperation {
  @scala.inline
  def apply[T](`type`: T, source: String = null): BaseOperation[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOperation[T]]
  }
}

