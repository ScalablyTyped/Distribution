package typings.smartFoxServer.SFS2X.Entities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Variables
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Variables.html
object Variables {
  
  @js.native
  trait MMOItemVariable extends SFSUserVariable
  object MMOItemVariable {
    
    @scala.inline
    def apply(getTypeName: Double => String, isNull: () => Boolean, name: String, value: Double): MMOItemVariable = {
      val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction1(getTypeName), isNull = js.Any.fromFunction0(isNull), name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MMOItemVariable]
    }
  }
  
  @js.native
  trait ReservedBuddyVariables extends StObject
  
  @js.native
  trait ReservedRoomVariables extends StObject
  
  @js.native
  trait SFSBuddyVariable extends SFSUserVariable {
    
    /**
      * Indicates whether the Buddy Variable is persistent or not.
      * @return {boolean} Returns: true if the Buddy Variable is persistent.
      */
    def isOffline(): Boolean = js.native
  }
  object SFSBuddyVariable {
    
    @scala.inline
    def apply(
      getTypeName: Double => String,
      isNull: () => Boolean,
      isOffline: () => Boolean,
      name: String,
      value: Double
    ): SFSBuddyVariable = {
      val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction1(getTypeName), isNull = js.Any.fromFunction0(isNull), isOffline = js.Any.fromFunction0(isOffline), name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFSBuddyVariable]
    }
    
    @scala.inline
    implicit class SFSBuddyVariableMutableBuilder[Self <: SFSBuddyVariable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsOffline(value: () => Boolean): Self = StObject.set(x, "isOffline", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait SFSRoomVariable extends SFSUserVariable {
    
    /** @type {boolean} Indicates whether this Room Variable is persistent or not. */
    var isPersistent: Boolean = js.native
    
    /** @type {boolean} Indicates whether this Room Variable is private or not. */
    var isPrivate: Boolean = js.native
  }
  object SFSRoomVariable {
    
    @scala.inline
    def apply(
      getTypeName: Double => String,
      isNull: () => Boolean,
      isPersistent: Boolean,
      isPrivate: Boolean,
      name: String,
      value: Double
    ): SFSRoomVariable = {
      val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction1(getTypeName), isNull = js.Any.fromFunction0(isNull), isPersistent = isPersistent.asInstanceOf[js.Any], isPrivate = isPrivate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFSRoomVariable]
    }
    
    @scala.inline
    implicit class SFSRoomVariableMutableBuilder[Self <: SFSRoomVariable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsPersistent(value: Boolean): Self = StObject.set(x, "isPersistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SFSUserVariable extends StObject {
    
    /**
      * Indicates the type of this variable. Possibly returned strings are: Null, Bool, Int, Double, String, Object, Array.
      * @param  {number} typeId The type id of the User Variable among those available in the VariableType class.
      * @return {string}        Returns: The variable type name.
      */
    def getTypeName(typeId: Double): String = js.native
    
    /**
      * Indicates if the variable is null.
      * @return {boolean} Returns: true if the variable has a null value.
      */
    def isNull(): Boolean = js.native
    
    /** @type {string} Indicates the name of this variable. */
    var name: String = js.native
    
    /** @type {number} Returns the value of this variable. */
    var value: Double = js.native
  }
  object SFSUserVariable {
    
    @scala.inline
    def apply(getTypeName: Double => String, isNull: () => Boolean, name: String, value: Double): SFSUserVariable = {
      val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction1(getTypeName), isNull = js.Any.fromFunction0(isNull), name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFSUserVariable]
    }
    
    @scala.inline
    implicit class SFSUserVariableMutableBuilder[Self <: SFSUserVariable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetTypeName(value: Double => String): Self = StObject.set(x, "getTypeName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsNull(value: () => Boolean): Self = StObject.set(x, "isNull", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VariableType extends StObject
}
