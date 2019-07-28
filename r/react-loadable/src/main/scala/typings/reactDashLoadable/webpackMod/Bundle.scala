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
    val __obj = js.Dynamic.literal(file = file, id = id, publicPath = publicPath)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Bundle]
  }
}

