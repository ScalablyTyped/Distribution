package typings.raml1Parser

import typings.raml1Parser.resolversApiMod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceRegistryMod {
  
  @JSImport("raml-1-parser/dist/parser/jsyaml/resourceRegistry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addLoadCallback(listener: NotifyCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addLoadCallback")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addNotify(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addNotify")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def get(url: String): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[Response]
  
  inline def hasAsyncRequests(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAsyncRequests")().asInstanceOf[Boolean]
  
  inline def isWaitingFor(url: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWaitingFor")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def removeNotity(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNotity")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def set(url: String, content: Response): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(url.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type NotifyCallback = js.Function1[/* url */ String, Unit]
}
