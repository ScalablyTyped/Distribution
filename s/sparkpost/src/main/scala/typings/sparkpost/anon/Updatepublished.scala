package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Updatepublished extends js.Object {
  var update_published: js.UndefOr[Boolean] = js.undefined
}

object Updatepublished {
  @scala.inline
  def apply(update_published: js.UndefOr[Boolean] = js.undefined): Updatepublished = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(update_published)) __obj.updateDynamic("update_published")(update_published.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Updatepublished]
  }
}

