package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "servicecatalog")
@js.native
object servicecatalogNs extends js.Object {
  @js.native
  class Portfolio protected ()
    extends atPulumiAwsLib.servicecatalogMod.Portfolio {
    /**
      * Create a Portfolio resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.servicecatalogPortfolioMod.PortfolioArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.servicecatalogPortfolioMod.PortfolioArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  /* static members */
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.servicecatalogPortfolioMod.Portfolio = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.servicecatalogPortfolioMod.PortfolioState
    ): atPulumiAwsLib.servicecatalogPortfolioMod.Portfolio = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.servicecatalogPortfolioMod.PortfolioState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.servicecatalogPortfolioMod.Portfolio = js.native
    /**
      * Returns true if the given object is an instance of Portfolio.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicecatalog/portfolio.Portfolio */ scala.Boolean = js.native
  }
  
}

