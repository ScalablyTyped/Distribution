package typings
package reduxDashOrmLib.reduxDashOrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm", "QuerySet")
@js.native
class QuerySet[Fields, Additional, VirtualFields] protected () extends js.Object {
  def this(modelClass: reduxDashOrmLib.Anon_Action, clauses: QuerySetClauses, opts: QuerySetOpts) = this()
  /* private */ def _evaluate(): scala.Unit = js.native
  /* private */ def _new(clauses: QuerySetClauses, userOpts: QuerySetOpts): QuerySet[Fields, Additional, VirtualFields] = js.native
  def all(): QuerySet[Fields, Additional, VirtualFields] = js.native
  def at(index: java.lang.String): js.UndefOr[ModelWithFields[Fields, Additional, VirtualFields]] = js.native
  def count(): scala.Double = js.native
  def delete(): scala.Unit = js.native
   // TODO
  def exclude(lookupObj: js.Object): QuerySet[Fields, Additional, VirtualFields] = js.native
  def exists(): scala.Boolean = js.native
  def filter(lookupObj: js.Object): QuerySet[Fields, Additional, VirtualFields] = js.native
  def first(): js.UndefOr[ModelWithFields[Fields, Additional, VirtualFields]] = js.native
  def last(): js.UndefOr[ModelWithFields[Fields, Additional, VirtualFields]] = js.native
   // TODO
  def orderBy(iteratees: js.Any, orders: js.Any): QuerySet[Fields, Additional, VirtualFields] = js.native
  def toModelArray(): js.Array[ModelWithFields[Fields, Additional, VirtualFields]] = js.native
  def toRefArray(): js.Array[Fields with Additional with ORMId] = js.native
   // TODO
  def update(mergeObj: stdLib.Partial[Fields with Additional]): scala.Unit = js.native
}

@JSImport("redux-orm", "QuerySet")
@js.native
object QuerySet extends js.Object {
  def addSharedMethod(methodName: java.lang.String): scala.Unit = js.native
}

