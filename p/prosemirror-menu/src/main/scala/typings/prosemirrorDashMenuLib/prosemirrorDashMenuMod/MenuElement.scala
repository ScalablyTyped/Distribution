package typings
package prosemirrorDashMenuLib.prosemirrorDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MenuElement[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  /**
     * Render the element for display in the menu. Must return a DOM
     * element and a function that can be used to update the element to
     * a new state. The `update` function will return false if the
     * update hid the entire element.
     */
  def render(pm: prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S]): prosemirrorDashMenuLib.Anon_Update[S]
}

