package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iamGroupMod {
  
  @JSImport("@pulumi/aws/iam/group", "Group")
  @js.native
  class Group protected () extends CustomResource {
    /**
      * Create a Group resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: GroupArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: GroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN assigned by AWS for this group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The group's name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. Group names are not distinguished by case. For example, you cannot create groups named both "ADMINS" and "admins".
      */
    val name: Output_[String] = js.native
    
    /**
      * Path in which to create the group.
      */
    val path: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The [unique ID][1] assigned by AWS.
      */
    val uniqueId: Output_[String] = js.native
  }
  /* static members */
  object Group {
    
    /**
      * Get an existing Group resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/iam/group", "Group.get")
    @js.native
    def get(name: String, id: Input[ID]): Group = js.native
    @JSImport("@pulumi/aws/iam/group", "Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Group = js.native
    @JSImport("@pulumi/aws/iam/group", "Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupState): Group = js.native
    @JSImport("@pulumi/aws/iam/group", "Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): Group = js.native
    
    /**
      * Returns true if the given object is an instance of Group.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/iam/group", "Group.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/group.Group */ Boolean = js.native
  }
  
  @js.native
  trait GroupArgs extends StObject {
    
    /**
      * The group's name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. Group names are not distinguished by case. For example, you cannot create groups named both "ADMINS" and "admins".
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Path in which to create the group.
      */
    val path: js.UndefOr[Input[String]] = js.native
  }
  object GroupArgs {
    
    @scala.inline
    def apply(): GroupArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupArgs]
    }
    
    @scala.inline
    implicit class GroupArgsMutableBuilder[Self <: GroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait GroupState extends StObject {
    
    /**
      * The ARN assigned by AWS for this group.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The group's name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. Group names are not distinguished by case. For example, you cannot create groups named both "ADMINS" and "admins".
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Path in which to create the group.
      */
    val path: js.UndefOr[Input[String]] = js.native
    
    /**
      * The [unique ID][1] assigned by AWS.
      */
    val uniqueId: js.UndefOr[Input[String]] = js.native
  }
  object GroupState {
    
    @scala.inline
    def apply(): GroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupState]
    }
    
    @scala.inline
    implicit class GroupStateMutableBuilder[Self <: GroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
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
