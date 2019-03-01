package typings
package reactDashLoadableLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactLoadablePluginOptions extends js.Object {
  var filename: java.lang.String
}

object ReactLoadablePluginOptions {
  @scala.inline
  def apply(filename: java.lang.String): ReactLoadablePluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[ReactLoadablePluginOptions]
  }
}

