package typings.reactSortableHoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var withRef: Boolean
}

object Config {
  @scala.inline
  def apply(withRef: Boolean): Config = {
    val __obj = js.Dynamic.literal(withRef = withRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

