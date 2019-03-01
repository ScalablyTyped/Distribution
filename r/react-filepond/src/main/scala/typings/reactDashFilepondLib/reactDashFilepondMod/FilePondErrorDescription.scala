package typings
package reactDashFilepondLib.reactDashFilepondMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondErrorDescription extends js.Object {
  var main: java.lang.String
  var sub: java.lang.String
}

object FilePondErrorDescription {
  @scala.inline
  def apply(main: java.lang.String, sub: java.lang.String): FilePondErrorDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("main")(main)
    __obj.updateDynamic("sub")(sub)
    __obj.asInstanceOf[FilePondErrorDescription]
  }
}

