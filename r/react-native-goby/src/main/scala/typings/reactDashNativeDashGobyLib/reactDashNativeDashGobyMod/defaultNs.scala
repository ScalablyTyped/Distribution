package typings
package reactDashNativeDashGobyLib.reactDashNativeDashGobyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-goby", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  /**
    * Represents the default settings that will be used by the sync method if
    * an update dialog is configured to be displayed.
    */
  var DEFAULT_UPDATE_DIALOG: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.UpdateDialog = js.native
  /**
    * Allow Goby to restart the app.
    */
  def allowRestart(): scala.Unit = js.native
  /**
    * Asks the Goby service whether the configured app deployment has an update available.
    *
    * @param deploymentKey The deployment key to use to query the Goby server for an update.
    */
  def checkForUpdate(): js.Promise[reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.RemotePackage] = js.native
  def checkForUpdate(deploymentKey: java.lang.String): js.Promise[reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.RemotePackage] = js.native
  /**
    * Forbid Goby to restart the app.
    */
  def disallowRestart(): scala.Unit = js.native
  /**
    * Retrieves the metadata for an installed update (e.g. description, mandatory).
    *
    * @param updateState The state of the update you want to retrieve the metadata for. Defaults to UpdateState.RUNNING.
    */
  def getUpdateMetadata(): js.Promise[reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.LocalPackage] = js.native
  def getUpdateMetadata(updateState: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.UpdateState): js.Promise[reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.LocalPackage] = js.native
  /**
    * Notifies the Goby runtime that an installed update is considered successful.
    */
  def notifyAppReady(): js.Promise[reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.StatusReport] = js.native
  /**
    * Immediately restarts the app.
    *
    * @param onlyIfUpdateIsPending Indicates whether you want the restart to no-op if there isn't currently a pending update.
    */
  def restartApp(): scala.Unit = js.native
  def restartApp(onlyIfUpdateIsPending: scala.Boolean): scala.Unit = js.native
  /**
    * Allows checking for an update, downloading it and installing it, all with a single call.
    *
    * @param options Options used to configure the end-user update experience (e.g. show an prompt?, install the update immediately?).
    * @param syncStatusChangedCallback An optional callback that allows tracking the status of the sync operation, as opposed to simply checking the resolved state via the returned Promise.
    * @param downloadProgressCallback An optional callback that allows tracking the progress of an update while it is being downloaded.
    */
  def sync(): js.Promise[reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.SyncStatus] = js.native
  def sync(options: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.SyncOptions): js.Promise[reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.SyncStatus] = js.native
  def sync(
    options: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.SyncOptions,
    syncStatusChangedCallback: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.SyncStatusChangedCallback
  ): js.Promise[reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.SyncStatus] = js.native
  def sync(
    options: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.SyncOptions,
    syncStatusChangedCallback: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.SyncStatusChangedCallback,
    downloadProgressCallback: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.DownloadProgressCallback
  ): js.Promise[reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.SyncStatus] = js.native
  /**
    * Indicates when you would like to check for (and install) updates from the Goby server.
    */
  @js.native
  object CheckFrequency extends js.Object {
    val MANUAL: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.CheckFrequency.MANUAL with java.lang.String = js.native
    val ON_APP_RESUME: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.CheckFrequency.ON_APP_RESUME with java.lang.String = js.native
    val ON_APP_START: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.CheckFrequency.ON_APP_START with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.CheckFrequency with java.lang.String
      ] = js.native
  }
  
  /**
    * Indicates the status of a deployment (after installing and restarting).
    */
  @js.native
  object DeploymentStatus extends js.Object {
    val FAILED: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.DeploymentStatus.FAILED with java.lang.String = js.native
    val SUCCEEDED: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.DeploymentStatus.SUCCEEDED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.DeploymentStatus with java.lang.String
      ] = js.native
  }
  
  /**
    * Indicates when you would like an installed update to actually be applied.
    */
  @js.native
  object InstallMode extends js.Object {
    val IMMEDIATE: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.InstallMode.IMMEDIATE with java.lang.String = js.native
    val ON_NEXT_RESTART: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.InstallMode.ON_NEXT_RESTART with java.lang.String = js.native
    val ON_NEXT_RESUME: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.InstallMode.ON_NEXT_RESUME with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.InstallMode with java.lang.String
      ] = js.native
  }
  
  /**
    * Indicates the current status of a sync operation.
    */
  @js.native
  object SyncStatus extends js.Object {
    val AWAITING_USER_ACTION: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.SyncStatus.AWAITING_USER_ACTION with java.lang.String = js.native
    val CHECKING_FOR_UPDATE: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.SyncStatus.CHECKING_FOR_UPDATE with java.lang.String = js.native
    val DOWNLOADING_PACKAGE: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.SyncStatus.DOWNLOADING_PACKAGE with java.lang.String = js.native
    val INSTALLING_UPDATE: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.SyncStatus.INSTALLING_UPDATE with java.lang.String = js.native
    val SYNC_IN_PROGRESS: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.SyncStatus.SYNC_IN_PROGRESS with java.lang.String = js.native
    val UNKNOWN_ERROR: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.SyncStatus.UNKNOWN_ERROR with java.lang.String = js.native
    val UPDATE_IGNORED: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.SyncStatus.UPDATE_IGNORED with java.lang.String = js.native
    val UPDATE_INSTALLED: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.SyncStatus.UPDATE_INSTALLED with java.lang.String = js.native
    val UP_TO_DATE: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.SyncStatus.UP_TO_DATE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.SyncStatus with java.lang.String
      ] = js.native
  }
  
  /**
    * Indicates the state that an update is currently in.
    */
  @js.native
  object UpdateState extends js.Object {
    val LATEST: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.UpdateState.LATEST with java.lang.String = js.native
    val PENDING: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.UpdateState.PENDING with java.lang.String = js.native
    val RUNNING: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.UpdateState.RUNNING with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.UpdateState with java.lang.String
      ] = js.native
  }
  
  type CheckFrequency = reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.CheckFrequency
  type DeploymentStatus = reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.DeploymentStatus
  type InstallMode = reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.InstallMode
  type SyncStatus = reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.SyncStatus
  type UpdateState = reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.UpdateState
}

