package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaretPosition extends js.Object {
  val offset: scala.Double
  val offsetNode: Node
  def getClientRect(): DOMRect | scala.Null
}

@JSGlobal("CaretPosition")
@js.native
class CaretPositionCls () extends CaretPosition {
  /* CompleteClass */
  override val offset: scala.Double = js.native
  /* CompleteClass */
  override val offsetNode: Node = js.native
  /* CompleteClass */
  override def getClientRect(): DOMRect | scala.Null = js.native
}

@JSGlobal("CaretPosition")
@js.native
object CaretPosition
  extends org.scalablytyped.runtime.Instantiable0[CaretPosition]

