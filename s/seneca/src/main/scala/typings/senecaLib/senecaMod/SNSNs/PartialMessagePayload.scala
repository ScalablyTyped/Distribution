package typings
package senecaLib.senecaMod.SNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialMessagePayload extends js.Object {
  @JSName("fatal$")
  var fatal$: scala.Boolean
  @JSName("plugin$")
  var plugin$: js.Any
  @JSName("transport$")
  var transport$: js.Object
  @JSName("tx$")
  var tx$: java.lang.String
}

object PartialMessagePayload {
  @scala.inline
  def apply(fatal$: scala.Boolean, plugin$: js.Any, transport$: js.Object, tx$: java.lang.String): PartialMessagePayload = {
    val __obj = js.Dynamic.literal(fatal$ = fatal$, plugin$ = plugin$, transport$ = transport$, tx$ = tx$)
  
    __obj.asInstanceOf[PartialMessagePayload]
  }
}

