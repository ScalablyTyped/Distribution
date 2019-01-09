package typings
package prosemirrorDashMenuLib.prosemirrorDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-menu", "DropdownSubmenu")
@js.native
class DropdownSubmenu[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] protected () extends js.Object {
  /**
    * Creates a submenu for the given group of menu elements. The
    * following options are recognized:
    *
    * **`label`**`: string`
    * : The label to show on the submenu.
    */
  def this(content: js.Array[MenuElement[S]]) = this()
  def this(content: js.Array[MenuElement[S]], options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  /**
    * Renders the submenu.
    */
  def render(view: prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S]): prosemirrorDashMenuLib.Anon_Dom[S] = js.native
}

