package typings.reactDashJoyride

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arialabel extends js.Object {
  var `aria-label`: String
  var `data-action`: String
  var role: String
  var title: String
  def onClick(): Unit
}

object Anon_Arialabel {
  @scala.inline
  def apply(`aria-label`: String, `data-action`: String, onClick: () => Unit, role: String, title: String): Anon_Arialabel = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), role = role.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-action")(`data-action`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Arialabel]
  }
}

