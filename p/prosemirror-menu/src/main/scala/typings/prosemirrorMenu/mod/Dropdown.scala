package typings.prosemirrorMenu.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorMenu.anon.Update
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorView.mod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-menu", "Dropdown")
@js.native
class Dropdown[S /* <: Schema[_, _] */] protected () extends js.Object {
  /**
    * Create a dropdown wrapping the elements. Options may include
    * the following properties:
    *
    * **`label`**`: string`
    * : The label to show on the drop-down control.
    *
    * **`title`**`: string`
    * : Sets the
    * [`title`](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/title)
    * attribute given to the menu control.
    *
    * **`class`**`: string`
    * : When given, adds an extra CSS class to the menu control.
    *
    * **`css`**`: string`
    * : When given, adds an extra set of CSS styles to the menu control.
    */
  def this(content: js.Array[MenuElement[S]]) = this()
  def this(content: js.Array[MenuElement[S]], options: StringDictionary[js.Any]) = this()
  /**
    * Render the dropdown menu and sub-items.
    */
  def render(view: EditorView[S]): Update[S] = js.native
}

