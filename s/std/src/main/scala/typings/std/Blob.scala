package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A file-like object of immutable, raw data. Blobs represent data that isn't necessarily in a JavaScript-native format. The File interface is based on Blob, inheriting blob functionality and expanding it to support files on the user's system. */
@js.native
trait Blob
  extends StObject
     with ImageBitmapSource
     with MediaProvider
     with _BlobPart
     with _BodyInit {
  
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  
  val size: Double = js.native
  
  def slice(): Blob = js.native
  def slice(start: Double): Blob = js.native
  def slice(start: Double, end: Double): Blob = js.native
  def slice(start: Double, end: Double, contentType: java.lang.String): Blob = js.native
  def slice(start: Double, end: Unit, contentType: java.lang.String): Blob = js.native
  def slice(start: Unit, end: Double): Blob = js.native
  def slice(start: Unit, end: Double, contentType: java.lang.String): Blob = js.native
  def slice(start: Unit, end: Unit, contentType: java.lang.String): Blob = js.native
  
  def stream(): ReadableStream[js.Any] = js.native
  
  def text(): js.Promise[java.lang.String] = js.native
  
  val `type`: java.lang.String = js.native
}
