package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordSourceSelectorProxy extends js.Object {
  def create(dataID: DataID, typeName: java.lang.String): RecordProxy
  def delete(dataID: DataID): scala.Unit
  def get(dataID: DataID): js.UndefOr[RecordProxy | scala.Null]
  def getPluralRootField(fieldName: java.lang.String): js.UndefOr[(js.Array[js.UndefOr[RecordProxy | scala.Null]]) | scala.Null]
  def getRoot(): RecordProxy
  def getRootField(fieldName: java.lang.String): js.UndefOr[RecordProxy | scala.Null]
}

object RecordSourceSelectorProxy {
  @scala.inline
  def apply(
    create: (DataID, java.lang.String) => RecordProxy,
    delete: DataID => scala.Unit,
    get: DataID => js.UndefOr[RecordProxy | scala.Null],
    getPluralRootField: java.lang.String => js.UndefOr[(js.Array[js.UndefOr[RecordProxy | scala.Null]]) | scala.Null],
    getRoot: () => RecordProxy,
    getRootField: java.lang.String => js.UndefOr[RecordProxy | scala.Null]
  ): RecordSourceSelectorProxy = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getPluralRootField = js.Any.fromFunction1(getPluralRootField), getRoot = js.Any.fromFunction0(getRoot), getRootField = js.Any.fromFunction1(getRootField))
  
    __obj.asInstanceOf[RecordSourceSelectorProxy]
  }
}

