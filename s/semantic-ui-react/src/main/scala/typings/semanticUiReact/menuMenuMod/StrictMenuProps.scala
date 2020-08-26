package typings.semanticUiReact.menuMenuMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.menuItemMod.MenuItemProps
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.labeled
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.massive
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictMenuProps extends js.Object {
  /** Index of the currently active item. */
  var activeIndex: js.UndefOr[Double | String] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** A menu may be attached to other content segments. */
  var attached: js.UndefOr[Boolean | bottom | top] = js.native
  /** A menu item or menu can have no borders. */
  var borderless: js.UndefOr[Boolean] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Additional colors can be specified. */
  var color: js.UndefOr[SemanticCOLORS] = js.native
  /** A menu can take up only the space necessary to fit its content. */
  var compact: js.UndefOr[Boolean] = js.native
  /** Initial activeIndex value. */
  var defaultActiveIndex: js.UndefOr[Double | String] = js.native
  /** A menu can be fixed to a side of its context. */
  var fixed: js.UndefOr[left | right | bottom | top] = js.native
  /** A menu can be floated. */
  var floated: js.UndefOr[Boolean | right] = js.native
  /** A vertical menu may take the size of its container. */
  var fluid: js.UndefOr[Boolean] = js.native
  /** A menu may have labeled icons. */
  var icon: js.UndefOr[Boolean | labeled] = js.native
  /** A menu may have its colors inverted to show greater contrast. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** Shorthand array of props for Menu. */
  var items: js.UndefOr[SemanticShorthandCollection[MenuItemProps]] = js.native
  /**
    * onClick handler for MenuItem. Mutually exclusive with children.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All item props.
    */
  var onItemClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
      /* data */ MenuItemProps, 
      Unit
    ]
  ] = js.native
  /** A pagination menu is specially formatted to present links to pages of content. */
  var pagination: js.UndefOr[Boolean] = js.native
  /** A menu can point to show its relationship to nearby content. */
  var pointing: js.UndefOr[Boolean] = js.native
  /** A menu can adjust its appearance to de-emphasize its contents. */
  var secondary: js.UndefOr[Boolean] = js.native
  /** A menu can vary in size. */
  var size: js.UndefOr[mini | tiny | small | large | huge | massive] = js.native
  /** A menu can stack at mobile resolutions. */
  var stackable: js.UndefOr[Boolean] = js.native
  /** A menu can be formatted to show tabs of information. */
  var tabular: js.UndefOr[Boolean | right] = js.native
  /** A menu can be formatted for text content. */
  var text: js.UndefOr[Boolean] = js.native
  /** A vertical menu displays elements vertically. */
  var vertical: js.UndefOr[Boolean] = js.native
  /** A menu can have its items divided evenly. */
  var widths: js.UndefOr[SemanticWIDTHS] = js.native
}

object StrictMenuProps {
  @scala.inline
  def apply(): StrictMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictMenuProps]
  }
  @scala.inline
  implicit class StrictMenuPropsOps[Self <: StrictMenuProps] (val x: Self) extends AnyVal {
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
    def setActiveIndex(value: Double | String): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setAttached(value: Boolean | bottom | top): Self = this.set("attached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    @scala.inline
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderless: Self = this.set("borderless", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: SemanticCOLORS): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setDefaultActiveIndex(value: Double | String): Self = this.set("defaultActiveIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultActiveIndex: Self = this.set("defaultActiveIndex", js.undefined)
    @scala.inline
    def setFixed(value: left | right | bottom | top): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setFloated(value: Boolean | right): Self = this.set("floated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloated: Self = this.set("floated", js.undefined)
    @scala.inline
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
    @scala.inline
    def setIcon(value: Boolean | labeled): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setItemsVarargs(value: SemanticShorthandItem[MenuItemProps]*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: SemanticShorthandCollection[MenuItemProps]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setOnItemClick(
      value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ MenuItemProps) => Unit
    ): Self = this.set("onItemClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    @scala.inline
    def setPagination(value: Boolean): Self = this.set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    @scala.inline
    def setPointing(value: Boolean): Self = this.set("pointing", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointing: Self = this.set("pointing", js.undefined)
    @scala.inline
    def setSecondary(value: Boolean): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
    @scala.inline
    def setSize(value: mini | tiny | small | large | huge | massive): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStackable(value: Boolean): Self = this.set("stackable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackable: Self = this.set("stackable", js.undefined)
    @scala.inline
    def setTabular(value: Boolean | right): Self = this.set("tabular", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabular: Self = this.set("tabular", js.undefined)
    @scala.inline
    def setText(value: Boolean): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    @scala.inline
    def setWidths(value: SemanticWIDTHS): Self = this.set("widths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidths: Self = this.set("widths", js.undefined)
  }
  
}

