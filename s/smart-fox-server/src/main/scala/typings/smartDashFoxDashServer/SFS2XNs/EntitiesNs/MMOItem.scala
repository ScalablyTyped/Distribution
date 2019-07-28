package typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.DataNs.Vec3D
import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.VariablesNs.MMOItemVariable
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
  def this(id: Double) = this()
  /** @type {Data.Vec3D} Returns the entry point of this item in the current user's AoI. */
  var aoiEnteryPoint: Vec3D = js.native
  /** @type {number} Indicates the id of this item. */
  var id: Double = js.native
  /**
    * Indicates whether this item has the specified MMOItem Variable set or not.
    * @param  {string}  varName The name of the MMOItem Variable whose existance must be checked.
    * @return {boolean}         Returns: true if an MMOItem Variable with the passed name is set for this item.
    */
  def containsVariable(varName: String): Boolean = js.native
  /**
    * Retrieves an MMOItem Variable from its name.
    * @param  {string}                    varName The name of the MMOItem Variable to be retrieved.
    * @return {Variables.MMOItemVariable}         The MMOItemVariable object, or null if no MMOItem Variable with the passed name is associated to this item.
    */
  def getVariable(varName: String): MMOItemVariable = js.native
  /**
    * Retrieves all the MMOItem Variables of this item.
    * @return {Variables.MMOItemVariable[]} The list of MMOItemVariable objects associated to this item.
    */
  def getVariables(): js.Array[MMOItemVariable] = js.native
}

