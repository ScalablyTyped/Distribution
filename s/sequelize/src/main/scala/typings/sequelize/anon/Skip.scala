package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Skip extends js.Object {
  var skip: js.UndefOr[js.Array[String]] = js.undefined
}

object Skip {
  @scala.inline
  def apply(skip: js.Array[String] = null): Skip = {
    val __obj = js.Dynamic.literal()
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Skip]
  }
}

