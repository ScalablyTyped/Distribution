package typings.reactNativeGoby.mod.Goby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyncStatus extends js.Object

/**
  * Indicates the current status of a sync operation.
  */
@JSImport("react-native-goby", "Goby.SyncStatus")
@js.native
object SyncStatus extends js.Object {
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

