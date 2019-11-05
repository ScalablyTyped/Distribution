package typings.ractive.ractiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdaptorHandle extends js.Object {
  /** Called when Ractive needs to retrieve the adapted value. */
  def get(): js.Any
  /** Called when Ractive needs to replace the adapted value e.g. r.set('adapted', {}). */
  def reset(value: js.Any): Unit
  /** Called when Ractive needs to set a property of the adapted value e.g. r.set('adapted.prop', {}). */
  def set(prop: String, value: js.Any): Unit
  /** Called when Ractive no longer needs the adaptor. */
  def teardown(): Unit
}

object AdaptorHandle {
  @scala.inline
  def apply(get: () => js.Any, reset: js.Any => Unit, set: (String, js.Any) => Unit, teardown: () => Unit): AdaptorHandle = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction2(set), teardown = js.Any.fromFunction0(teardown))
  
    __obj.asInstanceOf[AdaptorHandle]
  }
}

