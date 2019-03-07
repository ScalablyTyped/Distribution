package typings
package atPulumiAwsLib.appmeshRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appmesh/route", "Route")
@js.native
class Route protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Route resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: RouteArgs) = this()
  def this(name: java.lang.String, args: RouteArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the route.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The creation date of the route.
    */
  val createdDate: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The last update date of the route.
    */
  val lastUpdatedDate: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the service mesh in which to create the route.
    */
  val meshName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name to use for the route.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The route specification to apply.
    */
  val spec: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_HttpRoute] = js.native
  val virtualRouterName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/appmesh/route", "Route")
@js.native
object Route extends js.Object {
  /**
    * Get an existing Route resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.appmeshRouteMod.Route = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appmeshRouteMod.RouteState
  ): atPulumiAwsLib.appmeshRouteMod.Route = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appmeshRouteMod.RouteState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.appmeshRouteMod.Route = js.native
}

