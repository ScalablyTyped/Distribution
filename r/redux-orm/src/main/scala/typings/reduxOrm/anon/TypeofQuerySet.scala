package typings.reduxOrm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofQuerySet extends js.Object {
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

object TypeofQuerySet {
  @scala.inline
  def apply(addSharedMethod: String => Unit): TypeofQuerySet = {
    val __obj = js.Dynamic.literal(addSharedMethod = js.Any.fromFunction1(addSharedMethod))
    __obj.asInstanceOf[TypeofQuerySet]
  }
  @scala.inline
  implicit class TypeofQuerySetOps[Self <: TypeofQuerySet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddSharedMethod(value: String => Unit): Self = this.set("addSharedMethod", js.Any.fromFunction1(value))
  }
  
}

