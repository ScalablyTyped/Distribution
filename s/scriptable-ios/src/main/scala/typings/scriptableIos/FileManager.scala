package typings.scriptableIos

import typings.scriptableIos.FileManager.AllFileBookmarks
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Read and write files on disk._
  * @see https://docs.scriptable.app/filemanager
  */
@js.native
trait FileManager extends StObject {
  
  /**
    * _Adds a tag to a file._
    *
    * A tag can only be added to a file once. It is not possible to specify a color for the tag. You can create the tags using the Files app to specify the color and then add them to
    * files afterwards using the FileManager API.
    *
    * The function will error if the file does not exist or if it exists in iCloud but has not been download. Use `fileExists(filePath)` to check if a file exists and
    * `downloadFileFromiCloud(filePath)` to download the file. Note that it is always safe to call `downloadFileFromiCloud(filePath)`, even if the file is stored locally on the device.
    * @param filePath - Path of file to add the tag to.
    * @param tag - Tag to add. This can be an existing tag or a new tag.
    * @see https://docs.scriptable.app/filemanager/#-addtag
    */
  def addTag(filePath: String, tag: String): Unit = js.native
  
  /**
    * _Reads all extended attributes on a file._
    *
    * Extended attributes are metadata that can be stored on a file. Note that extended attributes are not synced with iCloud.
    * @param filePath - Path of file to read extended attributes from.
    * @see https://docs.scriptable.app/filemanager/#-allextendedattributes
    */
  def allExtendedAttributes(filePath: String): js.Array[String] = js.native
  
  /**
    * _Reads all file bookmarks created in settings._
    *
    * File bookmarks are used to bookmark a file or a folder and read or written to it later. File bookmarks are created from Scriptables settings.
    *
    * This function returns all file bookmarks as an array of objects that take the following form.
    *
    *     {
    *       "name": "My Bookmark",
    *       "source": "host"
    *     }
    *
    * The source can either be `host` for file bookmarks that can be used in the app or `siri_shortcuts` for file bookmarks that can be used in Siri and Shortcuts.
    * @see https://docs.scriptable.app/filemanager/#-allfilebookmarks
    */
  def allFileBookmarks(): js.Array[AllFileBookmarks] = js.native
  
  /**
    * _Reads all tags from a file._
    *
    * The tags are read from the file at the specified path. Tags can either be read, added and removed using the Files app by using the APIs provided by a FileManager.
    *
    * The function will error if the file does not exist or if it exists in iCloud but has not been download. Use `fileExists(filePath)` to check if a file exists and
    * `downloadFileFromiCloud(filePath)` to download the file. Note that it is always safe to call `downloadFileFromiCloud(filePath)`, even if the file is stored locally on the device.
    * @param filePath - Path of file to read tags from.
    * @see https://docs.scriptable.app/filemanager/#-alltags
    */
  def allTags(filePath: String): js.Array[String] = js.native
  
  /**
    * _Check if a bookmark exists._
    *
    * Checks if a file bookmark exists with the specified name.
    *
    * You can edit your file bookmarks from Scriptables settings.
    *
    * Please beware that bookmarks created from Scriptables settings only can be used when running a script in the app and not from the Share Sheet, Siri and Shortcuts. If you wish to
    * use a bookmark from Siri or the Shortcuts app, the bookmark must be created using Scriptables "Create File Bookmark" shortcut action using the Shortcuts app.
    * @param name - Name of bookmark.
    * @see https://docs.scriptable.app/filemanager/#-bookmarkexists
    */
  def bookmarkExists(name: String): Boolean = js.native
  
  /**
    * _Get path to a bookmarked file or folder._
    *
    * Gets the path to a bookmarked file or filder. Use file bookmarks to access files and folders outside Scriptables documents directory.
    *
    * You can edit your file bookmarks from Scriptables settings.
    *
    * The function will throw an error if the bookmark doesn't exist.
    *
    * Please beware that bookmarks created from Scriptables settings only can be used when running a script in the app and not from the Share Sheet, Siri and Shortcuts. If you wish to
    * use a bookmark from Siri or the Shortcuts app, the bookmark must be created using Scriptables "Create File Bookmark" shortcut action using the Shortcuts app.
    * @param name - Name of bookmark to create path for.
    * @see https://docs.scriptable.app/filemanager/#-bookmarkedpath
    */
  def bookmarkedPath(name: String): String = js.native
  
  /**
    * _Path of cache directory._
    *
    * Used to retrieve the path of a cache directory on disk. The operating system may at any time delete files stored in this directory and therefore you should not rely on it for long
    * time storage.
    *
    * Data persisted in the cache directory will generally live longer than data persisted in a temporary directory.
    *
    * If you need long time storage, see documentsDirectory() or libraryDirectory(). This directory is not shared between the app, the action extension and Siri.
    * @see https://docs.scriptable.app/filemanager/#-cachedirectory
    */
  def cacheDirectory(): String = js.native
  
