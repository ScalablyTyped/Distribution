package typings.std

import typings.std.stdStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle)
  */
@js.native
trait FileSystemFileHandle
  extends StObject
     with FileSystemHandle {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/createWritable) */
  /* standard dom */
  def createWritable(): js.Promise[FileSystemWritableFileStream] = js.native
  def createWritable(options: FileSystemCreateWritableOptions): js.Promise[FileSystemWritableFileStream] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/getFile) */
  /* standard dom */
  def getFile(): js.Promise[File] = js.native
  
  /* standard dom */
  @JSName("kind")
  val kind_FileSystemFileHandle: file = js.native
}
