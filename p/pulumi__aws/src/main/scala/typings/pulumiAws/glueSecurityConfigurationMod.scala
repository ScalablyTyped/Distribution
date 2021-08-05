package typings.pulumiAws

import typings.pulumiAws.outputMod.glue.SecurityConfigurationEncryptionConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glueSecurityConfigurationMod {
  
  @JSImport("@pulumi/aws/glue/securityConfiguration", "SecurityConfiguration")
  @js.native
  class SecurityConfiguration protected () extends CustomResource {
    /**
      * Create a SecurityConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecurityConfigurationArgs) = this()
    def this(name: String, args: SecurityConfigurationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Configuration block containing encryption configuration. Detailed below.
      */
    val encryptionConfiguration: Output_[SecurityConfigurationEncryptionConfiguration] = js.native
    
    /**
      * Name of the security configuration.
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object SecurityConfiguration {
    
    @JSImport("@pulumi/aws/glue/securityConfiguration", "SecurityConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SecurityConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): SecurityConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SecurityConfiguration]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SecurityConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SecurityConfiguration]
    inline def get(name: String, id: Input[ID], state: SecurityConfigurationState): SecurityConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SecurityConfiguration]
    inline def get(name: String, id: Input[ID], state: SecurityConfigurationState, opts: CustomResourceOptions): SecurityConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SecurityConfiguration]
    
    /**
      * Returns true if the given object is an instance of SecurityConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/securityConfiguration.SecurityConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/securityConfiguration.SecurityConfiguration */ Boolean]
  }
  
  trait SecurityConfigurationArgs extends StObject {
    
    /**
      * Configuration block containing encryption configuration. Detailed below.
      */
    val encryptionConfiguration: Input[typings.pulumiAws.inputMod.glue.SecurityConfigurationEncryptionConfiguration]
    
    /**
      * Name of the security configuration.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object SecurityConfigurationArgs {
    
    inline def apply(
      encryptionConfiguration: Input[typings.pulumiAws.inputMod.glue.SecurityConfigurationEncryptionConfiguration]
    ): SecurityConfigurationArgs = {
      val __obj = js.Dynamic.literal(encryptionConfiguration = encryptionConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecurityConfigurationArgs]
    }
    
    extension [Self <: SecurityConfigurationArgs](x: Self) {
      
      inline def setEncryptionConfiguration(value: Input[typings.pulumiAws.inputMod.glue.SecurityConfigurationEncryptionConfiguration]): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait SecurityConfigurationState extends StObject {
    
    /**
      * Configuration block containing encryption configuration. Detailed below.
      */
    val encryptionConfiguration: js.UndefOr[
        Input[typings.pulumiAws.inputMod.glue.SecurityConfigurationEncryptionConfiguration]
      ] = js.undefined
    
    /**
      * Name of the security configuration.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object SecurityConfigurationState {
    
    inline def apply(): SecurityConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecurityConfigurationState]
    }
    
    extension [Self <: SecurityConfigurationState](x: Self) {
      
      inline def setEncryptionConfiguration(value: Input[typings.pulumiAws.inputMod.glue.SecurityConfigurationEncryptionConfiguration]): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
      
      inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
