package typings.request.mod

import typings.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsWithUrl
  extends StObject
     with UrlOptions
     with CoreOptions
     with Options
object OptionsWithUrl {
  
  @scala.inline
  def apply(url: String | Url): OptionsWithUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithUrl]
  }
}
