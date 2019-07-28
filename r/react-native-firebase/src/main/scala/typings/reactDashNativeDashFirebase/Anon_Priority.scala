package typings.reactDashNativeDashFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Priority extends js.Object {
  var `.priority`: String | Double | Null
  var `.value`: js.Any
}

object Anon_Priority {
  @scala.inline
  def apply(`.value`: js.Any, `.priority`: String | Double = null): Anon_Priority = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".value")(`.value`)
    if (`.priority` != null) __obj.updateDynamic(".priority")(`.priority`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Priority]
  }
}

