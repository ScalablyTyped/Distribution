package typings.reactNativeGoby.mod

import typings.reactNativeGoby.mod.Goby.SyncStatus
import typings.reactNativeGoby.mod.Goby.UpdateState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  /**
    * Decorates a React Component configuring it to sync for updates with the Goby server.
    *
    * @param options Options used to configure the end-user sync and update experience (e.g. when to check for updates?, show an prompt?, install the update immediately?).
    */
  @scala.inline
  def apply(): js.Function = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function]
  @scala.inline
  def apply(options: GobyOptions): js.Function = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @JSImport("react-native-goby", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates when you would like to check for (and install) updates from the Goby server.
    */
  @JSImport("react-native-goby", "default.CheckFrequency")
  @js.native
  object CheckFrequency extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.reactNativeGoby.mod.Goby.CheckFrequency & Double] = js.native
    
    /* 2 */ val MANUAL: typings.reactNativeGoby.mod.Goby.CheckFrequency.MANUAL & Double = js.native
    
    /* 1 */ val ON_APP_RESUME: typings.reactNativeGoby.mod.Goby.CheckFrequency.ON_APP_RESUME & Double = js.native
    
    /* 0 */ val ON_APP_START: typings.reactNativeGoby.mod.Goby.CheckFrequency.ON_APP_START & Double = js.native
  }
  
  /**
    * Represents the default settings that will be used by the sync method if
    * an update dialog is configured to be displayed.
    */
  @JSImport("react-native-goby", "default.DEFAULT_UPDATE_DIALOG")
  @js.native
  def DEFAULT_UPDATE_DIALOG: UpdateDialog = js.native
  @scala.inline
  def DEFAULT_UPDATE_DIALOG_=(x: UpdateDialog): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_UPDATE_DIALOG")(x.asInstanceOf[js.Any])
  
  /**
    * Indicates the status of a deployment (after installing and restarting).
    */
  @JSImport("react-native-goby", "default.DeploymentStatus")
  @js.native
  object DeploymentStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.reactNativeGoby.mod.Goby.DeploymentStatus & Double] = js.native
    
    /* 0 */ val FAILED: typings.reactNativeGoby.mod.Goby.DeploymentStatus.FAILED & Double = js.native
    
    /* 1 */ val SUCCEEDED: typings.reactNativeGoby.mod.Goby.DeploymentStatus.SUCCEEDED & Double = js.native
  }
  
  /**
    * Indicates when you would like an installed update to actually be applied.
    */
  @JSImport("react-native-goby", "default.InstallMode")
  @js.native
  object InstallMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.reactNativeGoby.mod.Goby.InstallMode & Double] = js.native
    
    /* 0 */ val IMMEDIATE: typings.reactNativeGoby.mod.Goby.InstallMode.IMMEDIATE & Double = js.native
    
    /* 1 */ val ON_NEXT_RESTART: typings.reactNativeGoby.mod.Goby.InstallMode.ON_NEXT_RESTART & Double = js.native
    
    /* 2 */ val ON_NEXT_RESUME: typings.reactNativeGoby.mod.Goby.InstallMode.ON_NEXT_RESUME & Double = js.native
  }
  
  /**
    * Indicates the current status of a sync operation.
    */
  @JSImport("react-native-goby", "default.SyncStatus")
  @js.native
  object SyncStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.reactNativeGoby.mod.Goby.SyncStatus & Double] = js.native
    
    /* 1 */ val AWAITING_USER_ACTION: typings.reactNativeGoby.mod.Goby.SyncStatus.AWAITING_USER_ACTION & Double = js.native
    
    /* 0 */ val CHECKING_FOR_UPDATE: typings.reactNativeGoby.mod.Goby.SyncStatus.CHECKING_FOR_UPDATE & Double = js.native
    
    /* 2 */ val DOWNLOADING_PACKAGE: typings.reactNativeGoby.mod.Goby.SyncStatus.DOWNLOADING_PACKAGE & Double = js.native
    
    /* 3 */ val INSTALLING_UPDATE: typings.reactNativeGoby.mod.Goby.SyncStatus.INSTALLING_UPDATE & Double = js.native
    
    /* 7 */ val SYNC_IN_PROGRESS: typings.reactNativeGoby.mod.Goby.SyncStatus.SYNC_IN_PROGRESS & Double = js.native
    
    /* 8 */ val UNKNOWN_ERROR: typings.reactNativeGoby.mod.Goby.SyncStatus.UNKNOWN_ERROR & Double = js.native
    
    /* 5 */ val UPDATE_IGNORED: typings.reactNativeGoby.mod.Goby.SyncStatus.UPDATE_IGNORED & Double = js.native
    
    /* 6 */ val UPDATE_INSTALLED: typings.reactNativeGoby.mod.Goby.SyncStatus.UPDATE_INSTALLED & Double = js.native
    
    /* 4 */ val UP_TO_DATE: typings.reactNativeGoby.mod.Goby.SyncStatus.UP_TO_DATE & Double = js.native
  }
  
  /**
    * Indicates the state that an update is currently in.
    */
  @JSImport("react-native-goby", "default.UpdateState")
  @js.native
  object UpdateState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.reactNativeGoby.mod.Goby.UpdateState & Double] = js.native
    
    /* 2 */ val LATEST: typings.reactNativeGoby.mod.Goby.UpdateState.LATEST & Double = js.native
    
    /* 1 */ val PENDING: typings.reactNativeGoby.mod.Goby.UpdateState.PENDING & Double = js.native
    
    /* 0 */ val RUNNING: typings.reactNativeGoby.mod.Goby.UpdateState.RUNNING & Double = js.native
  }
  
  /**
    * Allow Goby to restart the app.
    */
  @scala.inline
  def allowRestart(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowRestart")().asInstanceOf[Unit]
  
  /**
    * Asks the Goby service whether the configured app deployment has an update available.
    *
    * @param deploymentKey The deployment key to use to query the Goby server for an update.
    */
  @scala.inline
  def checkForUpdate(): js.Promise[RemotePackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkForUpdate")().asInstanceOf[js.Promise[RemotePackage]]
  @scala.inline
  def checkForUpdate(deploymentKey: String): js.Promise[RemotePackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkForUpdate")(deploymentKey.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RemotePackage]]
  
  /**
    * Forbid Goby to restart the app.
    */
  @scala.inline
  def disallowRestart(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowRestart")().asInstanceOf[Unit]
  
  /**
    * Retrieves the metadata for an installed update (e.g. description, mandatory).
    *
    * @param updateState The state of the update you want to retrieve the metadata for. Defaults to UpdateState.RUNNING.
    */
  @scala.inline
  def getUpdateMetadata(): js.Promise[LocalPackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUpdateMetadata")().asInstanceOf[js.Promise[LocalPackage]]
  @scala.inline
  def getUpdateMetadata(updateState: UpdateState): js.Promise[LocalPackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUpdateMetadata")(updateState.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LocalPackage]]
  
  /**
    * Notifies the Goby runtime that an installed update is considered successful.
    */
  @scala.inline
  def notifyAppReady(): js.Promise[StatusReport] = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyAppReady")().asInstanceOf[js.Promise[StatusReport]]
  
  /**
    * Immediately restarts the app.
    *
    * @param onlyIfUpdateIsPending Indicates whether you want the restart to no-op if there isn't currently a pending update.
    */
  @scala.inline
  def restartApp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restartApp")().asInstanceOf[Unit]
  @scala.inline
  def restartApp(onlyIfUpdateIsPending: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restartApp")(onlyIfUpdateIsPending.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Allows checking for an update, downloading it and installing it, all with a single call.
    *
    * @param options Options used to configure the end-user update experience (e.g. show an prompt?, install the update immediately?).
    * @param syncStatusChangedCallback An optional callback that allows tracking the status of the sync operation, as opposed to simply checking the resolved state via the returned Promise.
    * @param downloadProgressCallback An optional callback that allows tracking the progress of an update while it is being downloaded.
    */
  @scala.inline
  def sync(): js.Promise[SyncStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[js.Promise[SyncStatus]]
  @scala.inline
  def sync(options: Unit, syncStatusChangedCallback: Unit, downloadProgressCallback: DownloadProgressCallback): js.Promise[SyncStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any], syncStatusChangedCallback.asInstanceOf[js.Any], downloadProgressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SyncStatus]]
  @scala.inline
  def sync(options: Unit, syncStatusChangedCallback: SyncStatusChangedCallback): js.Promise[SyncStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any], syncStatusChangedCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SyncStatus]]
  @scala.inline
  def sync(
    options: Unit,
    syncStatusChangedCallback: SyncStatusChangedCallback,
    downloadProgressCallback: DownloadProgressCallback
  ): js.Promise[SyncStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any], syncStatusChangedCallback.asInstanceOf[js.Any], downloadProgressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SyncStatus]]
  @scala.inline
  def sync(options: SyncOptions): js.Promise[SyncStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SyncStatus]]
  @scala.inline
  def sync(
    options: SyncOptions,
    syncStatusChangedCallback: Unit,
    downloadProgressCallback: DownloadProgressCallback
  ): js.Promise[SyncStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any], syncStatusChangedCallback.asInstanceOf[js.Any], downloadProgressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SyncStatus]]
  @scala.inline
  def sync(options: SyncOptions, syncStatusChangedCallback: SyncStatusChangedCallback): js.Promise[SyncStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any], syncStatusChangedCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SyncStatus]]
  @scala.inline
  def sync(
    options: SyncOptions,
    syncStatusChangedCallback: SyncStatusChangedCallback,
    downloadProgressCallback: DownloadProgressCallback
  ): js.Promise[SyncStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any], syncStatusChangedCallback.asInstanceOf[js.Any], downloadProgressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SyncStatus]]
}
