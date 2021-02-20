package typings.pulumiAws.mod

import typings.pulumiAws.quicksightGroupMod.GroupArgs
import typings.pulumiAws.quicksightGroupMod.GroupState
import typings.pulumiAws.quicksightUserMod.UserArgs
import typings.pulumiAws.quicksightUserMod.UserState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quicksight {
  
  @JSImport("@pulumi/aws", "quicksight.Group")
  @js.native
  class Group protected ()
    extends typings.pulumiAws.quicksightMod.Group {
    /**
      * Create a Group resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GroupArgs) = this()
    def this(name: String, args: GroupArgs, opts: CustomResourceOptions) = this()
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
    @JSImport("@pulumi/aws", "quicksight.Group.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.quicksightGroupMod.Group = js.native
    @JSImport("@pulumi/aws", "quicksight.Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.quicksightGroupMod.Group = js.native
    @JSImport("@pulumi/aws", "quicksight.Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupState): typings.pulumiAws.quicksightGroupMod.Group = js.native
    @JSImport("@pulumi/aws", "quicksight.Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): typings.pulumiAws.quicksightGroupMod.Group = js.native
    
    /**
      * Returns true if the given object is an instance of Group.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "quicksight.Group.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/quicksight/group.Group */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "quicksight.User")
  @js.native
  class User protected ()
    extends typings.pulumiAws.quicksightMod.User {
    /**
      * Create a User resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserArgs) = this()
    def this(name: String, args: UserArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object User {
    
    /**
      * Get an existing User resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "quicksight.User.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.quicksightUserMod.User = js.native
    @JSImport("@pulumi/aws", "quicksight.User.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.quicksightUserMod.User = js.native
    @JSImport("@pulumi/aws", "quicksight.User.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserState): typings.pulumiAws.quicksightUserMod.User = js.native
    @JSImport("@pulumi/aws", "quicksight.User.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserState, opts: CustomResourceOptions): typings.pulumiAws.quicksightUserMod.User = js.native
    
    /**
      * Returns true if the given object is an instance of User.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "quicksight.User.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/quicksight/user.User */ Boolean = js.native
  }
}
