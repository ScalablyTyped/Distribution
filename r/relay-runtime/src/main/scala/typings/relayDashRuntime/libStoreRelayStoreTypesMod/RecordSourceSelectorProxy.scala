package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libStoreRelayConnectionMod.ConnectionID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordSourceSelectorProxy extends RecordSourceProxy {
  def getPluralRootField(fieldName: String): js.Array[RecordProxy]
  def getRootField(fieldName: String): RecordProxy
  def insertConnectionEdge_UNSTABLE(connectionID: ConnectionID, args: Variables, edge: RecordProxy): Unit
}

object RecordSourceSelectorProxy {
  @scala.inline
  def apply(
    create: (DataID, String) => RecordProxy,
    delete: DataID => Unit,
    get: DataID => RecordProxy,
    getPluralRootField: String => js.Array[RecordProxy],
    getRoot: () => RecordProxy,
    getRootField: String => RecordProxy,
    insertConnectionEdge_UNSTABLE: (ConnectionID, Variables, RecordProxy) => Unit
  ): RecordSourceSelectorProxy = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getPluralRootField = js.Any.fromFunction1(getPluralRootField), getRoot = js.Any.fromFunction0(getRoot), getRootField = js.Any.fromFunction1(getRootField), insertConnectionEdge_UNSTABLE = js.Any.fromFunction3(insertConnectionEdge_UNSTABLE))
  
    __obj.asInstanceOf[RecordSourceSelectorProxy]
  }
}

