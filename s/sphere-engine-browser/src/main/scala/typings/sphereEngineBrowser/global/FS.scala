package typings.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FS {
  
  @JSGlobal("FS")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a directory if it doesn't already exist. If it already exists, nothing happens.
    * @param path SphereFS path of the directory to create.
    */
  inline def createDirectory(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createDirectory")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Delete a file from the file system. The SphereFS prefix must be writable.
    * @param path SphereFS path of the file to delete.
    */
  inline def deleteFile(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteFile")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Get a Boolean value indicating whether a directory exists.
    * @param path SphereFS path of the directory to check for existence.
    */
  inline def directoryExists(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("directoryExists")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Get the directory component of a path, stripping the filename if present.
    * @param path SphereFS or relative path of a file or directory. It doesn't need to exist.
    */
  inline def directoryOf(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("directoryOf")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Evaluate a JavaScript script file (`.js`) as traditional code (not as a module).
    * @param path SphereFS path of the script file to execute.
    */
  inline def evaluateScript(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluateScript")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Get the filename extension (everything after the last `.`) from a file path.
    * @param path SphereFS or relative path of a file. The file need not exist.
    * @returns The extension starting with the last `.`, or `null` if the path has no extension.
    * @throws {TypeError} `path` must not name a known directory or end in a slash.
    */
  inline def extensionOf(path: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("extensionOf")(path.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /**
    * Get a Boolean value indicating whether a file exists.
    * @param path SphereFS path of the file to check for existence.
    */
  inline def fileExists(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExists")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Get the filename component from a file path, stripping any directory information if present.
    * @param path SphereFS or relative path of a file. The file need not exist.
    * @returns The filename component of the path, or `undefined` if the path names a known
    *          directory and/or ends in a slash.
    */
  inline def fileNameOf(path: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileNameOf")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  /**
    * Get the full, canonical SphereFS pathname of a file, relative path, or absolute path. If two
    * paths have the same SphereFS pathname, they can be assumed to refer to the same file (or
    * directory).
    * @param path          The filename or path string to be interpreted.
    * @param baseDirectory Path to the base directory used to resolve relative paths.
    * @returns The normalized SphereFS pathname for the given path and base directory.
    */
  inline def fullPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fullPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fullPath(path: String, baseDirectory: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fullPath")(path.asInstanceOf[js.Any], baseDirectory.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Check whether a given path matches the specified wildcard pattern.
    * @param patterns One or more wildcard patterns using globbing syntax where `?` matches a
    *                 single character, `*` matches any number of characters except for slash
    *                 (`/`), and `**` is the same but also matches slashes.
    * @param path     The path to check.
    * @returns `true` if the path matches the pattern, otherwise `false`.
    */
  inline def `match`(path: String, patterns: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(path.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def `match`(path: String, patterns: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(path.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def readFile(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Get an abbreviated version of a full SphereFS path by finding its path relative to a given
    * base directory.
    * @param path          A full SphereFS path to be abbreviated.
    * @param baseDirectory SphereFS path of the base directory for the relative path.
    */
  inline def relativePath(path: String, baseDirectory: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relativePath")(path.asInstanceOf[js.Any], baseDirectory.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Remove an empty directory from the file system. The SphereFS prefix must be writable.
    * @param directoryPath SphereFS path of the directory to remove.
    */
  inline def removeDirectory(directoryPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDirectory")(directoryPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Rename a file or directory or move it to a new location. The source and target prefixes must
    * be writable.
    * @param path    SphereFS path of the file to rename or move.
    * @param newPath The new SphereFS path of the file.
    */
  inline def rename(path: String, newPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(path.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeFile(path: String, content: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFile(path: String, content: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFile(path: String, content: js.typedarray.ArrayBuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFile(path: String, content: js.typedarray.ArrayBufferView): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
