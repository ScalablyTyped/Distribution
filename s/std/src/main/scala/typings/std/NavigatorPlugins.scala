package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorPlugins extends StObject {
  
  def javaEnabled(): scala.Boolean = js.native
  
  val mimeTypes: MimeTypeArray = js.native
  
  val plugins: PluginArray = js.native
}
object NavigatorPlugins {
  
  @scala.inline
  def apply(javaEnabled: () => scala.Boolean, mimeTypes: MimeTypeArray, plugins: PluginArray): NavigatorPlugins = {
    val __obj = js.Dynamic.literal(javaEnabled = js.Any.fromFunction0(javaEnabled), mimeTypes = mimeTypes.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorPlugins]
  }
  
  @scala.inline
  implicit class NavigatorPluginsMutableBuilder[Self <: NavigatorPlugins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJavaEnabled(value: () => scala.Boolean): Self = StObject.set(x, "javaEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMimeTypes(value: MimeTypeArray): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugins(value: PluginArray): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
