package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryReader) */
@js.native
trait FileSystemDirectoryReader extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryReader/readEntries) */
  /* standard dom */
  def readEntries(successCallback: FileSystemEntriesCallback): Unit = js.native
  def readEntries(successCallback: FileSystemEntriesCallback, errorCallback: ErrorCallback): Unit = js.native
}
