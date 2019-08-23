package typings.relayDashCompiler

import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/ASTConvert", JSImport.Namespace)
@js.native
object libASTConvertMod extends js.Object {
  def transformASTSchema(schema: GraphQLSchema, transforms: js.Array[String]): GraphQLSchema = js.native
}

