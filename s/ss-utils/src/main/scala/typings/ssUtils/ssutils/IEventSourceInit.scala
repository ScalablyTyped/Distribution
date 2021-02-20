package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventSourceInit extends StObject {
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object IEventSourceInit {
  
  @scala.inline
  def apply(): IEventSourceInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventSourceInit]
  }
  
  @scala.inline
  implicit class IEventSourceInitMutableBuilder[Self <: IEventSourceInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
