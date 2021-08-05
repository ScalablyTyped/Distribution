package typings.pulumiAws

import typings.pulumiAws.outputMod.worklink.FleetIdentityProvider
import typings.pulumiAws.outputMod.worklink.FleetNetwork
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object worklinkFleetMod {
  
  @JSImport("@pulumi/aws/worklink/fleet", "Fleet")
  @js.native
  class Fleet protected () extends CustomResource {
    /**
      * Create a Fleet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: FleetArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: FleetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the created WorkLink Fleet.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `"AmazonWorkLink-"`.
      */
    val auditStreamArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The identifier used by users to sign in to the Amazon WorkLink app.
      */
    val companyCode: Output_[String] = js.native
    
    /**
      * The time that the fleet was created.
      */
    val createdTime: Output_[String] = js.native
    
    /**
      * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
      */
    val deviceCaCertificate: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the fleet.
      */
    val displayName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
      */
    val identityProvider: Output_[js.UndefOr[FleetIdentityProvider]] = js.native
    
    /**
      * The time that the fleet was last updated.
      */
    val lastUpdatedTime: Output_[String] = js.native
    
    /**
      * A region-unique name for the AMI.
      */
    val name: Output_[String] = js.native
    
    /**
      * Provide this to allow manage the company network configuration for the fleet. Fields documented below.
      */
    val network: Output_[js.UndefOr[FleetNetwork]] = js.native
    
    /**
      * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
      */
    val optimizeForEndUserLocation: Output_[js.UndefOr[Boolean]] = js.native
  }
  /* static members */
  object Fleet {
    
    @JSImport("@pulumi/aws/worklink/fleet", "Fleet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Fleet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Fleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Fleet]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Fleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Fleet]
    inline def get(name: String, id: Input[ID], state: FleetState): Fleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Fleet]
    inline def get(name: String, id: Input[ID], state: FleetState, opts: CustomResourceOptions): Fleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Fleet]
    
    /**
      * Returns true if the given object is an instance of Fleet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/worklink/fleet.Fleet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/worklink/fleet.Fleet */ Boolean]
  }
  
  trait FleetArgs extends StObject {
    
    /**
      * The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `"AmazonWorkLink-"`.
      */
    val auditStreamArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
      */
    val deviceCaCertificate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the fleet.
      */
    val displayName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
      */
    val identityProvider: js.UndefOr[Input[typings.pulumiAws.inputMod.worklink.FleetIdentityProvider]] = js.undefined
    
    /**
      * A region-unique name for the AMI.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Provide this to allow manage the company network configuration for the fleet. Fields documented below.
      */
    val network: js.UndefOr[Input[typings.pulumiAws.inputMod.worklink.FleetNetwork]] = js.undefined
    
    /**
      * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
      */
    val optimizeForEndUserLocation: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object FleetArgs {
    
    inline def apply(): FleetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetArgs]
    }
    
    extension [Self <: FleetArgs](x: Self) {
      
      inline def setAuditStreamArn(value: Input[String]): Self = StObject.set(x, "auditStreamArn", value.asInstanceOf[js.Any])
      
      inline def setAuditStreamArnUndefined: Self = StObject.set(x, "auditStreamArn", js.undefined)
      
      inline def setDeviceCaCertificate(value: Input[String]): Self = StObject.set(x, "deviceCaCertificate", value.asInstanceOf[js.Any])
      
      inline def setDeviceCaCertificateUndefined: Self = StObject.set(x, "deviceCaCertificate", js.undefined)
      
      inline def setDisplayName(value: Input[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setIdentityProvider(value: Input[typings.pulumiAws.inputMod.worklink.FleetIdentityProvider]): Self = StObject.set(x, "identityProvider", value.asInstanceOf[js.Any])
      
      inline def setIdentityProviderUndefined: Self = StObject.set(x, "identityProvider", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNetwork(value: Input[typings.pulumiAws.inputMod.worklink.FleetNetwork]): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      inline def setOptimizeForEndUserLocation(value: Input[Boolean]): Self = StObject.set(x, "optimizeForEndUserLocation", value.asInstanceOf[js.Any])
      
      inline def setOptimizeForEndUserLocationUndefined: Self = StObject.set(x, "optimizeForEndUserLocation", js.undefined)
    }
  }
  
  trait FleetState extends StObject {
    
    /**
      * The ARN of the created WorkLink Fleet.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `"AmazonWorkLink-"`.
      */
    val auditStreamArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The identifier used by users to sign in to the Amazon WorkLink app.
      */
    val companyCode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The time that the fleet was created.
      */
    val createdTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
      */
    val deviceCaCertificate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the fleet.
      */
    val displayName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
      */
    val identityProvider: js.UndefOr[Input[typings.pulumiAws.inputMod.worklink.FleetIdentityProvider]] = js.undefined
    
    /**
      * The time that the fleet was last updated.
      */
    val lastUpdatedTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A region-unique name for the AMI.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Provide this to allow manage the company network configuration for the fleet. Fields documented below.
      */
    val network: js.UndefOr[Input[typings.pulumiAws.inputMod.worklink.FleetNetwork]] = js.undefined
    
    /**
      * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
      */
    val optimizeForEndUserLocation: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object FleetState {
    
    inline def apply(): FleetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetState]
    }
    
    extension [Self <: FleetState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAuditStreamArn(value: Input[String]): Self = StObject.set(x, "auditStreamArn", value.asInstanceOf[js.Any])
      
      inline def setAuditStreamArnUndefined: Self = StObject.set(x, "auditStreamArn", js.undefined)
      
      inline def setCompanyCode(value: Input[String]): Self = StObject.set(x, "companyCode", value.asInstanceOf[js.Any])
      
      inline def setCompanyCodeUndefined: Self = StObject.set(x, "companyCode", js.undefined)
      
      inline def setCreatedTime(value: Input[String]): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
      
      inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
      
      inline def setDeviceCaCertificate(value: Input[String]): Self = StObject.set(x, "deviceCaCertificate", value.asInstanceOf[js.Any])
      
      inline def setDeviceCaCertificateUndefined: Self = StObject.set(x, "deviceCaCertificate", js.undefined)
      
      inline def setDisplayName(value: Input[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setIdentityProvider(value: Input[typings.pulumiAws.inputMod.worklink.FleetIdentityProvider]): Self = StObject.set(x, "identityProvider", value.asInstanceOf[js.Any])
      
      inline def setIdentityProviderUndefined: Self = StObject.set(x, "identityProvider", js.undefined)
      
      inline def setLastUpdatedTime(value: Input[String]): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
      
      inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNetwork(value: Input[typings.pulumiAws.inputMod.worklink.FleetNetwork]): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      inline def setOptimizeForEndUserLocation(value: Input[Boolean]): Self = StObject.set(x, "optimizeForEndUserLocation", value.asInstanceOf[js.Any])
      
      inline def setOptimizeForEndUserLocationUndefined: Self = StObject.set(x, "optimizeForEndUserLocation", js.undefined)
    }
  }
}
