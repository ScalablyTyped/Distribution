package typings.rockset.apiMod

import typings.rockset.configurationMod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rockset/dist/codegen/api", "OrganizationsApi")
@js.native
open class OrganizationsApi () extends BaseAPI {
  def this(configuration: Configuration) = this()
  def this(configuration: Unit, basePath: String) = this()
  def this(configuration: Configuration, basePath: String) = this()
  def this(configuration: Unit, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Unit, basePath: Unit, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: Unit, fetch: FetchAPI) = this()
  
  /**
    * Retrieve information about current organization.
    * @summary Get Organization
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof OrganizationsApi
    */
  def getOrganization(): js.Promise[OrganizationResponse] = js.native
  def getOrganization(options: Any): js.Promise[OrganizationResponse] = js.native
}
