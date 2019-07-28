package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordSourceSelectorProxy extends js.Object {
  def create(dataID: DataID, typeName: String): RecordProxy
  def delete(dataID: DataID): Unit
  def get(dataID: DataID): js.UndefOr[RecordProxy | Null]
  def getPluralRootField(fieldName: String): js.UndefOr[(js.Array[js.UndefOr[RecordProxy | Null]]) | Null]
  def getRoot(): RecordProxy
  def getRootField(fieldName: String): js.UndefOr[RecordProxy | Null]
}

object RecordSourceSelectorProxy {
  @scala.inline
  def apply(
    create: (DataID, String) => RecordProxy,
    delete: DataID => Unit,
    get: DataID => js.UndefOr[RecordProxy | Null],
    getPluralRootField: String => js.UndefOr[(js.Array[js.UndefOr[RecordProxy | Null]]) | Null],
    getRoot: () => RecordProxy,
    getRootField: String => js.UndefOr[RecordProxy | Null]
  ): RecordSourceSelectorProxy = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getPluralRootField = js.Any.fromFunction1(getPluralRootField), getRoot = js.Any.fromFunction0(getRoot), getRootField = js.Any.fromFunction1(getRootField))
  
    __obj.asInstanceOf[RecordSourceSelectorProxy]
  }
}

