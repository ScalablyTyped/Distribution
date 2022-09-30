package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides stream-like access to the raw byte content of a file.
  */
@js.native
trait FileStream extends StObject {
  
  def asyncRead(numBytes: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def asyncWrite(data: js.typedarray.ArrayBuffer): js.Promise[Unit] = js.native
  def asyncWrite(data: js.typedarray.ArrayBufferView): js.Promise[Unit] = js.native
  
  /** Clean up any resources held by this `FileStream` after using it. */
  def dispose(): Unit = js.native
  
  /** Full, canonical SphereFS path of the open file. */
  val fileName: String = js.native
  
  /** Amount of disk space used by the open file, in bytes. */
  val fileSize: Double = js.native
  
  /** Position of the next byte in the file to be read or written, starting at 0. */
  var position: Double = js.native
  
  def read(size: Double): js.typedarray.ArrayBuffer = js.native
  
  def write(data: js.typedarray.ArrayBuffer): Unit = js.native
  def write(data: js.typedarray.ArrayBufferView): Unit = js.native
}
