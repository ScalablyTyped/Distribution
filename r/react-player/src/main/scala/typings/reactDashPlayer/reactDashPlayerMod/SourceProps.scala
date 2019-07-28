package typings.reactDashPlayer.reactDashPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceProps extends js.Object {
  var src: String
  var `type`: String
}

object SourceProps {
  @scala.inline
  def apply(src: String, `type`: String): SourceProps = {
    val __obj = js.Dynamic.literal(src = src)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SourceProps]
  }
}

