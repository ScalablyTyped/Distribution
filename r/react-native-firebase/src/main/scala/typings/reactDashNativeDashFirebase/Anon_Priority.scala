package typings.reactDashNativeDashFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Priority extends js.Object {
  @JSName(".priority")
  var Dotpriority: String | Double | Null
  @JSName(".value")
  var Dotvalue: js.Any
}

object Anon_Priority {
  @scala.inline
  def apply(Dotvalue: js.Any, Dotpriority: String | Double = null): Anon_Priority = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".value")(Dotvalue.asInstanceOf[js.Any])
    if (Dotpriority != null) __obj.updateDynamic(".priority")(Dotpriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Priority]
  }
}

