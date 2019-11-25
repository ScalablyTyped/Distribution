package typings.sharedb.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareDBSourceOptions extends js.Object {
  var source: js.UndefOr[Boolean] = js.undefined
}

object ShareDBSourceOptions {
  @scala.inline
  def apply(source: js.UndefOr[Boolean] = js.undefined): ShareDBSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareDBSourceOptions]
  }
}

