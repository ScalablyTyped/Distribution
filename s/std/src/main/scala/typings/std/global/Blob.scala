package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.BlobPart
import typings.std.BlobPropertyBag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Blob")
@js.native
class Blob ()
  extends typings.std.Blob {
  def this(blobParts: js.Array[BlobPart]) = this()
  def this(blobParts: js.UndefOr[scala.Nothing], options: BlobPropertyBag) = this()
  def this(blobParts: js.Array[BlobPart], options: BlobPropertyBag) = this()
}
@JSGlobal("Blob")
@js.native
object Blob
  extends Instantiable0[typings.std.Blob]
     with Instantiable1[/* blobParts */ js.Array[BlobPart], typings.std.Blob]
     with Instantiable2[
      js.UndefOr[/* blobParts */ js.Array[BlobPart]], 
      /* options */ BlobPropertyBag, 
      typings.std.Blob
    ]
