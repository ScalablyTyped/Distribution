package typings.reactSplitterLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitterLayoutProps extends js.Object {
  
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
  implicit class SplitterLayoutPropsOps[Self <: SplitterLayoutProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCustomClassName(value: String): Self = this.set("customClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomClassName: Self = this.set("customClassName", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: () => Unit): Self = this.set("onDragEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: () => Unit): Self = this.set("onDragStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnSecondaryPaneSizeChange(value: /* value */ Double => Unit): Self = this.set("onSecondaryPaneSizeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSecondaryPaneSizeChange: Self = this.set("onSecondaryPaneSizeChange", js.undefined)
    
    @scala.inline
    def setPercentage(value: Boolean): Self = this.set("percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentage: Self = this.set("percentage", js.undefined)
    
    @scala.inline
    def setPrimaryIndex(value: TPrimaryIndex): Self = this.set("primaryIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryIndex: Self = this.set("primaryIndex", js.undefined)
    
    @scala.inline
    def setPrimaryMinSize(value: Double): Self = this.set("primaryMinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryMinSize: Self = this.set("primaryMinSize", js.undefined)
    
    @scala.inline
    def setSecondaryInitialSize(value: Double): Self = this.set("secondaryInitialSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryInitialSize: Self = this.set("secondaryInitialSize", js.undefined)
    
    @scala.inline
    def setSecondaryMinSize(value: Double): Self = this.set("secondaryMinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryMinSize: Self = this.set("secondaryMinSize", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
