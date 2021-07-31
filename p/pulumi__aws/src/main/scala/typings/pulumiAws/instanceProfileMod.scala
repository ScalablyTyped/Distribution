package typings.pulumiAws

import typings.pulumiAws.iamMod.Role
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceProfileMod {
  
  @JSImport("@pulumi/aws/iam/instanceProfile", "InstanceProfile")
  @js.native
  class InstanceProfile protected () extends CustomResource {
    /**
      * Create a InstanceProfile resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: InstanceProfileArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: InstanceProfileArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN assigned by AWS to the instance profile.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The creation timestamp of the instance profile.
      */
    val createDate: Output_[String] = js.native
    
    /**
      * The profile's name. If omitted, this provider will assign a random, unique name.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Path in which to create the profile.
      */
    val path: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The role name to include in the profile.
      */
    val role: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The [unique ID][1] assigned by AWS.
      */
    val uniqueId: Output_[String] = js.native
  }
  /* static members */
  object InstanceProfile {
    
    @JSImport("@pulumi/aws/iam/instanceProfile", "InstanceProfile")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing InstanceProfile resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): InstanceProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[InstanceProfile]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): InstanceProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[InstanceProfile]
    @scala.inline
    def get(name: String, id: Input[ID], state: InstanceProfileState): InstanceProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[InstanceProfile]
    @scala.inline
    def get(name: String, id: Input[ID], state: InstanceProfileState, opts: CustomResourceOptions): InstanceProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[InstanceProfile]
    
    /**
      * Returns true if the given object is an instance of InstanceProfile.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/instanceProfile.InstanceProfile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iam/instanceProfile.InstanceProfile */ Boolean]
  }
  
  trait InstanceProfileArgs extends StObject {
    
    /**
      * The profile's name. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Path in which to create the profile.
      */
    val path: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The role name to include in the profile.
      */
    val role: js.UndefOr[Input[String | Role]] = js.undefined
  }
  object InstanceProfileArgs {
    
    @scala.inline
    def apply(): InstanceProfileArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceProfileArgs]
    }
    
    @scala.inline
    implicit class InstanceProfileArgsMutableBuilder[Self <: InstanceProfileArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setRole(value: Input[String | Role]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  trait InstanceProfileState extends StObject {
    
    /**
      * The ARN assigned by AWS to the instance profile.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The creation timestamp of the instance profile.
      */
    val createDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The profile's name. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Path in which to create the profile.
      */
    val path: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The role name to include in the profile.
      */
    val role: js.UndefOr[Input[String | Role]] = js.undefined
    
    /**
      * The [unique ID][1] assigned by AWS.
      */
    val uniqueId: js.UndefOr[Input[String]] = js.undefined
  }
  object InstanceProfileState {
    
    @scala.inline
    def apply(): InstanceProfileState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceProfileState]
    }
    
    @scala.inline
    implicit class InstanceProfileStateMutableBuilder[Self <: InstanceProfileState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCreateDate(value: Input[String]): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateDateUndefined: Self = StObject.set(x, "createDate", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setRole(value: Input[String | Role]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setUniqueId(value: Input[String]): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
    }
  }
}
