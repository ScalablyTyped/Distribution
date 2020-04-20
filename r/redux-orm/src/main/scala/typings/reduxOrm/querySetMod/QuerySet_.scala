package typings.reduxOrm.querySetMod

import typings.reduxOrm.databaseMod.QueryClause
import typings.reduxOrm.modelMod.AnyModel
import typings.reduxOrm.modelMod.ModelClass
import typings.reduxOrm.modelMod.Ref
import typings.reduxOrm.modelMod.SessionBoundModel
import typings.reduxOrm.querySetMod.QuerySet.QueryBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm/QuerySet", "QuerySet")
@js.native
class QuerySet_[M /* <: AnyModel */, InstanceProps /* <: js.Object */] protected () extends QueryBuilder[M, InstanceProps] {
  /**
    * Creates a `QuerySet`. The constructor is mainly for internal use;
    * Access QuerySet instances from {@link Model}.
    *
    * @param  modelClass - the {@link Model} class of objects in this QuerySet.
    * @param  clauses - query clauses needed to evaluate the set.
    * @param  [opts] - additional options
    */
  def this(modelClass: ModelClass[M], clauses: js.Array[QueryClause[js.Object]]) = this()
  def this(modelClass: ModelClass[M], clauses: js.Array[QueryClause[js.Object]], opts: js.Object) = this()
  /**
    * Checks if the {@link QuerySet} instance has any records matching the query
    * in the database.
    *
    * @return `true` if the {@link QuerySet} instance contains entities, else `false`.
    */
  def exists(): Boolean = js.native
  /**
    * Returns an array of {@link SessionBoundModel} instances represented by the QuerySet.
    *
    * @return session bound model instances represented by the QuerySet
    */
  def toModelArray(): js.Array[SessionBoundModel[M, InstanceProps]] = js.native
  /**
    * Returns an array of the plain objects represented by the QuerySet.
    * The plain objects are direct references to the store.
    *
    * @return references to the plain JS objects represented by the QuerySet
    */
  def toRefArray(): js.Array[Ref[M] with InstanceProps] = js.native
}

