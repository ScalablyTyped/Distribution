package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordSourceProxy extends js.Object {
  def create(dataID: DataID, typeName: String): RecordProxy
  def delete(dataID: DataID): Unit
  def get(dataID: DataID): js.UndefOr[RecordProxy | Null]
  def getRoot(): RecordProxy
}

object RecordSourceProxy {
  @scala.inline
  def apply(
    create: (DataID, String) => RecordProxy,
    delete: DataID => Unit,
    get: DataID => js.UndefOr[RecordProxy | Null],
    getRoot: () => RecordProxy
  ): RecordSourceProxy = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getRoot = js.Any.fromFunction0(getRoot))
  
    __obj.asInstanceOf[RecordSourceProxy]
  }
}

