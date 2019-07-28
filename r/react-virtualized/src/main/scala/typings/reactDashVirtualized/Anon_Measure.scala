package typings.reactDashVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Measure extends js.Object {
  def measure(): Unit
}

object Anon_Measure {
  @scala.inline
  def apply(measure: () => Unit): Anon_Measure = {
    val __obj = js.Dynamic.literal(measure = js.Any.fromFunction0(measure))
  
    __obj.asInstanceOf[Anon_Measure]
  }
}

