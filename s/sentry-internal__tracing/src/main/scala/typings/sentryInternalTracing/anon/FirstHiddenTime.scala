package typings.sentryInternalTracing.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstHiddenTime extends StObject {
  
  val firstHiddenTime: Double
}
object FirstHiddenTime {
  
  inline def apply(firstHiddenTime: Double): FirstHiddenTime = {
    val __obj = js.Dynamic.literal(firstHiddenTime = firstHiddenTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstHiddenTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstHiddenTime] (val x: Self) extends AnyVal {
    
    inline def setFirstHiddenTime(value: Double): Self = StObject.set(x, "firstHiddenTime", value.asInstanceOf[js.Any])
  }
}
