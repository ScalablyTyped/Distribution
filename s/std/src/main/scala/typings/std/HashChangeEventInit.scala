package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashChangeEventInit extends EventInit {
  
  var newURL: js.UndefOr[java.lang.String] = js.native
  
  var oldURL: js.UndefOr[java.lang.String] = js.native
}
object HashChangeEventInit {
  
  @scala.inline
  def apply(): HashChangeEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashChangeEventInit]
  }
  
  @scala.inline
  implicit class HashChangeEventInitMutableBuilder[Self <: HashChangeEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewURL(value: java.lang.String): Self = StObject.set(x, "newURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewURLUndefined: Self = StObject.set(x, "newURL", js.undefined)
    
    @scala.inline
    def setOldURL(value: java.lang.String): Self = StObject.set(x, "oldURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldURLUndefined: Self = StObject.set(x, "oldURL", js.undefined)
  }
}
