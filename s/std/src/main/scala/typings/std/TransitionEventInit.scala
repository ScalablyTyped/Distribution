package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionEventInit
  extends StObject
     with EventInit {
  
  var elapsedTime: js.UndefOr[Double] = js.undefined
  
  var propertyName: js.UndefOr[java.lang.String] = js.undefined
  
  var pseudoElement: js.UndefOr[java.lang.String] = js.undefined
}
object TransitionEventInit {
  
  @scala.inline
  def apply(): TransitionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionEventInit]
  }
  
  @scala.inline
  implicit class TransitionEventInitMutableBuilder[Self <: TransitionEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsedTimeUndefined: Self = StObject.set(x, "elapsedTime", js.undefined)
    
    @scala.inline
    def setPropertyName(value: java.lang.String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
    
    @scala.inline
    def setPseudoElement(value: java.lang.String): Self = StObject.set(x, "pseudoElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudoElementUndefined: Self = StObject.set(x, "pseudoElement", js.undefined)
  }
}
