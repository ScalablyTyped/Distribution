package typings.smartDashFoxDashServer.SFS2X.Entities

import typings.smartDashFoxDashServer.SFS2X.Entities.Variables.SFSUserVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Variables
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Variables.html
@JSGlobal("SFS2X.Entities.Variables")
@js.native
object Variables extends js.Object {
  @js.native
  class MMOItemVariable protected () extends SFSUserVariable {
    /**
      * Creates a new MMOItemVariable instance.
      * @param {string} name  The name of the MMOItem Variable.
      * @param {any}    value The value of the MMOItem Variable; valid data types are: Boolean, Number, String, Object, Array. The value can also be null.
      * @param {number} [type=-1]  The type id of the MMOItem Variable among those available in the VariableType class. Usually it is not necessary to pass this parameter, as the type is auto-detected from the value.
      */
    def this(name: String, value: js.Any) = this()
    def this(name: String, value: js.Any, `type`: Double) = this()
  }
  
  @js.native
  class ReservedBuddyVariables () extends js.Object
  
  @js.native
  class ReservedRoomVariables () extends js.Object
  
  @js.native
  class SFSBuddyVariable protected () extends SFSUserVariable {
    /**
      * Creates a new SFSBuddyVariable instance.
      * @param {string} name  The name of the Buddy Variable.
      * @param {any}    value The value of the Buddy Variable; valid data types are: Boolean, Number, String, Object, Array. The value can also be null.
      * @param {number} [type=-1]  The type id of the Buddy Variable among those available in the VariableType class. Usually it is not necessary to pass this parameter, as the type is auto-detected from the value.
      */
    def this(name: String, value: js.Any) = this()
    def this(name: String, value: js.Any, `type`: Double) = this()
    /**
      * Indicates whether the Buddy Variable is persistent or not.
      * @return {boolean} Returns: true if the Buddy Variable is persistent.
      */
    def isOffline(): Boolean = js.native
  }
  
  @js.native
  class SFSRoomVariable protected () extends SFSUserVariable {
    /**
      * Creates a new SFSRoomVariable instance.
      * @param {string} name  The name of the Room Variable.
      * @param {any}    value The value of the Room Variable; valid data types are: Boolean, Number, String, Object, Array. The value can also be null.
      * @param {number} [type=-1]  The type id of the Room Variable among those available in the VariableType class. Usually it is not necessary to pass this parameter, as the type is auto-detected from the value.
      */
    def this(name: String, value: js.Any) = this()
    def this(name: String, value: js.Any, `type`: Double) = this()
    /** @type {boolean} Indicates whether this Room Variable is persistent or not. */
    var isPersistent: Boolean = js.native
    /** @type {boolean} Indicates whether this Room Variable is private or not. */
    var isPrivate: Boolean = js.native
  }
  
  @js.native
  class SFSUserVariable protected () extends js.Object {
    /**
      * Creates a new SFSUserVariable instance.
      * @param {string} name  The name of the User Variable.
      * @param {any}    value The value of the User Variable; valid data types are: Boolean, Number, String, Object, Array. The value can also be null.
      * @param {number} [type=-1]  The type id of the User Variable among those available in the VariableType class. Usually it is not necessary to pass this parameter, as the type is auto-detected from the value.
      */
    def this(name: String, value: js.Any) = this()
    def this(name: String, value: js.Any, `type`: Double) = this()
    /** @type {string} Indicates the name of this variable. */
    var name: String = js.native
    /** @type {number} Returns the value of this variable. */
    var value: Double = js.native
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
  }
  
  @js.native
  class VariableType () extends js.Object
  
  /* static members */
  @js.native
  object ReservedBuddyVariables extends js.Object {
    /** @type {string} The Buddy Variable with this name stores the optional nickname of the user in a buddy list. This variable is persistent, which means that the nickname is preserved upon disconnection. */
    var BV_NICKNAME: String = js.native
    /** @type {string} The Buddy Variable with this name keeps track of the online/offline state of the user in a buddy list. This variable is persistent, which means that the online/offline state is preserved upon disconnection. */
    var BV_ONLINE: String = js.native
    /** @type {string} The Buddy Variable with this name stores the custom state of the user in a buddy list. This variable is persistent, which means that the custom state is preserved upon disconnection. */
    var BV_STATE: String = js.native
  }
  
  /* static members */
  @js.native
  object ReservedRoomVariables extends js.Object {
    /** @type {string} The Room Variable with this name keeps track of the state (started or stopped) of a game created with the CreateSFSGameRequest request. */
    var RV_GAME_STARTED: String = js.native
  }
  
  /* static members */
  @js.native
  object SFSBuddyVariable extends js.Object {
    /** @type {string} The prefix to be added to a Buddy Variable name to make it persistent. */
    var OFFLINE_PREFIX: String = js.native
  }
  
  /* static members */
  @js.native
  object VariableType extends js.Object {
    /** @type {number} The type of the User/Room Variable is array. */
    var ARRAY: Double = js.native
    /** @type {number} The type of the User/Room Variable is boolean. */
    var BOOL: Double = js.native
    /** @type {number} The type of the User/Room Variable is number (specifically a double). */
    var DOUBLE: Double = js.native
    /** @type {number} The type of the User/Room Variable is number (specifically an integer). */
    var INT: Double = js.native
    /** @type {number} The User/Room Variable is null. */
    var NULL: Double = js.native
    /** @type {number} The type of the User/Room Variable is object. */
    var OBJECT: Double = js.native
    /** @type {number} The type of the User/Room Variable is string. */
    var STRING: Double = js.native
  }
  
}

