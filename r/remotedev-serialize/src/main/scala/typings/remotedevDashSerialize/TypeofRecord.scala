package typings.remotedevDashSerialize

import typings.immutable.immutableMod.Record
import typings.std.Iterable
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofRecord extends js.Object {
  val FactoryNs: js.Any = js.native
  def Factory[TProps /* <: js.Object */](): Record[TProps] with TProps = js.native
  def Factory[TProps /* <: js.Object */](values: Iterable[js.Tuple2[String, _]]): Record[TProps] with TProps = js.native
  def Factory[TProps /* <: js.Object */](values: Partial[TProps]): Record[TProps] with TProps = js.native
  def getDescriptiveName(record: Record[_]): String = js.native
  def isRecord(maybeRecord: js.Any): /* is immutable.immutable.Record<any> */ Boolean = js.native
}

