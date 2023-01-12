package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The legacy PerformanceNavigation interface represents information about how the navigation to the current document was done.
  * @deprecated This interface is deprecated in the Navigation Timing Level 2 specification. Please use the PerformanceNavigationTiming interface instead.
  */
trait PerformanceNavigation extends StObject {
  
  /* standard dom */
  val TYPE_BACK_FORWARD: Double
  
  /* standard dom */
  val TYPE_NAVIGATE: Double
  
  /* standard dom */
  val TYPE_RELOAD: Double
  
  /* standard dom */
  val TYPE_RESERVED: Double
  
  /** @deprecated */
  /* standard dom */
  val redirectCount: Double
  
  /** @deprecated */
  /* standard dom */
  def toJSON(): Any
  
  /** @deprecated */
  /* standard dom */
  val `type`: Double
}
object PerformanceNavigation {
  
  inline def apply(
    TYPE_BACK_FORWARD: Double,
    TYPE_NAVIGATE: Double,
    TYPE_RELOAD: Double,
    TYPE_RESERVED: Double,
    redirectCount: Double,
    toJSON: () => Any,
    `type`: Double
  ): PerformanceNavigation = {
    val __obj = js.Dynamic.literal(TYPE_BACK_FORWARD = TYPE_BACK_FORWARD.asInstanceOf[js.Any], TYPE_NAVIGATE = TYPE_NAVIGATE.asInstanceOf[js.Any], TYPE_RELOAD = TYPE_RELOAD.asInstanceOf[js.Any], TYPE_RESERVED = TYPE_RESERVED.asInstanceOf[js.Any], redirectCount = redirectCount.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceNavigation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceNavigation] (val x: Self) extends AnyVal {
    
    inline def setRedirectCount(value: Double): Self = StObject.set(x, "redirectCount", value.asInstanceOf[js.Any])
    
    inline def setTYPE_BACK_FORWARD(value: Double): Self = StObject.set(x, "TYPE_BACK_FORWARD", value.asInstanceOf[js.Any])
    
    inline def setTYPE_NAVIGATE(value: Double): Self = StObject.set(x, "TYPE_NAVIGATE", value.asInstanceOf[js.Any])
    
    inline def setTYPE_RELOAD(value: Double): Self = StObject.set(x, "TYPE_RELOAD", value.asInstanceOf[js.Any])
    
    inline def setTYPE_RESERVED(value: Double): Self = StObject.set(x, "TYPE_RESERVED", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
