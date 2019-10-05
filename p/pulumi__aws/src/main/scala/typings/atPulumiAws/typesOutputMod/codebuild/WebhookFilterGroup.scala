package typings.atPulumiAws.typesOutputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookFilterGroup extends js.Object {
  /**
    * A webhook filter for the group. Filter blocks are documented below.
    */
  var filters: js.UndefOr[js.Array[WebhookFilterGroupFilter]] = js.undefined
}

object WebhookFilterGroup {
  @scala.inline
  def apply(filters: js.Array[WebhookFilterGroupFilter] = null): WebhookFilterGroup = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[WebhookFilterGroup]
  }
}

