package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.eks.FargateProfileSelector
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fargateProfileMod {
  
  @JSImport("@pulumi/aws/eks/fargateProfile", "FargateProfile")
  @js.native
  class FargateProfile protected () extends CustomResource {
    /**
      * Create a FargateProfile resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FargateProfileArgs) = this()
    def this(name: String, args: FargateProfileArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the EKS Fargate Profile.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Name of the EKS Cluster.
      */
    val clusterName: Output_[String] = js.native
    
    /**
      * Name of the EKS Fargate Profile.
      */
    val fargateProfileName: Output_[String] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
      */
    val podExecutionRoleArn: Output_[String] = js.native
    
    /**
      * Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
      */
    val selectors: Output_[js.Array[FargateProfileSelector]] = js.native
    
    /**
      * Status of the EKS Fargate Profile.
      */
    val status: Output_[String] = js.native
    
    /**
      * Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
      */
    val subnetIds: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object FargateProfile {
    
    /**
      * Get an existing FargateProfile resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/eks/fargateProfile", "FargateProfile.get")
    @js.native
    def get(name: String, id: Input[ID]): FargateProfile = js.native
    @JSImport("@pulumi/aws/eks/fargateProfile", "FargateProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): FargateProfile = js.native
    @JSImport("@pulumi/aws/eks/fargateProfile", "FargateProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: FargateProfileState): FargateProfile = js.native
    @JSImport("@pulumi/aws/eks/fargateProfile", "FargateProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: FargateProfileState, opts: CustomResourceOptions): FargateProfile = js.native
    
    /**
      * Returns true if the given object is an instance of FargateProfile.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/eks/fargateProfile", "FargateProfile.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/fargateProfile.FargateProfile */ Boolean = js.native
  }
  
  @js.native
  trait FargateProfileArgs extends StObject {
    
    /**
      * Name of the EKS Cluster.
      */
    val clusterName: Input[String] = js.native
    
    /**
      * Name of the EKS Fargate Profile.
      */
    val fargateProfileName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
      */
    val podExecutionRoleArn: Input[String] = js.native
    
    /**
      * Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
      */
    val selectors: Input[js.Array[Input[typings.pulumiAws.inputMod.eks.FargateProfileSelector]]] = js.native
    
    /**
      * Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object FargateProfileArgs {
    
    @scala.inline
    def apply(
      clusterName: Input[String],
      podExecutionRoleArn: Input[String],
      selectors: Input[js.Array[Input[typings.pulumiAws.inputMod.eks.FargateProfileSelector]]]
    ): FargateProfileArgs = {
      val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], podExecutionRoleArn = podExecutionRoleArn.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
      __obj.asInstanceOf[FargateProfileArgs]
    }
    
    @scala.inline
    implicit class FargateProfileArgsMutableBuilder[Self <: FargateProfileArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterName(value: Input[String]): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFargateProfileName(value: Input[String]): Self = StObject.set(x, "fargateProfileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFargateProfileNameUndefined: Self = StObject.set(x, "fargateProfileName", js.undefined)
      
      @scala.inline
      def setPodExecutionRoleArn(value: Input[String]): Self = StObject.set(x, "podExecutionRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectors(value: Input[js.Array[Input[typings.pulumiAws.inputMod.eks.FargateProfileSelector]]]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorsVarargs(value: Input[typings.pulumiAws.inputMod.eks.FargateProfileSelector]*): Self = StObject.set(x, "selectors", js.Array(value :_*))
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait FargateProfileState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the EKS Fargate Profile.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the EKS Cluster.
      */
    val clusterName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the EKS Fargate Profile.
      */
    val fargateProfileName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
      */
    val podExecutionRoleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
      */
    val selectors: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.eks.FargateProfileSelector]]]] = js.native
    
    /**
      * Status of the EKS Fargate Profile.
      */
    val status: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object FargateProfileState {
    
    @scala.inline
    def apply(): FargateProfileState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FargateProfileState]
    }
    
    @scala.inline
    implicit class FargateProfileStateMutableBuilder[Self <: FargateProfileState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setClusterName(value: Input[String]): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
      
      @scala.inline
      def setFargateProfileName(value: Input[String]): Self = StObject.set(x, "fargateProfileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFargateProfileNameUndefined: Self = StObject.set(x, "fargateProfileName", js.undefined)
      
      @scala.inline
      def setPodExecutionRoleArn(value: Input[String]): Self = StObject.set(x, "podExecutionRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPodExecutionRoleArnUndefined: Self = StObject.set(x, "podExecutionRoleArn", js.undefined)
      
      @scala.inline
      def setSelectors(value: Input[js.Array[Input[typings.pulumiAws.inputMod.eks.FargateProfileSelector]]]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      @scala.inline
      def setSelectorsVarargs(value: Input[typings.pulumiAws.inputMod.eks.FargateProfileSelector]*): Self = StObject.set(x, "selectors", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
