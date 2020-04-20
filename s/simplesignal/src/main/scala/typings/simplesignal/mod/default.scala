package typings.simplesignal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simplesignal", JSImport.Default)
@js.native
class default[F /* <: js.Function */] () extends SimpleSignal[F] {
  /* CompleteClass */
  override var functions: js.Any = js.native
  /* CompleteClass */
  override def add(func: F): Boolean = js.native
  /* CompleteClass */
  override def dispatch(args: js.Any*): Unit = js.native
  /* CompleteClass */
  override def numItems: Double = js.native
  /* CompleteClass */
  override def remove(func: F): Boolean = js.native
  /* CompleteClass */
  override def removeAll(): Boolean = js.native
}

