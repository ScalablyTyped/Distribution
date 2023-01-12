package typings.smartFoxServer.SFS2X.Entities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Variables
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Variables.html
object Variables {
  
  trait MMOItemVariable
    extends StObject
       with SFSUserVariable
  object MMOItemVariable {
    
    inline def apply(getTypeName: Double => String, isNull: () => Boolean, name: String, value: Double): MMOItemVariable = {
      val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction1(getTypeName), isNull = js.Any.fromFunction0(isNull), name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MMOItemVariable]
    }
  }
  
  trait ReservedBuddyVariables extends StObject
  
  trait ReservedRoomVariables extends StObject
  
  trait SFSBuddyVariable
    extends StObject
       with SFSUserVariable {
    
    /**
      * Indicates whether the Buddy Variable is persistent or not.
      * @return {boolean} Returns: true if the Buddy Variable is persistent.
      */
    def isOffline(): Boolean
  }
  object SFSBuddyVariable {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: SFSBuddyVariable] (val x: Self) extends AnyVal {
      
      inline def setIsOffline(value: () => Boolean): Self = StObject.set(x, "isOffline", js.Any.fromFunction0(value))
    }
  }
  
  trait SFSRoomVariable
    extends StObject
       with SFSUserVariable {
    
    /** @type {boolean} Indicates whether this Room Variable is persistent or not. */
    var isPersistent: Boolean
    
    /** @type {boolean} Indicates whether this Room Variable is private or not. */
    var isPrivate: Boolean
  }
  object SFSRoomVariable {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: SFSRoomVariable] (val x: Self) extends AnyVal {
      
      inline def setIsPersistent(value: Boolean): Self = StObject.set(x, "isPersistent", value.asInstanceOf[js.Any])
      
      inline def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
    }
  }
  
  trait SFSUserVariable extends StObject {
    
    /**
      * Indicates the type of this variable. Possibly returned strings are: Null, Bool, Int, Double, String, Object, Array.
      * @param  {number} typeId The type id of the User Variable among those available in the VariableType class.
      * @return {string}        Returns: The variable type name.
      */
    def getTypeName(typeId: Double): String
    
    /**
      * Indicates if the variable is null.
      * @return {boolean} Returns: true if the variable has a null value.
      */
    def isNull(): Boolean
    
    /** @type {string} Indicates the name of this variable. */
    var name: String
    
    /** @type {number} Returns the value of this variable. */
    var value: Double
  }
  object SFSUserVariable {
    
    inline def apply(getTypeName: Double => String, isNull: () => Boolean, name: String, value: Double): SFSUserVariable = {
      val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction1(getTypeName), isNull = js.Any.fromFunction0(isNull), name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFSUserVariable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SFSUserVariable] (val x: Self) extends AnyVal {
      
      inline def setGetTypeName(value: Double => String): Self = StObject.set(x, "getTypeName", js.Any.fromFunction1(value))
      
      inline def setIsNull(value: () => Boolean): Self = StObject.set(x, "isNull", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait VariableType extends StObject
}
