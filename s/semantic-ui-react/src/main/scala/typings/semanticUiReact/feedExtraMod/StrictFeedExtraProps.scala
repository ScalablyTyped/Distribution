package typings.semanticUiReact.feedExtraMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.HtmlImageProps
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictFeedExtraProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** An event can contain additional information like a set of images. */
  var images: js.UndefOr[Boolean | js.Array[SemanticShorthandCollection[HtmlImageProps]]] = js.undefined
  /** An event can contain additional text information. */
  var text: js.UndefOr[Boolean] = js.undefined
}

object StrictFeedExtraProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    images: Boolean | js.Array[SemanticShorthandCollection[HtmlImageProps]] = null,
    text: js.UndefOr[Boolean] = js.undefined
  ): StrictFeedExtraProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictFeedExtraProps]
  }
}

