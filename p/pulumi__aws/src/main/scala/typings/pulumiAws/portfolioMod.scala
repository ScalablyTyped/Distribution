package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portfolioMod {
  
  @JSImport("@pulumi/aws/servicecatalog/portfolio", "Portfolio")
  @js.native
  class Portfolio protected () extends CustomResource {
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
    
    val arn: Output_[String] = js.native
    
    val createdTime: Output_[String] = js.native
    
    /**
      * Description of the portfolio
      */
    val description: Output_[String] = js.native
    
    /**
      * The name of the portfolio.
      */
    val name: Output_[String] = js.native
    
    /**
      * Name of the person or organization who owns the portfolio.
      */
    val providerName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Tags to apply to the connection.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Portfolio {
    
    @JSImport("@pulumi/aws/servicecatalog/portfolio", "Portfolio")
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
    inline def get(name: String, id: Input[ID]): Portfolio = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Portfolio]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Portfolio = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Portfolio]
    inline def get(name: String, id: Input[ID], state: PortfolioState): Portfolio = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Portfolio]
    inline def get(name: String, id: Input[ID], state: PortfolioState, opts: CustomResourceOptions): Portfolio = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Portfolio]
    
    /**
      * Returns true if the given object is an instance of Portfolio.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicecatalog/portfolio.Portfolio */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/servicecatalog/portfolio.Portfolio */ Boolean]
  }
  
  trait PortfolioArgs extends StObject {
    
    /**
      * Description of the portfolio
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the portfolio.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the person or organization who owns the portfolio.
      */
    val providerName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Tags to apply to the connection.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object PortfolioArgs {
    
    inline def apply(): PortfolioArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortfolioArgs]
    }
    
    extension [Self <: PortfolioArgs](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProviderName(value: Input[String]): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
      
      inline def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait PortfolioState extends StObject {
    
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    val createdTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of the portfolio
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the portfolio.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the person or organization who owns the portfolio.
      */
    val providerName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Tags to apply to the connection.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object PortfolioState {
    
    inline def apply(): PortfolioState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortfolioState]
    }
    
    extension [Self <: PortfolioState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCreatedTime(value: Input[String]): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
      
      inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProviderName(value: Input[String]): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
      
      inline def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
