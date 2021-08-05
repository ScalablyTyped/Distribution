package typings.sharepoint.anon

import typings.sharepoint.SP.JsGrid.IStyleType.Splitter
import typings.sharepoint.SP.JsGrid.IStyleType.SplitterHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dra extends StObject {
  
  var dra: Splitter
  
  var dragHandle: SplitterHandle
  
  var hover: Splitter
  
  var hoverHandle: SplitterHandle
  
  var normal: Splitter
  
  var normalHandle: SplitterHandle
}
object Dra {
  
  inline def apply(
    dra: Splitter,
    dragHandle: SplitterHandle,
    hover: Splitter,
    hoverHandle: SplitterHandle,
    normal: Splitter,
    normalHandle: SplitterHandle
  ): Dra = {
    val __obj = js.Dynamic.literal(dra = dra.asInstanceOf[js.Any], dragHandle = dragHandle.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], hoverHandle = hoverHandle.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalHandle = normalHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dra]
  }
  
  extension [Self <: Dra](x: Self) {
    
    inline def setDra(value: Splitter): Self = StObject.set(x, "dra", value.asInstanceOf[js.Any])
    
    inline def setDragHandle(value: SplitterHandle): Self = StObject.set(x, "dragHandle", value.asInstanceOf[js.Any])
    
    inline def setHover(value: Splitter): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverHandle(value: SplitterHandle): Self = StObject.set(x, "hoverHandle", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: Splitter): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalHandle(value: SplitterHandle): Self = StObject.set(x, "normalHandle", value.asInstanceOf[js.Any])
  }
}
