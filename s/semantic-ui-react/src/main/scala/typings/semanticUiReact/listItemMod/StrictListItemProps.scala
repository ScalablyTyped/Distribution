package typings.semanticUiReact.listItemMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactType
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.imageImageMod.ImageProps
import typings.semanticUiReact.listContentMod.ListContentProps
import typings.semanticUiReact.listDescriptionMod.ListDescriptionProps
import typings.semanticUiReact.listHeaderMod.ListHeaderProps
import typings.semanticUiReact.listIconMod.ListIconProps
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictListItemProps extends js.Object {
  /** A list item can active. */
  var active: js.UndefOr[Boolean] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandItem[ListContentProps]] = js.native
  /** Shorthand for ListDescription. */
  var description: js.UndefOr[SemanticShorthandItem[ListDescriptionProps]] = js.native
  /** A list item can disabled. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** Shorthand for ListHeader. */
  var header: js.UndefOr[SemanticShorthandItem[ListHeaderProps]] = js.native
  /** Shorthand for ListIcon. */
  var icon: js.UndefOr[SemanticShorthandItem[ListIconProps]] = js.native
  /** Shorthand for Image. */
  var image: js.UndefOr[SemanticShorthandItem[ImageProps]] = js.native
  /**
    * Called on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
      /* data */ ListItemProps, 
      Unit
    ]
  ] = js.native
  /** A value for an ordered list. */
  var value: js.UndefOr[String] = js.native
}

object StrictListItemProps {
  @scala.inline
  def apply(): StrictListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictListItemProps]
  }
  @scala.inline
  implicit class StrictListItemPropsOps[Self <: StrictListItemProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContentFunction3(
      value: (/* component */ ReactType[ListContentProps], ListContentProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("content", js.Any.fromFunction3(value))
    @scala.inline
    def setContent(value: SemanticShorthandItem[ListContentProps]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDescriptionFunction3(
      value: (/* component */ ReactType[ListDescriptionProps], ListDescriptionProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("description", js.Any.fromFunction3(value))
    @scala.inline
    def setDescription(value: SemanticShorthandItem[ListDescriptionProps]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHeaderFunction3(
      value: (/* component */ ReactType[ListHeaderProps], ListHeaderProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("header", js.Any.fromFunction3(value))
    @scala.inline
    def setHeader(value: SemanticShorthandItem[ListHeaderProps]): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setIconFunction3(
      value: (/* component */ ReactType[ListIconProps], ListIconProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("icon", js.Any.fromFunction3(value))
    @scala.inline
    def setIcon(value: SemanticShorthandItem[ListIconProps]): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setImageFunction3(
      value: (/* component */ ReactType[ImageProps], ImageProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("image", js.Any.fromFunction3(value))
    @scala.inline
    def setImage(value: SemanticShorthandItem[ImageProps]): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setOnClick(
      value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ ListItemProps) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

