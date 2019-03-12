package typings
package reactDashNativeDashReferrerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetReferrer extends js.Object {
  def getReferrer(): js.Promise[java.lang.String]
}

object Anon_GetReferrer {
  @scala.inline
  def apply(getReferrer: () => js.Promise[java.lang.String]): Anon_GetReferrer = {
    val __obj = js.Dynamic.literal(getReferrer = js.Any.fromFunction0(getReferrer))
  
    __obj.asInstanceOf[Anon_GetReferrer]
  }
}

