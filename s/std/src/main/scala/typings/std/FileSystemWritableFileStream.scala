package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream)
  */
@js.native
trait FileSystemWritableFileStream
  extends StObject
     with WritableStream[Any] {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/seek) */
  /* standard dom */
  def seek(position: Double): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/truncate) */
  /* standard dom */
  def truncate(size: Double): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/write) */
  /* standard dom */
  def write(data: FileSystemWriteChunkType): js.Promise[Unit] = js.native
}
