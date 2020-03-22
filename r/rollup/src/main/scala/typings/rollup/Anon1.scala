package typings.rollup

import typings.rollup.mod.RollupWatcherEvent
import typings.rollup.rollupStrings.END
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends RollupWatcherEvent {
  var code: END
}

object Anon1 {
  @scala.inline
  def apply(code: END): Anon1 = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon1]
  }
}

