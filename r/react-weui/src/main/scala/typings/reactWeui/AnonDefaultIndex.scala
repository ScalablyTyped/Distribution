package typings.reactWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultIndex extends js.Object {
  var defaultIndex: Double
  var `type`: String
}

object AnonDefaultIndex {
  @scala.inline
  def apply(defaultIndex: Double, `type`: String): AnonDefaultIndex = {
    val __obj = js.Dynamic.literal(defaultIndex = defaultIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultIndex]
  }
}

