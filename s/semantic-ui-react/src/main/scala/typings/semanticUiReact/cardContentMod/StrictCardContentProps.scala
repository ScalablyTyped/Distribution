package typings.semanticUiReact.cardContentMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactType
import typings.semanticUiReact.cardDescriptionMod.CardDescriptionProps
import typings.semanticUiReact.cardHeaderMod.CardHeaderProps
import typings.semanticUiReact.cardMetaMod.CardMetaProps
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.semanticUiReactStrings.center
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictCardContentProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** Shorthand for CardDescription. */
  var description: js.UndefOr[SemanticShorthandItem[CardDescriptionProps]] = js.native
  /** A card can contain extra content meant to be formatted separately from the main content. */
  var extra: js.UndefOr[Boolean] = js.native
  /** Shorthand for CardHeader. */
  var header: js.UndefOr[SemanticShorthandItem[CardHeaderProps]] = js.native
  /** Shorthand for CardMeta. */
  var meta: js.UndefOr[SemanticShorthandItem[CardMetaProps]] = js.native
  /** A card content can adjust its text alignment. */
  var textAlign: js.UndefOr[center | left | right] = js.native
}

object StrictCardContentProps {
  @scala.inline
  def apply(): StrictCardContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictCardContentProps]
  }
  @scala.inline
  implicit class StrictCardContentPropsOps[Self <: StrictCardContentProps] (val x: Self) extends AnyVal {
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
    def setDescriptionFunction3(
      value: (/* component */ ReactType[CardDescriptionProps], CardDescriptionProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("description", js.Any.fromFunction3(value))
    @scala.inline
    def setDescription(value: SemanticShorthandItem[CardDescriptionProps]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExtra(value: Boolean): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setHeaderFunction3(
      value: (/* component */ ReactType[CardHeaderProps], CardHeaderProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("header", js.Any.fromFunction3(value))
    @scala.inline
    def setHeader(value: SemanticShorthandItem[CardHeaderProps]): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setMetaFunction3(
      value: (/* component */ ReactType[CardMetaProps], CardMetaProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("meta", js.Any.fromFunction3(value))
    @scala.inline
    def setMeta(value: SemanticShorthandItem[CardMetaProps]): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setTextAlign(value: center | left | right): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
  }
  
}

