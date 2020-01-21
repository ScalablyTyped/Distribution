package typings.relayCompiler

import typings.graphql.astMod.DefinitionNode
import typings.graphql.mod.GraphQLSchema
import typings.relayCompiler.graphQLIRMod.Fragment
import typings.relayCompiler.graphQLIRMod.Root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/core/RelayParser", JSImport.Namespace)
@js.native
object relayParserMod extends js.Object {
  def parse(schema: GraphQLSchema, text: String): js.Array[Root | Fragment] = js.native
  def parse(schema: GraphQLSchema, text: String, filename: String): js.Array[Root | Fragment] = js.native
  def transform(schema: GraphQLSchema, documents: js.Array[DefinitionNode]): js.Array[Root | Fragment] = js.native
}

