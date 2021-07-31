package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerResult extends StObject {
  
  var id: String
  
  var name: js.UndefOr[String] = js.undefined
  
  var proxy: Boolean
}
object ServerResult {
  
  @scala.inline
  def apply(id: String, proxy: Boolean): ServerResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerResult]
  }
  
  @scala.inline
  implicit class ServerResultMutableBuilder[Self <: ServerResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProxy(value: Boolean): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
  }
}
