package typings.std

import typings.std.stdStrings.directory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle)
  */
@js.native
trait FileSystemDirectoryHandle
  extends StObject
     with FileSystemHandle {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/getDirectoryHandle) */
  /* standard dom */
  def getDirectoryHandle(name: java.lang.String): js.Promise[FileSystemDirectoryHandle] = js.native
  def getDirectoryHandle(name: java.lang.String, options: FileSystemGetDirectoryOptions): js.Promise[FileSystemDirectoryHandle] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/getFileHandle) */
  /* standard dom */
  def getFileHandle(name: java.lang.String): js.Promise[FileSystemFileHandle] = js.native
  def getFileHandle(name: java.lang.String, options: FileSystemGetFileOptions): js.Promise[FileSystemFileHandle] = js.native
  
  /* standard dom */
  @JSName("kind")
  val kind_FileSystemDirectoryHandle: directory = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/removeEntry) */
  /* standard dom */
  def removeEntry(name: java.lang.String): js.Promise[Unit] = js.native
  def removeEntry(name: java.lang.String, options: FileSystemRemoveOptions): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/resolve) */
  /* standard dom */
  def resolve(possibleDescendant: FileSystemHandle): js.Promise[js.Array[java.lang.String] | Null] = js.native
}
