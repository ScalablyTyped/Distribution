package typings.atReactDashNativeDashFirebaseApp.Utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePath extends js.Object {
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
    *
    * ```js
    * firebase.utils.FilePath.MOVIES_DIRECTORY;
    * ```
    */
  var MOVIES_DIRECTORY: String
  /**
    * Returns an absolute path to a directory in which to place pictures that are available to the user.
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
  @scala.inline
  def apply(
    CACHES_DIRECTORY: String,
    DOCUMENT_DIRECTORY: String,
    LIBRARY_DIRECTORY: String,
    MAIN_BUNDLE: String,
    MOVIES_DIRECTORY: String,
    PICTURES_DIRECTORY: String,
    TEMP_DIRECTORY: String,
    EXTERNAL_DIRECTORY: String = null,
    EXTERNAL_STORAGE_DIRECTORY: String = null
  ): FilePath = {
    val __obj = js.Dynamic.literal(CACHES_DIRECTORY = CACHES_DIRECTORY, DOCUMENT_DIRECTORY = DOCUMENT_DIRECTORY, LIBRARY_DIRECTORY = LIBRARY_DIRECTORY, MAIN_BUNDLE = MAIN_BUNDLE, MOVIES_DIRECTORY = MOVIES_DIRECTORY, PICTURES_DIRECTORY = PICTURES_DIRECTORY, TEMP_DIRECTORY = TEMP_DIRECTORY)
    if (EXTERNAL_DIRECTORY != null) __obj.updateDynamic("EXTERNAL_DIRECTORY")(EXTERNAL_DIRECTORY)
    if (EXTERNAL_STORAGE_DIRECTORY != null) __obj.updateDynamic("EXTERNAL_STORAGE_DIRECTORY")(EXTERNAL_STORAGE_DIRECTORY)
    __obj.asInstanceOf[FilePath]
  }
}

