package typings.semanticUiReact.headerHeaderMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.medium
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.semanticUiReact.semanticUiReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictHeaderProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Attach header  to other content, like a segment. */
  var attached: js.UndefOr[Boolean | top | bottom] = js.native
  /** Format header to appear inside a content block. */
  var block: js.UndefOr[Boolean] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Color of the header. */
  var color: js.UndefOr[SemanticCOLORS] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[ReactNode] = js.native
  /** Show that the header is inactive. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** Divide header from the content below it. */
  var dividing: js.UndefOr[Boolean] = js.native
  /** Header can sit to the left or right of other content. */
  var floated: js.UndefOr[SemanticFLOATS] = js.native
  /** Add an icon by icon name or pass an Icon. */
  var icon: js.UndefOr[js.Any] = js.native
  /** Add an image by img src or pass an Image. */
  var image: js.UndefOr[js.Any] = js.native
  /** Inverts the color of the header for dark backgrounds. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** Content headings are sized with em and are based on the font-size of their container. */
  var size: js.UndefOr[tiny | small | medium | large | huge] = js.native
  /** Headers may be formatted to label smaller or de-emphasized content. */
  var sub: js.UndefOr[Boolean] = js.native
  /** Shorthand for Header.Subheader. */
  var subheader: js.UndefOr[js.Any] = js.native
  /** Align header content. */
  var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.native
}

object StrictHeaderProps {
  @scala.inline
  def apply(): StrictHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictHeaderProps]
  }
  @scala.inline
  implicit class StrictHeaderPropsOps[Self <: StrictHeaderProps] (val x: Self) extends AnyVal {
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
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setAttached(value: Boolean | top | bottom): Self = this.set("attached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    @scala.inline
    def setBlock(value: Boolean): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
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
    def setContent(value: ReactNode): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDividing(value: Boolean): Self = this.set("dividing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDividing: Self = this.set("dividing", js.undefined)
    @scala.inline
    def setFloated(value: SemanticFLOATS): Self = this.set("floated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloated: Self = this.set("floated", js.undefined)
    @scala.inline
    def setIcon(value: js.Any): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setImage(value: js.Any): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setSize(value: tiny | small | medium | large | huge): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSub(value: Boolean): Self = this.set("sub", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSub: Self = this.set("sub", js.undefined)
    @scala.inline
    def setSubheader(value: js.Any): Self = this.set("subheader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubheader: Self = this.set("subheader", js.undefined)
    @scala.inline
    def setTextAlign(value: SemanticTEXTALIGNMENTS): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
  }
  
}

