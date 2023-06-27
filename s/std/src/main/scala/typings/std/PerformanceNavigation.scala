package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`255`
import typings.std.stdInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The legacy PerformanceNavigation interface represents information about how the navigation to the current document was done.
  * @deprecated This interface is deprecated in the Navigation Timing Level 2 specification. Please use the PerformanceNavigationTiming interface instead.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigation)
  */
trait PerformanceNavigation extends StObject {
  
  /* standard dom */
  val TYPE_BACK_FORWARD: `2`
  
  /* standard dom */
  val TYPE_NAVIGATE: `0`
  
  /* standard dom */
  val TYPE_RELOAD: `1`
  
  /* standard dom */
  val TYPE_RESERVED: `255`
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigation/redirectCount)
    */
  /* standard dom */
  val redirectCount: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigation/toJSON)
    */
  /* standard dom */
  def toJSON(): Any
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigation/type)
    */
  /* standard dom */
  val `type`: Double
}
object PerformanceNavigation {
  
  inline def apply(redirectCount: Double, toJSON: () => Any, `type`: Double): PerformanceNavigation = {
    val __obj = js.Dynamic.literal(TYPE_BACK_FORWARD = 2, TYPE_NAVIGATE = 0, TYPE_RELOAD = 1, TYPE_RESERVED = 255, redirectCount = redirectCount.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceNavigation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceNavigation] (val x: Self) extends AnyVal {
    
    inline def setRedirectCount(value: Double): Self = StObject.set(x, "redirectCount", value.asInstanceOf[js.Any])
    
    inline def setTYPE_BACK_FORWARD(value: `2`): Self = StObject.set(x, "TYPE_BACK_FORWARD", value.asInstanceOf[js.Any])
    
    inline def setTYPE_NAVIGATE(value: `0`): Self = StObject.set(x, "TYPE_NAVIGATE", value.asInstanceOf[js.Any])
    
    inline def setTYPE_RELOAD(value: `1`): Self = StObject.set(x, "TYPE_RELOAD", value.asInstanceOf[js.Any])
    
    inline def setTYPE_RESERVED(value: `255`): Self = StObject.set(x, "TYPE_RESERVED", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
