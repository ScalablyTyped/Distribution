package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoiObject extends StObject {
  
  var isJoi: Boolean = js.native
}
object JoiObject {
  
  @scala.inline
  def apply(isJoi: Boolean): JoiObject = {
    val __obj = js.Dynamic.literal(isJoi = isJoi.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoiObject]
  }
  
  @scala.inline
  implicit class JoiObjectMutableBuilder[Self <: JoiObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsJoi(value: Boolean): Self = StObject.set(x, "isJoi", value.asInstanceOf[js.Any])
  }
}
