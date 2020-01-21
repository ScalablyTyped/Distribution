package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOnlyRecordSourceProxy extends js.Object {
  def get(dataID: DataID): js.UndefOr[ReadOnlyRecordProxy | Null]
  def getRoot(): ReadOnlyRecordProxy
}

object ReadOnlyRecordSourceProxy {
  @scala.inline
  def apply(get: DataID => js.UndefOr[ReadOnlyRecordProxy | Null], getRoot: () => ReadOnlyRecordProxy): ReadOnlyRecordSourceProxy = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getRoot = js.Any.fromFunction0(getRoot))
  
    __obj.asInstanceOf[ReadOnlyRecordSourceProxy]
  }
}

