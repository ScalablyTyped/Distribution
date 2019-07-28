package typings.relayDashRuntime.relayDashRuntimeMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutableRecordSource extends js.Object {
  def clear(): Unit = js.native
  def delete(dataID: DataID): Unit = js.native
  def remove(dataID: DataID): Unit = js.native
  def set(dataID: DataID, record: Record[String, _]): Unit = js.native
}

