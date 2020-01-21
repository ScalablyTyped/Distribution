package typings.relayCompiler

import typings.graphql.definitionMod.GraphQLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/core/GraphQLSchemaUtils", JSImport.Namespace)
@js.native
object graphQLSchemaUtilsMod extends js.Object {
  def isAbstractType(`type`: GraphQLType): Boolean = js.native
}

