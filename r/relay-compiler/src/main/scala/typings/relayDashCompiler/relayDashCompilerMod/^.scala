package typings.relayDashCompiler.relayDashCompilerMod

import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var transformASTSchema: js.Function2[/* schema */ GraphQLSchema, /* transforms */ js.Array[String], GraphQLSchema] = js.native
}

