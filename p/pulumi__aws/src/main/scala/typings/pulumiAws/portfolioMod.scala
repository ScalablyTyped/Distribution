package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
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
    
    /**
      * Get an existing Portfolio resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/servicecatalog/portfolio", "Portfolio.get")
    @js.native
    def get(name: String, id: Input[ID]): Portfolio = js.native
    @JSImport("@pulumi/aws/servicecatalog/portfolio", "Portfolio.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Portfolio = js.native
    @JSImport("@pulumi/aws/servicecatalog/portfolio", "Portfolio.get")
    @js.native
    def get(name: String, id: Input[ID], state: PortfolioState): Portfolio = js.native
    @JSImport("@pulumi/aws/servicecatalog/portfolio", "Portfolio.get")
    @js.native
    def get(name: String, id: Input[ID], state: PortfolioState, opts: CustomResourceOptions): Portfolio = js.native
    
    /**
      * Returns true if the given object is an instance of Portfolio.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/servicecatalog/portfolio", "Portfolio.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicecatalog/portfolio.Portfolio */ Boolean = js.native
  }
  
  @js.native
  trait PortfolioArgs extends StObject {
    
    /**
      * Description of the portfolio
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the portfolio.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the person or organization who owns the portfolio.
      */
    val providerName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Tags to apply to the connection.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object PortfolioArgs {
    
    @scala.inline
    def apply(): PortfolioArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortfolioArgs]
    }
    
    @scala.inline
    implicit class PortfolioArgsMutableBuilder[Self <: PortfolioArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProviderName(value: Input[String]): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait PortfolioState extends StObject {
    
    val arn: js.UndefOr[Input[String]] = js.native
    
    val createdTime: js.UndefOr[Input[String]] = js.native
    
    /**
      * Description of the portfolio
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the portfolio.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the person or organization who owns the portfolio.
      */
    val providerName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Tags to apply to the connection.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object PortfolioState {
    
    @scala.inline
    def apply(): PortfolioState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortfolioState]
    }
    
    @scala.inline
    implicit class PortfolioStateMutableBuilder[Self <: PortfolioState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCreatedTime(value: Input[String]): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProviderName(value: Input[String]): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
