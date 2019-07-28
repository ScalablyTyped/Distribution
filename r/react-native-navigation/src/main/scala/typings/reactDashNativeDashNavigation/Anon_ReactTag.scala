package typings.reactDashNativeDashNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReactTag extends js.Object {
  var reactTag: Double | Null
}

object Anon_ReactTag {
  @scala.inline
  def apply(reactTag: Int | Double = null): Anon_ReactTag = {
    val __obj = js.Dynamic.literal()
    if (reactTag != null) __obj.updateDynamic("reactTag")(reactTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ReactTag]
  }
}

