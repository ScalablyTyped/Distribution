package typings.store2

import typings.store2.mod.DeveloperTools
import typings.store2.mod.StoreBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait _empty extends StObject {
    
    @JSName("_")
    val _underscore: DeveloperTools
    
    var local: StoreBase
    
    var page: StoreBase
    
    var session: StoreBase
  }
  object _empty {
    
    inline def apply(_underscore: DeveloperTools, local: StoreBase, page: StoreBase, session: StoreBase): _empty = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[_empty]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
      
      inline def setLocal(value: StoreBase): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setPage(value: StoreBase): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setSession(value: StoreBase): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def set_underscore(value: DeveloperTools): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
    }
  }
}
