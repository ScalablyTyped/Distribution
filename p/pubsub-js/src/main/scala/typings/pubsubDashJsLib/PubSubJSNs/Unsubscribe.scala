package typings
package pubsubDashJsLib.PubSubJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unsubscribe extends js.Object {
  def unsubscribe(tokenOrFunction: js.Any): js.Any
}

object Unsubscribe {
  @scala.inline
  def apply(unsubscribe: js.Function1[js.Any, js.Any]): Unsubscribe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unsubscribe")(unsubscribe)
    __obj.asInstanceOf[Unsubscribe]
  }
}

