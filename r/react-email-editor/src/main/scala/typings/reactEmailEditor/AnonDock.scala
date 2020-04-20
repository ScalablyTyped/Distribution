package typings.reactEmailEditor

import typings.reactEmailEditor.mod.DockPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDock extends js.Object {
  val dock: DockPosition
}

object AnonDock {
  @scala.inline
  def apply(dock: DockPosition): AnonDock = {
    val __obj = js.Dynamic.literal(dock = dock.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDock]
  }
}

