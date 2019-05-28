package typings
package reduxDashOrmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassModel
  extends org.scalablytyped.runtime.Instantiable1[
      /* props */ reduxDashOrmLib.reduxDashOrmMod.ModelProps, 
      reduxDashOrmLib.reduxDashOrmMod.Model[js.Object, js.Object, js.Object]
    ] {
  val _sessionData: js.Any = js.native
  var fields: reduxDashOrmLib.reduxDashOrmMod.ModelFields = js.native
  val idAttribute: java.lang.String = js.native
  var modelName: java.lang.String = js.native
   // TODO
  val query: reduxDashOrmLib.reduxDashOrmMod.QuerySet[_, js.Object, js.Object] = js.native
  val session: reduxDashOrmLib.reduxDashOrmMod.SessionWithModels[_] = js.native
  var virtualFields: reduxDashOrmLib.reduxDashOrmMod.ModelVirtualFields = js.native
  def _findDatabaseRows(lookupObj: js.Object): js.Any = js.native
  def _getTableOpts(): js.Object = js.native
  def all(): reduxDashOrmLib.reduxDashOrmMod.QuerySet[_, _, _] = js.native
  def connec(session: reduxDashOrmLib.reduxDashOrmMod.Session[reduxDashOrmLib.reduxDashOrmMod.ORMCommonState]): scala.Unit = js.native
  def create[Fields](props: Fields): reduxDashOrmLib.reduxDashOrmMod.ModelWithFields[Fields, _, _] = js.native
   // TODO
  def get(lookupObj: js.Object): reduxDashOrmLib.reduxDashOrmMod.ModelWithFields[_, _, _] = js.native
  def getQuerySet(): reduxDashOrmLib.reduxDashOrmMod.QuerySet[_, js.Object, js.Object] = js.native
  def hasId(id: java.lang.String): scala.Boolean = js.native
  def invalidateClassCache(): scala.Unit = js.native
  def markAccessed(): scala.Unit = js.native
  def options(): js.Object = js.native
  def reducer(
    action: js.Any,
    modelClass: /* import warning: ImportType.apply Failed type conversion: typeof Model */ js.Any,
    session: reduxDashOrmLib.reduxDashOrmMod.SessionWithModels[reduxDashOrmLib.reduxDashOrmMod.ORMCommonState]
  ): js.Any = js.native
  def upsert[Fields](props: stdLib.Partial[Fields]): reduxDashOrmLib.reduxDashOrmMod.ModelWithFields[Fields, _, _] = js.native
  def withId(id: java.lang.String): reduxDashOrmLib.reduxDashOrmMod.ModelWithFields[_, _, _] = js.native
}

