package typings
package atPulumiAwsLib.appsyncResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appsync/resolver", "Resolver")
@js.native
class Resolver protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Resolver resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ResolverArgs) = this()
  def this(name: java.lang.String, args: ResolverArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The API ID for the GraphQL API.
    */
  val apiId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ARN
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The DataSource name.
    */
  val dataSource: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The field name from the schema defined in the GraphQL API.
    */
  val field: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The request mapping template for this resolver.
    */
  val requestTemplate: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The response mapping template for this resolver.
    */
  val responseTemplate: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The type name from the schema defined in the GraphQL API.
    */
  val `type`: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/appsync/resolver", "Resolver")
@js.native
object Resolver extends js.Object {
  /**
    * Get an existing Resolver resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.appsyncResolverMod.Resolver = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appsyncResolverMod.ResolverState
  ): atPulumiAwsLib.appsyncResolverMod.Resolver = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appsyncResolverMod.ResolverState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.appsyncResolverMod.Resolver = js.native
  /**
    * Returns true if the given object is an instance of Resolver.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/resolver.Resolver */ scala.Boolean = js.native
}

