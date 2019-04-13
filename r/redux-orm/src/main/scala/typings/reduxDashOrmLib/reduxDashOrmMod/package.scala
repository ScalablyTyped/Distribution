package typings
package reduxDashOrmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashOrmMod {
  type ModelFields = org.scalablytyped.runtime.StringDictionary[Attribute | ForeignKey | ManyToMany | OneToOne]
  type ModelProps = js.Any
  type ModelVirtualFields = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ModelWithFields[Fields, Additional, VirtualFields] = (Model[Fields, Additional, VirtualFields]) with Fields with VirtualFields with Additional with ORMId
  type ORMCommonState = org.scalablytyped.runtime.StringDictionary[TableState[js.Any, js.Any]]
  type ORMSelector[State /* <: ORMCommonState */, Result] = js.Function2[/* session */ SessionWithModels[State], /* repeated */ js.Any, Result]
  type QuerySetClauses = js.Any
  type QuerySetOpts = js.Any
  type SessionWithModels[State /* <: ORMCommonState */] = Session[State] with reduxDashOrmLib.reduxDashOrmLibStrings.SessionWithModels with js.Any
  type Updater[State /* <: ORMCommonState */] = js.Function2[/* session */ SessionWithModels[State], /* action */ js.Any, js.Any]
}
