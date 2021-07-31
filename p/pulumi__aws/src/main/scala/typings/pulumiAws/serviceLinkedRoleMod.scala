package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceLinkedRoleMod {
  
  @JSImport("@pulumi/aws/iam/serviceLinkedRole", "ServiceLinkedRole")
  @js.native
  class ServiceLinkedRole protected () extends CustomResource {
    /**
      * Create a ServiceLinkedRole resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ServiceLinkedRoleArgs) = this()
    def this(name: String, args: ServiceLinkedRoleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) specifying the role.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
      */
    val awsServiceName: Output_[String] = js.native
    
    /**
      * The creation date of the IAM role.
      */
    val createDate: Output_[String] = js.native
    
    /**
      * Additional string appended to the role name. Not all AWS services support custom suffixes.
      */
    val customSuffix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The description of the role.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the role.
      */
    val name: Output_[String] = js.native
    
    /**
      * The path of the role.
      */
    val path: Output_[String] = js.native
    
    /**
      * The stable and unique string identifying the role.
      */
    val uniqueId: Output_[String] = js.native
  }
  /* static members */
  object ServiceLinkedRole {
    
    @JSImport("@pulumi/aws/iam/serviceLinkedRole", "ServiceLinkedRole")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ServiceLinkedRole resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ServiceLinkedRole = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ServiceLinkedRole]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ServiceLinkedRole = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ServiceLinkedRole]
    @scala.inline
    def get(name: String, id: Input[ID], state: ServiceLinkedRoleState): ServiceLinkedRole = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ServiceLinkedRole]
    @scala.inline
    def get(name: String, id: Input[ID], state: ServiceLinkedRoleState, opts: CustomResourceOptions): ServiceLinkedRole = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ServiceLinkedRole]
    
    /**
      * Returns true if the given object is an instance of ServiceLinkedRole.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/serviceLinkedRole.ServiceLinkedRole */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iam/serviceLinkedRole.ServiceLinkedRole */ Boolean]
  }
  
  trait ServiceLinkedRoleArgs extends StObject {
    
    /**
      * The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
      */
    val awsServiceName: Input[String]
    
    /**
      * Additional string appended to the role name. Not all AWS services support custom suffixes.
      */
    val customSuffix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The description of the role.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
  }
  object ServiceLinkedRoleArgs {
    
    @scala.inline
    def apply(awsServiceName: Input[String]): ServiceLinkedRoleArgs = {
      val __obj = js.Dynamic.literal(awsServiceName = awsServiceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceLinkedRoleArgs]
    }
    
    @scala.inline
    implicit class ServiceLinkedRoleArgsMutableBuilder[Self <: ServiceLinkedRoleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwsServiceName(value: Input[String]): Self = StObject.set(x, "awsServiceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSuffix(value: Input[String]): Self = StObject.set(x, "customSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSuffixUndefined: Self = StObject.set(x, "customSuffix", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    }
  }
  
  trait ServiceLinkedRoleState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the role.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
      */
    val awsServiceName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The creation date of the IAM role.
      */
    val createDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Additional string appended to the role name. Not all AWS services support custom suffixes.
      */
    val customSuffix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The description of the role.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the role.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The path of the role.
      */
    val path: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The stable and unique string identifying the role.
      */
    val uniqueId: js.UndefOr[Input[String]] = js.undefined
  }
  object ServiceLinkedRoleState {
    
    @scala.inline
    def apply(): ServiceLinkedRoleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceLinkedRoleState]
    }
    
    @scala.inline
    implicit class ServiceLinkedRoleStateMutableBuilder[Self <: ServiceLinkedRoleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAwsServiceName(value: Input[String]): Self = StObject.set(x, "awsServiceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsServiceNameUndefined: Self = StObject.set(x, "awsServiceName", js.undefined)
      
      @scala.inline
      def setCreateDate(value: Input[String]): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateDateUndefined: Self = StObject.set(x, "createDate", js.undefined)
      
      @scala.inline
      def setCustomSuffix(value: Input[String]): Self = StObject.set(x, "customSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSuffixUndefined: Self = StObject.set(x, "customSuffix", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setUniqueId(value: Input[String]): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
    }
  }
}
