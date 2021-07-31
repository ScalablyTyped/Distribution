package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspaces {
  
  trait DirectorySelfServicePermissions extends StObject {
    
    /**
      * Whether WorkSpaces directory users can change the compute type (bundle) for their workspace. Default `false`.
      */
    var changeComputeType: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether WorkSpaces directory users can increase the volume size of the drives on their workspace. Default `false`.
      */
    var increaseVolumeSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state. Default `false`.
      */
    var rebuildWorkspace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether WorkSpaces directory users can restart their workspace. Default `true`.
      */
    var restartWorkspace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether WorkSpaces directory users can switch the running mode of their workspace. Default `false`.
      */
    var switchRunningMode: js.UndefOr[Boolean] = js.undefined
  }
  object DirectorySelfServicePermissions {
    
    @scala.inline
    def apply(): DirectorySelfServicePermissions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectorySelfServicePermissions]
    }
    
    @scala.inline
    implicit class DirectorySelfServicePermissionsMutableBuilder[Self <: DirectorySelfServicePermissions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeComputeType(value: Boolean): Self = StObject.set(x, "changeComputeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeComputeTypeUndefined: Self = StObject.set(x, "changeComputeType", js.undefined)
      
      @scala.inline
      def setIncreaseVolumeSize(value: Boolean): Self = StObject.set(x, "increaseVolumeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncreaseVolumeSizeUndefined: Self = StObject.set(x, "increaseVolumeSize", js.undefined)
      
      @scala.inline
      def setRebuildWorkspace(value: Boolean): Self = StObject.set(x, "rebuildWorkspace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRebuildWorkspaceUndefined: Self = StObject.set(x, "rebuildWorkspace", js.undefined)
      
      @scala.inline
      def setRestartWorkspace(value: Boolean): Self = StObject.set(x, "restartWorkspace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestartWorkspaceUndefined: Self = StObject.set(x, "restartWorkspace", js.undefined)
      
      @scala.inline
      def setSwitchRunningMode(value: Boolean): Self = StObject.set(x, "switchRunningMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchRunningModeUndefined: Self = StObject.set(x, "switchRunningMode", js.undefined)
    }
  }
  
  trait DirectoryWorkspaceCreationProperties extends StObject {
    
    /**
      * The identifier of your custom security group. Should relate to the same VPC, where workspaces reside in.
      */
    var customSecurityGroupId: js.UndefOr[String] = js.undefined
    
    /**
      * The default organizational unit (OU) for your WorkSpace directories. Should conform `"OU=<value>,DC=<value>,...,DC=<value>"` pattern.
      */
    var defaultOu: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates whether internet access is enabled for your WorkSpaces.
      */
    var enableInternetAccess: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see [WorkSpace Maintenance](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html)..
      */
    var enableMaintenanceMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether users are local administrators of their WorkSpaces.
      */
    var userEnabledAsLocalAdministrator: js.UndefOr[Boolean] = js.undefined
  }
  object DirectoryWorkspaceCreationProperties {
    
    @scala.inline
    def apply(): DirectoryWorkspaceCreationProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryWorkspaceCreationProperties]
    }
    
    @scala.inline
    implicit class DirectoryWorkspaceCreationPropertiesMutableBuilder[Self <: DirectoryWorkspaceCreationProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomSecurityGroupId(value: String): Self = StObject.set(x, "customSecurityGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSecurityGroupIdUndefined: Self = StObject.set(x, "customSecurityGroupId", js.undefined)
      
      @scala.inline
      def setDefaultOu(value: String): Self = StObject.set(x, "defaultOu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOuUndefined: Self = StObject.set(x, "defaultOu", js.undefined)
      
      @scala.inline
      def setEnableInternetAccess(value: Boolean): Self = StObject.set(x, "enableInternetAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableInternetAccessUndefined: Self = StObject.set(x, "enableInternetAccess", js.undefined)
      
      @scala.inline
      def setEnableMaintenanceMode(value: Boolean): Self = StObject.set(x, "enableMaintenanceMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMaintenanceModeUndefined: Self = StObject.set(x, "enableMaintenanceMode", js.undefined)
      
      @scala.inline
      def setUserEnabledAsLocalAdministrator(value: Boolean): Self = StObject.set(x, "userEnabledAsLocalAdministrator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserEnabledAsLocalAdministratorUndefined: Self = StObject.set(x, "userEnabledAsLocalAdministrator", js.undefined)
    }
  }
  
  trait GetBundleComputeType extends StObject {
    
    /**
      * The name of the bundle. You cannot combine this parameter with `bundleId`.
      */
    var name: String
  }
  object GetBundleComputeType {
    
    @scala.inline
    def apply(name: String): GetBundleComputeType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBundleComputeType]
    }
    
    @scala.inline
    implicit class GetBundleComputeTypeMutableBuilder[Self <: GetBundleComputeType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetBundleRootStorage extends StObject {
    
    /**
      * The size of the user storage.
      */
    var capacity: String
  }
  object GetBundleRootStorage {
    
    @scala.inline
    def apply(capacity: String): GetBundleRootStorage = {
      val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBundleRootStorage]
    }
    
    @scala.inline
    implicit class GetBundleRootStorageMutableBuilder[Self <: GetBundleRootStorage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapacity(value: String): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetBundleUserStorage extends StObject {
    
    /**
      * The size of the user storage.
      */
    var capacity: String
  }
  object GetBundleUserStorage {
    
    @scala.inline
    def apply(capacity: String): GetBundleUserStorage = {
      val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBundleUserStorage]
    }
    
    @scala.inline
    implicit class GetBundleUserStorageMutableBuilder[Self <: GetBundleUserStorage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapacity(value: String): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetDirectorySelfServicePermission extends StObject {
    
    /**
      * Whether WorkSpaces directory users can change the compute type (bundle) for their workspace.
      */
    var changeComputeType: Boolean
    
    /**
      * Whether WorkSpaces directory users can increase the volume size of the drives on their workspace.
      */
    var increaseVolumeSize: Boolean
    
    /**
      * Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state.
      */
    var rebuildWorkspace: Boolean
    
    /**
      * Whether WorkSpaces directory users can restart their workspace.
      */
    var restartWorkspace: Boolean
    
    /**
      * Whether WorkSpaces directory users can switch the running mode of their workspace.
      */
    var switchRunningMode: Boolean
  }
  object GetDirectorySelfServicePermission {
    
    @scala.inline
    def apply(
      changeComputeType: Boolean,
      increaseVolumeSize: Boolean,
      rebuildWorkspace: Boolean,
      restartWorkspace: Boolean,
      switchRunningMode: Boolean
    ): GetDirectorySelfServicePermission = {
      val __obj = js.Dynamic.literal(changeComputeType = changeComputeType.asInstanceOf[js.Any], increaseVolumeSize = increaseVolumeSize.asInstanceOf[js.Any], rebuildWorkspace = rebuildWorkspace.asInstanceOf[js.Any], restartWorkspace = restartWorkspace.asInstanceOf[js.Any], switchRunningMode = switchRunningMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDirectorySelfServicePermission]
    }
    
    @scala.inline
    implicit class GetDirectorySelfServicePermissionMutableBuilder[Self <: GetDirectorySelfServicePermission] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeComputeType(value: Boolean): Self = StObject.set(x, "changeComputeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncreaseVolumeSize(value: Boolean): Self = StObject.set(x, "increaseVolumeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRebuildWorkspace(value: Boolean): Self = StObject.set(x, "rebuildWorkspace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestartWorkspace(value: Boolean): Self = StObject.set(x, "restartWorkspace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchRunningMode(value: Boolean): Self = StObject.set(x, "switchRunningMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetDirectoryWorkspaceCreationProperties extends StObject {
    
    /**
      * The identifier of your custom security group. Should relate to the same VPC, where workspaces reside in.
      */
    var customSecurityGroupId: String
    
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
    
    @scala.inline
    def apply(customSecurityGroupId: String): GetDirectoryWorkspaceCreationProperties = {
      val __obj = js.Dynamic.literal(customSecurityGroupId = customSecurityGroupId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDirectoryWorkspaceCreationProperties]
    }
    
    @scala.inline
    implicit class GetDirectoryWorkspaceCreationPropertiesMutableBuilder[Self <: GetDirectoryWorkspaceCreationProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomSecurityGroupId(value: String): Self = StObject.set(x, "customSecurityGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOu(value: String): Self = StObject.set(x, "defaultOu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOuUndefined: Self = StObject.set(x, "defaultOu", js.undefined)
      
      @scala.inline
      def setEnableInternetAccess(value: Boolean): Self = StObject.set(x, "enableInternetAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableInternetAccessUndefined: Self = StObject.set(x, "enableInternetAccess", js.undefined)
      
      @scala.inline
      def setEnableMaintenanceMode(value: Boolean): Self = StObject.set(x, "enableMaintenanceMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMaintenanceModeUndefined: Self = StObject.set(x, "enableMaintenanceMode", js.undefined)
      
      @scala.inline
      def setUserEnabledAsLocalAdministrator(value: Boolean): Self = StObject.set(x, "userEnabledAsLocalAdministrator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserEnabledAsLocalAdministratorUndefined: Self = StObject.set(x, "userEnabledAsLocalAdministrator", js.undefined)
    }
  }
  
  trait GetWorkspaceWorkspaceProperty extends StObject {
    
    /**
      * The compute type. For more information, see [Amazon WorkSpaces Bundles](http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles). Valid values are `VALUE`, `STANDARD`, `PERFORMANCE`, `POWER`, `GRAPHICS`, `POWERPRO` and `GRAPHICSPRO`.
      */
    var computeTypeName: String
    
    /**
      * The size of the root volume.
      */
    var rootVolumeSizeGib: Double
    
    /**
      * The running mode. For more information, see [Manage the WorkSpace Running Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html). Valid values are `AUTO_STOP` and `ALWAYS_ON`.
      */
    var runningMode: String
    
    /**
      * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
      */
    var runningModeAutoStopTimeoutInMinutes: Double
    
    /**
      * The size of the user storage.
      */
    var userVolumeSizeGib: Double
  }
  object GetWorkspaceWorkspaceProperty {
    
    @scala.inline
    def apply(
      computeTypeName: String,
      rootVolumeSizeGib: Double,
      runningMode: String,
      runningModeAutoStopTimeoutInMinutes: Double,
      userVolumeSizeGib: Double
    ): GetWorkspaceWorkspaceProperty = {
      val __obj = js.Dynamic.literal(computeTypeName = computeTypeName.asInstanceOf[js.Any], rootVolumeSizeGib = rootVolumeSizeGib.asInstanceOf[js.Any], runningMode = runningMode.asInstanceOf[js.Any], runningModeAutoStopTimeoutInMinutes = runningModeAutoStopTimeoutInMinutes.asInstanceOf[js.Any], userVolumeSizeGib = userVolumeSizeGib.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetWorkspaceWorkspaceProperty]
    }
    
    @scala.inline
    implicit class GetWorkspaceWorkspacePropertyMutableBuilder[Self <: GetWorkspaceWorkspaceProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComputeTypeName(value: String): Self = StObject.set(x, "computeTypeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootVolumeSizeGib(value: Double): Self = StObject.set(x, "rootVolumeSizeGib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunningMode(value: String): Self = StObject.set(x, "runningMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunningModeAutoStopTimeoutInMinutes(value: Double): Self = StObject.set(x, "runningModeAutoStopTimeoutInMinutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserVolumeSizeGib(value: Double): Self = StObject.set(x, "userVolumeSizeGib", value.asInstanceOf[js.Any])
    }
  }
  
  trait IpGroupRule extends StObject {
    
    /**
      * The description.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * The IP address range, in CIDR notation, e.g. `10.0.0.0/16`
      */
    var source: String
  }
  object IpGroupRule {
    
    @scala.inline
    def apply(source: String): IpGroupRule = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpGroupRule]
    }
    
    @scala.inline
    implicit class IpGroupRuleMutableBuilder[Self <: IpGroupRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkspaceWorkspaceProperties extends StObject {
    
    /**
      * The compute type. For more information, see [Amazon WorkSpaces Bundles](http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles). Valid values are `VALUE`, `STANDARD`, `PERFORMANCE`, `POWER`, `GRAPHICS`, `POWERPRO` and `GRAPHICSPRO`.
      */
    var computeTypeName: js.UndefOr[String] = js.undefined
    
    /**
      * The size of the root volume.
      */
    var rootVolumeSizeGib: js.UndefOr[Double] = js.undefined
    
    /**
      * The running mode. For more information, see [Manage the WorkSpace Running Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html). Valid values are `AUTO_STOP` and `ALWAYS_ON`.
      */
    var runningMode: js.UndefOr[String] = js.undefined
    
    /**
      * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
      */
    var runningModeAutoStopTimeoutInMinutes: Double
    
    /**
      * The size of the user storage.
      */
    var userVolumeSizeGib: js.UndefOr[Double] = js.undefined
  }
  object WorkspaceWorkspaceProperties {
    
    @scala.inline
    def apply(runningModeAutoStopTimeoutInMinutes: Double): WorkspaceWorkspaceProperties = {
      val __obj = js.Dynamic.literal(runningModeAutoStopTimeoutInMinutes = runningModeAutoStopTimeoutInMinutes.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceWorkspaceProperties]
    }
    
    @scala.inline
    implicit class WorkspaceWorkspacePropertiesMutableBuilder[Self <: WorkspaceWorkspaceProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComputeTypeName(value: String): Self = StObject.set(x, "computeTypeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputeTypeNameUndefined: Self = StObject.set(x, "computeTypeName", js.undefined)
      
      @scala.inline
      def setRootVolumeSizeGib(value: Double): Self = StObject.set(x, "rootVolumeSizeGib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootVolumeSizeGibUndefined: Self = StObject.set(x, "rootVolumeSizeGib", js.undefined)
      
      @scala.inline
      def setRunningMode(value: String): Self = StObject.set(x, "runningMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunningModeAutoStopTimeoutInMinutes(value: Double): Self = StObject.set(x, "runningModeAutoStopTimeoutInMinutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunningModeUndefined: Self = StObject.set(x, "runningMode", js.undefined)
      
      @scala.inline
      def setUserVolumeSizeGib(value: Double): Self = StObject.set(x, "userVolumeSizeGib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserVolumeSizeGibUndefined: Self = StObject.set(x, "userVolumeSizeGib", js.undefined)
    }
  }
}
