package typings.semanticUiReact.imageImageMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactType
import typings.semanticUiReact.dimmerDimmerMod.DimmerProps
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticSIZES
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.labelLabelMod.LabelProps
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictImageProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** An image may be formatted to appear inline with text as an avatar. */
  var avatar: js.UndefOr[Boolean] = js.native
  /** An image may include a border to emphasize the edges of white or transparent content. */
  var bordered: js.UndefOr[Boolean] = js.native
  /** An image can appear centered in a content block. */
  var centered: js.UndefOr[Boolean] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** An image may appear circular. */
  var circular: js.UndefOr[Boolean] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** Shorthand for Dimmer. */
  var dimmer: js.UndefOr[SemanticShorthandItem[DimmerProps]] = js.native
  /** An image can show that it is disabled and cannot be selected. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** An image can sit to the left or right of other content. */
  var floated: js.UndefOr[SemanticFLOATS] = js.native
  /** An image can take up the width of its container. */
  var fluid: js.UndefOr[Boolean] = js.native
  /** An image can be hidden. */
  var hidden: js.UndefOr[Boolean] = js.native
  /** Renders the Image as an <a> tag with this href. */
  var href: js.UndefOr[String] = js.native
  /** An image may appear inline. */
  var `inline`: js.UndefOr[Boolean] = js.native
  /** Shorthand for Label. */
  var label: js.UndefOr[SemanticShorthandItem[LabelProps]] = js.native
  /** An image may appear rounded. */
  var rounded: js.UndefOr[Boolean] = js.native
  /** An image may appear at different sizes. */
  var size: js.UndefOr[SemanticSIZES] = js.native
  /** An image can specify that it needs an additional spacing to separate it from nearby content. */
  var spaced: js.UndefOr[Boolean | left | right] = js.native
  /** Whether or not to add the ui className. */
  var ui: js.UndefOr[Boolean] = js.native
  /** An image can specify its vertical alignment. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
  /** An image can render wrapped in a `div.ui.image` as alternative HTML markup. */
  var wrapped: js.UndefOr[Boolean] = js.native
}

object StrictImageProps {
  @scala.inline
  def apply(): StrictImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictImageProps]
  }
  @scala.inline
  implicit class StrictImagePropsOps[Self <: StrictImageProps] (val x: Self) extends AnyVal {
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
    def setAvatar(value: Boolean): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    @scala.inline
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    @scala.inline
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
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
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDimmerFunction3(
      value: (/* component */ ReactType[DimmerProps], DimmerProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("dimmer", js.Any.fromFunction3(value))
    @scala.inline
    def setDimmer(value: SemanticShorthandItem[DimmerProps]): Self = this.set("dimmer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimmer: Self = this.set("dimmer", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFloated(value: SemanticFLOATS): Self = this.set("floated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloated: Self = this.set("floated", js.undefined)
    @scala.inline
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setLabelFunction3(
      value: (/* component */ ReactType[LabelProps], LabelProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("label", js.Any.fromFunction3(value))
    @scala.inline
    def setLabel(value: SemanticShorthandItem[LabelProps]): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setRounded(value: Boolean): Self = this.set("rounded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRounded: Self = this.set("rounded", js.undefined)
    @scala.inline
    def setSize(value: SemanticSIZES): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSpaced(value: Boolean | left | right): Self = this.set("spaced", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaced: Self = this.set("spaced", js.undefined)
    @scala.inline
    def setUi(value: Boolean): Self = this.set("ui", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUi: Self = this.set("ui", js.undefined)
    @scala.inline
    def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    @scala.inline
    def setWrapped(value: Boolean): Self = this.set("wrapped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapped: Self = this.set("wrapped", js.undefined)
  }
  
}

