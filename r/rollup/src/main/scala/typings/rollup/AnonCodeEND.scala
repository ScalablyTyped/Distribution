package typings.rollup

import typings.rollup.mod.RollupWatcherEvent
import typings.rollup.rollupStrings.END
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodeEND extends RollupWatcherEvent {
  var code: END
}

object AnonCodeEND {
  @scala.inline
  def apply(code: END): AnonCodeEND = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCodeEND]
  }
}

