package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Updatepublished extends js.Object {
  var update_published: js.UndefOr[Boolean] = js.undefined
}

object Anon_Updatepublished {
  @scala.inline
  def apply(update_published: js.UndefOr[Boolean] = js.undefined): Anon_Updatepublished = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(update_published)) __obj.updateDynamic("update_published")(update_published.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Updatepublished]
  }
}

