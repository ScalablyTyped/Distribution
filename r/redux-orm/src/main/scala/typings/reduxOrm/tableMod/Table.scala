package typings.reduxOrm.tableMod

import org.scalablytyped.runtime.Instantiable0
import typings.reduxOrm.modelMod.AnyModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm/db/Table", "Table")
@js.native
/**
  * Creates a new {@link Table} instance.
  *
  * @param   userOpts - options to use.
  * @param   [userOpts.idAttribute=DefaultTableOpts.idAttribute] - the id attribute of the entity.
  * @param   [userOpts.arrName=DefaultTableOpts.arrName] - the state attribute where an array of
  *                                             entity id's are stored
  * @param   [userOpts.mapName=DefaultTableOpts.mapName] - the state attribute where the entity objects
  *                                                 are stored in a id to entity object
  *                                                 map.
  * @param   [userOpts.fields=DefaultTableOpts.fields] - mapping of field key to {@link Field} object
  */
class Table[MClass /* <: Instantiable0[AnyModel] */] () extends js.Object {
  def this(userOpts: ModelTableOpts[MClass]) = this()
  def getEmptyState(): TableState[MClass] = js.native
}

