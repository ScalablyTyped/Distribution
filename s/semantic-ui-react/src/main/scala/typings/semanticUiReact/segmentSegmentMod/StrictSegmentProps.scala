package typings.semanticUiReact.segmentSegmentMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.semanticUiReact.semanticUiReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictSegmentProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Attach segment to other content, like a header. */
  var attached: js.UndefOr[Boolean | top | bottom] = js.native
  /** A basic segment has no special formatting. */
  var basic: js.UndefOr[Boolean] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** A segment can be circular. */
  var circular: js.UndefOr[Boolean] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** A segment can clear floated content. */
  var clearing: js.UndefOr[Boolean] = js.native
  /** Segment can be colored. */
  var color: js.UndefOr[SemanticCOLORS] = js.native
  /** A segment may take up only as much space as is necessary. */
  var compact: js.UndefOr[Boolean] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** A segment may show its content is disabled. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** Segment content can be floated to the left or right. */
  var floated: js.UndefOr[SemanticFLOATS] = js.native
  /** A segment can have its colors inverted for contrast. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** A segment may show its content is being loaded. */
  var loading: js.UndefOr[Boolean] = js.native
  /** A segment can increase its padding. */
  var padded: js.UndefOr[Boolean | very] = js.native
  /** Formatted to look like a pile of pages. */
  var piled: js.UndefOr[Boolean] = js.native
  /** A segment can be used to reserve space for conditionally displayed content. */
  var placeholder: js.UndefOr[Boolean] = js.native
  /** A segment may be formatted to raise above the page. */
  var raised: js.UndefOr[Boolean] = js.native
  /** A segment can be formatted to appear less noticeable. */
  var secondary: js.UndefOr[Boolean] = js.native
  /** A segment can have different sizes. */
  var size: js.UndefOr[SegmentSizeProp] = js.native
  /** Formatted to show it contains multiple pages. */
  var stacked: js.UndefOr[Boolean] = js.native
  /** A segment can be formatted to appear even less noticeable. */
  var tertiary: js.UndefOr[Boolean] = js.native
  /** Formats content to be aligned as part of a vertical group. */
  var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.native
  /** Formats content to be aligned vertically. */
  var vertical: js.UndefOr[Boolean] = js.native
}

object StrictSegmentProps {
  @scala.inline
  def apply(): StrictSegmentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictSegmentProps]
  }
  @scala.inline
  implicit class StrictSegmentPropsOps[Self <: StrictSegmentProps] (val x: Self) extends AnyVal {
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
    def setClearing(value: Boolean): Self = this.set("clearing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearing: Self = this.set("clearing", js.undefined)
    @scala.inline
    def setColor(value: SemanticCOLORS): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFloated(value: SemanticFLOATS): Self = this.set("floated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloated: Self = this.set("floated", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setPadded(value: Boolean | very): Self = this.set("padded", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadded: Self = this.set("padded", js.undefined)
    @scala.inline
    def setPiled(value: Boolean): Self = this.set("piled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePiled: Self = this.set("piled", js.undefined)
    @scala.inline
    def setPlaceholder(value: Boolean): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setRaised(value: Boolean): Self = this.set("raised", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaised: Self = this.set("raised", js.undefined)
    @scala.inline
    def setSecondary(value: Boolean): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
    @scala.inline
    def setSize(value: SegmentSizeProp): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStacked(value: Boolean): Self = this.set("stacked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStacked: Self = this.set("stacked", js.undefined)
    @scala.inline
    def setTertiary(value: Boolean): Self = this.set("tertiary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTertiary: Self = this.set("tertiary", js.undefined)
    @scala.inline
    def setTextAlign(value: SemanticTEXTALIGNMENTS): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

