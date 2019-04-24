package typings
package atPulumiAwsLib.appsyncResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverArgs extends js.Object {
  /**
    * The API ID for the GraphQL API.
    */
  val apiId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The DataSource name.
    */
  val dataSource: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The field name from the schema defined in the GraphQL API.
    */
  val field: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The request mapping template for this resolver.
    */
  val requestTemplate: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The response mapping template for this resolver.
    */
  val responseTemplate: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The type name from the schema defined in the GraphQL API.
    */
  val `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object ResolverArgs {
  @scala.inline
  def apply(
    apiId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    dataSource: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    field: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    requestTemplate: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    responseTemplate: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): ResolverArgs = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], requestTemplate = requestTemplate.asInstanceOf[js.Any], responseTemplate = responseTemplate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverArgs]
  }
}

