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

object ipsetMod {
  
  @JSImport("@pulumi/aws/guardduty/ipset", "IPSet")
  @js.native
  class IPSet protected () extends CustomResource {
    /**
      * Create a IPSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IPSetArgs) = this()
    def this(name: String, args: IPSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Specifies whether GuardDuty is to start using the uploaded IPSet.
      */
    val activate: Output_[Boolean] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the GuardDuty IPSet.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The detector ID of the GuardDuty.
      */
    val detectorId: Output_[String] = js.native
    
    /**
      * The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
      */
    val format: Output_[String] = js.native
    
    /**
      * The URI of the file that contains the IPSet.
      */
    val location: Output_[String] = js.native
    
    /**
      * The friendly name to identify the IPSet.
      */
    val name: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object IPSet {
    
    @JSImport("@pulumi/aws/guardduty/ipset", "IPSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IPSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): IPSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[IPSet]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): IPSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IPSet]
    inline def get(name: String, id: Input[ID], state: IPSetState): IPSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[IPSet]
    inline def get(name: String, id: Input[ID], state: IPSetState, opts: CustomResourceOptions): IPSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IPSet]
    
    /**
      * Returns true if the given object is an instance of IPSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/ipset.IPSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/guardduty/ipset.IPSet */ Boolean]
  }
  
  trait IPSetArgs extends StObject {
    
    /**
      * Specifies whether GuardDuty is to start using the uploaded IPSet.
      */
    val activate: Input[Boolean]
    
    /**
      * The detector ID of the GuardDuty.
      */
    val detectorId: Input[String]
    
    /**
      * The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
      */
    val format: Input[String]
    
    /**
      * The URI of the file that contains the IPSet.
      */
    val location: Input[String]
    
    /**
      * The friendly name to identify the IPSet.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object IPSetArgs {
    
    inline def apply(
      activate: Input[Boolean],
      detectorId: Input[String],
      format: Input[String],
      location: Input[String]
    ): IPSetArgs = {
      val __obj = js.Dynamic.literal(activate = activate.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPSetArgs]
    }
    
    extension [Self <: IPSetArgs](x: Self) {
      
      inline def setActivate(value: Input[Boolean]): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
      
      inline def setDetectorId(value: Input[String]): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: Input[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Input[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait IPSetState extends StObject {
    
    /**
      * Specifies whether GuardDuty is to start using the uploaded IPSet.
      */
    val activate: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the GuardDuty IPSet.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The detector ID of the GuardDuty.
      */
    val detectorId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
      */
    val format: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The URI of the file that contains the IPSet.
      */
    val location: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The friendly name to identify the IPSet.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object IPSetState {
    
    inline def apply(): IPSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPSetState]
    }
    
    extension [Self <: IPSetState](x: Self) {
      
      inline def setActivate(value: Input[Boolean]): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
      
      inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDetectorId(value: Input[String]): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
      
      inline def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
      
      inline def setFormat(value: Input[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLocation(value: Input[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
