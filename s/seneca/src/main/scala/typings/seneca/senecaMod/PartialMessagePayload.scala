package typings.seneca.senecaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialMessagePayload extends js.Object {
  @JSName("fatal$")
  var fatal$: Boolean
  @JSName("plugin$")
  var plugin$: js.Any
  @JSName("transport$")
  var transport$: js.Object
  @JSName("tx$")
  var tx$: String
}

object PartialMessagePayload {
  @scala.inline
  def apply(fatal$: Boolean, plugin$: js.Any, transport$: js.Object, tx$: String): PartialMessagePayload = {
    val __obj = js.Dynamic.literal(fatal$ = fatal$.asInstanceOf[js.Any], plugin$ = plugin$.asInstanceOf[js.Any], transport$ = transport$.asInstanceOf[js.Any], tx$ = tx$.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PartialMessagePayload]
  }
}

