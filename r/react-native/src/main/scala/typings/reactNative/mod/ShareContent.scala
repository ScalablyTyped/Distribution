package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.anon.Message
  - typings.reactNative.anon.Title
*/
trait ShareContent extends StObject
object ShareContent {
  
  @scala.inline
  def Message(message: String): typings.reactNative.anon.Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNative.anon.Message]
  }
  
  @scala.inline
  def Title(url: String): typings.reactNative.anon.Title = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNative.anon.Title]
  }
}
