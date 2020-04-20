package typings.ractive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTeardown extends js.Object {
  def teardown(): Unit
}

object AnonTeardown {
  @scala.inline
  def apply(teardown: () => Unit): AnonTeardown = {
    val __obj = js.Dynamic.literal(teardown = js.Any.fromFunction0(teardown))
    __obj.asInstanceOf[AnonTeardown]
  }
}

