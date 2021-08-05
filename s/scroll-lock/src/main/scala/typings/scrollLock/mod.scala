package typings.scrollLock

import typings.std.Element
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scroll-lock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addFillGapSelector(fillGapSelector: FillGapSelector): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFillGapSelector")(fillGapSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addFillGapTarget(fillGapTarget: FillGapTarget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFillGapTarget")(fillGapTarget.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addLockableSelector(lockableSelector: LockableSelector): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addLockableSelector")(lockableSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addLockableTarget(lockableTarget: LockableTarget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addLockableTarget")(lockableTarget.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addScrollableSelector(scrollableSelector: ScrollableSelector): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addScrollableSelector")(scrollableSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addScrollableTarget(scrollableTarget: ScrollableTarget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addScrollableTarget")(scrollableTarget.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearQueueScrollLocks(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearQueueScrollLocks")().asInstanceOf[Unit]
  
  inline def disablePageScroll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disablePageScroll")().asInstanceOf[Unit]
  inline def disablePageScroll(scrollableTarget: ScrollableTarget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disablePageScroll")(scrollableTarget.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enablePageScroll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enablePageScroll")().asInstanceOf[Unit]
  inline def enablePageScroll(scrollableTarget: ScrollableTarget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enablePageScroll")(scrollableTarget.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getCurrentPageScrollBarWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPageScrollBarWidth")().asInstanceOf[Double]
  
  inline def getPageScrollBarWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageScrollBarWidth")().asInstanceOf[Double]
  inline def getPageScrollBarWidth(onlyExists: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageScrollBarWidth")(onlyExists.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getScrollState(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollState")().asInstanceOf[Boolean]
  
  inline def refillGaps(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refillGaps")().asInstanceOf[Unit]
  
  inline def removeFillGapSelector(fillGapSelector: FillGapSelector): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFillGapSelector")(fillGapSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeFillGapTarget(fillGapTarget: FillGapTarget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFillGapTarget")(fillGapTarget.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeScrollableSelector(scrollableSelector: ScrollableSelector): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeScrollableSelector")(scrollableSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeScrollableTarget(scrollableTarget: ScrollableTarget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeScrollableTarget")(scrollableTarget.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setFillGapMethod(fillGapMethod: FillGapMethod): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFillGapMethod")(fillGapMethod.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.scrollLock.scrollLockStrings.padding
    - typings.scrollLock.scrollLockStrings.margin
    - typings.scrollLock.scrollLockStrings.width
    - typings.scrollLock.scrollLockStrings.`max-width`
    - typings.scrollLock.scrollLockStrings.none
  */
  trait FillGapMethod extends StObject
  object FillGapMethod {
    
    inline def margin: typings.scrollLock.scrollLockStrings.margin = "margin".asInstanceOf[typings.scrollLock.scrollLockStrings.margin]
    
    inline def `max-width`: typings.scrollLock.scrollLockStrings.`max-width` = "max-width".asInstanceOf[typings.scrollLock.scrollLockStrings.`max-width`]
    
    inline def none: typings.scrollLock.scrollLockStrings.none = "none".asInstanceOf[typings.scrollLock.scrollLockStrings.none]
    
    inline def padding: typings.scrollLock.scrollLockStrings.padding = "padding".asInstanceOf[typings.scrollLock.scrollLockStrings.padding]
    
    inline def width: typings.scrollLock.scrollLockStrings.width = "width".asInstanceOf[typings.scrollLock.scrollLockStrings.width]
  }
  
  type FillGapSelector = String | js.Array[String]
  
  type FillGapTarget = Element | js.Array[Element] | NodeList
  
  type LockableSelector = String | js.Array[String]
  
  type LockableTarget = Element | js.Array[Element] | NodeList
  
  type ScrollableSelector = String | js.Array[String]
  
  type ScrollableTarget = Element | js.Array[Element] | NodeList
}
