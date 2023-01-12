package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var elapsedTime: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var propertyName: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var pseudoElement: js.UndefOr[java.lang.String] = js.undefined
}
object TransitionEventInit {
  
  inline def apply(): TransitionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionEventInit] (val x: Self) extends AnyVal {
    
    inline def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    inline def setElapsedTimeUndefined: Self = StObject.set(x, "elapsedTime", js.undefined)
    
    inline def setPropertyName(value: java.lang.String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
    
    inline def setPseudoElement(value: java.lang.String): Self = StObject.set(x, "pseudoElement", value.asInstanceOf[js.Any])
    
    inline def setPseudoElementUndefined: Self = StObject.set(x, "pseudoElement", js.undefined)
  }
}
