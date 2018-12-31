package typings
package atPulumiAwsLib.servicecatalogPortfolioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicecatalog/portfolio", "Portfolio")
@js.native
class Portfolio protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a Portfolio resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: PortfolioArgs) = this()
  def this(name: java.lang.String, args: PortfolioArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val arn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val createdTime: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Description of the portfolio
    */
  val description: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of the portfolio.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Name of the person or organization who owns the portfolio.
    */
  val providerName: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Tags to apply to the connection.
    */
  val tags: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
}

@JSImport("@pulumi/aws/servicecatalog/portfolio", "Portfolio")
@js.native
object Portfolio extends js.Object {
  /**
    * Get an existing Portfolio resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.servicecatalogPortfolioMod.Portfolio = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.servicecatalogPortfolioMod.PortfolioState
  ): atPulumiAwsLib.servicecatalogPortfolioMod.Portfolio = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.servicecatalogPortfolioMod.PortfolioState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.servicecatalogPortfolioMod.Portfolio = js.native
}

