package typings.prosemirrorMenu.mod

import typings.prosemirrorMenu.AnonDom
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorView.mod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-menu", "MenuItem")
@js.native
class MenuItem[S /* <: Schema[_, _] */] protected () extends js.Object {
  def this(spec: MenuItemSpec[S]) = this()
  /**
    * The spec used to create the menu item.
    */
  var spec: MenuItemSpec[S] = js.native
  /**
    * Renders the icon according to its [display
    * spec](#menu.MenuItemSpec.display), and adds an event handler which
    * executes the command when the representation is clicked.
    */
  def render(view: EditorView[S]): AnonDom[S] = js.native
}

