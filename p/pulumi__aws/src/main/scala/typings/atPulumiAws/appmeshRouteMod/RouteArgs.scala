package typings.atPulumiAws.appmeshRouteMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.appmesh.RouteSpec
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteArgs extends js.Object {
  /**
    * The name of the service mesh in which to create the route.
    */
  val meshName: Input[String]
  /**
    * The name to use for the route.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The route specification to apply.
    */
  val spec: Input[RouteSpec]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The name of the virtual router in which to create the route.
    */
  val virtualRouterName: Input[String]
}

object RouteArgs {
  @scala.inline
  def apply(
    meshName: Input[String],
    spec: Input[RouteSpec],
    virtualRouterName: Input[String],
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): RouteArgs = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteArgs]
  }
}

