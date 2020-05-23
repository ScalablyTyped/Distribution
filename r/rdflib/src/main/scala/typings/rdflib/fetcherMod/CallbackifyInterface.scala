package typings.rdflib.fetcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackifyInterface extends js.Object {
  var fireCallbacks: js.Function
}

object CallbackifyInterface {
  @scala.inline
  def apply(fireCallbacks: js.Function): CallbackifyInterface = {
    val __obj = js.Dynamic.literal(fireCallbacks = fireCallbacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackifyInterface]
  }
}

