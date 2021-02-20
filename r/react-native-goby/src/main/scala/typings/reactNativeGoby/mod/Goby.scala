package typings.reactNativeGoby.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Goby {
  
  @js.native
  sealed trait CheckFrequency extends StObject
  /**
    * Indicates when you would like to check for (and install) updates from the Goby server.
    */
  @JSImport("react-native-goby", "Goby.CheckFrequency")
  @js.native
  object CheckFrequency extends StObject {
    
    /**
      * Don't automatically check for updates, but only do it when goby.sync() is manully called inside app code.
      */
    @js.native
    sealed trait MANUAL extends CheckFrequency
    
    /**
      * When the app re-enters the foreground.
      */
    @js.native
    sealed trait ON_APP_RESUME extends CheckFrequency
    
    /**
      * When the app is fully initialized (or more specifically, when the root component is mounted).
      */
    @js.native
    sealed trait ON_APP_START extends CheckFrequency
  }
  
  @js.native
  sealed trait DeploymentStatus extends StObject
  /**
    * Indicates the status of a deployment (after installing and restarting).
    */
  @JSImport("react-native-goby", "Goby.DeploymentStatus")
  @js.native
  object DeploymentStatus extends StObject {
    
    /**
      * The deployment failed (and was rolled back).
      */
    @js.native
    sealed trait FAILED extends DeploymentStatus
    
    /**
      * The deployment succeeded.
      */
    @js.native
    sealed trait SUCCEEDED extends DeploymentStatus
  }
  
  @js.native
  sealed trait InstallMode extends StObject
  /**
    * Indicates when you would like an installed update to actually be applied.
    */
  @JSImport("react-native-goby", "Goby.InstallMode")
  @js.native
  object InstallMode extends StObject {
    
    /**
      * Indicates that you want to install the update and restart the app immediately.
      */
    @js.native
    sealed trait IMMEDIATE extends InstallMode
    
    /**
      * Indicates that you want to install the update, but not forcibly restart the app.
      */
    @js.native
    sealed trait ON_NEXT_RESTART extends InstallMode
    
    /**
      * Indicates that you want to install the update, but don't want to restart the
      * app until the next time the end user resumes it from the background.
      */
    @js.native
    sealed trait ON_NEXT_RESUME extends InstallMode
  }
  
  @js.native
  sealed trait SyncStatus extends StObject
  /**
    * Indicates the current status of a sync operation.
    */
  @JSImport("react-native-goby", "Goby.SyncStatus")
  @js.native
  object SyncStatus extends StObject {
    
    /**
      * An update is available, and a confirmation dialog was shown
      * to the end user. (This is only applicable when the updateDialog is used)
      */
    @js.native
    sealed trait AWAITING_USER_ACTION extends SyncStatus
    
    /**
      * The Goby server is being queried for an update.
      */
    @js.native
    sealed trait CHECKING_FOR_UPDATE extends SyncStatus
    
    /**
      * An available update is being downloaded from the Goby server.
      */
    @js.native
    sealed trait DOWNLOADING_PACKAGE extends SyncStatus
    
    /**
      * An available update was downloaded and is about to be installed.
      */
    @js.native
    sealed trait INSTALLING_UPDATE extends SyncStatus
    
    /**
      * There is an ongoing sync operation running which prevents the current call from being executed.
      */
    @js.native
    sealed trait SYNC_IN_PROGRESS extends SyncStatus
    
    /**
      * The sync operation encountered an unknown error.
      */
    @js.native
    sealed trait UNKNOWN_ERROR extends SyncStatus
    
    /**
      * The app had an optional update which the end user chose to ignore.
      * (This is only applicable when the updateDialog is used)
      */
    @js.native
    sealed trait UPDATE_IGNORED extends SyncStatus
    
    /**
      * An available update has been installed and will be run either immediately after the
      * syncStatusChangedCallback function returns or the next time the app resumes/restarts,
      * depending on the InstallMode specified in SyncOptions
      */
    @js.native
    sealed trait UPDATE_INSTALLED extends SyncStatus
    
    /**
      * The app is up-to-date with the Goby server.
      */
    @js.native
    sealed trait UP_TO_DATE extends SyncStatus
  }
  
  @js.native
  sealed trait UpdateState extends StObject
  /**
    * Indicates the state that an update is currently in.
    */
  @JSImport("react-native-goby", "Goby.UpdateState")
  @js.native
  object UpdateState extends StObject {
    
    /**
      * Indicates than an update represents the latest available
      * release, and can be either currently running or pending.
      */
    @js.native
    sealed trait LATEST extends UpdateState
    
    /**
      * Indicates than an update has been installed, but the
      * app hasn't been restarted yet in order to apply it.
      */
    @js.native
    sealed trait PENDING extends UpdateState
    
    /**
      * Indicates that an update represents the
      * version of the app that is currently running.
      */
    @js.native
    sealed trait RUNNING extends UpdateState
  }
}
