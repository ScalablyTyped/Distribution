package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostMessageOptions extends StObject {
  
  var transfer: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object PostMessageOptions {
  
  @scala.inline
  def apply(): PostMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostMessageOptions]
  }
  
  @scala.inline
  implicit class PostMessageOptionsMutableBuilder[Self <: PostMessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransfer(value: js.Array[js.Any]): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
    
    @scala.inline
    def setTransferVarargs(value: js.Any*): Self = StObject.set(x, "transfer", js.Array(value :_*))
  }
}
