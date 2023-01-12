package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sharing {
  
  @js.native
  sealed trait Role extends StObject
  @JSGlobal("SP.Sharing.Role")
  @js.native
  object Role extends StObject {
    
    @js.native
    sealed trait edit
      extends StObject
         with Role
    
    @js.native
    sealed trait none
      extends StObject
         with Role
    
    @js.native
    sealed trait owner
      extends StObject
         with Role
    
    @js.native
    sealed trait view
      extends StObject
         with Role
  }
  
  trait DocumentSharingManager extends StObject
  
  trait UserRoleAssignment
    extends StObject
       with ClientValueObject {
    
    def get_role(): Role
    
    def get_userId(): String
    
    def set_role(value: Role): Unit
    
    def set_userId(value: String): Unit
  }
  object UserRoleAssignment {
    
    inline def apply(
      customFromJson: Any => Boolean,
      customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
      fromJson: Any => Unit,
      get_role: () => Role,
      get_typeId: () => String,
      get_userId: () => String,
      set_role: Role => Unit,
      set_userId: String => Unit,
      writeToXml: (XmlWriter, SerializationContext) => Unit
    ): UserRoleAssignment = {
      val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_role = js.Any.fromFunction0(get_role), get_typeId = js.Any.fromFunction0(get_typeId), get_userId = js.Any.fromFunction0(get_userId), set_role = js.Any.fromFunction1(set_role), set_userId = js.Any.fromFunction1(set_userId), writeToXml = js.Any.fromFunction2(writeToXml))
      __obj.asInstanceOf[UserRoleAssignment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserRoleAssignment] (val x: Self) extends AnyVal {
      
      inline def setGet_role(value: () => Role): Self = StObject.set(x, "get_role", js.Any.fromFunction0(value))
      
      inline def setGet_userId(value: () => String): Self = StObject.set(x, "get_userId", js.Any.fromFunction0(value))
      
      inline def setSet_role(value: Role => Unit): Self = StObject.set(x, "set_role", js.Any.fromFunction1(value))
      
      inline def setSet_userId(value: String => Unit): Self = StObject.set(x, "set_userId", js.Any.fromFunction1(value))
    }
  }
  
  trait UserSharingResult
    extends StObject
       with ClientValueObject {
    
    def get_allowedRoles(): js.Array[Role]
    
    def get_currentRole(): Role
    
    def get_isUserKnown(): Boolean
    
    def get_message(): String
    
    def get_status(): Boolean
    
    def get_user(): String
  }
  object UserSharingResult {
    
    inline def apply(
      customFromJson: Any => Boolean,
      customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
      fromJson: Any => Unit,
      get_allowedRoles: () => js.Array[Role],
      get_currentRole: () => Role,
      get_isUserKnown: () => Boolean,
      get_message: () => String,
      get_status: () => Boolean,
      get_typeId: () => String,
      get_user: () => String,
      writeToXml: (XmlWriter, SerializationContext) => Unit
    ): UserSharingResult = {
      val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_allowedRoles = js.Any.fromFunction0(get_allowedRoles), get_currentRole = js.Any.fromFunction0(get_currentRole), get_isUserKnown = js.Any.fromFunction0(get_isUserKnown), get_message = js.Any.fromFunction0(get_message), get_status = js.Any.fromFunction0(get_status), get_typeId = js.Any.fromFunction0(get_typeId), get_user = js.Any.fromFunction0(get_user), writeToXml = js.Any.fromFunction2(writeToXml))
      __obj.asInstanceOf[UserSharingResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserSharingResult] (val x: Self) extends AnyVal {
      
      inline def setGet_allowedRoles(value: () => js.Array[Role]): Self = StObject.set(x, "get_allowedRoles", js.Any.fromFunction0(value))
      
      inline def setGet_currentRole(value: () => Role): Self = StObject.set(x, "get_currentRole", js.Any.fromFunction0(value))
      
      inline def setGet_isUserKnown(value: () => Boolean): Self = StObject.set(x, "get_isUserKnown", js.Any.fromFunction0(value))
      
      inline def setGet_message(value: () => String): Self = StObject.set(x, "get_message", js.Any.fromFunction0(value))
      
      inline def setGet_status(value: () => Boolean): Self = StObject.set(x, "get_status", js.Any.fromFunction0(value))
      
      inline def setGet_user(value: () => String): Self = StObject.set(x, "get_user", js.Any.fromFunction0(value))
    }
  }
}
