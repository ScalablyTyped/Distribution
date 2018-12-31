package typings
package smartDashFoxDashServerLib.SFS2XNs.EntitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.MMOItem")
@js.native
class MMOItem protected () extends js.Object {
  /**
    * Creates a new MMOItem instance.
    * @param {number} id The item id.
    */
  def this(id: scala.Double) = this()
  /** @type {Data.Vec3D} Returns the entry point of this item in the current user's AoI. */
  var aoiEnteryPoint: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.DataNs.Vec3D = js.native
  /** @type {number} Indicates the id of this item. */
  var id: scala.Double = js.native
  /**
    * Indicates whether this item has the specified MMOItem Variable set or not.
    * @param  {string}  varName The name of the MMOItem Variable whose existance must be checked.
    * @return {boolean}         Returns: true if an MMOItem Variable with the passed name is set for this item.
    */
  def containsVariable(varName: java.lang.String): scala.Boolean = js.native
  /**
    * Retrieves an MMOItem Variable from its name.
    * @param  {string}                    varName The name of the MMOItem Variable to be retrieved.
    * @return {Variables.MMOItemVariable}         The MMOItemVariable object, or null if no MMOItem Variable with the passed name is associated to this item.
    */
  def getVariable(varName: java.lang.String): smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.VariablesNs.MMOItemVariable = js.native
  /**
    * Retrieves all the MMOItem Variables of this item.
    * @return {Variables.MMOItemVariable[]} The list of MMOItemVariable objects associated to this item.
    */
  def getVariables(): js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.VariablesNs.MMOItemVariable] = js.native
}

