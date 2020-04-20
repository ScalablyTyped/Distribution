package typings.reduxOrm.querySetMod.QuerySet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm/QuerySet", "QuerySet.addSharedMethod")
@js.native
object addSharedMethod extends js.Object {
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
  def apply(methodName: String): Unit = js.native
}

