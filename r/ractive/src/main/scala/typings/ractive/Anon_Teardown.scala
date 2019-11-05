package typings.ractive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Teardown extends js.Object {
  def teardown(): Unit
}

object Anon_Teardown {
  @scala.inline
  def apply(teardown: () => Unit): Anon_Teardown = {
    val __obj = js.Dynamic.literal(teardown = js.Any.fromFunction0(teardown))
  
    __obj.asInstanceOf[Anon_Teardown]
  }
}

