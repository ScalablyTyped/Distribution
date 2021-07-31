package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object availabilityZoneGroupMod {
  
  @JSImport("@pulumi/aws/ec2/availabilityZoneGroup", "AvailabilityZoneGroup")
  @js.native
  class AvailabilityZoneGroup protected () extends CustomResource {
    /**
      * Create a AvailabilityZoneGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AvailabilityZoneGroupArgs) = this()
    def this(name: String, args: AvailabilityZoneGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Name of the Availability Zone Group.
      */
    val groupName: Output_[String] = js.native
    
    /**
      * Indicates whether to enable or disable Availability Zone Group. Valid values: `opted-in` or `not-opted-in`.
      */
    val optInStatus: Output_[String] = js.native
  }
  /* static members */
  object AvailabilityZoneGroup {
    
    @JSImport("@pulumi/aws/ec2/availabilityZoneGroup", "AvailabilityZoneGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AvailabilityZoneGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): AvailabilityZoneGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[AvailabilityZoneGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): AvailabilityZoneGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AvailabilityZoneGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: AvailabilityZoneGroupState): AvailabilityZoneGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AvailabilityZoneGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: AvailabilityZoneGroupState, opts: CustomResourceOptions): AvailabilityZoneGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AvailabilityZoneGroup]
    
    /**
      * Returns true if the given object is an instance of AvailabilityZoneGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/availabilityZoneGroup.AvailabilityZoneGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/availabilityZoneGroup.AvailabilityZoneGroup */ Boolean]
  }
  
  trait AvailabilityZoneGroupArgs extends StObject {
    
    /**
      * Name of the Availability Zone Group.
      */
    val groupName: Input[String]
    
    /**
      * Indicates whether to enable or disable Availability Zone Group. Valid values: `opted-in` or `not-opted-in`.
      */
    val optInStatus: Input[String]
  }
  object AvailabilityZoneGroupArgs {
    
    @scala.inline
    def apply(groupName: Input[String], optInStatus: Input[String]): AvailabilityZoneGroupArgs = {
      val __obj = js.Dynamic.literal(groupName = groupName.asInstanceOf[js.Any], optInStatus = optInStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailabilityZoneGroupArgs]
    }
    
    @scala.inline
    implicit class AvailabilityZoneGroupArgsMutableBuilder[Self <: AvailabilityZoneGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupName(value: Input[String]): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptInStatus(value: Input[String]): Self = StObject.set(x, "optInStatus", value.asInstanceOf[js.Any])
    }
  }
  
  trait AvailabilityZoneGroupState extends StObject {
    
    /**
      * Name of the Availability Zone Group.
      */
    val groupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether to enable or disable Availability Zone Group. Valid values: `opted-in` or `not-opted-in`.
      */
    val optInStatus: js.UndefOr[Input[String]] = js.undefined
  }
  object AvailabilityZoneGroupState {
    
    @scala.inline
    def apply(): AvailabilityZoneGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvailabilityZoneGroupState]
    }
    
    @scala.inline
    implicit class AvailabilityZoneGroupStateMutableBuilder[Self <: AvailabilityZoneGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupName(value: Input[String]): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
      
      @scala.inline
      def setOptInStatus(value: Input[String]): Self = StObject.set(x, "optInStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptInStatusUndefined: Self = StObject.set(x, "optInStatus", js.undefined)
    }
  }
}
