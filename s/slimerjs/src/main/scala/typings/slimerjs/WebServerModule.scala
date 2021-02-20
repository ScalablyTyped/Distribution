package typings.slimerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebServerModule extends StObject {
  
  def create(): WebServer = js.native
}
object WebServerModule {
  
  @scala.inline
  def apply(create: () => WebServer): WebServerModule = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.asInstanceOf[WebServerModule]
  }
  
  @scala.inline
  implicit class WebServerModuleMutableBuilder[Self <: WebServerModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: () => WebServer): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
  }
}
