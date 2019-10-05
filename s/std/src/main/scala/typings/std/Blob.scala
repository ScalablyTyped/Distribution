package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A file-like object of immutable, raw data. Blobs represent data that isn't necessarily in a JavaScript-native format. The File interface is based on Blob, inheriting blob functionality and expanding it to support files on the user's system. */
@js.native
trait Blob
  extends ImageBitmapSource
     with _BlobPart
     with _BodyInit {
  val size: Double = js.native
  val `type`: java.lang.String = js.native
  def slice(): Blob = js.native
  def slice(start: Double): Blob = js.native
  def slice(start: Double, end: Double): Blob = js.native
  def slice(start: Double, end: Double, contentType: java.lang.String): Blob = js.native
}

@JSGlobal("Blob")
@js.native
object Blob
  extends Instantiable0[Blob]
     with Instantiable1[/* blobParts */ js.Array[BlobPart], Blob]
     with Instantiable2[/* blobParts */ js.Array[BlobPart], /* options */ BlobPropertyBag, Blob]

