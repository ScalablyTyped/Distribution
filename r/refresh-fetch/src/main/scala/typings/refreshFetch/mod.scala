package typings.refreshFetch

import typings.refreshFetch.anon.Body
import typings.refreshFetch.anon.Fetch
import typings.std.Request
import typings.std.RequestInit
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("refresh-fetch", "configureRefreshFetch")
  @js.native
  def configureRefreshFetch[T](configuration: Fetch[T]): T = js.native
  
  @JSImport("refresh-fetch", "fetchJSON")
  @js.native
  def fetchJSON[ResponseBody](url: String): js.Promise[Body[ResponseBody]] = js.native
  @JSImport("refresh-fetch", "fetchJSON")
  @js.native
  def fetchJSON[ResponseBody](url: String, options: RequestInit): js.Promise[Body[ResponseBody]] = js.native
  @JSImport("refresh-fetch", "fetchJSON")
  @js.native
  def fetchJSON[ResponseBody](url: Request): js.Promise[Body[ResponseBody]] = js.native
  @JSImport("refresh-fetch", "fetchJSON")
  @js.native
  def fetchJSON[ResponseBody](url: Request, options: RequestInit): js.Promise[Body[ResponseBody]] = js.native
  @JSImport("refresh-fetch", "fetchJSON")
  @js.native
  def fetchJSON[ResponseBody](url: URL): js.Promise[Body[ResponseBody]] = js.native
  @JSImport("refresh-fetch", "fetchJSON")
  @js.native
  def fetchJSON[ResponseBody](url: URL, options: RequestInit): js.Promise[Body[ResponseBody]] = js.native
}
