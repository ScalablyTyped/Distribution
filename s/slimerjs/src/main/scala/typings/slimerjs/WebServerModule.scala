package typings.slimerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebServerModule extends StObject {
  
  def create(): WebServer
}
object WebServerModule {
  
  inline def apply(create: () => WebServer): WebServerModule = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.asInstanceOf[WebServerModule]
  }
  
  extension [Self <: WebServerModule](x: Self) {
    
    inline def setCreate(value: () => WebServer): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
  }
}
