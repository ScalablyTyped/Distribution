package typings.reactPaginate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Event extends StObject {
    
    var event: js.Object
    
    var index: Double | Null
    
    var isActive: Boolean
    
    var isBreak: Boolean
    
    var isNext: Boolean
    
    var isPrevious: Boolean
    
    var nextSelectedPage: js.UndefOr[Double] = js.undefined
    
    var selected: Double
  }
  object Event {
    
    inline def apply(
      event: js.Object,
      isActive: Boolean,
      isBreak: Boolean,
      isNext: Boolean,
      isPrevious: Boolean,
      selected: Double
    ): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isBreak = isBreak.asInstanceOf[js.Any], isNext = isNext.asInstanceOf[js.Any], isPrevious = isPrevious.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], index = null)
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setEvent(value: js.Object): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexNull: Self = StObject.set(x, "index", null)
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsBreak(value: Boolean): Self = StObject.set(x, "isBreak", value.asInstanceOf[js.Any])
      
      inline def setIsNext(value: Boolean): Self = StObject.set(x, "isNext", value.asInstanceOf[js.Any])
      
      inline def setIsPrevious(value: Boolean): Self = StObject.set(x, "isPrevious", value.asInstanceOf[js.Any])
      
      inline def setNextSelectedPage(value: Double): Self = StObject.set(x, "nextSelectedPage", value.asInstanceOf[js.Any])
      
      inline def setNextSelectedPageUndefined: Self = StObject.set(x, "nextSelectedPage", js.undefined)
      
      inline def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  trait Selected extends StObject {
    
    var selected: Double
  }
  object Selected {
    
    inline def apply(selected: Double): Selected = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selected]
    }
    
    extension [Self <: Selected](x: Self) {
      
      inline def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
