package typings.prosemirrorMenu.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorView.mod.EditorView
import typings.std.Event
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemSpec[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * A predicate function to determine whether the item is 'active' (for
    * example, the item for toggling the strong mark might be active then
    * the cursor is in strong text).
    */
  var active: js.UndefOr[(js.Function1[/* p */ EditorState[S], Boolean]) | Null] = js.undefined
  /**
    * Optionally adds a CSS class to the item's DOM representation.
    */
  var `class`: js.UndefOr[String] = js.undefined
  /**
    * Optionally adds a string of inline CSS to the item's DOM
    * representation.
    */
  var css: js.UndefOr[String] = js.undefined
  /**
    * Function that is used to determine if the item is enabled. If
    * given and returning false, the item will be given a disabled
    * styling.
    */
  var enable: js.UndefOr[(js.Function1[/* p */ EditorState[S], Boolean]) | Null] = js.undefined
  /**
    * Describes an icon to show for this item. The object may specify
    * an SVG icon, in which case its `path` property should be an [SVG
    * path
    * spec](https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/d),
    * and `width` and `height` should provide the viewbox in which that
    * path exists. Alternatively, it may have a `text` property
    * specifying a string of text that makes up the icon, with an
    * optional `css` property giving additional CSS styling for the
    * text. _Or_ it may contain `dom` property containing a DOM node.
    */
  var icon: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
  /**
    * Makes the item show up as a text label. Mostly useful for items
    * wrapped in a [drop-down](#menu.Dropdown) or similar menu. The object
    * should have a `label` property providing the text to display.
    */
  var label: js.UndefOr[String | Null] = js.undefined
  /**
    * A function that renders the item. You must provide either this,
    * [`icon`](#menu.MenuItemSpec.icon), or [`label`](#MenuItemSpec.label).
    */
  var render: js.UndefOr[(js.Function1[/* p */ EditorView[S], Node]) | Null] = js.undefined
  /**
    * Optional function that is used to determine whether the item is
    * appropriate at the moment. Deselected items will be hidden.
    */
  var select: js.UndefOr[(js.Function1[/* p */ EditorState[S], Boolean]) | Null] = js.undefined
  /**
    * Defines DOM title (mouseover) text for the item.
    */
  var title: js.UndefOr[String | (js.Function1[/* p */ EditorState[S], String]) | Null] = js.undefined
  /**
    * The function to execute when the menu item is activated.
    */
  def run(p1: EditorState[S], p2: js.Function1[/* p */ Transaction[S], Unit], p3: EditorView[S], p4: Event): Unit
}

object MenuItemSpec {
  @scala.inline
  def apply[/* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](
    run: (EditorState[S], js.Function1[/* p */ Transaction[S], Unit], EditorView[S], Event) => Unit,
    active: js.UndefOr[Null | (/* p */ EditorState[S] => Boolean)] = js.undefined,
    `class`: String = null,
    css: String = null,
    enable: js.UndefOr[Null | (/* p */ EditorState[S] => Boolean)] = js.undefined,
    icon: js.UndefOr[Null | StringDictionary[js.Any]] = js.undefined,
    label: js.UndefOr[Null | String] = js.undefined,
    render: js.UndefOr[Null | (/* p */ EditorView[S] => Node)] = js.undefined,
    select: js.UndefOr[Null | (/* p */ EditorState[S] => Boolean)] = js.undefined,
    title: js.UndefOr[Null | String | (js.Function1[/* p */ EditorState[S], String])] = js.undefined
  ): MenuItemSpec[S] = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction4(run))
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(if (active != null) js.Any.fromFunction1(active.asInstanceOf[/* p */ EditorState[S] => Boolean]) else null)
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(if (enable != null) js.Any.fromFunction1(enable.asInstanceOf[/* p */ EditorState[S] => Boolean]) else null)
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(render)) __obj.updateDynamic("render")(if (render != null) js.Any.fromFunction1(render.asInstanceOf[/* p */ EditorView[S] => Node]) else null)
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(if (select != null) js.Any.fromFunction1(select.asInstanceOf[/* p */ EditorState[S] => Boolean]) else null)
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemSpec[S]]
  }
}

