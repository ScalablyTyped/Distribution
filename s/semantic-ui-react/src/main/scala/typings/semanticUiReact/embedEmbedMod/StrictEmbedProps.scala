package typings.semanticUiReact.embedEmbedMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactType
import typings.semanticUiReact.genericMod.HtmlIframeProps
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.iconIconMod.IconProps
import typings.semanticUiReact.semanticUiReactStrings.`16Colon9`
import typings.semanticUiReact.semanticUiReactStrings.`21Colon9`
import typings.semanticUiReact.semanticUiReactStrings.`4Colon3`
import typings.semanticUiReact.semanticUiReactStrings.vimeo
import typings.semanticUiReact.semanticUiReactStrings.youtube
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictEmbedProps extends js.Object {
  /** An embed can be active. */
  var active: js.UndefOr[Boolean] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** An embed can specify an alternative aspect ratio. */
  var aspectRatio: js.UndefOr[`4Colon3` | `16Colon9` | `21Colon9`] = js.native
  /** Setting to true or false will force autoplay. */
  var autoplay: js.UndefOr[Boolean] = js.native
  /** Whether to show networks branded UI like title cards, or after video calls to action. */
  var brandedUI: js.UndefOr[Boolean] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Specifies a default chrome color with Vimeo or YouTube. */
  var color: js.UndefOr[String] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** Initial value of active. */
  var defaultActive: js.UndefOr[Boolean] = js.native
  /** Whether to prefer HD content. */
  var hd: js.UndefOr[Boolean] = js.native
  /** Specifies an icon to use with placeholder content. */
  var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.native
  /** Specifies an id for source. */
  var id: js.UndefOr[String] = js.native
  /** Shorthand for HTML iframe. */
  var iframe: js.UndefOr[SemanticShorthandItem[HtmlIframeProps]] = js.native
  /**
    * Сalled on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and proposed value.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      /* data */ EmbedProps, 
      Unit
    ]
  ] = js.native
  /** A placeholder image for embed. */
  var placeholder: js.UndefOr[String] = js.native
  /** Specifies a source to use. */
  var source: js.UndefOr[youtube | vimeo] = js.native
  /** Specifies a url to use for embed. */
  var url: js.UndefOr[String] = js.native
}

object StrictEmbedProps {
  @scala.inline
  def apply(): StrictEmbedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictEmbedProps]
  }
  @scala.inline
  implicit class StrictEmbedPropsOps[Self <: StrictEmbedProps] (val x: Self) extends AnyVal {
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
    def setAspectRatio(value: `4Colon3` | `16Colon9` | `21Colon9`): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setBrandedUI(value: Boolean): Self = this.set("brandedUI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrandedUI: Self = this.set("brandedUI", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDefaultActive(value: Boolean): Self = this.set("defaultActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultActive: Self = this.set("defaultActive", js.undefined)
    @scala.inline
    def setHd(value: Boolean): Self = this.set("hd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHd: Self = this.set("hd", js.undefined)
    @scala.inline
    def setIconFunction3(
      value: (/* component */ ReactType[IconProps], IconProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("icon", js.Any.fromFunction3(value))
    @scala.inline
    def setIcon(value: SemanticShorthandItem[IconProps]): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIframeFunction3(
      value: (/* component */ ReactType[HtmlIframeProps], HtmlIframeProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("iframe", js.Any.fromFunction3(value))
    @scala.inline
    def setIframe(value: SemanticShorthandItem[HtmlIframeProps]): Self = this.set("iframe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframe: Self = this.set("iframe", js.undefined)
    @scala.inline
    def setOnClick(value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ EmbedProps) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setSource(value: youtube | vimeo): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

