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

object tapePoolMod {
  
  @JSImport("@pulumi/aws/storagegateway/tapePool", "TapePool")
  @js.native
  class TapePool protected () extends CustomResource {
    /**
      * Create a TapePool resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TapePoolArgs) = this()
    def this(name: String, args: TapePoolArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Volume Amazon Resource Name (ARN), e.g. `aws_storagegateway_tape_pool.example arn:aws:storagegateway:us-east-1:123456789012:tapepool/pool-12345678`.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of the new custom tape pool.
      */
    val poolName: Output_[String] = js.native
    
    /**
      * Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500 days). Default value is 0.
      */
    val retentionLockTimeInDays: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * Tape retention lock can be configured in two modes. When configured in governance mode, AWS accounts with specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When configured in compliance mode, the tape retention lock cannot be removed by any user, including the root AWS account. Possible values are `COMPLIANCE`, `GOVERNANCE`, and `NONE`. Default value is `NONE`.
      */
    val retentionLockType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The storage class that is associated with the new custom pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class that corresponds to the pool. Possible values are `DEEP_ARCHIVE` or `GLACIER`.
      */
    val storageClass: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object TapePool {
    
    @JSImport("@pulumi/aws/storagegateway/tapePool", "TapePool")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing TapePool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): TapePool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[TapePool]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): TapePool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TapePool]
    @scala.inline
    def get(name: String, id: Input[ID], state: TapePoolState): TapePool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[TapePool]
    @scala.inline
    def get(name: String, id: Input[ID], state: TapePoolState, opts: CustomResourceOptions): TapePool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TapePool]
    
    /**
      * Returns true if the given object is an instance of TapePool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/tapePool.TapePool */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/storagegateway/tapePool.TapePool */ Boolean]
  }
  
  trait TapePoolArgs extends StObject {
    
    /**
      * The name of the new custom tape pool.
      */
    val poolName: Input[String]
    
    /**
      * Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500 days). Default value is 0.
      */
    val retentionLockTimeInDays: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Tape retention lock can be configured in two modes. When configured in governance mode, AWS accounts with specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When configured in compliance mode, the tape retention lock cannot be removed by any user, including the root AWS account. Possible values are `COMPLIANCE`, `GOVERNANCE`, and `NONE`. Default value is `NONE`.
      */
    val retentionLockType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The storage class that is associated with the new custom pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class that corresponds to the pool. Possible values are `DEEP_ARCHIVE` or `GLACIER`.
      */
    val storageClass: Input[String]
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object TapePoolArgs {
    
    @scala.inline
    def apply(poolName: Input[String], storageClass: Input[String]): TapePoolArgs = {
      val __obj = js.Dynamic.literal(poolName = poolName.asInstanceOf[js.Any], storageClass = storageClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[TapePoolArgs]
    }
    
    @scala.inline
    implicit class TapePoolArgsMutableBuilder[Self <: TapePoolArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPoolName(value: Input[String]): Self = StObject.set(x, "poolName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetentionLockTimeInDays(value: Input[Double]): Self = StObject.set(x, "retentionLockTimeInDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetentionLockTimeInDaysUndefined: Self = StObject.set(x, "retentionLockTimeInDays", js.undefined)
      
      @scala.inline
      def setRetentionLockType(value: Input[String]): Self = StObject.set(x, "retentionLockType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetentionLockTypeUndefined: Self = StObject.set(x, "retentionLockType", js.undefined)
      
      @scala.inline
      def setStorageClass(value: Input[String]): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait TapePoolState extends StObject {
    
    /**
      * Volume Amazon Resource Name (ARN), e.g. `aws_storagegateway_tape_pool.example arn:aws:storagegateway:us-east-1:123456789012:tapepool/pool-12345678`.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the new custom tape pool.
      */
    val poolName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500 days). Default value is 0.
      */
    val retentionLockTimeInDays: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Tape retention lock can be configured in two modes. When configured in governance mode, AWS accounts with specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When configured in compliance mode, the tape retention lock cannot be removed by any user, including the root AWS account. Possible values are `COMPLIANCE`, `GOVERNANCE`, and `NONE`. Default value is `NONE`.
      */
    val retentionLockType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The storage class that is associated with the new custom pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class that corresponds to the pool. Possible values are `DEEP_ARCHIVE` or `GLACIER`.
      */
    val storageClass: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object TapePoolState {
    
    @scala.inline
    def apply(): TapePoolState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TapePoolState]
    }
    
    @scala.inline
    implicit class TapePoolStateMutableBuilder[Self <: TapePoolState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setPoolName(value: Input[String]): Self = StObject.set(x, "poolName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolNameUndefined: Self = StObject.set(x, "poolName", js.undefined)
      
      @scala.inline
      def setRetentionLockTimeInDays(value: Input[Double]): Self = StObject.set(x, "retentionLockTimeInDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetentionLockTimeInDaysUndefined: Self = StObject.set(x, "retentionLockTimeInDays", js.undefined)
      
      @scala.inline
      def setRetentionLockType(value: Input[String]): Self = StObject.set(x, "retentionLockType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetentionLockTypeUndefined: Self = StObject.set(x, "retentionLockType", js.undefined)
      
      @scala.inline
      def setStorageClass(value: Input[String]): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
