package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mskConfigurationMod {
  
  @JSImport("@pulumi/aws/msk/configuration", "Configuration")
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
      * Amazon Resource Name (ARN) of the configuration.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Description of the configuration.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * List of Apache Kafka versions which can use this configuration.
      */
    val kafkaVersions: Output_[js.Array[String]] = js.native
    
    /**
      * Latest revision of the configuration.
      */
    val latestRevision: Output_[Double] = js.native
    
    /**
      * Name of the configuration.
      */
    val name: Output_[String] = js.native
    
    /**
      * Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
      */
    val serverProperties: Output_[String] = js.native
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
    @JSImport("@pulumi/aws/msk/configuration", "Configuration.get")
    @js.native
    def get(name: String, id: Input[ID]): Configuration = js.native
    @JSImport("@pulumi/aws/msk/configuration", "Configuration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Configuration = js.native
    @JSImport("@pulumi/aws/msk/configuration", "Configuration.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationState): Configuration = js.native
    @JSImport("@pulumi/aws/msk/configuration", "Configuration.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationState, opts: CustomResourceOptions): Configuration = js.native
    
    /**
      * Returns true if the given object is an instance of Configuration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/msk/configuration", "Configuration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/msk/configuration.Configuration */ Boolean = js.native
  }
  
  @js.native
  trait ConfigurationArgs extends StObject {
    
    /**
      * Description of the configuration.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of Apache Kafka versions which can use this configuration.
      */
    val kafkaVersions: Input[js.Array[Input[String]]] = js.native
    
    /**
      * Name of the configuration.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
      */
    val serverProperties: Input[String] = js.native
  }
  object ConfigurationArgs {
    
    @scala.inline
    def apply(kafkaVersions: Input[js.Array[Input[String]]], serverProperties: Input[String]): ConfigurationArgs = {
      val __obj = js.Dynamic.literal(kafkaVersions = kafkaVersions.asInstanceOf[js.Any], serverProperties = serverProperties.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationArgs]
    }
    
    @scala.inline
    implicit class ConfigurationArgsMutableBuilder[Self <: ConfigurationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setKafkaVersions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "kafkaVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKafkaVersionsVarargs(value: Input[String]*): Self = StObject.set(x, "kafkaVersions", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setServerProperties(value: Input[String]): Self = StObject.set(x, "serverProperties", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConfigurationState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the configuration.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Description of the configuration.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of Apache Kafka versions which can use this configuration.
      */
    val kafkaVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Latest revision of the configuration.
      */
    val latestRevision: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Name of the configuration.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
      */
    val serverProperties: js.UndefOr[Input[String]] = js.native
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
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setKafkaVersions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "kafkaVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKafkaVersionsUndefined: Self = StObject.set(x, "kafkaVersions", js.undefined)
      
      @scala.inline
      def setKafkaVersionsVarargs(value: Input[String]*): Self = StObject.set(x, "kafkaVersions", js.Array(value :_*))
      
      @scala.inline
      def setLatestRevision(value: Input[Double]): Self = StObject.set(x, "latestRevision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestRevisionUndefined: Self = StObject.set(x, "latestRevision", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setServerProperties(value: Input[String]): Self = StObject.set(x, "serverProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerPropertiesUndefined: Self = StObject.set(x, "serverProperties", js.undefined)
    }
  }
}
