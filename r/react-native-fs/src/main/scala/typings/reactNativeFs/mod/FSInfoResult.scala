package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FSInfoResult extends StObject {
  
  // The total amount of storage space on the device (in bytes).
  var freeSpace: Double = js.native
  
  var totalSpace: Double = js.native
}
object FSInfoResult {
  
  @scala.inline
  def apply(freeSpace: Double, totalSpace: Double): FSInfoResult = {
    val __obj = js.Dynamic.literal(freeSpace = freeSpace.asInstanceOf[js.Any], totalSpace = totalSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSInfoResult]
  }
  
  @scala.inline
  implicit class FSInfoResultMutableBuilder[Self <: FSInfoResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFreeSpace(value: Double): Self = StObject.set(x, "freeSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSpace(value: Double): Self = StObject.set(x, "totalSpace", value.asInstanceOf[js.Any])
  }
}
