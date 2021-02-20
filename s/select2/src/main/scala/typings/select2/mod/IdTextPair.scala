package typings.select2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdTextPair extends StObject {
  
  var element: js.UndefOr[scala.Nothing] = js.native
  
  var id: String = js.native
  
  var loading: js.UndefOr[scala.Nothing] = js.native
  
  var text: String = js.native
}
object IdTextPair {
  
  @scala.inline
  def apply(id: String, text: String): IdTextPair = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdTextPair]
  }
  
  @scala.inline
  implicit class IdTextPairMutableBuilder[Self <: IdTextPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
