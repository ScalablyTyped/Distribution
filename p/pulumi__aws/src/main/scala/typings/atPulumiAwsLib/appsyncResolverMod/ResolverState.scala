package typings
package atPulumiAwsLib.appsyncResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverState extends js.Object {
  /**
    * The API ID for the GraphQL API.
    */
  val apiId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The DataSource name.
    */
  val dataSource: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The field name from the schema defined in the GraphQL API.
    */
  val field: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The request mapping template for this resolver.
    */
  val requestTemplate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The response mapping template for this resolver.
    */
  val responseTemplate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type name from the schema defined in the GraphQL API.
    */
  val `type`: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ResolverState {
  @scala.inline
  def apply(
    apiId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dataSource: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    field: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    requestTemplate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    responseTemplate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ResolverState = {
    val __obj = js.Dynamic.literal()
    if (apiId != null) __obj.updateDynamic("apiId")(apiId.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (requestTemplate != null) __obj.updateDynamic("requestTemplate")(requestTemplate.asInstanceOf[js.Any])
    if (responseTemplate != null) __obj.updateDynamic("responseTemplate")(responseTemplate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverState]
  }
}

