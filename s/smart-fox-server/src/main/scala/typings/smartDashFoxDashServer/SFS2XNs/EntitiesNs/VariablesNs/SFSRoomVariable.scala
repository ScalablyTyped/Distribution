package typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.VariablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.Variables.SFSRoomVariable")
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

