package typings
package sharedbLib.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait sharedb extends js.Object {
  def addProjection(name: java.lang.String, collection: java.lang.String, fields: js.Object): js.Any = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function1[/* err */ sharedbLib.sharedbMod.sharedbNs.Error, _]): scala.Unit = js.native
  def connect(): sharedbLib.sharedbMod.sharedbNs.Connection = js.native
  def listen(stream: js.Any): scala.Unit = js.native
  def use(action: sharedbLib.sharedbMod.sharedbNs.UseAction, fn: sharedbLib.sharedbMod.sharedbNs.UseCallback): scala.Unit = js.native
}

