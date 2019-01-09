package typings
package reduxDashOrmLib.reduxDashOrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm", "Session")
@js.native
class Session[State /* <: ORMCommonState */] protected () extends js.Object {
  def this(schema: ORM[State], db: DB, state: State, withMutations: scala.Boolean, batchToken: js.Any) = this()
  val accessedModels: js.Array[java.lang.String] = js.native
  var batchToken: js.Any = js.native
  var db: DB = js.native
  var initialState: State = js.native
  var models: js.Array[reduxDashOrmLib.Anon_Action] = js.native
  var schema: ORM[State] = js.native
  var sessionBoundModels: js.Array[reduxDashOrmLib.Anon_Action] = js.native
  var state: State = js.native
  var withMutations: scala.Boolean = js.native
  def applyUpdate(updateSpec: js.Any): js.Any = js.native
  def getDataForModel(modelName: java.lang.String): js.Object = js.native
  // TODO
  def markAccessed(modelName: java.lang.String): scala.Unit = js.native
   // TODO
  def query(querySpec: js.Any): js.Any = js.native
}

