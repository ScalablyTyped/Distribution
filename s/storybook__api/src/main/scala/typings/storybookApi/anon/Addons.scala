package typings.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Addons extends js.Object {
  var selectedPanel: String
}

object Addons {
  @scala.inline
  def apply(selectedPanel: String): Addons = {
    val __obj = js.Dynamic.literal(selectedPanel = selectedPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addons]
  }
}

