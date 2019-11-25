package typings.prosemirrorDashMenu.prosemirrorDashMenuMod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashState.prosemirrorDashStateMod.EditorState
import typings.prosemirrorDashState.prosemirrorDashStateMod.Transaction
import typings.prosemirrorDashView.prosemirrorDashViewMod.EditorView
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
  var `class`: String
  /**
    * Optionally adds a string of inline CSS to the item's DOM
    * representation.
    */
  var css: String
  /**
    * Function that is used to determine if the item is enabled. If
    * given and returning false, the item will be given a disabled
    * styling.
    */
  var enable: js.UndefOr[(js.Function1[/* p */ EditorState[S], Boolean]) | Null] = js.undefined
  /**
    * Defines which event on the command's DOM representation should
    * trigger the execution of the command. Defaults to mousedown.
    */
  var execEvent: String
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
  def apply[S /* <: Schema[_, _] */](
    `class`: String,
    css: String,
    execEvent: String,
    run: (EditorState[S], js.Function1[/* p */ Transaction[S], Unit], EditorView[S], Event) => Unit,
    active: /* p */ EditorState[S] => Boolean = null,
    enable: /* p */ EditorState[S] => Boolean = null,
    icon: StringDictionary[js.Any] = null,
    label: String = null,
    render: /* p */ EditorView[S] => Node = null,
    select: /* p */ EditorState[S] => Boolean = null,
    title: String | (js.Function1[/* p */ EditorState[S], String]) = null
  ): MenuItemSpec[S] = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], execEvent = execEvent.asInstanceOf[js.Any], run = js.Any.fromFunction4(run))
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (active != null) __obj.updateDynamic("active")(js.Any.fromFunction1(active))
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction1(enable))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemSpec[S]]
  }
}

