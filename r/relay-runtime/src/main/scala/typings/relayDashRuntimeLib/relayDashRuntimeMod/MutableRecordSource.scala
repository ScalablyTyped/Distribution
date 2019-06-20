package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutableRecordSource extends js.Object {
  def clear(): scala.Unit = js.native
  def delete(dataID: DataID): scala.Unit = js.native
  def remove(dataID: DataID): scala.Unit = js.native
  def set(dataID: DataID, record: Record): scala.Unit = js.native
}

