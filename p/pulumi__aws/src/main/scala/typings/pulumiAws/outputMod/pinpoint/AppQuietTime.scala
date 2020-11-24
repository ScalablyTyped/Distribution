package typings.pulumiAws.outputMod.pinpoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppQuietTime extends js.Object {
  
  /**
    * The default end time for quiet time in ISO 8601 format. Required if `start` is set
    */
  var end: js.UndefOr[String] = js.native
  
  /**
    * The default start time for quiet time in ISO 8601 format. Required if `end` is set
    */
  var start: js.UndefOr[String] = js.native
}
object AppQuietTime {
  
  @scala.inline
  def apply(): AppQuietTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppQuietTime]
  }
  
  @scala.inline
  implicit class AppQuietTimeOps[Self <: AppQuietTime] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
