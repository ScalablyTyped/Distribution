package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.segmentSegmentMod.SegmentSizeProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Segment/SegmentGroup", JSImport.Default)
  @js.native
  val default: StatelessComponent[SegmentGroupProps] = js.native
  
  @js.native
  trait SegmentGroupProps
    extends StrictSegmentGroupProps
       with /* key */ StringDictionary[js.Any]
  object SegmentGroupProps {
    
    @scala.inline
    def apply(): SegmentGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentGroupProps]
    }
  }
  
  @js.native
  trait StrictSegmentGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** A segment may take up only as much space as is necessary. */
    var compact: js.UndefOr[Boolean] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Formats content to be aligned horizontally. */
    var horizontal: js.UndefOr[Boolean] = js.native
    
    /** Formatted to look like a pile of pages. */
    var piled: js.UndefOr[Boolean] = js.native
    
    /** A segment group may be formatted to raise above the page. */
    var raised: js.UndefOr[Boolean] = js.native
    
    /** A segment group can have different sizes. */
    var size: js.UndefOr[SegmentSizeProp] = js.native
    
    /** Formatted to show it contains multiple pages. */
    var stacked: js.UndefOr[Boolean] = js.native
  }
  object StrictSegmentGroupProps {
    
    @scala.inline
    def apply(): StrictSegmentGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictSegmentGroupProps]
    }
    
    @scala.inline
    implicit class StrictSegmentGroupPropsMutableBuilder[Self <: StrictSegmentGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setPiled(value: Boolean): Self = StObject.set(x, "piled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPiledUndefined: Self = StObject.set(x, "piled", js.undefined)
      
      @scala.inline
      def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
      
      @scala.inline
      def setSize(value: SegmentSizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    }
  }
  
  type _To = StatelessComponent[SegmentGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `segmentGroupMod.foo` */
  override def _to: StatelessComponent[SegmentGroupProps] = default
}
