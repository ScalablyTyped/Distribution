package typings
package smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.VariablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.Variables.SFSUserVariable")
@js.native
class SFSUserVariable protected () extends js.Object {
  /**
                   * Creates a new SFSUserVariable instance.
                   * @param {string} name  The name of the User Variable.
                   * @param {any}    value The value of the User Variable; valid data types are: Boolean, Number, String, Object, Array. The value can also be null.
                   * @param {number} [type=-1]  The type id of the User Variable among those available in the VariableType class. Usually it is not necessary to pass this parameter, as the type is auto-detected from the value.
                   */
  def this(name: java.lang.String, value: js.Any) = this()
  /**
                   * Creates a new SFSUserVariable instance.
                   * @param {string} name  The name of the User Variable.
                   * @param {any}    value The value of the User Variable; valid data types are: Boolean, Number, String, Object, Array. The value can also be null.
                   * @param {number} [type=-1]  The type id of the User Variable among those available in the VariableType class. Usually it is not necessary to pass this parameter, as the type is auto-detected from the value.
                   */
  def this(name: java.lang.String, value: js.Any, `type`: scala.Double) = this()
  /** @type {string} Indicates the name of this variable. */
  var name: java.lang.String = js.native
  /** @type {number} Returns the value of this variable. */
  var value: scala.Double = js.native
  /**
                   * Indicates the type of this variable. Possibly returned strings are: Null, Bool, Int, Double, String, Object, Array.
                   * @param  {number} typeId The type id of the User Variable among those available in the VariableType class.
                   * @return {string}        Returns: The variable type name.
                   */
  def getTypeName(typeId: scala.Double): java.lang.String = js.native
  /**
                   * Indicates if the variable is null.
                   * @return {boolean} Returns: true if the variable has a null value.
                   */
  def isNull(): scala.Boolean = js.native
}

