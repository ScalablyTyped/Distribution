package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Measure extends js.Object {
  def measure(): scala.Unit
}

object Anon_Measure {
  @scala.inline
  def apply(measure: () => scala.Unit): Anon_Measure = {
    val __obj = js.Dynamic.literal(measure = js.Any.fromFunction0(measure))
  
    __obj.asInstanceOf[Anon_Measure]
  }
}

