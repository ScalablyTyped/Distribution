package typings.reactNativePermissions.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationAccuracyOptions extends js.Object {
  
  var purposeKey: String = js.native
}
object LocationAccuracyOptions {
  
  @scala.inline
  def apply(purposeKey: String): LocationAccuracyOptions = {
    val __obj = js.Dynamic.literal(purposeKey = purposeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationAccuracyOptions]
  }
  
  @scala.inline
  implicit class LocationAccuracyOptionsOps[Self <: LocationAccuracyOptions] (val x: Self) extends AnyVal {
    
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
    def setPurposeKey(value: String): Self = this.set("purposeKey", value.asInstanceOf[js.Any])
  }
}
