package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gatewayMod {
  
  @JSImport("@pulumi/aws/directconnect/gateway", "Gateway")
  @js.native
  class Gateway protected () extends CustomResource {
    /**
      * Create a Gateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GatewayArgs) = this()
    def this(name: String, args: GatewayArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
      */
    val amazonSideAsn: Output_[String] = js.native
    
    /**
      * The name of the connection.
      */
    val name: Output_[String] = js.native
    
    /**
      * AWS Account ID of the gateway.
      */
    val ownerAccountId: Output_[String] = js.native
  }
  /* static members */
  object Gateway {
    
    @JSImport("@pulumi/aws/directconnect/gateway", "Gateway")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Gateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Gateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Gateway]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Gateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Gateway]
    inline def get(name: String, id: Input[ID], state: GatewayState): Gateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Gateway]
    inline def get(name: String, id: Input[ID], state: GatewayState, opts: CustomResourceOptions): Gateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Gateway]
    
    /**
      * Returns true if the given object is an instance of Gateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gateway.Gateway */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/gateway.Gateway */ Boolean]
  }
  
  trait GatewayArgs extends StObject {
    
    /**
      * The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
      */
    val amazonSideAsn: Input[String]
    
    /**
      * The name of the connection.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object GatewayArgs {
    
    inline def apply(amazonSideAsn: Input[String]): GatewayArgs = {
      val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewayArgs]
    }
    
    extension [Self <: GatewayArgs](x: Self) {
      
      inline def setAmazonSideAsn(value: Input[String]): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait GatewayState extends StObject {
    
    /**
      * The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
      */
    val amazonSideAsn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the connection.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * AWS Account ID of the gateway.
      */
    val ownerAccountId: js.UndefOr[Input[String]] = js.undefined
  }
  object GatewayState {
    
    inline def apply(): GatewayState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GatewayState]
    }
    
    extension [Self <: GatewayState](x: Self) {
      
      inline def setAmazonSideAsn(value: Input[String]): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      inline def setAmazonSideAsnUndefined: Self = StObject.set(x, "amazonSideAsn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOwnerAccountId(value: Input[String]): Self = StObject.set(x, "ownerAccountId", value.asInstanceOf[js.Any])
      
      inline def setOwnerAccountIdUndefined: Self = StObject.set(x, "ownerAccountId", js.undefined)
    }
  }
}
