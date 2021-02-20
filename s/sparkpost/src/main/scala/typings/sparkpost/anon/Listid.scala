package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Listid extends StObject {
  
  var list_id: String = js.native
}
object Listid {
  
  @scala.inline
  def apply(list_id: String): Listid = {
    val __obj = js.Dynamic.literal(list_id = list_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listid]
  }
  
  @scala.inline
  implicit class ListidMutableBuilder[Self <: Listid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setList_id(value: String): Self = StObject.set(x, "list_id", value.asInstanceOf[js.Any])
  }
}
