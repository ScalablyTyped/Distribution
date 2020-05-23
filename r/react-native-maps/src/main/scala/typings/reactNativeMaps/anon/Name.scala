package typings.reactNativeMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var placeId: String
}

object Name {
  @scala.inline
  def apply(name: String, placeId: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

