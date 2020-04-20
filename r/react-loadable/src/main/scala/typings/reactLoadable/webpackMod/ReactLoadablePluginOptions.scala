package typings.reactLoadable.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactLoadablePluginOptions extends js.Object {
  var filename: String
}

object ReactLoadablePluginOptions {
  @scala.inline
  def apply(filename: String): ReactLoadablePluginOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactLoadablePluginOptions]
  }
}

