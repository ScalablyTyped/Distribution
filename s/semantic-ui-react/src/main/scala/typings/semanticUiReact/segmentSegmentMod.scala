package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import typings.semanticUiReact.segmentGroupMod.SegmentGroupProps
import typings.semanticUiReact.segmentInlineMod.SegmentInlineComponent
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.semanticUiReact.semanticUiReactStrings.very
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentSegmentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Segment/Segment", JSImport.Default)
  @js.native
  val default: SegmentComponent = js.native
  
  @js.native
  trait SegmentComponent extends FunctionComponent[SegmentProps] {
    
    var Group: StatelessComponent[SegmentGroupProps] = js.native
    
    var Inline: SegmentInlineComponent = js.native
  }
  
  @js.native
  trait SegmentProps
    extends StrictSegmentProps
       with /* key */ StringDictionary[js.Any]
  object SegmentProps {
    
    @scala.inline
    def apply(): SegmentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentProps]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.semanticUiReact.semanticUiReactStrings.mini
    - typings.semanticUiReact.semanticUiReactStrings.tiny
    - typings.semanticUiReact.semanticUiReactStrings.small
    - typings.semanticUiReact.semanticUiReactStrings.large
    - typings.semanticUiReact.semanticUiReactStrings.big
    - typings.semanticUiReact.semanticUiReactStrings.huge
    - typings.semanticUiReact.semanticUiReactStrings.massive
  */
  trait SegmentSizeProp extends StObject
  object SegmentSizeProp {
    
    @scala.inline
    def big: typings.semanticUiReact.semanticUiReactStrings.big = "big".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.big]
    
    @scala.inline
    def huge: typings.semanticUiReact.semanticUiReactStrings.huge = "huge".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.huge]
    
    @scala.inline
    def large: typings.semanticUiReact.semanticUiReactStrings.large = "large".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.large]
    
    @scala.inline
    def massive: typings.semanticUiReact.semanticUiReactStrings.massive = "massive".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.massive]
    
    @scala.inline
    def mini: typings.semanticUiReact.semanticUiReactStrings.mini = "mini".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.mini]
    
    @scala.inline
    def small: typings.semanticUiReact.semanticUiReactStrings.small = "small".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.small]
    
    @scala.inline
    def tiny: typings.semanticUiReact.semanticUiReactStrings.tiny = "tiny".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.tiny]
  }
  
  @js.native
  trait StrictSegmentProps extends StObject {
    
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
    implicit class StrictSegmentPropsMutableBuilder[Self <: StrictSegmentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAttached(value: Boolean | top | bottom): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      @scala.inline
      def setBasic(value: Boolean): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearing(value: Boolean): Self = StObject.set(x, "clearing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearingUndefined: Self = StObject.set(x, "clearing", js.undefined)
      
      @scala.inline
      def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFloated(value: SemanticFLOATS): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatedUndefined: Self = StObject.set(x, "floated", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setPadded(value: Boolean | very): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddedUndefined: Self = StObject.set(x, "padded", js.undefined)
      
      @scala.inline
      def setPiled(value: Boolean): Self = StObject.set(x, "piled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPiledUndefined: Self = StObject.set(x, "piled", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: Boolean): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
      
      @scala.inline
      def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
      
      @scala.inline
      def setSize(value: SegmentSizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
      
      @scala.inline
      def setTertiary(value: Boolean): Self = StObject.set(x, "tertiary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTertiaryUndefined: Self = StObject.set(x, "tertiary", js.undefined)
      
      @scala.inline
      def setTextAlign(value: SemanticTEXTALIGNMENTS): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  type _To = SegmentComponent
  
  /* This means you don't have to write `default`, but can instead just say `segmentSegmentMod.foo` */
  override def _to: SegmentComponent = default
}
