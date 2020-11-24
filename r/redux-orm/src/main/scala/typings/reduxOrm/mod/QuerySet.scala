package typings.reduxOrm.mod

import typings.reduxOrm.databaseMod.QueryClause
import typings.reduxOrm.modelMod.AnyModel
import typings.reduxOrm.modelMod.ModelClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-orm", "QuerySet")
@js.native
class QuerySet[M /* <: AnyModel */, InstanceProps /* <: js.Object */] protected ()
  extends typings.reduxOrm.querySetMod.default[M, InstanceProps] {
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
}
@JSImport("redux-orm", "QuerySet")
@js.native
object QuerySet extends js.Object {
  
  /**
    * Register custom method on a `QuerySet` class specification.
    * QuerySet class may be attached to a {@link Model} class via {@link Model#querySetClass}
    *
    * @param methodName - name of a method to be available on specific QuerySet class instances
    *
    * @example:
    * class CustomQuerySet extends QuerySet<Book> {
    *     static currentYear = 2019
    *     unreleased(): QuerySet<Book> {
    *         return this.filter(book => book.releaseYear > CustomQuerySet.currentYear);
    *     }
    * }
    * CustomQuerySet.addSharedMethod('unreleased');
    * // assign specific QuerySet to a Model class
    * Book.querySetClass = typeof CustomQuerySet;
    * // register models
    * const schema = {Book };
    * const orm = new ORM<typeof schema>();
    * orm.register(Book);
    * const session = orm.session(orm.getEmptyState());
    * // use shared method
    * const unreleased = customQs.unreleased();
    */
  def addSharedMethod(methodName: String): Unit = js.native
}
