package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSGesture extends js.Object {
  var target: Element
  def addPointer(pointerId: scala.Double): scala.Unit
  def stop(): scala.Unit
}

@JSGlobal("MSGesture")
@js.native
class MSGestureCls () extends MSGesture {
  /* CompleteClass */
  override var target: Element = js.native
  /* CompleteClass */
  override def addPointer(pointerId: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def stop(): scala.Unit = js.native
}

@JSGlobal("MSGesture")
@js.native
object MSGesture
  extends org.scalablytyped.runtime.Instantiable0[MSGesture]

