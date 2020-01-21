package typings.prismaBinding

import typings.graphql.mod.GraphQLSchema
import typings.prismaBinding.sharedLinkMod.SharedLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding/dist/cache", JSImport.Namespace)
@js.native
object cacheMod extends js.Object {
  def getCachedRemoteSchema(endpoint: String, typeDefs: String, link: SharedLink): GraphQLSchema = js.native
  def getCachedRemoteSchema(endpoint: String, typeDefs: String, link: SharedLink, disableCache: Boolean): GraphQLSchema = js.native
  def getCachedTypeDefs(schemaPath: String): String = js.native
  def getCachedTypeDefs(schemaPath: String, disableCache: Boolean): String = js.native
}

