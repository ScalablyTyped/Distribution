package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadonlyRecordSourceProxy extends js.Object {
  def get(dataID: DataID): js.UndefOr[ReadonlyRecordProxy | Null]
  def getRoot(): ReadonlyRecordProxy
}

object ReadonlyRecordSourceProxy {
  @scala.inline
  def apply(get: DataID => js.UndefOr[ReadonlyRecordProxy | Null], getRoot: () => ReadonlyRecordProxy): ReadonlyRecordSourceProxy = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getRoot = js.Any.fromFunction0(getRoot))
  
    __obj.asInstanceOf[ReadonlyRecordSourceProxy]
  }
}

