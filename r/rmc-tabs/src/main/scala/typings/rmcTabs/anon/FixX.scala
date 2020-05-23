package typings.rmcTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixX extends js.Object {
  var fixX: Boolean
  var fixY: Boolean
}

object FixX {
  @scala.inline
  def apply(fixX: Boolean, fixY: Boolean): FixX = {
    val __obj = js.Dynamic.literal(fixX = fixX.asInstanceOf[js.Any], fixY = fixY.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixX]
  }
}

