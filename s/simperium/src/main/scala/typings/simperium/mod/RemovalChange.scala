package typings.simperium.mod

import typings.simperium.simperiumStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemovalChange
  extends Change[js.Any] {
  
  var ccid: String = js.native
  
  var id: String = js.native
  
  var o: `-_` = js.native
}
object RemovalChange {
  
  @scala.inline
  def apply(ccid: String, id: String, o: `-_`): RemovalChange = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovalChange]
  }
  
  @scala.inline
  implicit class RemovalChangeMutableBuilder[Self <: RemovalChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCcid(value: String): Self = StObject.set(x, "ccid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: `-_`): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
  }
}
