package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extra extends StObject {
  
  var extra: Boolean = js.native
}
object Extra {
  
  @scala.inline
  def apply(extra: Boolean): Extra = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extra]
  }
  
  @scala.inline
  implicit class ExtraMutableBuilder[Self <: Extra] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtra(value: Boolean): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
  }
}
