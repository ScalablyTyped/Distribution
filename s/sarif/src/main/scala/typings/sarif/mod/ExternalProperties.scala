package typings.sarif.mod

import typings.sarif.mod.ExternalProperties.version
import typings.sarif.sarifStrings.`2Dot1Dot0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalProperties extends js.Object {
  
  /**
    * Addresses that will be merged with a separate run.
    */
  var addresses: js.UndefOr[js.Array[Address]] = js.native
  
  /**
    * An array of artifact objects that will be merged with a separate run.
    */
  var artifacts: js.UndefOr[js.Array[Artifact]] = js.native
  
  /**
    * A conversion object that will be merged with a separate run.
    */
  var conversion: js.UndefOr[Conversion] = js.native
  
  /**
    * The analysis tool object that will be merged with a separate run.
    */
  var driver: js.UndefOr[ToolComponent] = js.native
  
  /**
    * Tool extensions that will be merged with a separate run.
    */
  var extensions: js.UndefOr[js.Array[ToolComponent]] = js.native
  
  /**
    * Key/value pairs that provide additional information that will be merged with a separate run.
    */
  var externalizedProperties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * An array of graph objects that will be merged with a separate run.
    */
  var graphs: js.UndefOr[js.Array[Graph]] = js.native
  
  /**
    * A stable, unique identifer for this external properties object, in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.native
  
  /**
    * Describes the invocation of the analysis tool that will be merged with a separate run.
    */
  var invocations: js.UndefOr[js.Array[Invocation]] = js.native
  
  /**
    * An array of logical locations such as namespaces, types or functions that will be merged with a separate run.
    */
  var logicalLocations: js.UndefOr[js.Array[LogicalLocation]] = js.native
  
  /**
    * Tool policies that will be merged with a separate run.
    */
  var policies: js.UndefOr[js.Array[ToolComponent]] = js.native
  
  /**
    * Key/value pairs that provide additional information about the external properties.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * An array of result objects that will be merged with a separate run.
    */
  var results: js.UndefOr[js.Array[Result]] = js.native
  
  /**
    * A stable, unique identifer for the run associated with this external properties object, in the form of a GUID.
    */
  var runGuid: js.UndefOr[String] = js.native
  
  /**
    * The URI of the JSON schema corresponding to the version of the external property file format.
    */
  var schema: js.UndefOr[String] = js.native
  
  /**
    * Tool taxonomies that will be merged with a separate run.
    */
  var taxonomies: js.UndefOr[js.Array[ToolComponent]] = js.native
  
  /**
    * An array of threadFlowLocation objects that will be merged with a separate run.
    */
  var threadFlowLocations: js.UndefOr[js.Array[ThreadFlowLocation]] = js.native
  
  /**
    * Tool translations that will be merged with a separate run.
    */
  var translations: js.UndefOr[js.Array[ToolComponent]] = js.native
  
  /**
    * The SARIF format version of this external properties object.
    */
  var version: js.UndefOr[version] = js.native
  
  /**
    * Requests that will be merged with a separate run.
    */
  var webRequests: js.UndefOr[js.Array[WebRequest]] = js.native
  
  /**
    * Responses that will be merged with a separate run.
    */
  var webResponses: js.UndefOr[js.Array[WebResponse]] = js.native
}
@JSImport("sarif", "ExternalProperties")
@js.native
object ExternalProperties extends js.Object {
  
  type version = `2Dot1Dot0`
}
