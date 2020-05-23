package typings.reactNativeFirebase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Priority extends js.Object {
  @JSName(".priority")
  var Dotpriority: String | Double | Null
  @JSName(".value")
  var Dotvalue: js.Any
}

object Priority {
  @scala.inline
  def apply(Dotvalue: js.Any, Dotpriority: String | Double = null): Priority = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".value")(Dotvalue.asInstanceOf[js.Any])
    __obj.updateDynamic(".priority")(Dotpriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Priority]
  }
}

