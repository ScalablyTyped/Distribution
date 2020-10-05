package typings.semanticUiReact.iconIconMod

import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticICONS
import typings.semanticUiReact.semanticUiReactStrings.clockwise
import typings.semanticUiReact.semanticUiReactStrings.counterclockwise
import typings.semanticUiReact.semanticUiReactStrings.horizontally
import typings.semanticUiReact.semanticUiReactStrings.vertically
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictIconProps extends js.Object {
  /** Icon can have an aria hidden. */
  var `aria-hidden`: js.UndefOr[String] = js.native
  /** Icon can have an aria label. */
  var `aria-label`: js.UndefOr[String] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Formatted to appear bordered */
  var bordered: js.UndefOr[Boolean] = js.native
  /** Icon can formatted to appear circular. */
  var circular: js.UndefOr[Boolean] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Color of the icon. */
  var color: js.UndefOr[SemanticCOLORS] = js.native
  /** Icons can display a smaller corner icon. */
  var corner: js.UndefOr[Boolean | IconCorner] = js.native
  /** Show that the icon is inactive. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** Fitted, without space to left or right of Icon. */
  var fitted: js.UndefOr[Boolean] = js.native
  /** Icon can be flipped. */
  var flipped: js.UndefOr[horizontally | vertically] = js.native
  /** Formatted to have its colors inverted for contrast. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** Icon can be formatted as a link. */
  var link: js.UndefOr[Boolean] = js.native
  /** Icon can be used as a simple loader. */
  var loading: js.UndefOr[Boolean] = js.native
  /** Name of the icon. */
  var name: js.UndefOr[SemanticICONS] = js.native
  /** Icon can rotated. */
  var rotated: js.UndefOr[clockwise | counterclockwise] = js.native
  /** Size of the icon. */
  var size: js.UndefOr[IconSizeProp] = js.native
}

object StrictIconProps {
  @scala.inline
  def apply(): StrictIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictIconProps]
  }
  @scala.inline
  implicit class StrictIconPropsOps[Self <: StrictIconProps] (val x: Self) extends AnyVal {
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
    def `setAria-hidden`(value: String): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", js.undefined)
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
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
    def setCorner(value: Boolean | IconCorner): Self = this.set("corner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorner: Self = this.set("corner", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFitted(value: Boolean): Self = this.set("fitted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitted: Self = this.set("fitted", js.undefined)
    @scala.inline
    def setFlipped(value: horizontally | vertically): Self = this.set("flipped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipped: Self = this.set("flipped", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setLink(value: Boolean): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setName(value: SemanticICONS): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRotated(value: clockwise | counterclockwise): Self = this.set("rotated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotated: Self = this.set("rotated", js.undefined)
    @scala.inline
    def setSize(value: IconSizeProp): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

