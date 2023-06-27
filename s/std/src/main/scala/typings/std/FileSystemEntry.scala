package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry) */
@js.native
trait FileSystemEntry extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/filesystem) */
  /* standard dom */
  val filesystem: FileSystem = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/fullPath) */
  /* standard dom */
  val fullPath: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/getParent) */
  /* standard dom */
  def getParent(): Unit = js.native
  def getParent(successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def getParent(successCallback: FileSystemEntryCallback): Unit = js.native
  def getParent(successCallback: FileSystemEntryCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/isDirectory) */
  /* standard dom */
  val isDirectory: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/isFile) */
  /* standard dom */
  val isFile: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/name) */
  /* standard dom */
  val name: java.lang.String = js.native
}
