package typings.requestidlecallback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdleRequestOptions extends StObject {
  
  var timeout: Double = js.native
}
object IdleRequestOptions {
  
  @scala.inline
  def apply(timeout: Double): IdleRequestOptions = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleRequestOptions]
  }
  
  @scala.inline
  implicit class IdleRequestOptionsMutableBuilder[Self <: IdleRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
