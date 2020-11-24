package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FSInfoResult extends js.Object {
  
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
  implicit class FSInfoResultOps[Self <: FSInfoResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFreeSpace(value: Double): Self = this.set("freeSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSpace(value: Double): Self = this.set("totalSpace", value.asInstanceOf[js.Any])
  }
}
