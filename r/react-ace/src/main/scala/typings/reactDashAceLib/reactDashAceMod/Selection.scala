package typings
package reactDashAceLib.reactDashAceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selection extends js.Object {
  def getCursor(): Annotation
}

object Selection {
  @scala.inline
  def apply(getCursor: js.Function0[Annotation]): Selection = {
    val __obj = js.Dynamic.literal(getCursor = getCursor)
  
    __obj.asInstanceOf[Selection]
  }
}

