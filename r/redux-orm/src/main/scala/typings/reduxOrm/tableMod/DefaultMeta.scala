package typings.reduxOrm.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultMeta[MIdType] extends js.Object {
  var maxId: Null | Double
}

object DefaultMeta {
  @scala.inline
  def apply[MIdType](maxId: Int | Double = null): DefaultMeta[MIdType] = {
    val __obj = js.Dynamic.literal()
    if (maxId != null) __obj.updateDynamic("maxId")(maxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultMeta[MIdType]]
  }
}

