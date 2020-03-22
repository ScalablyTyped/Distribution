package typings.pulumiAws.routeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.appmesh.RouteSpec
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteState extends js.Object {
  /**
    * The ARN of the route.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The creation date of the route.
    */
  val createdDate: js.UndefOr[Input[String]] = js.native
  /**
    * The last update date of the route.
    */
  val lastUpdatedDate: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the service mesh in which to create the route.
    */
  val meshName: js.UndefOr[Input[String]] = js.native
  /**
    * A name for the HTTP header in the client request that will be matched on.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The route specification to apply.
    */
  val spec: js.UndefOr[Input[RouteSpec]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The name of the virtual router in which to create the route.
    */
  val virtualRouterName: js.UndefOr[Input[String]] = js.native
}

object RouteState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    createdDate: Input[String] = null,
    lastUpdatedDate: Input[String] = null,
    meshName: Input[String] = null,
    name: Input[String] = null,
    spec: Input[RouteSpec] = null,
    tags: Input[StringDictionary[_]] = null,
    virtualRouterName: Input[String] = null
  ): RouteState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate.asInstanceOf[js.Any])
    if (meshName != null) __obj.updateDynamic("meshName")(meshName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (virtualRouterName != null) __obj.updateDynamic("virtualRouterName")(virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteState]
  }
}

