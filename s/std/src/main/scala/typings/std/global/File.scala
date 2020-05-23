package typings.std.global

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.BlobPart
import typings.std.FilePropertyBag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("File")
@js.native
class File protected ()
  extends typings.std.File {
  def this(fileBits: js.Array[BlobPart], fileName: java.lang.String) = this()
  def this(fileBits: js.Array[BlobPart], fileName: java.lang.String, options: FilePropertyBag) = this()
}

@JSGlobal("File")
@js.native
object File
  extends Instantiable2[/* fileBits */ js.Array[BlobPart], /* fileName */ java.lang.String, typings.std.File]
     with Instantiable3[
      /* fileBits */ js.Array[BlobPart], 
      /* fileName */ java.lang.String, 
      /* options */ FilePropertyBag, 
      typings.std.File
    ]

