package typings.pulumiAws

import typings.pulumiAws.portfolioMod.PortfolioArgs
import typings.pulumiAws.portfolioMod.PortfolioState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicecatalogMod {
  
  @JSImport("@pulumi/aws/servicecatalog", "Portfolio")
  @js.native
  class Portfolio protected ()
    extends typings.pulumiAws.portfolioMod.Portfolio {
    /**
      * Create a Portfolio resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PortfolioArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: PortfolioArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Portfolio {
    
    @JSImport("@pulumi/aws/servicecatalog", "Portfolio")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Portfolio resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.portfolioMod.Portfolio = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.portfolioMod.Portfolio]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.portfolioMod.Portfolio = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.portfolioMod.Portfolio]
    inline def get(name: String, id: Input[ID], state: PortfolioState): typings.pulumiAws.portfolioMod.Portfolio = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.portfolioMod.Portfolio]
    inline def get(name: String, id: Input[ID], state: PortfolioState, opts: CustomResourceOptions): typings.pulumiAws.portfolioMod.Portfolio = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.portfolioMod.Portfolio]
    
    /**
      * Returns true if the given object is an instance of Portfolio.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicecatalog/portfolio.Portfolio */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/servicecatalog/portfolio.Portfolio */ Boolean]
  }
}
