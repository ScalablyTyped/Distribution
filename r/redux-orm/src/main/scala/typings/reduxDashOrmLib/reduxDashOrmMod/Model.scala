package typings
package reduxDashOrmLib.reduxDashOrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm", "Model")
@js.native
class Model[Fields, Additional, VirtualFields] protected () extends js.Object {
  def this(props: ModelProps) = this()
  val ref: Fields with Additional with ORMId = js.native
  /* private */ def _initFields(props: ModelProps): scala.Unit = js.native
  /* private */ def _onDelete(): scala.Unit = js.native
  /* private */ def _refreshMany2Many(relations: js.Any): scala.Unit = js.native
  def delete(): scala.Unit = js.native
  def equals(otherModel: ModelWithFields[_, _, _]): scala.Boolean = js.native
  def getId(): java.lang.String = js.native
  def refreshFromState(): scala.Unit = js.native
  def set(propertyName: java.lang.String, value: js.Any): scala.Unit = js.native
  def update(userMergeObj: stdLib.Partial[Fields with Additional]): scala.Unit = js.native
}

@JSImport("redux-orm", "Model")
@js.native
object Model extends js.Object {
  val _sessionData: js.Any = js.native
  var fields: reduxDashOrmLib.reduxDashOrmMod.ModelFields = js.native
  val idAttribute: java.lang.String = js.native
  var modelName: java.lang.String = js.native
   // TODO
  val query: reduxDashOrmLib.reduxDashOrmMod.QuerySet[_, js.Object, js.Object] = js.native
  var querySetClass: reduxDashOrmLib.Anon_AddSharedMethod = js.native
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
    modelClass: reduxDashOrmLib.Anon_Action,
    session: reduxDashOrmLib.reduxDashOrmMod.SessionWithModels[reduxDashOrmLib.reduxDashOrmMod.ORMCommonState]
  ): js.Any = js.native
  def upsert[Fields](props: stdLib.Partial[Fields]): reduxDashOrmLib.reduxDashOrmMod.ModelWithFields[Fields, _, _] = js.native
  def withId(id: java.lang.String): reduxDashOrmLib.reduxDashOrmMod.ModelWithFields[_, _, _] = js.native
}

