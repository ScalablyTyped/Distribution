package typings.reactNativeFirebaseApp.mod

import typings.reactNativeFirebaseApp.mod.ReactNativeFirebase.FirebaseModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Utils_ {
  
  @JSImport("@react-native-firebase/app", "Utils.Module")
  @js.native
  open class Module () extends FirebaseModule {
    
    /**
      * Returns PlayServicesAvailability properties
      *
      * #### Example
      *
      * ```js
      * const PlayServicesAvailability = await firebase.utils().getPlayServicesStatus();
      * ```
      *
      * @android Android only - iOS always returns { isAvailable: true, status: 0 }
      */
    def getPlayServicesStatus(): js.Promise[PlayServicesAvailability] = js.native
    
    /**
      * Returns true if this app is running inside a Firebase Test Lab environment.
      *
      * #### Example
      *
      * ```js
      * const isRunningInTestLab = await firebase.utils().isRunningInTestLab;
      * ```
      * @android Android only - iOS returns false
      */
    var isRunningInTestLab: Boolean = js.native
    
    /**
      * Attempts to make Google Play services available on this device
      *
      * #### Example
      *
      * ```js
      * await firebase.utils().makePlayServicesAvailable();
      * ```
      *
      * @android Android only - iOS returns undefined
      */
    def makePlayServicesAvailable(): js.Promise[Unit] = js.native
    
    /**
      * Returns PlayServicesAvailability properties
      *
      * #### Example
      *
      * ```js
      * const PlayServicesAvailability = await firebase.utils().playServicesAvailability;
      * ```
      *
      * @android Android only - iOS always returns { isAvailable: true, status: 0 }
      */
    var playServicesAvailability: PlayServicesAvailability = js.native
    
    /**
      * A prompt appears on the device to ask the user to update play services
      *
      * #### Example
      *
      * ```js
      * await firebase.utils().promptForPlayServices();
      * ```
      *
      * @android Android only - iOS returns undefined
      */
    def promptForPlayServices(): js.Promise[Unit] = js.native
    
    /**
      * Resolves an error by starting any intents requiring user interaction.
      *
      * #### Example
      *
      * ```js
      * await firebase.utils().resolutionForPlayServices();
      * ```
      *
      * @android Android only - iOS returns undefined
      */
    def resolutionForPlayServices(): js.Promise[Unit] = js.native
  }
  
  @js.native
  sealed trait PlayServicesAvailabilityStatusCodes extends StObject
  @JSImport("@react-native-firebase/app", "Utils.PlayServicesAvailabilityStatusCodes")
  @js.native
  object PlayServicesAvailabilityStatusCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PlayServicesAvailabilityStatusCodes & Double] = js.native
    
    @js.native
    sealed trait API_UNAVAILABLE
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 16 */ val API_UNAVAILABLE: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.API_UNAVAILABLE & Double = js.native
    
    @js.native
    sealed trait CANCELED
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 13 */ val CANCELED: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.CANCELED & Double = js.native
    
    @js.native
    sealed trait DEVELOPER_ERROR
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 10 */ val DEVELOPER_ERROR: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.DEVELOPER_ERROR & Double = js.native
    
    @js.native
    sealed trait DRIVE_EXTERNAL_STORAGE_REQUIRED
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 1500 */ val DRIVE_EXTERNAL_STORAGE_REQUIRED: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.DRIVE_EXTERNAL_STORAGE_REQUIRED & Double = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 8 */ val INTERNAL_ERROR: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.INTERNAL_ERROR & Double = js.native
    
    @js.native
    sealed trait INTERRUPTED
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 15 */ val INTERRUPTED: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.INTERRUPTED & Double = js.native
    
    @js.native
    sealed trait INVALID_ACCOUNT
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 5 */ val INVALID_ACCOUNT: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.INVALID_ACCOUNT & Double = js.native
    
    @js.native
    sealed trait LICENSE_CHECK_FAILED
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 11 */ val LICENSE_CHECK_FAILED: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.LICENSE_CHECK_FAILED & Double = js.native
    
    @js.native
    sealed trait NETWORK_ERROR
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 7 */ val NETWORK_ERROR: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.NETWORK_ERROR & Double = js.native
    
    @js.native
    sealed trait RESOLUTION_REQUIRED
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 6 */ val RESOLUTION_REQUIRED: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.RESOLUTION_REQUIRED & Double = js.native
    
    @js.native
    sealed trait RESTRICTED_PROFILE
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 20 */ val RESTRICTED_PROFILE: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.RESTRICTED_PROFILE & Double = js.native
    
    @js.native
    sealed trait SERVICE_DISABLED
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 3 */ val SERVICE_DISABLED: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.SERVICE_DISABLED & Double = js.native
    
    @js.native
    sealed trait SERVICE_INVALID
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 9 */ val SERVICE_INVALID: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.SERVICE_INVALID & Double = js.native
    
    @js.native
    sealed trait SERVICE_MISSING
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 1 */ val SERVICE_MISSING: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.SERVICE_MISSING & Double = js.native
    
    @js.native
    sealed trait SERVICE_MISSING_PERMISSION
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 19 */ val SERVICE_MISSING_PERMISSION: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.SERVICE_MISSING_PERMISSION & Double = js.native
    
    @js.native
    sealed trait SERVICE_UPDATING
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 18 */ val SERVICE_UPDATING: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.SERVICE_UPDATING & Double = js.native
    
    @js.native
    sealed trait SERVICE_VERSION_UPDATE_REQUIRED
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 2 */ val SERVICE_VERSION_UPDATE_REQUIRED: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.SERVICE_VERSION_UPDATE_REQUIRED & Double = js.native
    
    @js.native
    sealed trait SIGN_IN_FAILED
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 17 */ val SIGN_IN_FAILED: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.SIGN_IN_FAILED & Double = js.native
    
    @js.native
    sealed trait SIGN_IN_REQUIRED
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 4 */ val SIGN_IN_REQUIRED: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.SIGN_IN_REQUIRED & Double = js.native
    
    @js.native
    sealed trait SUCCESS
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 0 */ val SUCCESS: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.SUCCESS & Double = js.native
    
    @js.native
    sealed trait TIMEOUT
      extends StObject
         with PlayServicesAvailabilityStatusCodes
    /* 14 */ val TIMEOUT: typings.reactNativeFirebaseApp.mod.Utils_.PlayServicesAvailabilityStatusCodes.TIMEOUT & Double = js.native
  }
  
  trait FilePath extends StObject {
    
    /**
      * Returns an absolute path to the application specific cache directory on the filesystem.
      *
      * The system will automatically delete files in this directory when disk space is needed elsewhere on the device, starting with the oldest files first.
      *
      * ```js
      * firebase.utils.FilePath.CACHES_DIRECTORY;
      * ```
      */
    var CACHES_DIRECTORY: String
    
    /**
      * Returns an absolute path to the users Documents directory.
      *
      * Use this directory to place documents that have been created by the user.
      *
      * Normally this is the external files directory on Android but if no external storage directory found,
      * e.g. removable media has been ejected by the user, it will fall back to internal storage. This may
      * under rare circumstances where device storage environment changes cause the directory to be different
      * between runs of the application
      *
      * ```js
      * firebase.utils.FilePath.DOCUMENT_DIRECTORY;
      * ```
      */
    var DOCUMENT_DIRECTORY: String
    
    /**
      * Returns an absolute path to the directory on the primary shared/external storage device.
      *
      * Here your application can place persistent files it owns. These files are internal to the application, and not typically visible to the user as media.
      *
      * Returns null if no external storage directory found, e.g. removable media has been ejected by the user.
      *
      * ```js
      * firebase.utils.FilePath.EXTERNAL_DIRECTORY;
      * ```
      *
      * @android Android only - iOS returns null
      */
    var EXTERNAL_DIRECTORY: String | Null
    
    /**
      * Returns an absolute path to the primary shared/external storage directory.
      *
      * Traditionally this is an SD card, but it may also be implemented as built-in storage on a device.
      *
      * Returns null if no external storage directory found, e.g. removable media has been ejected by the user.
      * Requires special permission granted by Play Store review team on Android, is unlikely to be a valid path.
      *
      * ```js
      * firebase.utils.FilePath.EXTERNAL_STORAGE_DIRECTORY;
      * ```
      *
      * @android Android only - iOS returns null
      */
    var EXTERNAL_STORAGE_DIRECTORY: String | Null
    
    /**
      * Returns an absolute path to the apps library/resources directory.
      *
      * E.g. this can be used for things like documentation, support files, and configuration files and generic resources.
      *
      * ```js
      * firebase.utils.FilePath.LIBRARY_DIRECTORY;
      * ```
      */
    var LIBRARY_DIRECTORY: String
    
    /**
      * Returns an absolute path to the applications main bundle.
      *
      * ```js
      * firebase.utils.FilePath.MAIN_BUNDLE;
      * ```
      *
      * @ios iOS only
      */
    var MAIN_BUNDLE: String
    
    /**
      * Returns an absolute path to a directory in which to place movies that are available to the user.
      * Requires special permission granted by Play Store review team on Android, is unlikely to be a valid path.
      *
      * ```js
      * firebase.utils.FilePath.MOVIES_DIRECTORY;
      * ```
      */
    var MOVIES_DIRECTORY: String
    
    /**
      * Returns an absolute path to a directory in which to place pictures that are available to the user.
      * Requires special permission granted by Play Store review team on Android, is unlikely to be a valid path.
      *
      * ```js
      * firebase.utils.FilePath.PICTURES_DIRECTORY;
      * ```
      */
    var PICTURES_DIRECTORY: String
    
    /**
      * Returns an absolute path to a temporary directory.
      *
      * Use this directory to create temporary files. The system will automatically delete files in this directory when disk space is needed elsewhere on the device, starting with the oldest files first.
      *
      * ```js
      * firebase.utils.FilePath.TEMP_DIRECTORY;
      * ```
      */
    var TEMP_DIRECTORY: String
  }
  object FilePath {
    
    inline def apply(
      CACHES_DIRECTORY: String,
      DOCUMENT_DIRECTORY: String,
      LIBRARY_DIRECTORY: String,
      MAIN_BUNDLE: String,
      MOVIES_DIRECTORY: String,
      PICTURES_DIRECTORY: String,
      TEMP_DIRECTORY: String
    ): FilePath = {
      val __obj = js.Dynamic.literal(CACHES_DIRECTORY = CACHES_DIRECTORY.asInstanceOf[js.Any], DOCUMENT_DIRECTORY = DOCUMENT_DIRECTORY.asInstanceOf[js.Any], LIBRARY_DIRECTORY = LIBRARY_DIRECTORY.asInstanceOf[js.Any], MAIN_BUNDLE = MAIN_BUNDLE.asInstanceOf[js.Any], MOVIES_DIRECTORY = MOVIES_DIRECTORY.asInstanceOf[js.Any], PICTURES_DIRECTORY = PICTURES_DIRECTORY.asInstanceOf[js.Any], TEMP_DIRECTORY = TEMP_DIRECTORY.asInstanceOf[js.Any], EXTERNAL_DIRECTORY = null, EXTERNAL_STORAGE_DIRECTORY = null)
      __obj.asInstanceOf[FilePath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilePath] (val x: Self) extends AnyVal {
      
      inline def setCACHES_DIRECTORY(value: String): Self = StObject.set(x, "CACHES_DIRECTORY", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_DIRECTORY(value: String): Self = StObject.set(x, "DOCUMENT_DIRECTORY", value.asInstanceOf[js.Any])
      
      inline def setEXTERNAL_DIRECTORY(value: String): Self = StObject.set(x, "EXTERNAL_DIRECTORY", value.asInstanceOf[js.Any])
      
      inline def setEXTERNAL_DIRECTORYNull: Self = StObject.set(x, "EXTERNAL_DIRECTORY", null)
      
      inline def setEXTERNAL_STORAGE_DIRECTORY(value: String): Self = StObject.set(x, "EXTERNAL_STORAGE_DIRECTORY", value.asInstanceOf[js.Any])
      
      inline def setEXTERNAL_STORAGE_DIRECTORYNull: Self = StObject.set(x, "EXTERNAL_STORAGE_DIRECTORY", null)
      
      inline def setLIBRARY_DIRECTORY(value: String): Self = StObject.set(x, "LIBRARY_DIRECTORY", value.asInstanceOf[js.Any])
      
      inline def setMAIN_BUNDLE(value: String): Self = StObject.set(x, "MAIN_BUNDLE", value.asInstanceOf[js.Any])
      
      inline def setMOVIES_DIRECTORY(value: String): Self = StObject.set(x, "MOVIES_DIRECTORY", value.asInstanceOf[js.Any])
      
      inline def setPICTURES_DIRECTORY(value: String): Self = StObject.set(x, "PICTURES_DIRECTORY", value.asInstanceOf[js.Any])
      
      inline def setTEMP_DIRECTORY(value: String): Self = StObject.set(x, "TEMP_DIRECTORY", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlayServicesAvailability extends StObject {
    
    /**
      * A human readable error string
      *
      * ```js
      * firebase.utils().playServicesAvailability.error;
      * ```
      * @android Android only - iOS returns undefined
      */
    var error: js.UndefOr[String] = js.undefined
    
    /**
      * If Play Services is not available on the device, hasResolution indicates
      * whether it is possible to do something about it (e.g. install Play Services).
      *
      * ```js
      * firebase.utils().playServicesAvailability.hasResolution;
      * ```
      * @android Android only - iOS returns undefined
      */
    var hasResolution: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Returns a boolean indicating whether Play Store is available on the device
      *
      * ```js
      * firebase.utils().playServicesAvailability.isAvailable;
      * ```
      *
      * @android Android only - iOS returns true
      */
    var isAvailable: Boolean
    
    /**
      * If an error was received, this indicates whether the error is resolvable
      *
      * ```js
      * firebase.utils().playServicesAvailability.isUserResolvableError;
      * ```
      * @android Android only - iOS returns undefined
      */
    var isUserResolvableError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Returns a numeric status code. Please refer to Android documentation
      * for further information:
      * https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult
      *
      * ```js
      * firebase.utils().playServicesAvailability.status;
      * ```
      *
      * @android Android only - iOS returns 0
      */
    var status: PlayServicesAvailabilityStatusCodes
  }
  object PlayServicesAvailability {
    
    inline def apply(isAvailable: Boolean, status: PlayServicesAvailabilityStatusCodes): PlayServicesAvailability = {
      val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayServicesAvailability]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlayServicesAvailability] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHasResolution(value: Boolean): Self = StObject.set(x, "hasResolution", value.asInstanceOf[js.Any])
      
      inline def setHasResolutionUndefined: Self = StObject.set(x, "hasResolution", js.undefined)
      
      inline def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
      
      inline def setIsUserResolvableError(value: Boolean): Self = StObject.set(x, "isUserResolvableError", value.asInstanceOf[js.Any])
      
      inline def setIsUserResolvableErrorUndefined: Self = StObject.set(x, "isUserResolvableError", js.undefined)
      
      inline def setStatus(value: PlayServicesAvailabilityStatusCodes): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Statics extends StObject {
    
    var FilePath: typings.reactNativeFirebaseApp.mod.Utils_.FilePath
  }
  object Statics {
    
    inline def apply(FilePath: FilePath): Statics = {
      val __obj = js.Dynamic.literal(FilePath = FilePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Statics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Statics] (val x: Self) extends AnyVal {
      
      inline def setFilePath(value: FilePath): Self = StObject.set(x, "FilePath", value.asInstanceOf[js.Any])
    }
  }
}
