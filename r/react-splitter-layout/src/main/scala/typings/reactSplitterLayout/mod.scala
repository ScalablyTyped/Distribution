package typings.reactSplitterLayout

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-splitter-layout", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SplitterLayoutProps, js.Object, js.Any]
  
  type SplitterLayout = PureComponent[SplitterLayoutProps, js.Object, js.Any]
  
  @js.native
  trait SplitterLayoutProps extends StObject {
    
    /**
      * Placeholder of the panel(s) inside the splitter
      */
    var children: js.UndefOr[js.Any] = js.native
    
    /**
      * Custom CSS class name applied to the layout div.
      * You can use this to customize layout style.
      * Refers to the original stylesheet to see what you can customize.
      */
    var customClassName: js.UndefOr[String] = js.native
    
    /**
      * Called when dragging finishes.
      *
      * No parameter will be passed to event handlers.
      */
    var onDragEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Called when dragging is started.
      *
      * No parameter will be passed to event handlers.
      */
    var onDragStart: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Called when the size of secondary pane is changed.
      *
      * Event handlers will be passed with a single parameter of number type representing
      * new size of secondary pane.
      * When percentage is set to false, the value is in pixel size.
      * When percentage is set to true, the value is in percentage.
      */
    var onSecondaryPaneSizeChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    /**
      * Determine whether the width of each pane should be calculated in percentage or by pixels.
      * The default value is false, which means width is calculated in pixels.
      *
      * @default false
      */
    var percentage: js.UndefOr[Boolean] = js.native
    
    /**
      * Index of the primary pane.
      * Since SplitterLayout supports at most 2 children, only 0 or 1 is allowed.
      *
      * A primary pane is used to show users primary content, while a secondary pane is the other pane.
      * When window size changes and percentage is set to false, primary pane's size is flexible
      * and secondary pane's size is kept unchanged. However, when the window size is not enough
      * for showing both minimal primary pane and minimal secondary pane,
      * the primary pane's size is served first.
      *
      * @default 0
      */
    var primaryIndex: js.UndefOr[TPrimaryIndex] = js.native
    
    /**
      * Minimal size of primary pane.
      * When percentage is set to false, this value is pixel size (25 means 25px).
      * When percentage is set to true, this value is percentage (25 means 25%).
      *
      * @default 0
      */
    var primaryMinSize: js.UndefOr[Double] = js.native
    
    /**
      * Initial size of secondary pane when page loads.
      * If this prop is not defined, SplitterLayout tries to split the layout with equal sizes.
      * (Note: equal size may not apply when there are nested layouts.)
      *
      * @default undefined
      */
    var secondaryInitialSize: js.UndefOr[Double] = js.native
    
    /**
      * Minimal size of secondary pane.
      */
    var secondaryMinSize: js.UndefOr[Double] = js.native
    
    /**
      * Determine whether the layout should be a horizontal split or a vertical split.
      *
      * @default false
      */
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object SplitterLayoutProps {
    
    @scala.inline
    def apply(): SplitterLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitterLayoutProps]
    }
    
    @scala.inline
    implicit class SplitterLayoutPropsMutableBuilder[Self <: SplitterLayoutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCustomClassName(value: String): Self = StObject.set(x, "customClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomClassNameUndefined: Self = StObject.set(x, "customClassName", js.undefined)
      
      @scala.inline
      def setOnDragEnd(value: () => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: () => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnSecondaryPaneSizeChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onSecondaryPaneSizeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSecondaryPaneSizeChangeUndefined: Self = StObject.set(x, "onSecondaryPaneSizeChange", js.undefined)
      
      @scala.inline
      def setPercentage(value: Boolean): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      @scala.inline
      def setPrimaryIndex(value: TPrimaryIndex): Self = StObject.set(x, "primaryIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryIndexUndefined: Self = StObject.set(x, "primaryIndex", js.undefined)
      
      @scala.inline
      def setPrimaryMinSize(value: Double): Self = StObject.set(x, "primaryMinSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryMinSizeUndefined: Self = StObject.set(x, "primaryMinSize", js.undefined)
      
      @scala.inline
      def setSecondaryInitialSize(value: Double): Self = StObject.set(x, "secondaryInitialSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryInitialSizeUndefined: Self = StObject.set(x, "secondaryInitialSize", js.undefined)
      
      @scala.inline
      def setSecondaryMinSize(value: Double): Self = StObject.set(x, "secondaryMinSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryMinSizeUndefined: Self = StObject.set(x, "secondaryMinSize", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSplitterLayout.reactSplitterLayoutNumbers.`0`
    - typings.reactSplitterLayout.reactSplitterLayoutNumbers.`1`
  */
  trait TPrimaryIndex extends StObject
  object TPrimaryIndex {
    
    @scala.inline
    def `0`: typings.reactSplitterLayout.reactSplitterLayoutNumbers.`0` = 0.asInstanceOf[typings.reactSplitterLayout.reactSplitterLayoutNumbers.`0`]
    
    @scala.inline
    def `1`: typings.reactSplitterLayout.reactSplitterLayoutNumbers.`1` = 1.asInstanceOf[typings.reactSplitterLayout.reactSplitterLayoutNumbers.`1`]
  }
}
