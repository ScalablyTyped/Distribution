package typings
package reduxDashOrmLib.reduxDashOrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def attr(): reduxDashOrmLib.reduxDashOrmMod.Attribute = js.native
  def attr(opts: reduxDashOrmLib.reduxDashOrmMod.AttributeOpts): reduxDashOrmLib.reduxDashOrmMod.Attribute = js.native
  def createReducer[State /* <: reduxDashOrmLib.reduxDashOrmMod.ORMCommonState */](orm: reduxDashOrmLib.reduxDashOrmMod.ORM[State]): js.Function2[/* state */ State, /* action */ js.Any, State] = js.native
  def createReducer[State /* <: reduxDashOrmLib.reduxDashOrmMod.ORMCommonState */](
    orm: reduxDashOrmLib.reduxDashOrmMod.ORM[State],
    updater: reduxDashOrmLib.reduxDashOrmMod.Updater[State]
  ): js.Function2[/* state */ State, /* action */ js.Any, State] = js.native
  def createSelector[State /* <: reduxDashOrmLib.reduxDashOrmMod.ORMCommonState */](
    orm: reduxDashOrmLib.reduxDashOrmMod.ORM[State],
    args: (reduxDashOrmLib.reduxDashOrmMod.ORMSelector[State, _])*
  ): js.Function1[/* state */ State, _] = js.native
  def fk(opts: reduxDashOrmLib.reduxDashOrmMod.RelationalFieldOpts): reduxDashOrmLib.reduxDashOrmMod.ForeignKey = js.native
  def fk(toModelName: java.lang.String): reduxDashOrmLib.reduxDashOrmMod.ForeignKey = js.native
  def fk(toModelName: java.lang.String, relatedName: java.lang.String): reduxDashOrmLib.reduxDashOrmMod.ForeignKey = js.native
  def many(toModelName: java.lang.String): reduxDashOrmLib.reduxDashOrmMod.ManyToMany = js.native
  def many(toModelName: java.lang.String, relatedName: java.lang.String): reduxDashOrmLib.reduxDashOrmMod.ManyToMany = js.native
  def oneToOne(opts: reduxDashOrmLib.reduxDashOrmMod.RelationalFieldOpts): reduxDashOrmLib.reduxDashOrmMod.OneToOne = js.native
  def oneToOne(toModelName: java.lang.String): reduxDashOrmLib.reduxDashOrmMod.OneToOne = js.native
  def oneToOne(toModelName: java.lang.String, relatedName: java.lang.String): reduxDashOrmLib.reduxDashOrmMod.OneToOne = js.native
}

