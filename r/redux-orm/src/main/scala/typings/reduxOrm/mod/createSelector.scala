package typings.reduxOrm.mod

import typings.reduxOrm.ormMod.OrmState
import typings.reduxOrm.reduxMod.ORMSelector
import typings.reduxOrm.reduxMod.Selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-orm", "createSelector")
@js.native
object createSelector extends js.Object {
  
  def apply[I, R](
    orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String],
    ormSelector: ORMSelector[I, js.Array[js.Any], R]
  ): Selector[OrmState[I], R] = js.native
  def apply[S, I, R](
    orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    ormSelector: ORMSelector[I, js.Array[js.Any], R]
  ): Selector[S, R] = js.native
  def apply[S, I, R1, R](
    orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    ormSelector: ORMSelector[I, js.Array[R1], R]
  ): Selector[S, R] = js.native
  def apply[S, I, R1, R2, R](
    orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    ormSelector: ORMSelector[I, js.Tuple2[R1, R2], R]
  ): Selector[S, R] = js.native
  def apply[S, I, R1, R2, R3, R](
    orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    ormSelector: ORMSelector[I, js.Tuple3[R1, R2, R3], R]
  ): Selector[S, R] = js.native
  def apply[S, I, R1, R2, R3, R4, R](
    orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    ormSelector: ORMSelector[I, js.Tuple4[R1, R2, R3, R4], R]
  ): Selector[S, R] = js.native
  def apply[S, I, R1, R2, R3, R4, R5, R](
    orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    ormSelector: ORMSelector[I, js.Tuple5[R1, R2, R3, R4, R5], R]
  ): Selector[S, R] = js.native
  def apply[S, I, R1, R2, R3, R4, R5, R6, R](
    orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    ormSelector: ORMSelector[I, js.Tuple6[R1, R2, R3, R4, R5, R6], R]
  ): Selector[S, R] = js.native
}
