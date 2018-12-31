package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blob extends js.Object {
  val size: scala.Double = js.native
  val `type`: java.lang.String = js.native
  def slice(): Blob = js.native
  def slice(start: scala.Double): Blob = js.native
  def slice(start: scala.Double, end: scala.Double): Blob = js.native
  def slice(start: scala.Double, end: scala.Double, contentType: java.lang.String): Blob = js.native
}

@JSGlobal("Blob")
@js.native
object Blob
  extends org.scalablytyped.runtime.Instantiable0[Blob]
     with org.scalablytyped.runtime.Instantiable1[/* blobParts */ js.Array[BlobPart], Blob]
     with org.scalablytyped.runtime.Instantiable2[/* blobParts */ js.Array[BlobPart], /* options */ BlobPropertyBag, Blob]

