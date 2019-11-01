package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordSourceProxy extends js.Object {
  def create(dataID: DataID, typeName: String): RecordProxy[js.Object]
  def delete(dataID: DataID): Unit
  // tslint:disable-next-line
  def get[T](dataID: DataID): js.UndefOr[RecordProxy[T] | Null]
  def getRoot(): RecordProxy[js.Object]
}

object RecordSourceProxy {
  @scala.inline
  def apply(
    create: (DataID, String) => RecordProxy[js.Object],
    delete: DataID => Unit,
    get: DataID => js.UndefOr[RecordProxy[js.Any] | Null],
    getRoot: () => RecordProxy[js.Object]
  ): RecordSourceProxy = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getRoot = js.Any.fromFunction0(getRoot))
  
    __obj.asInstanceOf[RecordSourceProxy]
  }
}

