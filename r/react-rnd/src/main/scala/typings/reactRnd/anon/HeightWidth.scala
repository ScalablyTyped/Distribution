package typings.reactRnd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeightWidth extends js.Object {
  var height: Double | String
  var width: Double | String
}

object HeightWidth {
  @scala.inline
  def apply(height: Double | String, width: Double | String): HeightWidth = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightWidth]
  }
}

