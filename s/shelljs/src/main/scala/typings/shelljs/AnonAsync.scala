package typings.shelljs

import typings.shelljs.shelljsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsync extends js.Object {
  var async: js.UndefOr[`false`] = js.undefined
}

object AnonAsync {
  @scala.inline
  def apply(async: `false` = null): AnonAsync = {
    val __obj = js.Dynamic.literal()
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsync]
  }
}

