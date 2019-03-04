package typings
package reactDashNativeDashFirebaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Priority extends js.Object {
  var `.priority`: java.lang.String | scala.Double | scala.Null
  var `.value`: js.Any
}

object Anon_Priority {
  @scala.inline
  def apply(`.value`: js.Any, `.priority`: java.lang.String | scala.Double = null): Anon_Priority = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".value")(`.value`)
    if (`.priority` != null) __obj.updateDynamic(".priority")(`.priority`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Priority]
  }
}

