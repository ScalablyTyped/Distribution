package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSStream extends js.Object {
  val `type`: java.lang.String
  def msClose(): scala.Unit
  def msDetachStream(): js.Any
}

@JSGlobal("MSStream")
@js.native
class MSStreamCls () extends MSStream {
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /* CompleteClass */
  override def msClose(): scala.Unit = js.native
  /* CompleteClass */
  override def msDetachStream(): js.Any = js.native
}

@JSGlobal("MSStream")
@js.native
object MSStream
  extends org.scalablytyped.runtime.Instantiable0[MSStream]

