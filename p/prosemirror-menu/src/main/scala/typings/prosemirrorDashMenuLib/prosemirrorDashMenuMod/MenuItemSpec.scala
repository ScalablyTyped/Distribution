package typings
package prosemirrorDashMenuLib.prosemirrorDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemSpec[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  /**
    * A predicate function to determine whether the item is 'active' (for
    * example, the item for toggling the strong mark might be active then
    * the cursor is in strong text).
    */
  var active: js.UndefOr[
    (js.Function1[
      /* p */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      scala.Boolean
    ]) | scala.Null
  ] = js.undefined
  /**
    * Optionally adds a CSS class to the item's DOM representation.
    */
  var `class`: java.lang.String
  /**
    * Optionally adds a string of inline CSS to the item's DOM
    * representation.
    */
  var css: java.lang.String
  /**
    * Function that is used to determine if the item is enabled. If
    * given and returning false, the item will be given a disabled
    * styling.
    */
  var enable: js.UndefOr[
    (js.Function1[
      /* p */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      scala.Boolean
    ]) | scala.Null
  ] = js.undefined
  /**
    * Defines which event on the command's DOM representation should
    * trigger the execution of the command. Defaults to mousedown.
    */
  var execEvent: java.lang.String
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
  var icon: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null] = js.undefined
  /**
    * Makes the item show up as a text label. Mostly useful for items
    * wrapped in a [drop-down](#menu.Dropdown) or similar menu. The object
    * should have a `label` property providing the text to display.
    */
  var label: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * A function that renders the item. You must provide either this,
    * [`icon`](#menu.MenuItemSpec.icon), or [`label`](#MenuItemSpec.label).
    */
  var render: js.UndefOr[
    (js.Function1[/* p */ prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S], stdLib.Node]) | scala.Null
  ] = js.undefined
  /**
    * Optional function that is used to determine whether the item is
    * appropriate at the moment. Deselected items will be hidden.
    */
  var select: js.UndefOr[
    (js.Function1[
      /* p */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      scala.Boolean
    ]) | scala.Null
  ] = js.undefined
  /**
    * Defines DOM title (mouseover) text for the item.
    */
  var title: js.UndefOr[
    java.lang.String | (js.Function1[
      /* p */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      java.lang.String
    ]) | scala.Null
  ] = js.undefined
  /**
    * The function to execute when the menu item is activated.
    */
  def run(
    p1: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    p2: js.Function1[/* p */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], scala.Unit],
    p3: prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S],
    p4: stdLib.Event
  ): scala.Unit
}

object MenuItemSpec {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    `class`: java.lang.String,
    css: java.lang.String,
    execEvent: java.lang.String,
    run: js.Function4[
      prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      js.Function1[/* p */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], scala.Unit], 
      prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S], 
      stdLib.Event, 
      scala.Unit
    ],
    active: js.Function1[
      /* p */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      scala.Boolean
    ] = null,
    enable: js.Function1[
      /* p */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      scala.Boolean
    ] = null,
    icon: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    label: java.lang.String = null,
    render: js.Function1[/* p */ prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S], stdLib.Node] = null,
    select: js.Function1[
      /* p */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      scala.Boolean
    ] = null,
    title: java.lang.String | (js.Function1[
      /* p */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      java.lang.String
    ]) = null
  ): MenuItemSpec[S] = {
    val __obj = js.Dynamic.literal(`class` = `class`)
    __obj.updateDynamic("css")(css)
    __obj.updateDynamic("execEvent")(execEvent)
    __obj.updateDynamic("run")(run)
    if (active != null) __obj.updateDynamic("active")(active)
    if (enable != null) __obj.updateDynamic("enable")(enable)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (render != null) __obj.updateDynamic("render")(render)
    if (select != null) __obj.updateDynamic("select")(select)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemSpec[S]]
  }
}

