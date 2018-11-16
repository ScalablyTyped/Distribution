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
object MSGesture
  extends ScalablyTyped.runtime.Instantiable0[MSGesture]

