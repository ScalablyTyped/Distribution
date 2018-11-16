package typings
package smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.VariablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.Variables.SFSBuddyVariable")
@js.native
class SFSBuddyVariable protected () extends SFSUserVariable {
  /**
                   * Creates a new SFSBuddyVariable instance.
                   * @param {string} name  The name of the Buddy Variable.
                   * @param {any}    value The value of the Buddy Variable; valid data types are: Boolean, Number, String, Object, Array. The value can also be null.
                   * @param {number} [type=-1]  The type id of the Buddy Variable among those available in the VariableType class. Usually it is not necessary to pass this parameter, as the type is auto-detected from the value.
                   */
  def this(name: java.lang.String, value: js.Any) = this()
  /**
                   * Creates a new SFSBuddyVariable instance.
                   * @param {string} name  The name of the Buddy Variable.
                   * @param {any}    value The value of the Buddy Variable; valid data types are: Boolean, Number, String, Object, Array. The value can also be null.
                   * @param {number} [type=-1]  The type id of the Buddy Variable among those available in the VariableType class. Usually it is not necessary to pass this parameter, as the type is auto-detected from the value.
                   */
  def this(name: java.lang.String, value: js.Any, `type`: scala.Double) = this()
  /**
                   * Indicates whether the Buddy Variable is persistent or not.
                   * @return {boolean} Returns: true if the Buddy Variable is persistent.
                   */
  def isOffline(): scala.Boolean = js.native
}

@JSGlobal("SFS2X.Entities.Variables.SFSBuddyVariable")
@js.native
object SFSBuddyVariable extends js.Object {
  /** @type {string} The prefix to be added to a Buddy Variable name to make it persistent. */
  var OFFLINE_PREFIX: java.lang.String = js.native
}

