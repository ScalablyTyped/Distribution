package typings.semanticUiReact.cardCardMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactType
import typings.semanticUiReact.cardDescriptionMod.CardDescriptionProps
import typings.semanticUiReact.cardHeaderMod.CardHeaderProps
import typings.semanticUiReact.cardMetaMod.CardMetaProps
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.imageImageMod.ImageProps
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictCardProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** A Card can center itself inside its container. */
  var centered: js.UndefOr[Boolean] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** A Card can be formatted to display different colors. */
  var color: js.UndefOr[SemanticCOLORS] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** Shorthand for CardDescription. */
  var description: js.UndefOr[SemanticShorthandItem[CardDescriptionProps]] = js.native
  /** Shorthand for primary content of CardContent. */
  var extra: js.UndefOr[SemanticShorthandContent] = js.native
  /** A Card can be formatted to take up the width of its container. */
  var fluid: js.UndefOr[Boolean] = js.native
  /** Shorthand for CardHeader. */
  var header: js.UndefOr[SemanticShorthandItem[CardHeaderProps]] = js.native
  /** Render as an `a` tag instead of a `div` and adds the href attribute. */
  var href: js.UndefOr[String] = js.native
  /** A card can contain an Image component. */
  var image: js.UndefOr[SemanticShorthandItem[ImageProps]] = js.native
  /** A card can be formatted to link to other content. */
  var link: js.UndefOr[Boolean] = js.native
  /** Shorthand for CardMeta. */
  var meta: js.UndefOr[SemanticShorthandItem[CardMetaProps]] = js.native
  /**
    * Called on click. When passed, the component renders as an `a`
    * tag by default instead of a `div`.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
      /* data */ CardProps, 
      Unit
    ]
  ] = js.native
  /** A Card can be formatted to raise above the page. */
  var raised: js.UndefOr[Boolean] = js.native
}

object StrictCardProps {
  @scala.inline
  def apply(): StrictCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictCardProps]
  }
  @scala.inline
  implicit class StrictCardPropsOps[Self <: StrictCardProps] (val x: Self) extends AnyVal {
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
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
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
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDescriptionFunction3(
      value: (/* component */ ReactType[CardDescriptionProps], CardDescriptionProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("description", js.Any.fromFunction3(value))
    @scala.inline
    def setDescription(value: SemanticShorthandItem[CardDescriptionProps]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExtra(value: SemanticShorthandContent): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
    @scala.inline
    def setHeaderFunction3(
      value: (/* component */ ReactType[CardHeaderProps], CardHeaderProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("header", js.Any.fromFunction3(value))
    @scala.inline
    def setHeader(value: SemanticShorthandItem[CardHeaderProps]): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setImageFunction3(
      value: (/* component */ ReactType[ImageProps], ImageProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("image", js.Any.fromFunction3(value))
    @scala.inline
    def setImage(value: SemanticShorthandItem[ImageProps]): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setLink(value: Boolean): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setMetaFunction3(
      value: (/* component */ ReactType[CardMetaProps], CardMetaProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("meta", js.Any.fromFunction3(value))
    @scala.inline
    def setMeta(value: SemanticShorthandItem[CardMetaProps]): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setOnClick(value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ CardProps) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setRaised(value: Boolean): Self = this.set("raised", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaised: Self = this.set("raised", js.undefined)
  }
  
}

