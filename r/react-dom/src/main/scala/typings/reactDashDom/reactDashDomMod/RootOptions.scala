package typings.reactDashDom.reactDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootOptions extends js.Object {
  var hydrate: js.UndefOr[Boolean] = js.undefined
}

object RootOptions {
  @scala.inline
  def apply(hydrate: js.UndefOr[Boolean] = js.undefined): RootOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hydrate)) __obj.updateDynamic("hydrate")(hydrate)
    __obj.asInstanceOf[RootOptions]
  }
}

