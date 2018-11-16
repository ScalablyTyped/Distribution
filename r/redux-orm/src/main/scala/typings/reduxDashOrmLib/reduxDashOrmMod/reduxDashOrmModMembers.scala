package typings
package reduxDashOrmLib.reduxDashOrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm", JSImport.Namespace)
@js.native
object reduxDashOrmModMembers extends js.Object {
  def attr(): Attribute = js.native
  def attr(opts: AttributeOpts): Attribute = js.native
  def createReducer[State /* <: ORMCommonState */](orm: ORM[State]): js.Function2[/* state */ State, /* action */ js.Any, State] = js.native
  def createReducer[State /* <: ORMCommonState */](orm: ORM[State], updater: Updater[State]): js.Function2[/* state */ State, /* action */ js.Any, State] = js.native
  def createSelector[State /* <: ORMCommonState */](orm: ORM[State], args: (ORMSelector[State, _])*): js.Function1[/* state */ State, _] = js.native
  def fk(opts: RelationalFieldOpts): ForeignKey = js.native
  def fk(toModelName: java.lang.String): ForeignKey = js.native
  def fk(toModelName: java.lang.String, relatedName: java.lang.String): ForeignKey = js.native
  def many(toModelName: java.lang.String): ManyToMany = js.native
  def many(toModelName: java.lang.String, relatedName: java.lang.String): ManyToMany = js.native
  def oneToOne(opts: RelationalFieldOpts): OneToOne = js.native
  def oneToOne(toModelName: java.lang.String): OneToOne = js.native
  def oneToOne(toModelName: java.lang.String, relatedName: java.lang.String): OneToOne = js.native
}

