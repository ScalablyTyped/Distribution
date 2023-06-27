package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/UserActivation) */
trait UserActivation extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/UserActivation/hasBeenActive) */
  /* standard dom */
  val hasBeenActive: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/UserActivation/hasBeenActive) */
  /* standard dom */
  val isActive: scala.Boolean
}
object UserActivation {
  
  inline def apply(hasBeenActive: scala.Boolean, isActive: scala.Boolean): UserActivation = {
    val __obj = js.Dynamic.literal(hasBeenActive = hasBeenActive.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserActivation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserActivation] (val x: Self) extends AnyVal {
    
    inline def setHasBeenActive(value: scala.Boolean): Self = StObject.set(x, "hasBeenActive", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: scala.Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
  }
}
