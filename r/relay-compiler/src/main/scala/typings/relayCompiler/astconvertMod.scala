package typings.relayCompiler

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/core/ASTConvert", JSImport.Namespace)
@js.native
object astconvertMod extends js.Object {
  def transformASTSchema(schema: GraphQLSchema, transforms: js.Array[String]): GraphQLSchema = js.native
}

