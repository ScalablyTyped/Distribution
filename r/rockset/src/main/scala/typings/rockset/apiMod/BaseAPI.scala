package typings.rockset.apiMod

import typings.rockset.configurationMod.Configuration
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rockset/dist/codegen/api", "BaseAPI")
@js.native
open class BaseAPI () extends StObject {
  def this(configuration: Configuration) = this()
  def this(configuration: Unit, basePath: String) = this()
  def this(configuration: Configuration, basePath: String) = this()
  def this(configuration: Unit, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Unit, basePath: Unit, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: Unit, fetch: FetchAPI) = this()
  
  /* protected */ var basePath: String = js.native
  
  /* protected */ var configuration: Configuration = js.native
  
  /* protected */ def fetch(url: String): js.Promise[Response] = js.native
  /* protected */ def fetch(url: String, init: Any): js.Promise[Response] = js.native
  /* protected */ @JSName("fetch")
  var fetch_Original: FetchAPI = js.native
}
