package typings.reactDashQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShouldRefetch extends js.Object {
  var shouldRefetch: js.UndefOr[Boolean] = js.undefined
}

object Anon_ShouldRefetch {
  @scala.inline
  def apply(shouldRefetch: js.UndefOr[Boolean] = js.undefined): Anon_ShouldRefetch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shouldRefetch)) __obj.updateDynamic("shouldRefetch")(shouldRefetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ShouldRefetch]
  }
}

