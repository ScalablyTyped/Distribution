package typings.simonwepSelectionJs

import typings.simonwepSelectionJs.mod.Coordinates
import typings.simonwepSelectionJs.mod.Intersection
import typings.simonwepSelectionJs.mod.OverlapMode
import typings.simonwepSelectionJs.mod.Scrolling
import typings.simonwepSelectionJs.mod.SingleTap
import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@simonwep/selection-js.@simonwep/selection-js.SelectionOptions> */
  trait PartialSelectionOptions extends StObject {
    
    var allowTouch: js.UndefOr[Boolean] = js.undefined
    
    var boundaries: js.UndefOr[js.Array[String]] = js.undefined
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var container: js.UndefOr[String | HTMLElement | (js.Array[String | HTMLElement])] = js.undefined
    
    var document: js.UndefOr[Document] = js.undefined
    
    var intersect: js.UndefOr[Intersection] = js.undefined
    
    var overlap: js.UndefOr[OverlapMode] = js.undefined
    
    var scrolling: js.UndefOr[Scrolling] = js.undefined
    
    var selectables: js.UndefOr[js.Array[String]] = js.undefined
    
    var singleTap: js.UndefOr[SingleTap] = js.undefined
    
    var startThreshold: js.UndefOr[Double | Coordinates] = js.undefined
    
    var startareas: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PartialSelectionOptions {
    
    inline def apply(): PartialSelectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSelectionOptions]
    }
    
    extension [Self <: PartialSelectionOptions](x: Self) {
      
      inline def setAllowTouch(value: Boolean): Self = StObject.set(x, "allowTouch", value.asInstanceOf[js.Any])
      
      inline def setAllowTouchUndefined: Self = StObject.set(x, "allowTouch", js.undefined)
      
      inline def setBoundaries(value: js.Array[String]): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
      
      inline def setBoundariesUndefined: Self = StObject.set(x, "boundaries", js.undefined)
      
      inline def setBoundariesVarargs(value: String*): Self = StObject.set(x, "boundaries", js.Array(value*))
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setContainer(value: String | HTMLElement | (js.Array[String | HTMLElement])): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContainerVarargs(value: (String | HTMLElement)*): Self = StObject.set(x, "container", js.Array(value*))
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setIntersect(value: Intersection): Self = StObject.set(x, "intersect", value.asInstanceOf[js.Any])
      
      inline def setIntersectUndefined: Self = StObject.set(x, "intersect", js.undefined)
      
      inline def setOverlap(value: OverlapMode): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
      
      inline def setOverlapUndefined: Self = StObject.set(x, "overlap", js.undefined)
      
      inline def setScrolling(value: Scrolling): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      inline def setSelectables(value: js.Array[String]): Self = StObject.set(x, "selectables", value.asInstanceOf[js.Any])
      
      inline def setSelectablesUndefined: Self = StObject.set(x, "selectables", js.undefined)
      
      inline def setSelectablesVarargs(value: String*): Self = StObject.set(x, "selectables", js.Array(value*))
      
      inline def setSingleTap(value: SingleTap): Self = StObject.set(x, "singleTap", value.asInstanceOf[js.Any])
      
      inline def setSingleTapUndefined: Self = StObject.set(x, "singleTap", js.undefined)
      
      inline def setStartThreshold(value: Double | Coordinates): Self = StObject.set(x, "startThreshold", value.asInstanceOf[js.Any])
      
      inline def setStartThresholdUndefined: Self = StObject.set(x, "startThreshold", js.undefined)
      
      inline def setStartareas(value: js.Array[String]): Self = StObject.set(x, "startareas", value.asInstanceOf[js.Any])
      
      inline def setStartareasUndefined: Self = StObject.set(x, "startareas", js.undefined)
      
      inline def setStartareasVarargs(value: String*): Self = StObject.set(x, "startareas", js.Array(value*))
    }
  }
}
