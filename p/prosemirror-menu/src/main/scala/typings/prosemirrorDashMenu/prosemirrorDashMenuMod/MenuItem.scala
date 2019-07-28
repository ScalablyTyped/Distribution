package typings.prosemirrorDashMenu.prosemirrorDashMenuMod

import typings.prosemirrorDashMenu.Anon_Dom
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashView.prosemirrorDashViewMod.EditorView
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
  def render(view: EditorView[S]): Anon_Dom[S] = js.native
}

