package typings.relayDashCompiler.relayDashCompilerMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.languageAstMod.DefinitionNode
import typings.relayDashCompiler.libGraphQLIRMod.Fragment
import typings.relayDashCompiler.libGraphQLIRMod.Root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler", "Parser")
@js.native
object ParserNs extends js.Object {
  def parse(schema: GraphQLSchema, text: String): js.Array[Root | Fragment] = js.native
  def parse(schema: GraphQLSchema, text: String, filename: String): js.Array[Root | Fragment] = js.native
  def transform(schema: GraphQLSchema, documents: js.Array[DefinitionNode]): js.Array[Root | Fragment] = js.native
}

