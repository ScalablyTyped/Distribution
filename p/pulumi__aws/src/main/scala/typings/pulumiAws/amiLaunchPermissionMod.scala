package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amiLaunchPermissionMod {
  
  @JSImport("@pulumi/aws/ec2/amiLaunchPermission", "AmiLaunchPermission")
  @js.native
  class AmiLaunchPermission protected () extends CustomResource {
    /**
      * Create a AmiLaunchPermission resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AmiLaunchPermissionArgs) = this()
    def this(name: String, args: AmiLaunchPermissionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * An AWS Account ID to add launch permissions.
      */
    val accountId: Output_[String] = js.native
    
    /**
      * A region-unique name for the AMI.
      */
    val imageId: Output_[String] = js.native
  }
  /* static members */
  object AmiLaunchPermission {
    
    @JSImport("@pulumi/aws/ec2/amiLaunchPermission", "AmiLaunchPermission")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AmiLaunchPermission resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): AmiLaunchPermission = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[AmiLaunchPermission]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): AmiLaunchPermission = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AmiLaunchPermission]
    inline def get(name: String, id: Input[ID], state: AmiLaunchPermissionState): AmiLaunchPermission = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AmiLaunchPermission]
    inline def get(name: String, id: Input[ID], state: AmiLaunchPermissionState, opts: CustomResourceOptions): AmiLaunchPermission = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AmiLaunchPermission]
    
    /**
      * Returns true if the given object is an instance of AmiLaunchPermission.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/amiLaunchPermission.AmiLaunchPermission */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/amiLaunchPermission.AmiLaunchPermission */ Boolean]
  }
  
  trait AmiLaunchPermissionArgs extends StObject {
    
    /**
      * An AWS Account ID to add launch permissions.
      */
    val accountId: Input[String]
    
    /**
      * A region-unique name for the AMI.
      */
    val imageId: Input[String]
  }
  object AmiLaunchPermissionArgs {
    
    inline def apply(accountId: Input[String], imageId: Input[String]): AmiLaunchPermissionArgs = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AmiLaunchPermissionArgs]
    }
    
    extension [Self <: AmiLaunchPermissionArgs](x: Self) {
      
      inline def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setImageId(value: Input[String]): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    }
  }
  
  trait AmiLaunchPermissionState extends StObject {
    
    /**
      * An AWS Account ID to add launch permissions.
      */
    val accountId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A region-unique name for the AMI.
      */
    val imageId: js.UndefOr[Input[String]] = js.undefined
  }
  object AmiLaunchPermissionState {
    
    inline def apply(): AmiLaunchPermissionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AmiLaunchPermissionState]
    }
    
    extension [Self <: AmiLaunchPermissionState](x: Self) {
      
      inline def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setImageId(value: Input[String]): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
      
      inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
    }
  }
}
