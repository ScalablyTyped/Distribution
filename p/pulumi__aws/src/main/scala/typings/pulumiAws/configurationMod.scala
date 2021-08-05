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
    
    @JSImport("@pulumi/aws/mq/configuration", "Configuration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Configuration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Configuration]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Configuration]
    inline def get(name: String, id: Input[ID], state: ConfigurationState): Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Configuration]
    inline def get(name: String, id: Input[ID], state: ConfigurationState, opts: CustomResourceOptions): Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Configuration]
    
    /**
      * Returns true if the given object is an instance of Configuration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mq/configuration.Configuration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/mq/configuration.Configuration */ Boolean]
  }
  
  trait ConfigurationArgs extends StObject {
    
    /**
      * The broker configuration in XML format.
      * See [official docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/amazon-mq-broker-configuration-parameters.html)
      * for supported parameters and format of the XML.
      */
    val data: Input[String]
    
    /**
      * The description of the configuration.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of broker engine.
      */
    val engineType: Input[String]
    
    /**
      * The version of the broker engine.
      */
    val engineVersion: Input[String]
    
    /**
      * The name of the configuration
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ConfigurationArgs {
    
    inline def apply(data: Input[String], engineType: Input[String], engineVersion: Input[String]): ConfigurationArgs = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationArgs]
    }
    
    extension [Self <: ConfigurationArgs](x: Self) {
      
      inline def setData(value: Input[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEngineType(value: Input[String]): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
      
      inline def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait ConfigurationState extends StObject {
    
    /**
      * The ARN of the configuration.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The broker configuration in XML format.
      * See [official docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/amazon-mq-broker-configuration-parameters.html)
      * for supported parameters and format of the XML.
      */
    val data: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The description of the configuration.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of broker engine.
      */
    val engineType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The version of the broker engine.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The latest revision of the configuration.
      */
    val latestRevision: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The name of the configuration
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ConfigurationState {
    
    inline def apply(): ConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationState]
    }
    
    extension [Self <: ConfigurationState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setData(value: Input[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEngineType(value: Input[String]): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
      
      inline def setEngineTypeUndefined: Self = StObject.set(x, "engineType", js.undefined)
      
      inline def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      inline def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      inline def setLatestRevision(value: Input[Double]): Self = StObject.set(x, "latestRevision", value.asInstanceOf[js.Any])
      
      inline def setLatestRevisionUndefined: Self = StObject.set(x, "latestRevision", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
