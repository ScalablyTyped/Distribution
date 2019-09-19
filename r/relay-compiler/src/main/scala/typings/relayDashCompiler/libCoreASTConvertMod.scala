package typings.relayDashCompiler

import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/core/ASTConvert", JSImport.Namespace)
@js.native
object libCoreASTConvertMod extends js.Object {
  def transformASTSchema(schema: GraphQLSchema, transforms: js.Array[String]): GraphQLSchema = js.native
}

