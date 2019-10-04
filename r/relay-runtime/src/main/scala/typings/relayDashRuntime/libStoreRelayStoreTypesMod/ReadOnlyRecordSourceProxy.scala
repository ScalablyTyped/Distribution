package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOnlyRecordSourceProxy extends js.Object {
  def get(dataID: DataID): ReadOnlyRecordProxy
  def getRoot(): ReadOnlyRecordProxy
}

object ReadOnlyRecordSourceProxy {
  @scala.inline
  def apply(get: DataID => ReadOnlyRecordProxy, getRoot: () => ReadOnlyRecordProxy): ReadOnlyRecordSourceProxy = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getRoot = js.Any.fromFunction0(getRoot))
  
    __obj.asInstanceOf[ReadOnlyRecordSourceProxy]
  }
}

