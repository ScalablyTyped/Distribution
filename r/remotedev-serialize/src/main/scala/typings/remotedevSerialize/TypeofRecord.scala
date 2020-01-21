package typings.remotedevSerialize

import typings.immutable.Immutable.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofRecord extends js.Object {
  val Factory: TypeofFactory = js.native
  def apply[TProps](defaultValues: TProps): typings.immutable.Immutable.Record.Factory[TProps] = js.native
  def apply[TProps](defaultValues: TProps, name: String): typings.immutable.Immutable.Record.Factory[TProps] = js.native
  def getDescriptiveName(record: Record[_]): String = js.native
  def isRecord(maybeRecord: js.Any): /* is immutable.Immutable.Record<any> */ Boolean = js.native
}

