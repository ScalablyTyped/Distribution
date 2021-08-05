package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspaces {
  
  trait DirectorySelfServicePermissions extends StObject {
    
    /**
      * Whether WorkSpaces directory users can change the compute type (bundle) for their workspace. Default `false`.
      */
    var changeComputeType: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether WorkSpaces directory users can increase the volume size of the drives on their workspace. Default `false`.
      */
    var increaseVolumeSize: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state. Default `false`.
      */
    var rebuildWorkspace: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether WorkSpaces directory users can restart their workspace. Default `true`.
      */
    var restartWorkspace: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether WorkSpaces directory users can switch the running mode of their workspace. Default `false`.
      */
    var switchRunningMode: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object DirectorySelfServicePermissions {
    
    inline def apply(): DirectorySelfServicePermissions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectorySelfServicePermissions]
    }
    
    extension [Self <: DirectorySelfServicePermissions](x: Self) {
      
      inline def setChangeComputeType(value: Input[Boolean]): Self = StObject.set(x, "changeComputeType", value.asInstanceOf[js.Any])
      
      inline def setChangeComputeTypeUndefined: Self = StObject.set(x, "changeComputeType", js.undefined)
      
      inline def setIncreaseVolumeSize(value: Input[Boolean]): Self = StObject.set(x, "increaseVolumeSize", value.asInstanceOf[js.Any])
      
      inline def setIncreaseVolumeSizeUndefined: Self = StObject.set(x, "increaseVolumeSize", js.undefined)
      
      inline def setRebuildWorkspace(value: Input[Boolean]): Self = StObject.set(x, "rebuildWorkspace", value.asInstanceOf[js.Any])
      
      inline def setRebuildWorkspaceUndefined: Self = StObject.set(x, "rebuildWorkspace", js.undefined)
      
      inline def setRestartWorkspace(value: Input[Boolean]): Self = StObject.set(x, "restartWorkspace", value.asInstanceOf[js.Any])
      
      inline def setRestartWorkspaceUndefined: Self = StObject.set(x, "restartWorkspace", js.undefined)
      
      inline def setSwitchRunningMode(value: Input[Boolean]): Self = StObject.set(x, "switchRunningMode", value.asInstanceOf[js.Any])
      
      inline def setSwitchRunningModeUndefined: Self = StObject.set(x, "switchRunningMode", js.undefined)
    }
  }
  
  trait DirectoryWorkspaceCreationProperties extends StObject {
    
    /**
      * The identifier of your custom security group. Should relate to the same VPC, where workspaces reside in.
      */
    var customSecurityGroupId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The default organizational unit (OU) for your WorkSpace directories. Should conform `"OU=<value>,DC=<value>,...,DC=<value>"` pattern.
      */
    var defaultOu: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether internet access is enabled for your WorkSpaces.
      */
    var enableInternetAccess: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see [WorkSpace Maintenance](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html)..
      */
    var enableMaintenanceMode: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Indicates whether users are local administrators of their WorkSpaces.
      */
    var userEnabledAsLocalAdministrator: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object DirectoryWorkspaceCreationProperties {
    
    inline def apply(): DirectoryWorkspaceCreationProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryWorkspaceCreationProperties]
    }
    
    extension [Self <: DirectoryWorkspaceCreationProperties](x: Self) {
      
      inline def setCustomSecurityGroupId(value: Input[String]): Self = StObject.set(x, "customSecurityGroupId", value.asInstanceOf[js.Any])
      
      inline def setCustomSecurityGroupIdUndefined: Self = StObject.set(x, "customSecurityGroupId", js.undefined)
      
      inline def setDefaultOu(value: Input[String]): Self = StObject.set(x, "defaultOu", value.asInstanceOf[js.Any])
      
      inline def setDefaultOuUndefined: Self = StObject.set(x, "defaultOu", js.undefined)
      
      inline def setEnableInternetAccess(value: Input[Boolean]): Self = StObject.set(x, "enableInternetAccess", value.asInstanceOf[js.Any])
      
      inline def setEnableInternetAccessUndefined: Self = StObject.set(x, "enableInternetAccess", js.undefined)
      
      inline def setEnableMaintenanceMode(value: Input[Boolean]): Self = StObject.set(x, "enableMaintenanceMode", value.asInstanceOf[js.Any])
      
      inline def setEnableMaintenanceModeUndefined: Self = StObject.set(x, "enableMaintenanceMode", js.undefined)
      
      inline def setUserEnabledAsLocalAdministrator(value: Input[Boolean]): Self = StObject.set(x, "userEnabledAsLocalAdministrator", value.asInstanceOf[js.Any])
      
      inline def setUserEnabledAsLocalAdministratorUndefined: Self = StObject.set(x, "userEnabledAsLocalAdministrator", js.undefined)
    }
  }
  
  trait GetDirectoryWorkspaceCreationProperties extends StObject {
    
    /**
      * The identifier of your custom security group. Should relate to the same VPC, where workspaces reside in.
      */
    var customSecurityGroupId: js.UndefOr[String] = js.undefined
    
    /**
      * The default organizational unit (OU) for your WorkSpace directories.
      */
    var defaultOu: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates whether internet access is enabled for your WorkSpaces.
      */
    var enableInternetAccess: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see [WorkSpace Maintenance](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html).
      */
    var enableMaintenanceMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether users are local administrators of their WorkSpaces.
      */
    var userEnabledAsLocalAdministrator: js.UndefOr[Boolean] = js.undefined
  }
  object GetDirectoryWorkspaceCreationProperties {
    
    inline def apply(): GetDirectoryWorkspaceCreationProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetDirectoryWorkspaceCreationProperties]
    }
    
    extension [Self <: GetDirectoryWorkspaceCreationProperties](x: Self) {
      
      inline def setCustomSecurityGroupId(value: String): Self = StObject.set(x, "customSecurityGroupId", value.asInstanceOf[js.Any])
      
      inline def setCustomSecurityGroupIdUndefined: Self = StObject.set(x, "customSecurityGroupId", js.undefined)
      
      inline def setDefaultOu(value: String): Self = StObject.set(x, "defaultOu", value.asInstanceOf[js.Any])
      
      inline def setDefaultOuUndefined: Self = StObject.set(x, "defaultOu", js.undefined)
      
      inline def setEnableInternetAccess(value: Boolean): Self = StObject.set(x, "enableInternetAccess", value.asInstanceOf[js.Any])
      
      inline def setEnableInternetAccessUndefined: Self = StObject.set(x, "enableInternetAccess", js.undefined)
      
      inline def setEnableMaintenanceMode(value: Boolean): Self = StObject.set(x, "enableMaintenanceMode", value.asInstanceOf[js.Any])
      
      inline def setEnableMaintenanceModeUndefined: Self = StObject.set(x, "enableMaintenanceMode", js.undefined)
      
      inline def setUserEnabledAsLocalAdministrator(value: Boolean): Self = StObject.set(x, "userEnabledAsLocalAdministrator", value.asInstanceOf[js.Any])
      
      inline def setUserEnabledAsLocalAdministratorUndefined: Self = StObject.set(x, "userEnabledAsLocalAdministrator", js.undefined)
    }
  }
  
  trait IpGroupRule extends StObject {
    
    /**
      * The description.
      */
    var description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IP address range, in CIDR notation, e.g. `10.0.0.0/16`
      */
    var source: Input[String]
  }
  object IpGroupRule {
    
    inline def apply(source: Input[String]): IpGroupRule = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpGroupRule]
    }
    
    extension [Self <: IpGroupRule](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setSource(value: Input[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkspaceWorkspaceProperties extends StObject {
    
    /**
      * The compute type. For more information, see [Amazon WorkSpaces Bundles](http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles). Valid values are `VALUE`, `STANDARD`, `PERFORMANCE`, `POWER`, `GRAPHICS`, `POWERPRO` and `GRAPHICSPRO`.
      */
    var computeTypeName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The size of the root volume.
      */
    var rootVolumeSizeGib: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The running mode. For more information, see [Manage the WorkSpace Running Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html). Valid values are `AUTO_STOP` and `ALWAYS_ON`.
      */
    var runningMode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
      */
    var runningModeAutoStopTimeoutInMinutes: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The size of the user storage.
      */
    var userVolumeSizeGib: js.UndefOr[Input[Double]] = js.undefined
  }
  object WorkspaceWorkspaceProperties {
    
    inline def apply(): WorkspaceWorkspaceProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceWorkspaceProperties]
    }
    
    extension [Self <: WorkspaceWorkspaceProperties](x: Self) {
      
      inline def setComputeTypeName(value: Input[String]): Self = StObject.set(x, "computeTypeName", value.asInstanceOf[js.Any])
      
      inline def setComputeTypeNameUndefined: Self = StObject.set(x, "computeTypeName", js.undefined)
      
      inline def setRootVolumeSizeGib(value: Input[Double]): Self = StObject.set(x, "rootVolumeSizeGib", value.asInstanceOf[js.Any])
      
      inline def setRootVolumeSizeGibUndefined: Self = StObject.set(x, "rootVolumeSizeGib", js.undefined)
      
      inline def setRunningMode(value: Input[String]): Self = StObject.set(x, "runningMode", value.asInstanceOf[js.Any])
      
      inline def setRunningModeAutoStopTimeoutInMinutes(value: Input[Double]): Self = StObject.set(x, "runningModeAutoStopTimeoutInMinutes", value.asInstanceOf[js.Any])
      
      inline def setRunningModeAutoStopTimeoutInMinutesUndefined: Self = StObject.set(x, "runningModeAutoStopTimeoutInMinutes", js.undefined)
      
      inline def setRunningModeUndefined: Self = StObject.set(x, "runningMode", js.undefined)
      
      inline def setUserVolumeSizeGib(value: Input[Double]): Self = StObject.set(x, "userVolumeSizeGib", value.asInstanceOf[js.Any])
      
      inline def setUserVolumeSizeGibUndefined: Self = StObject.set(x, "userVolumeSizeGib", js.undefined)
    }
  }
}
