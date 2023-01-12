package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Critical extends StObject {
  
  def critical(text: String): String
  
  def high(text: String): String
  
  def low(text: String): String
  
  def medium(text: String): String
}
object Critical {
  
  inline def apply(
    critical: String => String,
    high: String => String,
    low: String => String,
    medium: String => String
  ): Critical = {
    val __obj = js.Dynamic.literal(critical = js.Any.fromFunction1(critical), high = js.Any.fromFunction1(high), low = js.Any.fromFunction1(low), medium = js.Any.fromFunction1(medium))
    __obj.asInstanceOf[Critical]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Critical] (val x: Self) extends AnyVal {
    
    inline def setCritical(value: String => String): Self = StObject.set(x, "critical", js.Any.fromFunction1(value))
    
    inline def setHigh(value: String => String): Self = StObject.set(x, "high", js.Any.fromFunction1(value))
    
    inline def setLow(value: String => String): Self = StObject.set(x, "low", js.Any.fromFunction1(value))
    
    inline def setMedium(value: String => String): Self = StObject.set(x, "medium", js.Any.fromFunction1(value))
  }
}