  /**
    * _Copies a file._
    *
    * Copies the file from the source path to the destination path. If a file already exists at the destination file path, the operation will fail and the file will not be copied.
    * @param sourceFilePath - Path of the file to copy.
    * @param destinationFilePath - Path to copy the file to.
    * @see https://docs.scriptable.app/filemanager/#-copy
    */
  def copy(sourceFilePath: String, destinationFilePath: String): Unit = js.native
  
  /**
    * _Creates a directory at the specified path._
    *
    * You can optionally create all intermediate directories.
    * @param path - Path of directory to create.
    * @param intermediateDirectories - Whether to create all intermediate directories. Defaults to false.
    * @see https://docs.scriptable.app/filemanager/#-createdirectory
    */
  def createDirectory(path: String): Unit = js.native
  def createDirectory(path: String, intermediateDirectories: Boolean): Unit = js.native
  
  /**
    * _Reads the creation date of a file._
    *
    * The returned value will be null if the creation date cannot be read.
    * @param filePath - Path of file.
    * @see https://docs.scriptable.app/filemanager/#-creationdate
    */
  def creationDate(filePath: String): Date = js.native
  
  /**
    * _Path of documents directory._
    *
    * Used to retrieve the path to the documents directory. Your scripts are stored in this directory. If you have iCloud enabled, your scripts will be stored in the documents directory
    * in iCloud otherwise they will be stored in the local documents directory. The directory can be used for long time storage. Documents stored in this directory can be accessed using
    * the Files app. Files stored in the local documents directory will not appear in the Files app.
    * @see https://docs.scriptable.app/filemanager/#-documentsdirectory
    */
  def documentsDirectory(): String = js.native
  
  /**
    * _Download file from iCloud if necessary._
    *
    * Downloads the file from iCloud if it has not already been downloaded. If you pass in a path to a file that is not stored in iCloud, the returned promise will be resolved immediately
    * making it safe to pass in any file path.
    * @param filePath - Path of file to download from iCloud.
    * @see https://docs.scriptable.app/filemanager/#-downloadfilefromicloud
    */
  def downloadFileFromiCloud(filePath: String): js.Promise[Unit] = js.native
  
  /**
    * _Checks if the file exists._
    *
    * Checks if the file exists at the specified file path. Checking this before moving or copying to a destination can be a good idea as those operations will replace any existing file
    * at the destination file path.
    * @param filePath - File path to examine.
    * @see https://docs.scriptable.app/filemanager/#-fileexists
    */
  def fileExists(filePath: String): Boolean = js.native
  
  /**
    * _Get extension of a file._
    *
    * Takes a file path and returns the extension of the file, e.g. ".jpg" or ".js". Returns en empty string for directories.
    * @param filePath - Path of file to get extension from.
    * @see https://docs.scriptable.app/filemanager/#-fileextension
    */
  def fileExtension(filePath: String): String = js.native
  
  /**
    * _Get name of a file._
    *
    * Takes a file path and returns the name of the file. Also supports getting the name of a directory. The returned file name optionally includes the extension of the file.
    * @param filePath - path of file to get name of.
    * @param includeFileExtension - Whether or not the file extension should be included. Defaults to false.
    * @see https://docs.scriptable.app/filemanager/#-filename
    */
  def fileName(filePath: String): String = js.native
  def fileName(filePath: String, includeFileExtension: Boolean): String = js.native
  
  /**
    * _Size of the file in kilobytes._
    *
    * The returned value will be null if the file size cannot be read.
    * @param filePath - Path of file.
    * @see https://docs.scriptable.app/filemanager/#-filesize
    */
  def fileSize(filePath: String): Double = js.native
  
  /**
    * _Gets the UTI of the specified file._
    *
    * The Uniform Type Identifier is a string that identifies the type of file.
    * @param filePath - Path of file to get UTI of.
    * @see https://docs.scriptable.app/filemanager/#-getuti
    */
  def getUTI(filePath: String): String = js.native
  
  /**
    * _Checks if a path points to a directory._
    * @param path - Path to examine.
    * @see https://docs.scriptable.app/filemanager/#-isdirectory
    */
  def isDirectory(path: String): Boolean = js.native
  
  /**
    * _Checks if a file has been downloaded._
    *
    * If a file is stored in iCloud and it has not been downloaded, this function returns false. In that case, the file can be downloaded using `downloadFileFromiCloud(filePath`. If the
    * file is not stored in iCloud but rather locally on the device, this function returns true.
    *
    * The function returns false if the file does not exist. Check if a file exists using `fileExists(filePath)`
    * @param filePath - Path of file.
    * @see https://docs.scriptable.app/filemanager/#-isfiledownloaded
    */
  def isFileDownloaded(filePath: String): Boolean = js.native
  
