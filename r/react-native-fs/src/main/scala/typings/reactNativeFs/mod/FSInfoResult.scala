package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FSInfoResult extends StObject {
  
  // The total amount of storage space on the device (in bytes).
  var freeSpace: Double
  
  var totalSpace: Double
}
object FSInfoResult {
  
  inline def apply(freeSpace: Double, totalSpace: Double): FSInfoResult = {
    val __obj = js.Dynamic.literal(freeSpace = freeSpace.asInstanceOf[js.Any], totalSpace = totalSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSInfoResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FSInfoResult] (val x: Self) extends AnyVal {
    
    inline def setFreeSpace(value: Double): Self = StObject.set(x, "freeSpace", value.asInstanceOf[js.Any])
    
    inline def setTotalSpace(value: Double): Self = StObject.set(x, "totalSpace", value.asInstanceOf[js.Any])
  }
}
