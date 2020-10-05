package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorPlugins extends js.Object {
  val mimeTypes: MimeTypeArray = js.native
  val plugins: PluginArray = js.native
  def javaEnabled(): scala.Boolean = js.native
}

object NavigatorPlugins {
  @scala.inline
  def apply(javaEnabled: () => scala.Boolean, mimeTypes: MimeTypeArray, plugins: PluginArray): NavigatorPlugins = {
    val __obj = js.Dynamic.literal(javaEnabled = js.Any.fromFunction0(javaEnabled), mimeTypes = mimeTypes.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorPlugins]
  }
  @scala.inline
  implicit class NavigatorPluginsOps[Self <: NavigatorPlugins] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJavaEnabled(value: () => scala.Boolean): Self = this.set("javaEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setMimeTypes(value: MimeTypeArray): Self = this.set("mimeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlugins(value: PluginArray): Self = this.set("plugins", value.asInstanceOf[js.Any])
  }
  
}

