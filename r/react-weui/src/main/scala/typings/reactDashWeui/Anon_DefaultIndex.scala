package typings.reactDashWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultIndex extends js.Object {
  var defaultIndex: Double
  var `type`: String
}

object Anon_DefaultIndex {
  @scala.inline
  def apply(defaultIndex: Double, `type`: String): Anon_DefaultIndex = {
    val __obj = js.Dynamic.literal(defaultIndex = defaultIndex)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_DefaultIndex]
  }
}

