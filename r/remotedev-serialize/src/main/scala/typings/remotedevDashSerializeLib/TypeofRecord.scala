package typings
package remotedevDashSerializeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofRecord extends js.Object {
  val FactoryNs: js.Any = js.native
  def Factory[TProps /* <: js.Object */](): immutableLib.immutableMod.Record[TProps] with TProps = js.native
  def Factory[TProps /* <: js.Object */](values: stdLib.Iterable[js.Tuple2[java.lang.String, _]]): immutableLib.immutableMod.Record[TProps] with TProps = js.native
  def Factory[TProps /* <: js.Object */](values: stdLib.Partial[TProps]): immutableLib.immutableMod.Record[TProps] with TProps = js.native
  def getDescriptiveName(record: immutableLib.immutableMod.Record[_]): java.lang.String = js.native
  def isRecord(maybeRecord: js.Any): /* is immutable.immutable.Record<any> */ scala.Boolean = js.native
}

