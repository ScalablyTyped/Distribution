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

object snapshotCopyGrantMod {
  
  @JSImport("@pulumi/aws/redshift/snapshotCopyGrant", "SnapshotCopyGrant")
  @js.native
  class SnapshotCopyGrant protected () extends CustomResource {
    /**
      * Create a SnapshotCopyGrant resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotCopyGrantArgs) = this()
    def this(name: String, args: SnapshotCopyGrantArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of snapshot copy grant
      */
    val arn: Output_[String] = js.native
    
    /**
      * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
      */
    val kmsKeyId: Output_[String] = js.native
    
    /**
      * A friendly name for identifying the grant.
      */
    val snapshotCopyGrantName: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object SnapshotCopyGrant {
    
    @JSImport("@pulumi/aws/redshift/snapshotCopyGrant", "SnapshotCopyGrant")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SnapshotCopyGrant resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): SnapshotCopyGrant = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SnapshotCopyGrant]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SnapshotCopyGrant = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SnapshotCopyGrant]
    inline def get(name: String, id: Input[ID], state: SnapshotCopyGrantState): SnapshotCopyGrant = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SnapshotCopyGrant]
    inline def get(name: String, id: Input[ID], state: SnapshotCopyGrantState, opts: CustomResourceOptions): SnapshotCopyGrant = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SnapshotCopyGrant]
    
    /**
      * Returns true if the given object is an instance of SnapshotCopyGrant.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotCopyGrant.SnapshotCopyGrant */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/redshift/snapshotCopyGrant.SnapshotCopyGrant */ Boolean]
  }
  
  trait SnapshotCopyGrantArgs extends StObject {
    
    /**
      * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly name for identifying the grant.
      */
    val snapshotCopyGrantName: Input[String]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object SnapshotCopyGrantArgs {
    
    inline def apply(snapshotCopyGrantName: Input[String]): SnapshotCopyGrantArgs = {
      val __obj = js.Dynamic.literal(snapshotCopyGrantName = snapshotCopyGrantName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotCopyGrantArgs]
    }
    
    extension [Self <: SnapshotCopyGrantArgs](x: Self) {
      
      inline def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      inline def setSnapshotCopyGrantName(value: Input[String]): Self = StObject.set(x, "snapshotCopyGrantName", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait SnapshotCopyGrantState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of snapshot copy grant
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly name for identifying the grant.
      */
    val snapshotCopyGrantName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object SnapshotCopyGrantState {
    
    inline def apply(): SnapshotCopyGrantState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapshotCopyGrantState]
    }
    
    extension [Self <: SnapshotCopyGrantState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      inline def setSnapshotCopyGrantName(value: Input[String]): Self = StObject.set(x, "snapshotCopyGrantName", value.asInstanceOf[js.Any])
      
      inline def setSnapshotCopyGrantNameUndefined: Self = StObject.set(x, "snapshotCopyGrantName", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
