package typings.request.mod

import typings.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.request.mod.OptionsWithUri
  - typings.request.mod.OptionsWithUrl
*/
trait Options extends StObject
object Options {
  
  @scala.inline
  def OptionsWithUri(uri: String | Url): typings.request.mod.OptionsWithUri = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.request.mod.OptionsWithUri]
  }
  
  @scala.inline
  def OptionsWithUrl(url: String | Url): typings.request.mod.OptionsWithUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.request.mod.OptionsWithUrl]
  }
}
