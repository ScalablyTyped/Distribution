package typings.semanticUiReact.feedContentMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactType
import typings.semanticUiReact.feedDateMod.FeedDateProps
import typings.semanticUiReact.feedExtraMod.FeedExtraProps
import typings.semanticUiReact.feedMetaMod.FeedMetaProps
import typings.semanticUiReact.feedSummaryMod.FeedSummaryProps
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictFeedContentProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** An event can contain a date. */
  var date: js.UndefOr[SemanticShorthandItem[FeedDateProps]] = js.native
  /** Shorthand for FeedExtra with images. */
  var extraImages: js.UndefOr[SemanticShorthandItem[FeedExtraProps]] = js.native
  /** Shorthand for FeedExtra with text. */
  var extraText: js.UndefOr[SemanticShorthandItem[FeedExtraProps]] = js.native
  /** Shorthand for FeedMeta. */
  var meta: js.UndefOr[SemanticShorthandItem[FeedMetaProps]] = js.native
  /** Shorthand for FeedSummary. */
  var summary: js.UndefOr[SemanticShorthandItem[FeedSummaryProps]] = js.native
}

object StrictFeedContentProps {
  @scala.inline
  def apply(): StrictFeedContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictFeedContentProps]
  }
  @scala.inline
  implicit class StrictFeedContentPropsOps[Self <: StrictFeedContentProps] (val x: Self) extends AnyVal {
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
    def setDateFunction3(
      value: (/* component */ ReactType[FeedDateProps], FeedDateProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("date", js.Any.fromFunction3(value))
    @scala.inline
    def setDate(value: SemanticShorthandItem[FeedDateProps]): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setExtraImagesFunction3(
      value: (/* component */ ReactType[FeedExtraProps], FeedExtraProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("extraImages", js.Any.fromFunction3(value))
    @scala.inline
    def setExtraImages(value: SemanticShorthandItem[FeedExtraProps]): Self = this.set("extraImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraImages: Self = this.set("extraImages", js.undefined)
    @scala.inline
    def setExtraTextFunction3(
      value: (/* component */ ReactType[FeedExtraProps], FeedExtraProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("extraText", js.Any.fromFunction3(value))
    @scala.inline
    def setExtraText(value: SemanticShorthandItem[FeedExtraProps]): Self = this.set("extraText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraText: Self = this.set("extraText", js.undefined)
    @scala.inline
    def setMetaFunction3(
      value: (/* component */ ReactType[FeedMetaProps], FeedMetaProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("meta", js.Any.fromFunction3(value))
    @scala.inline
    def setMeta(value: SemanticShorthandItem[FeedMetaProps]): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setSummaryFunction3(
      value: (/* component */ ReactType[FeedSummaryProps], FeedSummaryProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("summary", js.Any.fromFunction3(value))
    @scala.inline
    def setSummary(value: SemanticShorthandItem[FeedSummaryProps]): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
  
}

