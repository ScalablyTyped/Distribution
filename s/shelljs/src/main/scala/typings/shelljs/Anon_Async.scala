package typings.shelljs

import typings.shelljs.shelljsNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Async extends js.Object {
  var async: js.UndefOr[`false`] = js.undefined
}

object Anon_Async {
  @scala.inline
  def apply(async: `false` = null): Anon_Async = {
    val __obj = js.Dynamic.literal()
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Async]
  }
}

