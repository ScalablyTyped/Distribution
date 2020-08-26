package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadOnlyRecordSourceProxy extends js.Object {
  def get(dataID: DataID): js.UndefOr[ReadOnlyRecordProxy | Null] = js.native
  def getRoot(): ReadOnlyRecordProxy = js.native
}

object ReadOnlyRecordSourceProxy {
  @scala.inline
  def apply(get: DataID => js.UndefOr[ReadOnlyRecordProxy | Null], getRoot: () => ReadOnlyRecordProxy): ReadOnlyRecordSourceProxy = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getRoot = js.Any.fromFunction0(getRoot))
    __obj.asInstanceOf[ReadOnlyRecordSourceProxy]
  }
  @scala.inline
  implicit class ReadOnlyRecordSourceProxyOps[Self <: ReadOnlyRecordSourceProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: DataID => js.UndefOr[ReadOnlyRecordProxy | Null]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRoot(value: () => ReadOnlyRecordProxy): Self = this.set("getRoot", js.Any.fromFunction0(value))
  }
  
}

