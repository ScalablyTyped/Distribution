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
object CaretPosition
  extends ScalablyTyped.runtime.Instantiable0[CaretPosition]