  /**
    * _Checks if a file is stored in iCloud._
    *
    * Checks if a file is stored in iCloud or locally on the device. The function returns false if the file does not exist. Check if a file exists using `fileExists(filePath)`
    * @param filePath - Path of file.
    * @see https://docs.scriptable.app/filemanager/#-isfilestoredinicloud
    */
  def isFileStoredIniCloud(filePath: String): Boolean = js.native
  
  /**
    * _Joins two path components._
    *
    * Joins two paths to created one path. For example to join the path to a directory with the name of a file. This is the suggested approach for creating new file paths passed to the
    * read and write functions of a FileManager.
    * @param lhsPath - Left-hand side part of the new path.
    * @param rhsPath - Right-hand side part of the new path.
    * @see https://docs.scriptable.app/filemanager/#-joinpath
    */
  def joinPath(lhsPath: String, rhsPath: String): String = js.native
  
  /**
    * _Path of library directory._
    *
    * Used to retrieve the path to the library directory. The directory can be used for long time storage. Documents stored in this directory cannot be accessed using the Files app.
    * @see https://docs.scriptable.app/filemanager/#-librarydirectory
    */
  def libraryDirectory(): String = js.native
  
  /**
    * _Lists content of directory._
    *
    * Lists all the contents in the specified directory. The returned array contains file paths to all files in the directory.
    * @param directoryPath - Path to directory.
    * @see https://docs.scriptable.app/filemanager/#-listcontents
    */
  def listContents(directoryPath: String): js.Array[String] = js.native
  
  /**
    * _Reads the modification date of a file._
    *
    * The returned value will be null if the modification date cannot be read.
    * @param filePath - Path of file.
    * @see https://docs.scriptable.app/filemanager/#-modificationdate
    */
  def modificationDate(filePath: String): Date = js.native
  
  /**
    * _Moves a file._
    *
    * Moves the file from the source path to the destination path. Caution: This operation will replace any existing file at the the destination.
    * @param sourceFilePath - Path of the file to move.
    * @param destinationFilePath - Path to move the file to.
    * @see https://docs.scriptable.app/filemanager/#-move
    */
  def move(sourceFilePath: String, destinationFilePath: String): Unit = js.native
  
  /**
    * _Read contents of a file as data._
    *
    * Reads the contents of the file specified by the file path as raw data. To read the file as a string see `readString(filePath)` and to read it as an image see `readImage(filePath)`.
    *
    * The function will error if the file does not exist or if it exists in iCloud but has not been download. Use `fileExists(filePath)` to check if a file exists and
    * `downloadFileFromiCloud(filePath)` to download the file. Note that it is always safe to call `downloadFileFromiCloud(filePath)`, even if the file is stored locally on the device.
    * @param filePath - Path of the file to read.
    * @see https://docs.scriptable.app/filemanager/#-read
    */
  def read(filePath: String): Data = js.native
  
  /**
    * _Reads an extended attribute from a file._
    *
    * Extended attributes are metadata that can be stored on a file. Note that extended attributes are not synced with iCloud.
    *
    * The function will return `null` if the attribute does not exist.
    *
    * The function will error if the file does not exist or if it exists in iCloud but has not been download. Use `fileExists(filePath)` to check if a file exists and
    * `downloadFileFromiCloud(filePath)` to download the file. Note that it is always safe to call `downloadFileFromiCloud(filePath)`, even if the file is stored locally on the device.
    * @param filePath - Path of file to read extended attribute from.
    * @param name - Name of the extended attribute to read.
    * @see https://docs.scriptable.app/filemanager/#-readextendedattribute
    */
  def readExtendedAttribute(filePath: String, name: String): String = js.native
  
  /**
    * _Read contents of a file as an image._
    *
    * Reads the contents of the file specified by the file path and converts it to an image.
    *
    * The function will error if the file does not exist or if it exists in iCloud but has not been download. Use `fileExists(filePath)` to check if a file exists and
    * `downloadFileFromiCloud(filePath)` to download the file. Note that it is always safe to call `downloadFileFromiCloud(filePath)`, even if the file is stored locally on the device.
    * @param filePath - Path of the file to read.
    * @see https://docs.scriptable.app/filemanager/#-readimage
    */
  def readImage(filePath: String): Image = js.native
  
  /**
    * _Read contents of a file as string._
    *
    * The function will error if the file does not exist or if it exists in iCloud but has not been download. Use `fileExists(filePath)` to check if a file exists and
    * `downloadFileFromiCloud(filePath)` to download the file. Note that it is always safe to call `downloadFileFromiCloud(filePath)`, even if the file is stored locally on the device.
    * @param filePath - Path of the file to read.
    * @see https://docs.scriptable.app/filemanager/#-readstring
    */
  def readString(filePath: String): String = js.native
  
