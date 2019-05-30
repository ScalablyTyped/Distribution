package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A file-like object of immutable, raw data. Blobs represent data that isn't necessarily in a JavaScript-native format. The File interface is based on Blob, inheriting blob functionality and expanding it to support files on the user's system. */
@js.native
trait Blob
  extends ImageBitmapSource
     with _BlobPart
     with _BodyInit {
  val size: scala.Double = js.native
  val `type`: java.lang.String = js.native
  def slice(): Blob = js.native
  def slice(start: scala.Double): Blob = js.native
  def slice(start: scala.Double, end: scala.Double): Blob = js.native
  def slice(start: scala.Double, end: scala.Double, contentType: java.lang.String): Blob = js.native
}

@JSGlobal("Blob")
@js.native
class BlobCls () extends Blob {
  def this(blobParts: js.Array[BlobPart]) = this()
  def this(blobParts: js.Array[BlobPart], options: BlobPropertyBag) = this()
}

@JSGlobal("Blob")
@js.native
object Blob
  extends org.scalablytyped.runtime.Instantiable0[Blob]
     with org.scalablytyped.runtime.Instantiable1[/* blobParts */ js.Array[BlobPart], Blob]
     with org.scalablytyped.runtime.Instantiable2[/* blobParts */ js.Array[BlobPart], /* options */ BlobPropertyBag, Blob]

