package typings.ssh2SftpClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Group extends StObject {
    
    var group: String
    
    var other: String
    
    var user: String
  }
  object Group {
    
    @scala.inline
    def apply(group: String, other: String, user: String): Group = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    @scala.inline
    implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
