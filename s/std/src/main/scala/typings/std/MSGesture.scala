package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSGesture extends js.Object {
  var target: Element
  def addPointer(pointerId: Double): Unit
  def stop(): Unit
}

@JSGlobal("MSGesture")
@js.native
class MSGestureCls () extends MSGesture {
  /* CompleteClass */
  override var target: Element = js.native
  /* CompleteClass */
  override def addPointer(pointerId: Double): Unit = js.native
  /* CompleteClass */
  override def stop(): Unit = js.native
}

@JSGlobal("MSGesture")
@js.native
object MSGesture extends Instantiable0[MSGesture]

