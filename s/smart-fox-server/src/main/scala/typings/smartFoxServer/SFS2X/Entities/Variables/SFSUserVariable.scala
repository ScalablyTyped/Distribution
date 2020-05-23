package typings.smartFoxServer.SFS2X.Entities.Variables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SFSUserVariable extends js.Object {
  /** @type {string} Indicates the name of this variable. */
  var name: String
  /** @type {number} Returns the value of this variable. */
  var value: Double
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
}

object SFSUserVariable {
  @scala.inline
  def apply(getTypeName: Double => String, isNull: () => Boolean, name: String, value: Double): SFSUserVariable = {
    val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction1(getTypeName), isNull = js.Any.fromFunction0(isNull), name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFSUserVariable]
  }
}

