package typings.storybookCsf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Groups extends StObject {
    
    var groups: js.Array[String] = js.native
    
    var root: String | Null = js.native
  }
  object Groups {
    
    @scala.inline
    def apply(groups: js.Array[String]): Groups = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
      __obj.asInstanceOf[Groups]
    }
    
    @scala.inline
    implicit class GroupsMutableBuilder[Self <: Groups] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
    }
  }
}
