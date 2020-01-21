package typings.relayCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphQLIRMod {
  type Metadata = js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]]
  type ScalarFieldType = typings.graphql.definitionMod.GraphQLLeafType | typings.relayCompiler.graphQLIRMod.ScalarFieldTypeGraphQLList | (typings.graphql.definitionMod.GraphQLNonNull[
    typings.graphql.definitionMod.GraphQLLeafType | typings.relayCompiler.graphQLIRMod.ScalarFieldTypeGraphQLList
  ])
}
