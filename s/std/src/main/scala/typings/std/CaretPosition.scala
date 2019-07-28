package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaretPosition extends js.Object {
  val offset: Double
  val offsetNode: Node
  def getClientRect(): DOMRect | Null
}

@JSGlobal("CaretPosition")
@js.native
class CaretPositionCls () extends CaretPosition {
  /* CompleteClass */
  override val offset: Double = js.native
  /* CompleteClass */
  override val offsetNode: Node = js.native
  /* CompleteClass */
  override def getClientRect(): DOMRect | Null = js.native
}

@JSGlobal("CaretPosition")
@js.native
object CaretPosition extends Instantiable0[CaretPosition]

