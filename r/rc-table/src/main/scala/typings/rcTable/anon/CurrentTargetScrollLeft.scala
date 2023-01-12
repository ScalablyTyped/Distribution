package typings.rcTable.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentTargetScrollLeft extends StObject {
  
  var currentTarget: js.UndefOr[HTMLElement] = js.undefined
  
  var scrollLeft: js.UndefOr[Double] = js.undefined
}
object CurrentTargetScrollLeft {
  
  inline def apply(): CurrentTargetScrollLeft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentTargetScrollLeft]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurrentTargetScrollLeft] (val x: Self) extends AnyVal {
    
    inline def setCurrentTarget(value: HTMLElement): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
    
    inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
  }
}
