package typings.rockset.distCodegenApiMod

import typings.rockset.distCodegenConfigurationMod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rockset/dist/codegen/api", "QueriesApi")
@js.native
open class QueriesApi () extends BaseAPI {
  def this(configuration: Configuration) = this()
  def this(configuration: Unit, basePath: String) = this()
  def this(configuration: Configuration, basePath: String) = this()
  def this(configuration: Unit, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Unit, basePath: Unit, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: Unit, fetch: FetchAPI) = this()
  
  /**
    * Make a SQL query to Rockset.
    * @summary Query
    * @param {QueryRequest} body JSON object
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof QueriesApi
    */
  def query(body: QueryRequest): js.Promise[QueryResponse] = js.native
  def query(body: QueryRequest, options: Any): js.Promise[QueryResponse] = js.native
}
