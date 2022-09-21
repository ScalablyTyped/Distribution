package typings.simonwepSelectionJs.mod

import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionOptions extends StObject {
  
  var allowTouch: Boolean
  
  var boundaries: js.Array[String]
  
  var `class`: String
  
  var container: String | HTMLElement | (js.Array[String | HTMLElement])
  
  var document: Document
  
  var intersect: Intersection
  
  var overlap: OverlapMode
  
  var scrolling: Scrolling
  
  var selectables: js.Array[String]
  
  var singleTap: SingleTap
  
  var startThreshold: Double | Coordinates
  
  var startareas: js.Array[String]
}
object SelectionOptions {
  
  inline def apply(
    allowTouch: Boolean,
    boundaries: js.Array[String],
    `class`: String,
    container: String | HTMLElement | (js.Array[String | HTMLElement]),
    document: Document,
    intersect: Intersection,
    overlap: OverlapMode,
    scrolling: Scrolling,
    selectables: js.Array[String],
    singleTap: SingleTap,
    startThreshold: Double | Coordinates,
    startareas: js.Array[String]
  ): SelectionOptions = {
    val __obj = js.Dynamic.literal(allowTouch = allowTouch.asInstanceOf[js.Any], boundaries = boundaries.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], intersect = intersect.asInstanceOf[js.Any], overlap = overlap.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], selectables = selectables.asInstanceOf[js.Any], singleTap = singleTap.asInstanceOf[js.Any], startThreshold = startThreshold.asInstanceOf[js.Any], startareas = startareas.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionOptions]
  }
  
  extension [Self <: SelectionOptions](x: Self) {
    
    inline def setAllowTouch(value: Boolean): Self = StObject.set(x, "allowTouch", value.asInstanceOf[js.Any])
    
    inline def setBoundaries(value: js.Array[String]): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
    
    inline def setBoundariesVarargs(value: String*): Self = StObject.set(x, "boundaries", js.Array(value*))
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: String | HTMLElement | (js.Array[String | HTMLElement])): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerVarargs(value: (String | HTMLElement)*): Self = StObject.set(x, "container", js.Array(value*))
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setIntersect(value: Intersection): Self = StObject.set(x, "intersect", value.asInstanceOf[js.Any])
    
    inline def setOverlap(value: OverlapMode): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
    
    inline def setScrolling(value: Scrolling): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setSelectables(value: js.Array[String]): Self = StObject.set(x, "selectables", value.asInstanceOf[js.Any])
    
    inline def setSelectablesVarargs(value: String*): Self = StObject.set(x, "selectables", js.Array(value*))
    
    inline def setSingleTap(value: SingleTap): Self = StObject.set(x, "singleTap", value.asInstanceOf[js.Any])
    
    inline def setStartThreshold(value: Double | Coordinates): Self = StObject.set(x, "startThreshold", value.asInstanceOf[js.Any])
    
    inline def setStartareas(value: js.Array[String]): Self = StObject.set(x, "startareas", value.asInstanceOf[js.Any])
    
    inline def setStartareasVarargs(value: String*): Self = StObject.set(x, "startareas", js.Array(value*))
  }
}