  /**
    * _Removes a file._
    *
    * Removes the file at the specified path. Use with caution. Removed files cannot be restored.
    * @param filePath - Path of file to remove.
    * @see https://docs.scriptable.app/filemanager/#-remove
    */
  def remove(filePath: String): Unit = js.native
  
  /**
    * _Removes an extended attribute from a file._
    *
    * Extended attributes are metadata that can be stored on a file. Note that extended attributes are not synced with iCloud.
    *
    * The function will error if the file does not exist or if it exists in iCloud but has not been download. Use `fileExists(filePath)` to check if a file exists and
    * `downloadFileFromiCloud(filePath)` to download the file. Note that it is always safe to call `downloadFileFromiCloud(filePath)`, even if the file is stored locally on the device.
    * @param filePath - Path of file to add an extended attribute to.
    * @param name - Name of the extended attribute to remove.
    * @see https://docs.scriptable.app/filemanager/#-removeextendedattribute
    */
  def removeExtendedAttribute(filePath: String, name: String): Unit = js.native
  
  /**
    * _Removes a tag from a file._
    *
    * The function will error if the file does not exist or if it exists in iCloud but has not been download. Use `fileExists(filePath)` to check if a file exists and
    * `downloadFileFromiCloud(filePath)` to download the file. Note that it is always safe to call `downloadFileFromiCloud(filePath)`, even if the file is stored locally on the device.
    * @param filePath - Path of file to remove the tag from.
    * @param tag - Tag to remove.
    * @see https://docs.scriptable.app/filemanager/#-removetag
    */
  def removeTag(filePath: String, tag: String): Unit = js.native
  
  /**
    * _Path of temporary directory._
    *
    * Used to retrieve the path of a temporary directory on disk. Data persisted in a temporary directory will generally live shorter than data persisted in the cache directory.
    *
    * The operating system may at any time delete files stored in this directory and therefore you should not rely on it for long time storage. If you need long time storage, see
    * documentsDirectory() or libraryDirectory(). This directory is not shared between the app, the action extension and Siri.
    * @see https://docs.scriptable.app/filemanager/#-temporarydirectory
    */
  def temporaryDirectory(): String = js.native
  
  /**
    * _Write data to a file._
    * @param filePath - Path of file to write to.
    * @param content - Data to write to disk.
    * @see https://docs.scriptable.app/filemanager/#-write
    */
  def write(filePath: String, content: Data): Unit = js.native
  
  /**
    * _Writes an extended attribute to a file._
    *
    * Extended attributes are metadata that can be stored on a file. Note that extended attributes are not synced with iCloud.
    *
    * The function will error if the file does not exist or if it exists in iCloud but has not been download. Use `fileExists(filePath)` to check if a file exists and
    * `downloadFileFromiCloud(filePath)` to download the file. Note that it is always safe to call `downloadFileFromiCloud(filePath)`, even if the file is stored locally on the device.
    * @param filePath - Path of file to add an extended attribute to.
    * @param value - Value of the extended attribute.
    * @param name - Name of the extended attribute. This is used to retrieve the value at a later point.
    * @see https://docs.scriptable.app/filemanager/#-writeextendedattribute
    */
  def writeExtendedAttribute(filePath: String, value: String, name: String): Unit = js.native
  
  /**
    * _Write an image to a file._
    *
    * Writes the image to the specified file path on disk. If the file does not already exist, it will be created. If the file already exists the contents of the file will be overwritten
    * with the new content.
    * @param filePath - Path of file to write to.
    * @param image - Image to write to disk.
    * @see https://docs.scriptable.app/filemanager/#-writeimage
    */
  def writeImage(filePath: String, image: Image): Unit = js.native
  
  /**
    * _Write a string to a file._
    *
    * Writes the content to the specified file path on disk. If the file does not already exist, it will be created. If the file already exists the contents of the file will be
    * overwritten with the new content.
    * @param filePath - Path of file to write to.
    * @param content - Content to write to disk.
    * @see https://docs.scriptable.app/filemanager/#-writestring
    */
  def writeString(filePath: String, content: String): Unit = js.native
}
object FileManager {
  
  @js.native
  trait AllFileBookmarks extends StObject {
    
    var name: String = js.native
    
    var source: String = js.native
  }
  object AllFileBookmarks {
    
    @scala.inline
    def apply(name: String, source: String): AllFileBookmarks = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllFileBookmarks]
    }
    
    @scala.inline
    implicit class AllFileBookmarksMutableBuilder[Self <: AllFileBookmarks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
