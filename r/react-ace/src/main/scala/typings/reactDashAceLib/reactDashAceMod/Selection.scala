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
  def apply(getCursor: () => Annotation): Selection = {
    val __obj = js.Dynamic.literal(getCursor = js.Any.fromFunction0(getCursor))
  
    __obj.asInstanceOf[Selection]
  }
}

