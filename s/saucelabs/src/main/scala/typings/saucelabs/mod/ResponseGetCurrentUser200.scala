package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class ResponseGetCurrentUser200MutableBuilder[Self <: ResponseGetCurrentUser200] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
    
    @scala.inline
    def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
