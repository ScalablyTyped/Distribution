package typings.sphereEngineBrowser

import typings.std.Iterable
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a means for enumerating the contents of a directory (files and subdirectories).
  */
@js.native
trait DirectoryStream
  extends StObject
     with Iterable[DirectoryEntry] {
  
  /** Clean up any resources held by this `DirectoryStream` after using it. */
  def dispose(): Unit = js.native
  
  /** Total number of file and subdirectory entries in the directory. */
  val fileCount: Double = js.native
  
  /** SphereFS path to the directory being enumerated. */
  val fileName: String = js.native
  
  /** Get the next file or directory entry. */
  def next(): IteratorResult[DirectoryEntry, Any] = js.native
  
  /** The current position within the stream of directory entries. Starts at 0. */
  var position: Double = js.native
  
  /** Rewind this stream so the directory contents can be enumerated again. */
  def rewind(): Unit = js.native
}
