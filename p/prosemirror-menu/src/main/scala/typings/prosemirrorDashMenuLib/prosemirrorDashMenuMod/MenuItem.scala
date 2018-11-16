package typings
package prosemirrorDashMenuLib.prosemirrorDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-menu", "MenuItem")
@js.native
class MenuItem[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] protected () extends js.Object {
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
  def render(view: prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S]): prosemirrorDashMenuLib.Anon_Update[S] = js.native
}

