package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Skip extends js.Object {
  var skip: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Skip {
  @scala.inline
  def apply(skip: js.Array[String] = null): Anon_Skip = {
    val __obj = js.Dynamic.literal()
    if (skip != null) __obj.updateDynamic("skip")(skip)
    __obj.asInstanceOf[Anon_Skip]
  }
}

