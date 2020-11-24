package typings.relayRuntime.relayNetworkTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithData
  - typings.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithExtensionsOnly
  - typings.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithoutData
*/
trait GraphQLSingularResponse extends js.Object
object GraphQLSingularResponse {
  
  @scala.inline
  def GraphQLResponseWithData(data: PayloadData): GraphQLSingularResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSingularResponse]
  }
  
  @scala.inline
  def GraphQLResponseWithExtensionsOnly(data: Null, extensions: PayloadExtensions): GraphQLSingularResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSingularResponse]
  }
  
  @scala.inline
  def GraphQLResponseWithoutData(errors: js.Array[PayloadError]): GraphQLSingularResponse = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSingularResponse]
  }
}
