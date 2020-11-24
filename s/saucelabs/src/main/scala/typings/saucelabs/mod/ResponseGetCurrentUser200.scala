package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseGetCurrentUser200
  extends /* key */ StringDictionary[js.Any] {
  
  var exp: js.UndefOr[Double] = js.native
  
  var iat: js.UndefOr[Double] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object ResponseGetCurrentUser200 {
  
  @scala.inline
  def apply(): ResponseGetCurrentUser200 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseGetCurrentUser200]
  }
  
  @scala.inline
  implicit class ResponseGetCurrentUser200Ops[Self <: ResponseGetCurrentUser200] (val x: Self) extends AnyVal {
    
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
    def setExp(value: Double): Self = this.set("exp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExp: Self = this.set("exp", js.undefined)
    
    @scala.inline
    def setIat(value: Double): Self = this.set("iat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIat: Self = this.set("iat", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
