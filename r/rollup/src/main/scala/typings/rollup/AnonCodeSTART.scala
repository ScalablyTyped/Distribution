package typings.rollup

import typings.rollup.mod.RollupWatcherEvent
import typings.rollup.rollupStrings.START
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodeSTART extends RollupWatcherEvent {
  var code: START
}

object AnonCodeSTART {
  @scala.inline
  def apply(code: START): AnonCodeSTART = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCodeSTART]
  }
}

