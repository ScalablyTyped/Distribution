package typings.resizeObserverBrowser

import typings.std.DOMRectReadOnly
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeObserverEntry extends StObject {
  
  val borderBoxSize: js.UndefOr[js.Array[ResizeObserverSize]] = js.undefined
  
  val contentBoxSize: js.UndefOr[js.Array[ResizeObserverSize]] = js.undefined
  
  val contentRect: DOMRectReadOnly
  
  val devicePixelContentBoxSize: js.UndefOr[js.Array[ResizeObserverSize]] = js.undefined
  
  val target: Element
}
object ResizeObserverEntry {
  
  inline def apply(contentRect: DOMRectReadOnly, target: Element): ResizeObserverEntry = {
    val __obj = js.Dynamic.literal(contentRect = contentRect.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverEntry]
  }
  
  extension [Self <: ResizeObserverEntry](x: Self) {
    
    inline def setBorderBoxSize(value: js.Array[ResizeObserverSize]): Self = StObject.set(x, "borderBoxSize", value.asInstanceOf[js.Any])
    
    inline def setBorderBoxSizeUndefined: Self = StObject.set(x, "borderBoxSize", js.undefined)
    
    inline def setBorderBoxSizeVarargs(value: ResizeObserverSize*): Self = StObject.set(x, "borderBoxSize", js.Array(value :_*))
    
    inline def setContentBoxSize(value: js.Array[ResizeObserverSize]): Self = StObject.set(x, "contentBoxSize", value.asInstanceOf[js.Any])
    
    inline def setContentBoxSizeUndefined: Self = StObject.set(x, "contentBoxSize", js.undefined)
    
    inline def setContentBoxSizeVarargs(value: ResizeObserverSize*): Self = StObject.set(x, "contentBoxSize", js.Array(value :_*))
    
    inline def setContentRect(value: DOMRectReadOnly): Self = StObject.set(x, "contentRect", value.asInstanceOf[js.Any])
    
    inline def setDevicePixelContentBoxSize(value: js.Array[ResizeObserverSize]): Self = StObject.set(x, "devicePixelContentBoxSize", value.asInstanceOf[js.Any])
    
    inline def setDevicePixelContentBoxSizeUndefined: Self = StObject.set(x, "devicePixelContentBoxSize", js.undefined)
    
    inline def setDevicePixelContentBoxSizeVarargs(value: ResizeObserverSize*): Self = StObject.set(x, "devicePixelContentBoxSize", js.Array(value :_*))
    
    inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
