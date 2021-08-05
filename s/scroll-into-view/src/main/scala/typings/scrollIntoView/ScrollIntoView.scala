package typings.scrollIntoView

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollIntoView {
  
  trait Alignment extends StObject {
    
    /** 0 to 1, default 0.5 (center) */
    var left: js.UndefOr[Double] = js.undefined
    
    /** pixels to offset left alignment */
    var leftOffset: js.UndefOr[Double] = js.undefined
    
    /** 0 to 1, default 0.5 (center) */
    var top: js.UndefOr[Double] = js.undefined
    
    /** pixels to offset top alignment */
    var topOffset: js.UndefOr[Double] = js.undefined
  }
  object Alignment {
    
    inline def apply(): Alignment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alignment]
    }
    
    extension [Self <: Alignment](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftOffset(value: Double): Self = StObject.set(x, "leftOffset", value.asInstanceOf[js.Any])
      
      inline def setLeftOffsetUndefined: Self = StObject.set(x, "leftOffset", js.undefined)
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopOffset(value: Double): Self = StObject.set(x, "topOffset", value.asInstanceOf[js.Any])
      
      inline def setTopOffsetUndefined: Self = StObject.set(x, "topOffset", js.undefined)
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  type Callback = js.Function1[/* type */ callbackParameterType, Unit]
  
  @js.native
  trait ScrollIntoView extends StObject {
    
    def apply(target: HTMLElement): Unit = js.native
    def apply(target: HTMLElement, callback: Callback): Unit = js.native
    def apply(target: HTMLElement, settings: Settings): Unit = js.native
    def apply(target: HTMLElement, settings: Settings, callback: Callback): Unit = js.native
  }
  
  trait Settings extends StObject {
    
    var align: js.UndefOr[Alignment] = js.undefined
    
    var ease: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
    
    var time: js.UndefOr[Double] = js.undefined
    
    var validTarget: js.UndefOr[js.Function2[/* target */ HTMLElement, /* parentsScrolled */ Double, Boolean]] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setAlign(value: Alignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setEase(value: /* value */ Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
      
      inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setValidTarget(value: (/* target */ HTMLElement, /* parentsScrolled */ Double) => Boolean): Self = StObject.set(x, "validTarget", js.Any.fromFunction2(value))
      
      inline def setValidTargetUndefined: Self = StObject.set(x, "validTarget", js.undefined)
    }
  }
  
  /** type will be 'complete' if the scroll completed or 'canceled' if the current scroll was canceled by a new scroll */
  /* Rewritten from type alias, can be one of: 
    - typings.scrollIntoView.scrollIntoViewStrings.complete
    - typings.scrollIntoView.scrollIntoViewStrings.canceled
  */
  trait callbackParameterType extends StObject
  object callbackParameterType {
    
    inline def canceled: typings.scrollIntoView.scrollIntoViewStrings.canceled = "canceled".asInstanceOf[typings.scrollIntoView.scrollIntoViewStrings.canceled]
    
    inline def complete: typings.scrollIntoView.scrollIntoViewStrings.complete = "complete".asInstanceOf[typings.scrollIntoView.scrollIntoViewStrings.complete]
  }
}
