package typings.relayDashCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libGraphQLIRMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.graphql.typeDefinitionMod.GraphQLLeafType
  import typings.graphql.typeDefinitionMod.GraphQLNonNull

  type Metadata = js.UndefOr[StringDictionary[js.Any]]
  type ScalarFieldType = GraphQLLeafType | ScalarFieldTypeGraphQLList | (GraphQLNonNull[GraphQLLeafType | ScalarFieldTypeGraphQLList])
}
