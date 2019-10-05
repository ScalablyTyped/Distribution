package typings.remotedevDashSerialize

import typings.immutable.immutableMod.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofRecord extends js.Object {
  val Factory: TypeofFactory = js.native
  def apply[TProps](defaultValues: TProps): typings.immutable.immutableMod.Record.Factory[TProps] = js.native
  def apply[TProps](defaultValues: TProps, name: String): typings.immutable.immutableMod.Record.Factory[TProps] = js.native
  def getDescriptiveName(record: Record[_]): String = js.native
  def isRecord(maybeRecord: js.Any): /* is immutable.immutable.Record<any> */ Boolean = js.native
}

