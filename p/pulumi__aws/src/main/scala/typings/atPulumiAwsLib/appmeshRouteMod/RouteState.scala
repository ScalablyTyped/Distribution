package typings
package atPulumiAwsLib.appmeshRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteState extends js.Object {
  /**
    * The ARN of the route.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The creation date of the route.
    */
  val createdDate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The last update date of the route.
    */
  val lastUpdatedDate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the service mesh in which to create the route.
    */
  val meshName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name to use for the route.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The route specification to apply.
    */
  val spec: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_HttpRouteAnonActionMatch]] = js.undefined
  val virtualRouterName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object RouteState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    createdDate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    lastUpdatedDate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    meshName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    spec: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_HttpRouteAnonActionMatch] = null,
    virtualRouterName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): RouteState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate.asInstanceOf[js.Any])
    if (meshName != null) __obj.updateDynamic("meshName")(meshName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (virtualRouterName != null) __obj.updateDynamic("virtualRouterName")(virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteState]
  }
}

