package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiTestStatus
  extends /* key */ StringDictionary[js.Any] {
  
  var passed: js.UndefOr[Boolean] = js.native
}
object ApiTestStatus {
  
  @scala.inline
  def apply(): ApiTestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiTestStatus]
  }
  
  @scala.inline
  implicit class ApiTestStatusOps[Self <: ApiTestStatus] (val x: Self) extends AnyVal {
    
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
    def setPassed(value: Boolean): Self = this.set("passed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassed: Self = this.set("passed", js.undefined)
  }
}
