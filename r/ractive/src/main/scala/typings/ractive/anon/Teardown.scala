package typings.ractive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Teardown extends js.Object {
  def teardown(): Unit
}

object Teardown {
  @scala.inline
  def apply(teardown: () => Unit): Teardown = {
    val __obj = js.Dynamic.literal(teardown = js.Any.fromFunction0(teardown))
    __obj.asInstanceOf[Teardown]
  }
}

