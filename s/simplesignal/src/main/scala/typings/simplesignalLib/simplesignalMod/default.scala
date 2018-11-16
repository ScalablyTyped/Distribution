package typings
package simplesignalLib.simplesignalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simplesignal", JSImport.Default)
@js.native
class default[F /* <: js.Function */] () extends SimpleSignal[F] {
  /* CompleteClass */
  override var functions: js.Any = js.native
  /* CompleteClass */
  override val numItems: scala.Double = js.native
  /* CompleteClass */
  override def add(func: F): scala.Boolean = js.native
  /* CompleteClass */
  override def dispatch(args: js.Any*): scala.Unit = js.native
  /* CompleteClass */
  override def remove(func: F): scala.Boolean = js.native
  /* CompleteClass */
  override def removeAll(): scala.Boolean = js.native
}

