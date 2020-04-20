package typings.reduxOrm.querySetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object QuerySet {
  /**
    * Lookup clause as predicate accepting plain object Model representation stored in the database.
    * {@see QuerySet.exclude}
    * {@see QuerySet.filter}
    */
  type LookupPredicate[M /* <: typings.reduxOrm.modelMod.default[org.scalablytyped.runtime.Instantiable0[typings.reduxOrm.modelMod.AnyModel], _] */] = js.Function1[/* row */ typings.reduxOrm.modelMod.Ref[M], scala.Boolean]
  /**
    * Lookup clause as an object specifying props to match with plain object Model representation stored in the database.
    * {@see QuerySet.exclude}
    * {@see QuerySet.filter}
    */
  type LookupProps[M /* <: typings.reduxOrm.modelMod.default[org.scalablytyped.runtime.Instantiable0[typings.reduxOrm.modelMod.AnyModel], _] */] = typings.std.Partial[typings.reduxOrm.modelMod.Ref[M]] with (typings.std.Record[java.lang.String, typings.reduxOrm.modelMod.Serializable])
  /**
    * A union of lookup clauses.
    * {@see QuerySet.exclude}
    * {@see QuerySet.filter}
    */
  type LookupSpec[M /* <: typings.reduxOrm.modelMod.default[org.scalablytyped.runtime.Instantiable0[typings.reduxOrm.modelMod.AnyModel], _] */] = typings.reduxOrm.querySetMod.QuerySet.LookupProps[M] | typings.reduxOrm.querySetMod.QuerySet.LookupPredicate[M]
  /**
    * Ordering clause.
    *
    * Either a key of SessionBoundModel or a evaluator function accepting plain object Model representation stored in the database.
    *
    * {@see QuerySet.orderBy}
    */
  type SortIteratee[M /* <: typings.reduxOrm.modelMod.default[org.scalablytyped.runtime.Instantiable0[typings.reduxOrm.modelMod.AnyModel], _] */] = (/* keyof redux-orm.redux-orm/Model.Ref<M> */ java.lang.String) | (js.Function1[/* row */ typings.reduxOrm.modelMod.Ref[M], js.Any])
}
