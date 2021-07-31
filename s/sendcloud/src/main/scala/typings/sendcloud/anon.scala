package typings.sendcloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: String
    
    var created_at: String
    
    var description: String
    
    var members_count: Double
    
    var modify_at: String
    
    var name: String
  }
  object Address {
    
    @scala.inline
    def apply(
      address: String,
      created_at: String,
      description: String,
      members_count: Double,
      modify_at: String,
      name: String
    ): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], members_count = members_count.asInstanceOf[js.Any], modify_at = modify_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembers_count(value: Double): Self = StObject.set(x, "members_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModify_at(value: String): Self = StObject.set(x, "modify_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Createdat extends StObject {
    
    var address: String
    
    var created_at: String
    
    var description: String
    
    var members_count: Double
    
    var name: String
  }
  object Createdat {
    
    @scala.inline
    def apply(address: String, created_at: String, description: String, members_count: Double, name: String): Createdat = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], members_count = members_count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Createdat]
    }
    
    @scala.inline
    implicit class CreatedatMutableBuilder[Self <: Createdat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembers_count(value: Double): Self = StObject.set(x, "members_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description extends StObject {
    
    var address: String
    
    var description: String
    
    var members_count: Double
    
    var modify_at: String
    
    var name: String
  }
  object Description {
    
    @scala.inline
    def apply(address: String, description: String, members_count: Double, modify_at: String, name: String): Description = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], members_count = members_count.asInstanceOf[js.Any], modify_at = modify_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembers_count(value: Double): Self = StObject.set(x, "members_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModify_at(value: String): Self = StObject.set(x, "modify_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Modifyat extends StObject {
    
    var address: String
    
    var created_at: String
    
    var modify_at: String
    
    var name: String
    
    var subscribed: String
    
    var vars: js.Object
  }
  object Modifyat {
    
    @scala.inline
    def apply(
      address: String,
      created_at: String,
      modify_at: String,
      name: String,
      subscribed: String,
      vars: js.Object
    ): Modifyat = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], modify_at = modify_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modifyat]
    }
    
    @scala.inline
    implicit class ModifyatMutableBuilder[Self <: Modifyat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModify_at(value: String): Self = StObject.set(x, "modify_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribed(value: String): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVars(value: js.Object): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    }
  }
}
