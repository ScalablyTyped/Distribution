package typings.storybookCsf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Groups extends StObject {
    
    var groups: js.Array[String]
    
    var root: String | Null
  }
  object Groups {
    
    inline def apply(groups: js.Array[String]): Groups = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], root = null)
      __obj.asInstanceOf[Groups]
    }
    
    extension [Self <: Groups](x: Self) {
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
    }
  }
}
