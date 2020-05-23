package typings.rollup.anon

import typings.rollup.mod.RollupWatcherEvent
import typings.rollup.rollupStrings.END
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends RollupWatcherEvent {
  var code: END
}

object `1` {
  @scala.inline
  def apply(code: END): `1` = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

