package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseGetUserMinutes200
  extends /* key */ StringDictionary[js.Any] {
  
  var automated: js.UndefOr[String] = js.native
  
  var manual: js.UndefOr[String] = js.native
}
object ResponseGetUserMinutes200 {
  
  @scala.inline
  def apply(): ResponseGetUserMinutes200 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseGetUserMinutes200]
  }
  
  @scala.inline
  implicit class ResponseGetUserMinutes200Ops[Self <: ResponseGetUserMinutes200] (val x: Self) extends AnyVal {
    
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
    def setAutomated(value: String): Self = this.set("automated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomated: Self = this.set("automated", js.undefined)
    
    @scala.inline
    def setManual(value: String): Self = this.set("manual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManual: Self = this.set("manual", js.undefined)
  }
}
