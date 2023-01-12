package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var `1`: String
  
  var `2`: String
  
  var `4`: String
  
  var `8`: String
}
object `2` {
  
  inline def apply(`1`: String, `2`: String, `4`: String, `8`: String): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def set4(value: String): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
    
    inline def set8(value: String): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
  }
}
