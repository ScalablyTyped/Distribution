package typings.reactEmailEditor.anon

import typings.reactEmailEditor.mod.DockPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dock extends js.Object {
  val dock: DockPosition
}

object Dock {
  @scala.inline
  def apply(dock: DockPosition): Dock = {
    val __obj = js.Dynamic.literal(dock = dock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dock]
  }
}

