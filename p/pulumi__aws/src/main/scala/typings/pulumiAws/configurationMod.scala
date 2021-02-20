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

object configurationMod {
  
  @JSImport("@pulumi/aws/mq/configuration", "Configuration")
  @js.native
  class Configuration protected () extends CustomResource {
    /**
      * Create a Configuration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConfigurationArgs) = this()
    def this(name: String, args: ConfigurationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the configuration.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The broker configuration in XML format.
      * See [official docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/amazon-mq-broker-configuration-parameters.html)
      * for supported parameters and format of the XML.
      */
    val data: Output_[String] = js.native
    
    /**
      * The description of the configuration.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The type of broker engine.
      */
    val engineType: Output_[String] = js.native
    
    /**
      * The version of the broker engine.
      */
    val engineVersion: Output_[String] = js.native
    
    /**
      * The latest revision of the configuration.
      */
    val latestRevision: Output_[Double] = js.native
    
    /**
      * The name of the configuration
      */
    val name: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Configuration {
    
    /**
      * Get an existing Configuration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/mq/configuration", "Configuration.get")
    @js.native
    def get(name: String, id: Input[ID]): Configuration = js.native
    @JSImport("@pulumi/aws/mq/configuration", "Configuration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Configuration = js.native
    @JSImport("@pulumi/aws/mq/configuration", "Configuration.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationState): Configuration = js.native
    @JSImport("@pulumi/aws/mq/configuration", "Configuration.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationState, opts: CustomResourceOptions): Configuration = js.native
    
    /**
      * Returns true if the given object is an instance of Configuration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/mq/configuration", "Configuration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mq/configuration.Configuration */ Boolean = js.native
  }
  
  @js.native
  trait ConfigurationArgs extends StObject {
    
    /**
      * The broker configuration in XML format.
      * See [official docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/amazon-mq-broker-configuration-parameters.html)
      * for supported parameters and format of the XML.
      */
    val data: Input[String] = js.native
    
    /**
      * The description of the configuration.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of broker engine.
      */
    val engineType: Input[String] = js.native
    
    /**
      * The version of the broker engine.
      */
    val engineVersion: Input[String] = js.native
    
    /**
      * The name of the configuration
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ConfigurationArgs {
    
    @scala.inline
    def apply(data: Input[String], engineType: Input[String], engineVersion: Input[String]): ConfigurationArgs = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationArgs]
    }
    
    @scala.inline
    implicit class ConfigurationArgsMutableBuilder[Self <: ConfigurationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Input[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEngineType(value: Input[String]): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ConfigurationState extends StObject {
    
    /**
      * The ARN of the configuration.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The broker configuration in XML format.
      * See [official docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/amazon-mq-broker-configuration-parameters.html)
      * for supported parameters and format of the XML.
      */
    val data: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the configuration.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of broker engine.
      */
    val engineType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The version of the broker engine.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The latest revision of the configuration.
      */
    val latestRevision: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The name of the configuration
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ConfigurationState {
    
    @scala.inline
    def apply(): ConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationState]
    }
    
    @scala.inline
    implicit class ConfigurationStateMutableBuilder[Self <: ConfigurationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setData(value: Input[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEngineType(value: Input[String]): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineTypeUndefined: Self = StObject.set(x, "engineType", js.undefined)
      
      @scala.inline
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setLatestRevision(value: Input[Double]): Self = StObject.set(x, "latestRevision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestRevisionUndefined: Self = StObject.set(x, "latestRevision", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
