package typings.saslDashAnonymous.saslDashAnonymousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var trace: js.UndefOr[String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(trace: String = null): Credentials = {
    val __obj = js.Dynamic.literal()
    if (trace != null) __obj.updateDynamic("trace")(trace)
    __obj.asInstanceOf[Credentials]
  }
}

