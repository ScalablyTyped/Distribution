package typings
package saslDashAnonymousLib.saslDashAnonymousMod.AnonymousMechanismNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var trace: js.UndefOr[java.lang.String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(trace: java.lang.String = null): Credentials = {
    val __obj = js.Dynamic.literal()
    if (trace != null) __obj.updateDynamic("trace")(trace)
    __obj.asInstanceOf[Credentials]
  }
}

