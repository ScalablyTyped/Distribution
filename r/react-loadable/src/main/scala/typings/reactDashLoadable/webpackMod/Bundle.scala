package typings.reactDashLoadable.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bundle extends js.Object {
  var file: String
  var id: String
  var name: String | Null
  var publicPath: String
}

object Bundle {
  @scala.inline
  def apply(file: String, id: String, publicPath: String, name: String = null): Bundle = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle]
  }
}

