package typings.semanticUiReact.listListMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticSIZES
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.listItemMod.ListItemProps
import typings.semanticUiReact.semanticUiReactStrings.very
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictListProps extends js.Object {
  /** A list can animate to set the current item apart from the list. */
  var animated: js.UndefOr[Boolean] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** A list can mark items with a bullet. */
  var bulleted: js.UndefOr[Boolean] = js.native
  /** A list can divide its items into cells. */
  var celled: js.UndefOr[Boolean] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** A list can show divisions between content. */
  var divided: js.UndefOr[Boolean] = js.native
  /** An list can be floated left or right. */
  var floated: js.UndefOr[SemanticFLOATS] = js.native
  /** A list can be formatted to have items appear horizontally. */
  var horizontal: js.UndefOr[Boolean] = js.native
  /** A list can be inverted to appear on a dark background. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** Shorthand array of props for ListItem. */
  var items: js.UndefOr[SemanticShorthandCollection[ListItemProps]] = js.native
  /** A list can be specially formatted for navigation links. */
  var link: js.UndefOr[Boolean] = js.native
  /**
    * onClick handler for ListItem. Mutually exclusive with children.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All item props.
    */
  var onItemClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
      /* data */ ListItemProps, 
      Unit
    ]
  ] = js.native
  /** A list can be ordered numerically. */
  var ordered: js.UndefOr[Boolean] = js.native
  /** A list can relax its padding to provide more negative space. */
  var relaxed: js.UndefOr[Boolean | very] = js.native
  /** A selection list formats list items as possible choices. */
  var selection: js.UndefOr[Boolean] = js.native
  /** A list can vary in size. */
  var size: js.UndefOr[SemanticSIZES] = js.native
  /** An element inside a list can be vertically aligned. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
}

object StrictListProps {
  @scala.inline
  def apply(): StrictListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictListProps]
  }
  @scala.inline
  implicit class StrictListPropsOps[Self <: StrictListProps] (val x: Self) extends AnyVal {
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setBulleted(value: Boolean): Self = this.set("bulleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBulleted: Self = this.set("bulleted", js.undefined)
    @scala.inline
    def setCelled(value: Boolean): Self = this.set("celled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCelled: Self = this.set("celled", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDivided(value: Boolean): Self = this.set("divided", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivided: Self = this.set("divided", js.undefined)
    @scala.inline
    def setFloated(value: SemanticFLOATS): Self = this.set("floated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloated: Self = this.set("floated", js.undefined)
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setItemsVarargs(value: SemanticShorthandItem[ListItemProps]*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: SemanticShorthandCollection[ListItemProps]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLink(value: Boolean): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setOnItemClick(
      value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ ListItemProps) => Unit
    ): Self = this.set("onItemClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    @scala.inline
    def setOrdered(value: Boolean): Self = this.set("ordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrdered: Self = this.set("ordered", js.undefined)
    @scala.inline
    def setRelaxed(value: Boolean | very): Self = this.set("relaxed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelaxed: Self = this.set("relaxed", js.undefined)
    @scala.inline
    def setSelection(value: Boolean): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setSize(value: SemanticSIZES): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
  }
  
}

