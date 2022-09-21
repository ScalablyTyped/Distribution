package typings.rockset.codegenMod

import typings.rockset.apiMod.FetchAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rockset/dist/codegen", "BaseAPI")
@js.native
open class BaseAPI ()
  extends typings.rockset.apiMod.BaseAPI {
  def this(configuration: typings.rockset.configurationMod.Configuration) = this()
  def this(configuration: Unit, basePath: String) = this()
  def this(configuration: typings.rockset.configurationMod.Configuration, basePath: String) = this()
  def this(configuration: Unit, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Unit, basePath: Unit, fetch: FetchAPI) = this()
  def this(configuration: typings.rockset.configurationMod.Configuration, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: typings.rockset.configurationMod.Configuration, basePath: Unit, fetch: FetchAPI) = this()
}
