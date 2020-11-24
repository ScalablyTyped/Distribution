package typings.reactNativeFirebaseApp.mod.Utils_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var CACHES_DIRECTORY: String = js.native
  
  /**
    * Returns an absolute path to the users Documents directory.
    *
    * Use this directory to place documents that have been created by the user.
    *
    * ```js
    * firebase.utils.FilePath.DOCUMENT_DIRECTORY;
    * ```
    */
  var DOCUMENT_DIRECTORY: String = js.native
  
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
  var EXTERNAL_DIRECTORY: String | Null = js.native
  
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
  var EXTERNAL_STORAGE_DIRECTORY: String | Null = js.native
  
  /**
    * Returns an absolute path to the apps library/resources directory.
    *
    * E.g. this can be used for things like documentation, support files, and configuration files and generic resources.
    *
    * ```js
    * firebase.utils.FilePath.LIBRARY_DIRECTORY;
    * ```
    */
  var LIBRARY_DIRECTORY: String = js.native
  
  /**
    * Returns an absolute path to the applications main bundle.
    *
    * ```js
    * firebase.utils.FilePath.MAIN_BUNDLE;
    * ```
    *
    * @ios iOS only
    */
  var MAIN_BUNDLE: String = js.native
  
  /**
    * Returns an absolute path to a directory in which to place movies that are available to the user.
    *
    * ```js
    * firebase.utils.FilePath.MOVIES_DIRECTORY;
    * ```
    */
  var MOVIES_DIRECTORY: String = js.native
  
  /**
    * Returns an absolute path to a directory in which to place pictures that are available to the user.
    *
    * ```js
    * firebase.utils.FilePath.PICTURES_DIRECTORY;
    * ```
    */
  var PICTURES_DIRECTORY: String = js.native
  
  /**
    * Returns an absolute path to a temporary directory.
    *
    * Use this directory to create temporary files. The system will automatically delete files in this directory when disk space is needed elsewhere on the device, starting with the oldest files first.
    *
    * ```js
    * firebase.utils.FilePath.TEMP_DIRECTORY;
    * ```
    */
  var TEMP_DIRECTORY: String = js.native
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
    TEMP_DIRECTORY: String
  ): FilePath = {
    val __obj = js.Dynamic.literal(CACHES_DIRECTORY = CACHES_DIRECTORY.asInstanceOf[js.Any], DOCUMENT_DIRECTORY = DOCUMENT_DIRECTORY.asInstanceOf[js.Any], LIBRARY_DIRECTORY = LIBRARY_DIRECTORY.asInstanceOf[js.Any], MAIN_BUNDLE = MAIN_BUNDLE.asInstanceOf[js.Any], MOVIES_DIRECTORY = MOVIES_DIRECTORY.asInstanceOf[js.Any], PICTURES_DIRECTORY = PICTURES_DIRECTORY.asInstanceOf[js.Any], TEMP_DIRECTORY = TEMP_DIRECTORY.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePath]
  }
  
  @scala.inline
  implicit class FilePathOps[Self <: FilePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCACHES_DIRECTORY(value: String): Self = this.set("CACHES_DIRECTORY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_DIRECTORY(value: String): Self = this.set("DOCUMENT_DIRECTORY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLIBRARY_DIRECTORY(value: String): Self = this.set("LIBRARY_DIRECTORY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAIN_BUNDLE(value: String): Self = this.set("MAIN_BUNDLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOVIES_DIRECTORY(value: String): Self = this.set("MOVIES_DIRECTORY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPICTURES_DIRECTORY(value: String): Self = this.set("PICTURES_DIRECTORY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTEMP_DIRECTORY(value: String): Self = this.set("TEMP_DIRECTORY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXTERNAL_DIRECTORY(value: String): Self = this.set("EXTERNAL_DIRECTORY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXTERNAL_DIRECTORYNull: Self = this.set("EXTERNAL_DIRECTORY", null)
    
    @scala.inline
    def setEXTERNAL_STORAGE_DIRECTORY(value: String): Self = this.set("EXTERNAL_STORAGE_DIRECTORY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXTERNAL_STORAGE_DIRECTORYNull: Self = this.set("EXTERNAL_STORAGE_DIRECTORY", null)
  }
}
