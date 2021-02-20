package typings.pulumiAws

import typings.pulumiAws.outputMod.glue.SecurityConfigurationEncryptionConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing SecurityConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue/securityConfiguration", "SecurityConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): SecurityConfiguration = js.native
    @JSImport("@pulumi/aws/glue/securityConfiguration", "SecurityConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SecurityConfiguration = js.native
    @JSImport("@pulumi/aws/glue/securityConfiguration", "SecurityConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecurityConfigurationState): SecurityConfiguration = js.native
    @JSImport("@pulumi/aws/glue/securityConfiguration", "SecurityConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecurityConfigurationState, opts: CustomResourceOptions): SecurityConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of SecurityConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue/securityConfiguration", "SecurityConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/securityConfiguration.SecurityConfiguration */ Boolean = js.native
  }
  
  @js.native
  trait SecurityConfigurationArgs extends StObject {
    
    /**
      * Configuration block containing encryption configuration. Detailed below.
      */
    val encryptionConfiguration: Input[typings.pulumiAws.inputMod.glue.SecurityConfigurationEncryptionConfiguration] = js.native
    
    /**
      * Name of the security configuration.
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object SecurityConfigurationArgs {
    
    @scala.inline
    def apply(
      encryptionConfiguration: Input[typings.pulumiAws.inputMod.glue.SecurityConfigurationEncryptionConfiguration]
    ): SecurityConfigurationArgs = {
      val __obj = js.Dynamic.literal(encryptionConfiguration = encryptionConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecurityConfigurationArgs]
    }
    
    @scala.inline
    implicit class SecurityConfigurationArgsMutableBuilder[Self <: SecurityConfigurationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptionConfiguration(value: Input[typings.pulumiAws.inputMod.glue.SecurityConfigurationEncryptionConfiguration]): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait SecurityConfigurationState extends StObject {
    
    /**
      * Configuration block containing encryption configuration. Detailed below.
      */
    val encryptionConfiguration: js.UndefOr[
        Input[typings.pulumiAws.inputMod.glue.SecurityConfigurationEncryptionConfiguration]
      ] = js.native
    
    /**
      * Name of the security configuration.
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object SecurityConfigurationState {
    
    @scala.inline
    def apply(): SecurityConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecurityConfigurationState]
    }
    
    @scala.inline
    implicit class SecurityConfigurationStateMutableBuilder[Self <: SecurityConfigurationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptionConfiguration(value: Input[typings.pulumiAws.inputMod.glue.SecurityConfigurationEncryptionConfiguration]): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
