package typings
package reactDashLoadableLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bundle extends js.Object {
  var file: java.lang.String
  var id: java.lang.String
  var name: java.lang.String | scala.Null
  var publicPath: java.lang.String
}

object Bundle {
  @scala.inline
  def apply(
    file: java.lang.String,
    id: java.lang.String,
    publicPath: java.lang.String,
    name: java.lang.String = null
  ): Bundle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("publicPath")(publicPath)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Bundle]
  }
}

