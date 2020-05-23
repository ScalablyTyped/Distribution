package typings.prismaBinding

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.mod.GraphQLObjectType
import typings.prismaBinding.anon.PluralFieldName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def getDeepListType(field: js.Any): js.Any = js.native
  def getExistsFlowTypes(queryType: GraphQLObjectType[_, _, StringDictionary[_]]): String = js.native
  def getExistsTypes(queryType: GraphQLObjectType[_, _, StringDictionary[_]]): String = js.native
  def getTypesAndWhere(queryType: GraphQLObjectType[_, _, StringDictionary[_]]): js.Array[PluralFieldName] = js.native
  def getWhere(field: js.Any): String = js.native
}

