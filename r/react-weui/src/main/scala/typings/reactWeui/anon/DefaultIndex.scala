package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultIndex extends js.Object {
  var defaultIndex: Double
  var `type`: String
}

object DefaultIndex {
  @scala.inline
  def apply(defaultIndex: Double, `type`: String): DefaultIndex = {
    val __obj = js.Dynamic.literal(defaultIndex = defaultIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultIndex]
  }
}

