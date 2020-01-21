package typings.reactPlayer.mod

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
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceProps]
  }
}

