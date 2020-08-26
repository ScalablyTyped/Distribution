package typings.semanticUiReact.feedExtraMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.HtmlImageProps
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictFeedExtraProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** An event can contain additional information like a set of images. */
  var images: js.UndefOr[Boolean | js.Array[SemanticShorthandCollection[HtmlImageProps]]] = js.native
  /** An event can contain additional text information. */
  var text: js.UndefOr[Boolean] = js.native
}

object StrictFeedExtraProps {
  @scala.inline
  def apply(): StrictFeedExtraProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictFeedExtraProps]
  }
  @scala.inline
  implicit class StrictFeedExtraPropsOps[Self <: StrictFeedExtraProps] (val x: Self) extends AnyVal {
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
    def setImagesVarargs(value: SemanticShorthandCollection[HtmlImageProps]*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: Boolean | js.Array[SemanticShorthandCollection[HtmlImageProps]]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setText(value: Boolean): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

