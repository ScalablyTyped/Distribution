package typings
package atPulumiAwsLib.appmeshRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteArgs extends js.Object {
  /**
    * The name of the service mesh in which to create the route.
    */
  val meshName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name to use for the route.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The route specification to apply.
    */
  val spec: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_HttpRouteAnonActionMatch]
  /**
    * The name of the virtual router in which to create the route.
    */
  val virtualRouterName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object RouteArgs {
  @scala.inline
  def apply(
    meshName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    spec: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_HttpRouteAnonActionMatch],
    virtualRouterName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): RouteArgs = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteArgs]
  }
}

