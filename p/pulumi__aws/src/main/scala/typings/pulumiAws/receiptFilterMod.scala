package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object receiptFilterMod {
  
  @JSImport("@pulumi/aws/ses/receiptFilter", "ReceiptFilter")
  @js.native
  class ReceiptFilter protected () extends CustomResource {
    /**
      * Create a ReceiptFilter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReceiptFilterArgs) = this()
    def this(name: String, args: ReceiptFilterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The SES receipt filter ARN.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The IP address or address range to filter, in CIDR notation
      */
    val cidr: Output_[String] = js.native
    
    /**
      * The name of the filter
      */
    val name: Output_[String] = js.native
    
    /**
      * Block or Allow
      */
    val policy: Output_[String] = js.native
  }
  /* static members */
  object ReceiptFilter {
    
    @JSImport("@pulumi/aws/ses/receiptFilter", "ReceiptFilter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ReceiptFilter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ReceiptFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ReceiptFilter]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ReceiptFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReceiptFilter]
    inline def get(name: String, id: Input[ID], state: ReceiptFilterState): ReceiptFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ReceiptFilter]
    inline def get(name: String, id: Input[ID], state: ReceiptFilterState, opts: CustomResourceOptions): ReceiptFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReceiptFilter]
    
    /**
      * Returns true if the given object is an instance of ReceiptFilter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptFilter.ReceiptFilter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/receiptFilter.ReceiptFilter */ Boolean]
  }
  
  trait ReceiptFilterArgs extends StObject {
    
    /**
      * The IP address or address range to filter, in CIDR notation
      */
    val cidr: Input[String]
    
    /**
      * The name of the filter
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Block or Allow
      */
    val policy: Input[String]
  }
  object ReceiptFilterArgs {
    
    inline def apply(cidr: Input[String], policy: Input[String]): ReceiptFilterArgs = {
      val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptFilterArgs]
    }
    
    extension [Self <: ReceiptFilterArgs](x: Self) {
      
      inline def setCidr(value: Input[String]): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReceiptFilterState extends StObject {
    
    /**
      * The SES receipt filter ARN.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IP address or address range to filter, in CIDR notation
      */
    val cidr: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the filter
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Block or Allow
      */
    val policy: js.UndefOr[Input[String]] = js.undefined
  }
  object ReceiptFilterState {
    
    inline def apply(): ReceiptFilterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReceiptFilterState]
    }
    
    extension [Self <: ReceiptFilterState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCidr(value: Input[String]): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      inline def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
