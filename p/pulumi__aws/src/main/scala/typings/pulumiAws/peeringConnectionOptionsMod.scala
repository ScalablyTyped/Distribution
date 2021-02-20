package typings.pulumiAws

import typings.pulumiAws.outputMod.ec2.PeeringConnectionOptionsAccepter
import typings.pulumiAws.outputMod.ec2.PeeringConnectionOptionsRequester
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peeringConnectionOptionsMod {
  
  @JSImport("@pulumi/aws/ec2/peeringConnectionOptions", "PeeringConnectionOptions")
  @js.native
  class PeeringConnectionOptions protected () extends CustomResource {
    /**
      * Create a PeeringConnectionOptions resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PeeringConnectionOptionsArgs) = this()
    def this(name: String, args: PeeringConnectionOptionsArgs, opts: CustomResourceOptions) = this()
    
    /**
      * An optional configuration block that allows for [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
      * the peering connection (a maximum of one).
      */
    val accepter: Output_[PeeringConnectionOptionsAccepter] = js.native
    
    /**
      * A optional configuration block that allows for [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
      * the peering connection (a maximum of one).
      */
    val requester: Output_[PeeringConnectionOptionsRequester] = js.native
    
    /**
      * The ID of the requester VPC peering connection.
      */
    val vpcPeeringConnectionId: Output_[String] = js.native
  }
  /* static members */
  object PeeringConnectionOptions {
    
    /**
      * Get an existing PeeringConnectionOptions resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/peeringConnectionOptions", "PeeringConnectionOptions.get")
    @js.native
    def get(name: String, id: Input[ID]): PeeringConnectionOptions = js.native
    @JSImport("@pulumi/aws/ec2/peeringConnectionOptions", "PeeringConnectionOptions.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): PeeringConnectionOptions = js.native
    @JSImport("@pulumi/aws/ec2/peeringConnectionOptions", "PeeringConnectionOptions.get")
    @js.native
    def get(name: String, id: Input[ID], state: PeeringConnectionOptionsState): PeeringConnectionOptions = js.native
    @JSImport("@pulumi/aws/ec2/peeringConnectionOptions", "PeeringConnectionOptions.get")
    @js.native
    def get(name: String, id: Input[ID], state: PeeringConnectionOptionsState, opts: CustomResourceOptions): PeeringConnectionOptions = js.native
    
    /**
      * Returns true if the given object is an instance of PeeringConnectionOptions.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/peeringConnectionOptions", "PeeringConnectionOptions.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/peeringConnectionOptions.PeeringConnectionOptions */ Boolean = js.native
  }
  
  @js.native
  trait PeeringConnectionOptionsArgs extends StObject {
    
    /**
      * An optional configuration block that allows for [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
      * the peering connection (a maximum of one).
      */
    val accepter: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.PeeringConnectionOptionsAccepter]] = js.native
    
    /**
      * A optional configuration block that allows for [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
      * the peering connection (a maximum of one).
      */
    val requester: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.PeeringConnectionOptionsRequester]] = js.native
    
    /**
      * The ID of the requester VPC peering connection.
      */
    val vpcPeeringConnectionId: Input[String] = js.native
  }
  object PeeringConnectionOptionsArgs {
    
    @scala.inline
    def apply(vpcPeeringConnectionId: Input[String]): PeeringConnectionOptionsArgs = {
      val __obj = js.Dynamic.literal(vpcPeeringConnectionId = vpcPeeringConnectionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeeringConnectionOptionsArgs]
    }
    
    @scala.inline
    implicit class PeeringConnectionOptionsArgsMutableBuilder[Self <: PeeringConnectionOptionsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccepter(value: Input[typings.pulumiAws.inputMod.ec2.PeeringConnectionOptionsAccepter]): Self = StObject.set(x, "accepter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccepterUndefined: Self = StObject.set(x, "accepter", js.undefined)
      
      @scala.inline
      def setRequester(value: Input[typings.pulumiAws.inputMod.ec2.PeeringConnectionOptionsRequester]): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
      
      @scala.inline
      def setVpcPeeringConnectionId(value: Input[String]): Self = StObject.set(x, "vpcPeeringConnectionId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PeeringConnectionOptionsState extends StObject {
    
    /**
      * An optional configuration block that allows for [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
      * the peering connection (a maximum of one).
      */
    val accepter: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.PeeringConnectionOptionsAccepter]] = js.native
    
    /**
      * A optional configuration block that allows for [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
      * the peering connection (a maximum of one).
      */
    val requester: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.PeeringConnectionOptionsRequester]] = js.native
    
    /**
      * The ID of the requester VPC peering connection.
      */
    val vpcPeeringConnectionId: js.UndefOr[Input[String]] = js.native
  }
  object PeeringConnectionOptionsState {
    
    @scala.inline
    def apply(): PeeringConnectionOptionsState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PeeringConnectionOptionsState]
    }
    
    @scala.inline
    implicit class PeeringConnectionOptionsStateMutableBuilder[Self <: PeeringConnectionOptionsState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccepter(value: Input[typings.pulumiAws.inputMod.ec2.PeeringConnectionOptionsAccepter]): Self = StObject.set(x, "accepter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccepterUndefined: Self = StObject.set(x, "accepter", js.undefined)
      
      @scala.inline
      def setRequester(value: Input[typings.pulumiAws.inputMod.ec2.PeeringConnectionOptionsRequester]): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
      
      @scala.inline
      def setVpcPeeringConnectionId(value: Input[String]): Self = StObject.set(x, "vpcPeeringConnectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "vpcPeeringConnectionId", js.undefined)
    }
  }
}
