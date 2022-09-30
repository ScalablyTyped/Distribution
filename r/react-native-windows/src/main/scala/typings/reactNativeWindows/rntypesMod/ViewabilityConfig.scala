package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewabilityConfig extends StObject {
  
  /**
    * Similar to `viewAreaCoveragePercentThreshold`, but considers the percent of the item that is visible,
    * rather than the fraction of the viewable area it covers.
    */
  var itemVisiblePercentThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum amount of time (in milliseconds) that an item must be physically viewable before the
    * viewability callback will be fired. A high number means that scrolling through content without
    * stopping will not mark the content as viewable.
    */
  var minimumViewTime: js.UndefOr[Double] = js.undefined
  
  /**
    * Percent of viewport that must be covered for a partially occluded item to count as
    * "viewable", 0-100. Fully visible items are always considered viewable. A value of 0 means
    * that a single pixel in the viewport makes the item viewable, and a value of 100 means that
    * an item must be either entirely visible or cover the entire viewport to count as viewable.
    */
  var viewAreaCoveragePercentThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Nothing is considered viewable until the user scrolls or `recordInteraction` is called after
    * render.
    */
  var waitForInteraction: js.UndefOr[Boolean] = js.undefined
}
object ViewabilityConfig {
  
  inline def apply(): ViewabilityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewabilityConfig]
  }
  
  extension [Self <: ViewabilityConfig](x: Self) {
    
    inline def setItemVisiblePercentThreshold(value: Double): Self = StObject.set(x, "itemVisiblePercentThreshold", value.asInstanceOf[js.Any])
    
    inline def setItemVisiblePercentThresholdUndefined: Self = StObject.set(x, "itemVisiblePercentThreshold", js.undefined)
    
    inline def setMinimumViewTime(value: Double): Self = StObject.set(x, "minimumViewTime", value.asInstanceOf[js.Any])
    
    inline def setMinimumViewTimeUndefined: Self = StObject.set(x, "minimumViewTime", js.undefined)
    
    inline def setViewAreaCoveragePercentThreshold(value: Double): Self = StObject.set(x, "viewAreaCoveragePercentThreshold", value.asInstanceOf[js.Any])
    
    inline def setViewAreaCoveragePercentThresholdUndefined: Self = StObject.set(x, "viewAreaCoveragePercentThreshold", js.undefined)
    
    inline def setWaitForInteraction(value: Boolean): Self = StObject.set(x, "waitForInteraction", value.asInstanceOf[js.Any])
    
    inline def setWaitForInteractionUndefined: Self = StObject.set(x, "waitForInteraction", js.undefined)
  }
}
