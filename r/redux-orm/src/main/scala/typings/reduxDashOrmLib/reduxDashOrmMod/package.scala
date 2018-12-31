package typings
package reduxDashOrmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashOrmMod {
  type ModelProps = js.Any
  type ModelWithFields[Fields, Additional, VirtualFields] = (Model[Fields, Additional, VirtualFields]) with Fields with VirtualFields with Additional with ORMId
  type ORMSelector[State /* <: ORMCommonState */, Result] = js.Function2[/* session */ SessionWithModels[State], /* repeated */ js.Any, Result]
  type QuerySetClauses = js.Any
  type QuerySetOpts = js.Any
  type SessionWithModels[State /* <: ORMCommonState */] = Session[State] with reduxDashOrmLib.reduxDashOrmLibStrings.SessionWithModels with js.Any
  type Updater[State /* <: ORMCommonState */] = js.Function2[/* session */ SessionWithModels[State], /* action */ js.Any, js.Any]
}
