package typings.reactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPriority extends js.Object {
  @JSName(".priority")
  var Dotpriority: String | Double | Null
  @JSName(".value")
  var Dotvalue: js.Any
}

object AnonPriority {
  @scala.inline
  def apply(Dotvalue: js.Any, Dotpriority: String | Double = null): AnonPriority = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".value")(Dotvalue.asInstanceOf[js.Any])
    if (Dotpriority != null) __obj.updateDynamic(".priority")(Dotpriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPriority]
  }
}

