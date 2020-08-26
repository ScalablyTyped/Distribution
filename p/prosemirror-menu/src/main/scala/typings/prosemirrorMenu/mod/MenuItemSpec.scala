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

@js.native
trait MenuItemSpec[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * A predicate function to determine whether the item is 'active' (for
    * example, the item for toggling the strong mark might be active then
    * the cursor is in strong text).
    */
  var active: js.UndefOr[(js.Function1[/* p */ EditorState[S], Boolean]) | Null] = js.native
  /**
    * Optionally adds a CSS class to the item's DOM representation.
    */
  var `class`: js.UndefOr[String] = js.native
  /**
    * Optionally adds a string of inline CSS to the item's DOM
    * representation.
    */
  var css: js.UndefOr[String] = js.native
  /**
    * Function that is used to determine if the item is enabled. If
    * given and returning false, the item will be given a disabled
    * styling.
    */
  var enable: js.UndefOr[(js.Function1[/* p */ EditorState[S], Boolean]) | Null] = js.native
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
  var icon: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  /**
    * Makes the item show up as a text label. Mostly useful for items
    * wrapped in a [drop-down](#menu.Dropdown) or similar menu. The object
    * should have a `label` property providing the text to display.
    */
  var label: js.UndefOr[String | Null] = js.native
  /**
    * A function that renders the item. You must provide either this,
    * [`icon`](#menu.MenuItemSpec.icon), or [`label`](#MenuItemSpec.label).
    */
  var render: js.UndefOr[(js.Function1[/* p */ EditorView[S], Node]) | Null] = js.native
  /**
    * Optional function that is used to determine whether the item is
    * appropriate at the moment. Deselected items will be hidden.
    */
  var select: js.UndefOr[(js.Function1[/* p */ EditorState[S], Boolean]) | Null] = js.native
  /**
    * Defines DOM title (mouseover) text for the item.
    */
  var title: js.UndefOr[String | (js.Function1[/* p */ EditorState[S], String]) | Null] = js.native
  /**
    * The function to execute when the menu item is activated.
    */
  def run(p1: EditorState[S], p2: js.Function1[/* p */ Transaction[S], Unit], p3: EditorView[S], p4: Event): Unit = js.native
}

object MenuItemSpec {
  @scala.inline
  def apply[/* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](run: (EditorState[S], js.Function1[/* p */ Transaction[S], Unit], EditorView[S], Event) => Unit): MenuItemSpec[S] = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction4(run))
    __obj.asInstanceOf[MenuItemSpec[S]]
  }
  @scala.inline
  implicit class MenuItemSpecOps[Self <: MenuItemSpec[_], /* <: typings.prosemirrorModel.mod.Schema[_, _] */ S] (val x: Self with MenuItemSpec[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRun(value: (EditorState[S], js.Function1[/* p */ Transaction[S], Unit], EditorView[S], Event) => Unit): Self = this.set("run", js.Any.fromFunction4(value))
    @scala.inline
    def setActive(value: /* p */ EditorState[S] => Boolean): Self = this.set("active", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setActiveNull: Self = this.set("active", null)
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setEnable(value: /* p */ EditorState[S] => Boolean): Self = this.set("enable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setEnableNull: Self = this.set("enable", null)
    @scala.inline
    def setIcon(value: StringDictionary[js.Any]): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
    @scala.inline
    def setRender(value: /* p */ EditorView[S] => Node): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setRenderNull: Self = this.set("render", null)
    @scala.inline
    def setSelect(value: /* p */ EditorState[S] => Boolean): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSelectNull: Self = this.set("select", null)
    @scala.inline
    def setTitleFunction1(value: /* p */ EditorState[S] => String): Self = this.set("title", js.Any.fromFunction1(value))
    @scala.inline
    def setTitle(value: String | (js.Function1[/* p */ EditorState[S], String])): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
  }
  
}

