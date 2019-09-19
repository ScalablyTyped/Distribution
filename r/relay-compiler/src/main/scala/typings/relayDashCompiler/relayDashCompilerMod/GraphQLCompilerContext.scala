package typings.relayDashCompiler.relayDashCompilerMod

import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler", "GraphQLCompilerContext")
@js.native
class GraphQLCompilerContext protected ()
  extends typings.relayDashCompiler.libCoreGraphQLCompilerContextMod.GraphQLCompilerContext {
  def this(serverSchema: GraphQLSchema) = this()
  def this(serverSchema: GraphQLSchema, clientSchema: GraphQLSchema) = this()
}

