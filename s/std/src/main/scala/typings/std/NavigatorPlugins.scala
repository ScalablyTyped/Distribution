package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorPlugins extends js.Object {
  val mimeTypes: MimeTypeArray
  val plugins: PluginArray
  def javaEnabled(): scala.Boolean
}

object NavigatorPlugins {
  @scala.inline
  def apply(javaEnabled: () => scala.Boolean, mimeTypes: MimeTypeArray, plugins: PluginArray): NavigatorPlugins = {
    val __obj = js.Dynamic.literal(javaEnabled = js.Any.fromFunction0(javaEnabled), mimeTypes = mimeTypes.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorPlugins]
  }
}

