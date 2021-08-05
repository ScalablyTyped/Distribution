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
    
    @JSImport("@pulumi/aws/eks/fargateProfile", "FargateProfile")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing FargateProfile resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): FargateProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[FargateProfile]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): FargateProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FargateProfile]
    inline def get(name: String, id: Input[ID], state: FargateProfileState): FargateProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[FargateProfile]
    inline def get(name: String, id: Input[ID], state: FargateProfileState, opts: CustomResourceOptions): FargateProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FargateProfile]
    
    /**
      * Returns true if the given object is an instance of FargateProfile.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/fargateProfile.FargateProfile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/eks/fargateProfile.FargateProfile */ Boolean]
  }
  
  trait FargateProfileArgs extends StObject {
    
    /**
      * Name of the EKS Cluster.
      */
    val clusterName: Input[String]
    
    /**
      * Name of the EKS Fargate Profile.
      */
    val fargateProfileName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
      */
    val podExecutionRoleArn: Input[String]
    
    /**
      * Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
      */
    val selectors: Input[js.Array[Input[typings.pulumiAws.inputMod.eks.FargateProfileSelector]]]
    
    /**
      * Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object FargateProfileArgs {
    
    inline def apply(
      clusterName: Input[String],
      podExecutionRoleArn: Input[String],
      selectors: Input[js.Array[Input[typings.pulumiAws.inputMod.eks.FargateProfileSelector]]]
    ): FargateProfileArgs = {
      val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], podExecutionRoleArn = podExecutionRoleArn.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
      __obj.asInstanceOf[FargateProfileArgs]
    }
    
    extension [Self <: FargateProfileArgs](x: Self) {
      
      inline def setClusterName(value: Input[String]): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
      
      inline def setFargateProfileName(value: Input[String]): Self = StObject.set(x, "fargateProfileName", value.asInstanceOf[js.Any])
      
      inline def setFargateProfileNameUndefined: Self = StObject.set(x, "fargateProfileName", js.undefined)
      
      inline def setPodExecutionRoleArn(value: Input[String]): Self = StObject.set(x, "podExecutionRoleArn", value.asInstanceOf[js.Any])
      
      inline def setSelectors(value: Input[js.Array[Input[typings.pulumiAws.inputMod.eks.FargateProfileSelector]]]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsVarargs(value: Input[typings.pulumiAws.inputMod.eks.FargateProfileSelector]*): Self = StObject.set(x, "selectors", js.Array(value :_*))
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait FargateProfileState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the EKS Fargate Profile.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the EKS Cluster.
      */
    val clusterName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the EKS Fargate Profile.
      */
    val fargateProfileName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
      */
    val podExecutionRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
      */
    val selectors: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.eks.FargateProfileSelector]]]] = js.undefined
    
    /**
      * Status of the EKS Fargate Profile.
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object FargateProfileState {
    
    inline def apply(): FargateProfileState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FargateProfileState]
    }
    
    extension [Self <: FargateProfileState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setClusterName(value: Input[String]): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
      
      inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
      
      inline def setFargateProfileName(value: Input[String]): Self = StObject.set(x, "fargateProfileName", value.asInstanceOf[js.Any])
      
      inline def setFargateProfileNameUndefined: Self = StObject.set(x, "fargateProfileName", js.undefined)
      
      inline def setPodExecutionRoleArn(value: Input[String]): Self = StObject.set(x, "podExecutionRoleArn", value.asInstanceOf[js.Any])
      
      inline def setPodExecutionRoleArnUndefined: Self = StObject.set(x, "podExecutionRoleArn", js.undefined)
      
      inline def setSelectors(value: Input[js.Array[Input[typings.pulumiAws.inputMod.eks.FargateProfileSelector]]]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      inline def setSelectorsVarargs(value: Input[typings.pulumiAws.inputMod.eks.FargateProfileSelector]*): Self = StObject.set(x, "selectors", js.Array(value :_*))
      
      inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
