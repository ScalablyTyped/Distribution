package typings.reactNativeDraggableFlatlist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnActiveAnim extends StObject {
  
  var isActive: Boolean
  
  var onActiveAnim: ReadonlySharedValue01
}
object OnActiveAnim {
  
  inline def apply(isActive: Boolean, onActiveAnim: ReadonlySharedValue01): OnActiveAnim = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], onActiveAnim = onActiveAnim.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnActiveAnim]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnActiveAnim] (val x: Self) extends AnyVal {
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setOnActiveAnim(value: ReadonlySharedValue01): Self = StObject.set(x, "onActiveAnim", value.asInstanceOf[js.Any])
  }
}
