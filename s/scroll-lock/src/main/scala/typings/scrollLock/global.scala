package typings.scrollLock

import typings.scrollLock.mod.FillGapMethod
import typings.scrollLock.mod.FillGapSelector
import typings.scrollLock.mod.FillGapTarget
import typings.scrollLock.mod.LockableSelector
import typings.scrollLock.mod.LockableTarget
import typings.scrollLock.mod.ScrollableSelector
import typings.scrollLock.mod.ScrollableTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object scrollLock {
    
    @JSGlobal("scrollLock")
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
  }
}
