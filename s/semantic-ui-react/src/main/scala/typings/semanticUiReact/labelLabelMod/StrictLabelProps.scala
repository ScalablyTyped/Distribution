package typings.semanticUiReact.labelLabelMod

import typings.react.mod.ElementType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticSIZES
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.iconIconMod.IconProps
import typings.semanticUiReact.labelDetailMod.LabelDetailProps
import typings.semanticUiReact.semanticUiReactStrings.`bottom left`
import typings.semanticUiReact.semanticUiReactStrings.`bottom right`
import typings.semanticUiReact.semanticUiReactStrings.`top left`
import typings.semanticUiReact.semanticUiReactStrings.`top right`
import typings.semanticUiReact.semanticUiReactStrings.above
import typings.semanticUiReact.semanticUiReactStrings.below
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictLabelProps extends js.Object {
  
  /** A label can be active. */
  var active: js.UndefOr[Boolean] = js.native
  
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  
  /** A label can attach to a content segment. */
  var attached: js.UndefOr[top | bottom | (`top right`) | (`top left`) | (`bottom left`) | (`bottom right`)] = js.native
  
  /** A label can reduce its complexity. */
  var basic: js.UndefOr[Boolean] = js.native
  
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  
  /** A label can be circular. */
  var circular: js.UndefOr[Boolean] = js.native
  
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  
  /** Color of the label. */
  var color: js.UndefOr[SemanticCOLORS] = js.native
  
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  
  /** A label can position itself in the corner of an element. */
  var corner: js.UndefOr[Boolean | left | right] = js.native
  
  /** Shorthand for LabelDetail. */
  var detail: js.UndefOr[SemanticShorthandItem[LabelDetailProps]] = js.native
  
  /** Formats the label as a dot. */
  var empty: js.UndefOr[js.Any] = js.native
  
  /** Float above another element in the upper right corner. */
  var floating: js.UndefOr[Boolean] = js.native
  
  /** A horizontal label is formatted to label content along-side it horizontally. */
  var horizontal: js.UndefOr[Boolean] = js.native
  
  /** Add an icon by icon name or pass an <Icon /.> */
  var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.native
  
  /** A label can be formatted to emphasize an image or prop can be used as shorthand for Image. */
  var image: js.UndefOr[js.Any] = js.native
  
  /**
    * Called on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ LabelProps, Unit]
  ] = js.native
  
  /**
    * Adds an "x" icon, called when "x" is clicked.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onRemove: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ LabelProps, Unit]
  ] = js.native
  
  /** A label can point to content next to it. */
  var pointing: js.UndefOr[Boolean | above | below | left | right] = js.native
  
  /** A label can prompt for an error in your forms. */
  var prompt: js.UndefOr[Boolean] = js.native
  
  /** Shorthand for Icon to appear as the last child and trigger onRemove. */
  var removeIcon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.native
  
  /** A label can appear as a ribbon attaching itself to an element. */
  var ribbon: js.UndefOr[Boolean | right] = js.native
  
  /** A label can have different sizes. */
  var size: js.UndefOr[SemanticSIZES] = js.native
  
  /** A label can appear as a tag. */
  var tag: js.UndefOr[Boolean] = js.native
}
object StrictLabelProps {
  
  @scala.inline
  def apply(): StrictLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictLabelProps]
  }
  
  @scala.inline
  implicit class StrictLabelPropsOps[Self <: StrictLabelProps] (val x: Self) extends AnyVal {
    
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
    def setAttached(value: top | bottom | (`top right`) | (`top left`) | (`bottom left`) | (`bottom right`)): Self = this.set("attached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    
    @scala.inline
    def setBasic(value: Boolean): Self = this.set("basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasic: Self = this.set("basic", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCircular(value: Boolean): Self = this.set("circular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircular: Self = this.set("circular", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColor(value: SemanticCOLORS): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setCorner(value: Boolean | left | right): Self = this.set("corner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorner: Self = this.set("corner", js.undefined)
    
    @scala.inline
    def setDetailFunction3(
      value: (/* component */ ElementType[LabelDetailProps], LabelDetailProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("detail", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDetail(value: SemanticShorthandItem[LabelDetailProps]): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setEmpty(value: js.Any): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setFloating(value: Boolean): Self = this.set("floating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloating: Self = this.set("floating", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setIconFunction3(
      value: (/* component */ ElementType[IconProps], IconProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("icon", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIcon(value: SemanticShorthandItem[IconProps]): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setImage(value: js.Any): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setOnClick(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ LabelProps) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnRemove(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ LabelProps) => Unit): Self = this.set("onRemove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    
    @scala.inline
    def setPointing(value: Boolean | above | below | left | right): Self = this.set("pointing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointing: Self = this.set("pointing", js.undefined)
    
    @scala.inline
    def setPrompt(value: Boolean): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    
    @scala.inline
    def setRemoveIconFunction3(
      value: (/* component */ ElementType[IconProps], IconProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("removeIcon", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveIcon(value: SemanticShorthandItem[IconProps]): Self = this.set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveIcon: Self = this.set("removeIcon", js.undefined)
    
    @scala.inline
    def setRibbon(value: Boolean | right): Self = this.set("ribbon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRibbon: Self = this.set("ribbon", js.undefined)
    
    @scala.inline
    def setSize(value: SemanticSIZES): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTag(value: Boolean): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
