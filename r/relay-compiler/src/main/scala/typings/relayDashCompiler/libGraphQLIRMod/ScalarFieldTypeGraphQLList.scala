package typings.relayDashCompiler.libGraphQLIRMod

import typings.graphql.typeDefinitionMod.GraphQLList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalarFieldTypeGraphQLList extends GraphQLList[ScalarFieldType]

object ScalarFieldTypeGraphQLList {
  @scala.inline
  def apply(inspect: () => String, ofType: ScalarFieldType, toJSON: () => String): ScalarFieldTypeGraphQLList = {
    val __obj = js.Dynamic.literal(inspect = js.Any.fromFunction0(inspect), ofType = ofType.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[ScalarFieldTypeGraphQLList]
  }
}

