package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filters extends js.Object {
  var filters: js.UndefOr[js.Array[Anon_ExcludeMatchedPattern]] = js.undefined
}

object Anon_Filters {
  @scala.inline
  def apply(filters: js.Array[Anon_ExcludeMatchedPattern] = null): Anon_Filters = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[Anon_Filters]
  }
}

