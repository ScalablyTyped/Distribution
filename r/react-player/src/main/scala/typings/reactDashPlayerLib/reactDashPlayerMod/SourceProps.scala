package typings
package reactDashPlayerLib.reactDashPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceProps extends js.Object {
  var src: java.lang.String
  var `type`: java.lang.String
}

object SourceProps {
  @scala.inline
  def apply(src: java.lang.String, `type`: java.lang.String): SourceProps = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[SourceProps]
  }
}

