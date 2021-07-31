package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.imagebuilder.GetDistributionConfigurationDistribution
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDistributionConfigurationMod {
  
  @JSImport("@pulumi/aws/imagebuilder/getDistributionConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getDistributionConfiguration(args: GetDistributionConfigurationArgs): js.Promise[GetDistributionConfigurationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDistributionConfiguration")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetDistributionConfigurationResult]]
  @scala.inline
  def getDistributionConfiguration(args: GetDistributionConfigurationArgs, opts: InvokeOptions): js.Promise[GetDistributionConfigurationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistributionConfiguration")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDistributionConfigurationResult]]
  
  trait GetDistributionConfigurationArgs extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the distribution configuration.
      */
    val arn: String
    
    /**
      * Key-value map of resource tags for the distribution configuration.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetDistributionConfigurationArgs {
    
    @scala.inline
    def apply(arn: String): GetDistributionConfigurationArgs = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDistributionConfigurationArgs]
    }
    
    @scala.inline
    implicit class GetDistributionConfigurationArgsMutableBuilder[Self <: GetDistributionConfigurationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetDistributionConfigurationResult extends StObject {
    
    val arn: String
    
    /**
      * Date the distribution configuration was created.
      */
    val dateCreated: String
    
    /**
      * Date the distribution configuration was updated.
      */
    val dateUpdated: String
    
    /**
      * Description to apply to distributed AMI.
      */
    val description: String
    
    /**
      * Set of distributions.
      */
    val distributions: js.Array[GetDistributionConfigurationDistribution]
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Name of the distribution configuration.
      */
    val name: String
    
    /**
      * Key-value map of resource tags for the distribution configuration.
      */
    val tags: StringDictionary[String]
  }
  object GetDistributionConfigurationResult {
    
    @scala.inline
    def apply(
      arn: String,
      dateCreated: String,
      dateUpdated: String,
      description: String,
      distributions: js.Array[GetDistributionConfigurationDistribution],
      id: String,
      name: String,
      tags: StringDictionary[String]
    ): GetDistributionConfigurationResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], distributions = distributions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDistributionConfigurationResult]
    }
    
    @scala.inline
    implicit class GetDistributionConfigurationResultMutableBuilder[Self <: GetDistributionConfigurationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateCreated(value: String): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUpdated(value: String): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistributions(value: js.Array[GetDistributionConfigurationDistribution]): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistributionsVarargs(value: GetDistributionConfigurationDistribution*): Self = StObject.set(x, "distributions", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
